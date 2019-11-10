package com.takusemba.spotlight.effet

import android.animation.TimeInterpolator
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.PointF
import android.view.animation.DecelerateInterpolator
import java.util.concurrent.TimeUnit

/**
 * Additional effect drawing in loop to Shape.
 */
interface Effect {

  /**
   * [duration] to draw Effect.
   */
  val duration: Long

  /**
   * [interpolator] to draw Effect.
   */
  val interpolator: TimeInterpolator

  /**
   * Draw the Effect.
   *
   * @param value the animated value from 0 to 1 and this value is looped until Target finishes.
   */
  fun draw(canvas: Canvas, point: PointF, value: Float, paint: Paint)

  companion object {

    val DEFAULT_DURATION = TimeUnit.MILLISECONDS.toMillis(1000)

    val DEFAULT_INTERPOLATOR = DecelerateInterpolator(2f)
  }
}