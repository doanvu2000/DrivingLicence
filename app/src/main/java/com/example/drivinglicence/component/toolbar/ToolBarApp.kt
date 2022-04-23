package com.example.drivinglicense.component.toolbar

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import com.example.drivinglicense.R
import com.example.drivinglicense.databinding.ToolbarAppBinding

class ToolBarApp : LinearLayout {
    var onLeftClickListener: (() -> Unit)? = null
    var onRightClickListener: (() -> Unit)? = null

    private val binding =
        ToolbarAppBinding.inflate(LayoutInflater.from(context), this)

    constructor(context: Context?) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        initView(attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) :
            super(context, attrs, defStyleAttr) {
        initView(attrs)
    }

    private fun initView(attrs: AttributeSet?) {
        attrs?.let {
            val obtain = context.obtainStyledAttributes(attrs, R.styleable.ToolBarApp)
            val title = obtain.getString(R.styleable.ToolBarApp_title)
            val iconLeft = obtain.getDrawable(R.styleable.ToolBarApp_drawable_start)
            val iconRight = obtain.getDrawable(R.styleable.ToolBarApp_drawable_end)
            val titleColor = obtain.getColor(R.styleable.ToolBarApp_title_color, 0)
            setTitle(title)
            if (iconLeft != null) {
                binding.imageLeft.visibility = View.VISIBLE
                binding.imageLeft.setImageDrawable(iconLeft)
            } else {
                binding.imageLeft.visibility = View.INVISIBLE
            }

            if (titleColor != 0) {
                binding.textTitle.setTextColor(titleColor)
            }

            binding.imageLeft.setOnClickListener {
                onLeftClickListener?.invoke()
            }

            if (iconRight != null) {
                binding.imageRight.visibility = View.VISIBLE
                binding.imageRight.setImageDrawable(iconRight)
            } else {
                binding.imageRight.visibility = View.INVISIBLE
            }
            binding.imageRight.setOnClickListener {
                onRightClickListener?.invoke()
            }
            obtain.recycle()
        }
    }

    fun setTitle(title: String?) {
        if (title.isNullOrEmpty()) {
            binding.textTitle.visibility = View.INVISIBLE
        } else {
            binding.textTitle.visibility = View.VISIBLE
            binding.textTitle.text = title
        }
    }

    fun setIconLeft(id: Int) {
        if (id < 0) {
            binding.imageLeft.visibility = View.INVISIBLE
        } else {
            binding.imageLeft.setImageResource(id)
            binding.imageLeft.visibility = View.VISIBLE
            binding.imageLeft.setOnClickListener {
                onLeftClickListener?.invoke()
            }
        }
    }

    fun setIconRight(id: Int) {
        if (id < 0) {
            binding.imageRight.visibility = View.INVISIBLE
        } else {
            binding.imageRight.visibility = View.VISIBLE
            binding.imageRight.setImageResource(id)
        }
    }

    fun setTitleColor(color: Int) {
        if (color != 0) {
            binding.textTitle.setTextColor(color)
        }
    }
}