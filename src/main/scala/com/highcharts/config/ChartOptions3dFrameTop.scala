/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>chart-options3d-frame-top</code>
  */
@js.annotation.ScalaJSDefined
class ChartOptions3dFrameTop extends js.Object {

  /**
    * The color of the panel.
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The pixel thickness of the panel.
    */
  val size: js.UndefOr[Double] = js.undefined
}

object ChartOptions3dFrameTop {
  /**
    * @param color The color of the panel.
    * @param size The pixel thickness of the panel.
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, size: js.UndefOr[Double] = js.undefined): ChartOptions3dFrameTop = {
    val colorOuter: js.UndefOr[String | js.Object] = color
    val sizeOuter: js.UndefOr[Double] = size
    new ChartOptions3dFrameTop {
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val size: js.UndefOr[Double] = sizeOuter
    }
  }
}
