package com.example.drivinglicense.component.dialog

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import androidx.appcompat.app.AlertDialog
import com.example.drivinglicense.R
import com.example.drivinglicense.databinding.DialogAlertMessageAppBinding

class AlertMessageDialog(val context: Context) {
    private val binding by lazy {
        DialogAlertMessageAppBinding.inflate(LayoutInflater.from(context))
    }

    private val dialog: AlertDialog by lazy {
        AlertDialog.Builder(context, R.style.dialog_transparent_width).setView(binding.root)
            .create()
    }

    var reloadWithFlag: ((flag: Int) -> Unit)? = null

    init {
//        binding.btnSubmit.setOnClickListener {
//            dialog.dismiss()
//        }
        dialog.window?.requestFeature(Window.FEATURE_NO_TITLE)
    }

    fun isShowing(): Boolean {
        return dialog.isShowing
    }

    fun hide() {
        dialog.dismiss()
    }

    fun show(
        title: String?,
        message: String? = "",
        buttonAction: String? = "",
        isActionCancel: Boolean = false,
        isAllCaps: Boolean = false,
        cancelAble: Boolean = true,
        onClickCancel: (() -> Unit?)? = null,
        onClickSubmit: (() -> Unit?)? = null,
    ) {
        if (!title.isNullOrBlank()) {
            binding.dialogTitle.text = title
            binding.dialogTitle.visibility = View.VISIBLE
            binding.viewGuideline.visibility = View.VISIBLE
        } else {
            binding.viewGuideline.visibility = View.GONE
            binding.dialogTitle.visibility = View.GONE
        }
        if (!message.isNullOrBlank()) binding.dialogMsg.text = message
        if (!buttonAction.isNullOrBlank()) binding.btnSubmit.text = buttonAction
        binding.dialogMsg.isAllCaps = isAllCaps

        binding.btnSubmit.setOnClickListener {
            onClickSubmit?.invoke()
            dialog.dismiss()
        }

        binding.btnSubmitCancel.setOnClickListener {
            onClickCancel?.invoke()
            dialog.dismiss()
        }

        if (isActionCancel) {
            binding.btnSubmitCancel.visibility = View.VISIBLE
        }


        dialog.setCancelable(cancelAble)

        if (!dialog.isShowing)
            dialog.show()
    }

    fun show(
        title: String?,
        messageRes: Int,
        buttonActionRes: Int,
        isAllCaps: Boolean = false,
        onClick: (() -> Unit?)? = null
    ) {
        if (!title.isNullOrBlank()) {
            binding.dialogTitle.text = title
            binding.dialogTitle.visibility = View.VISIBLE
            binding.viewGuideline.visibility = View.VISIBLE
        } else {
            binding.viewGuideline.visibility = View.GONE
            binding.dialogTitle.visibility = View.GONE
        }

        val message = context.getString(messageRes)
        val buttonAction = context.getString(buttonActionRes)

        if (!message.isNullOrBlank()) binding.dialogMsg.text = message
        if (!buttonAction.isNullOrBlank()) binding.btnSubmit.text = buttonAction
        binding.dialogMsg.isAllCaps = isAllCaps

        binding.btnSubmit.setOnClickListener {
            onClick?.invoke()
            dialog.dismiss()
        }

        if (!dialog.isShowing)
            dialog.show()
    }

    fun hideCancelButton() {
        binding.btnSubmitCancel.visibility = View.GONE
    }

    fun setBackgroundButtonSubmit(layout: Int) {
        if (layout != 0) {
            binding.btnSubmit.setBackgroundResource(layout)
        }
    }
}