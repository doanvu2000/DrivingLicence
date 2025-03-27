package com.jin.drivinglicence.utils

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition

fun ImageView.loadSrc(src: Any) {
    loadSrcCacheResource(src)
}

fun ImageView.loadSrcError(src: Any, error: Int) {
    loadSrcCacheResource(src, error)
}

fun ImageView.loadSrcNoCache(src: Any) {
    context ?: return
    try {
        Glide.with(context).load(src).skipMemoryCache(true)
            .diskCacheStrategy(DiskCacheStrategy.NONE).into(this)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun ImageView.loadSrcNoCache(src: Any, placeHolder: Int, error: Int) {
    context ?: return
    try {
        Glide.with(context).load(src).placeholder(placeHolder).error(error).skipMemoryCache(true)
            .diskCacheStrategy(DiskCacheStrategy.NONE).into(this)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun ImageView.loadSrcCacheResource(url: Any, error: Int) {
    context ?: return
    try {
        Glide.with(this).load(url).skipMemoryCache(true)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE).error(error).into(this)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun ImageView.loadSrcCacheResource(url: Any) {
    context ?: return
    try {
        Glide.with(this).load(url).skipMemoryCache(true)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE).into(this)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun ImageView.loadSrcCacheData(url: Any, error: Int) {
    context ?: return
    try {
        Glide.with(this).load(url).skipMemoryCache(true)
            .diskCacheStrategy(DiskCacheStrategy.DATA).error(error).into(this)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun ImageView.loadSrcCacheData(url: Any) {
    context ?: return
    try {
        Glide.with(this).load(url).skipMemoryCache(true)
            .diskCacheStrategy(DiskCacheStrategy.DATA).into(this)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun ImageView.loadSrcCacheAll(url: Any, error: Int) {
    context ?: return
    try {
        Glide.with(this).load(url).skipMemoryCache(true)
            .diskCacheStrategy(DiskCacheStrategy.ALL).error(error).into(this)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun ImageView.loadSrcCacheAll(url: Any) {
    context ?: return
    try {
        Glide.with(this).load(url).skipMemoryCache(true)
            .diskCacheStrategy(DiskCacheStrategy.ALL).into(this)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun ImageView.loadSrc(src: Any, placeHolder: Int, error: Int) {
    context ?: return
    try {
        Glide.with(context).load(src).timeout(15000).placeholder(placeHolder).error(error)
            .skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.RESOURCE).into(this)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun Context.glideLoadBitmap(
    url: Any, onDone: (Bitmap?) -> Unit,
    onFailed: (() -> Unit)
) {
    val target = object : CustomTarget<Bitmap>() {
        override fun onResourceReady(resource: Bitmap, transition: Transition<in Bitmap>?) {
            onDone(resource)
        }

        override fun onLoadFailed(errorDrawable: Drawable?) {
            super.onLoadFailed(errorDrawable)
            onFailed()
        }

        override fun onLoadCleared(placeholder: Drawable?) {

        }
    }
    Glide.with(this).asBitmap().load(url).skipMemoryCache(false)
        .diskCacheStrategy(DiskCacheStrategy.NONE).timeout(15000).into(target)
}

const val ROOT_ASSET = "file:///android_asset"