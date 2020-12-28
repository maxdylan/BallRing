package com.lt.view.ballring

import android.content.Context
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class BallRingView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    val ballPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    val ringPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    var ballRadius = 0
    var ringRadius = 0
    var ringWidth = 0

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
    }

}