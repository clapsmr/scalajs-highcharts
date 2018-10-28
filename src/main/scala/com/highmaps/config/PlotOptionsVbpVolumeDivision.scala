/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-vbp-volumeDivision</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsVbpVolumeDivision extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Option to control if volume is divided.</p>
    * @since 6.0.0
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  val styles: js.Any = js.undefined
}

object PlotOptionsVbpVolumeDivision {
  /**
    * @param enabled <p>Option to control if volume is divided.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, styles: js.UndefOr[js.Any] = js.undefined): PlotOptionsVbpVolumeDivision = {
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val stylesOuter: js.Any = styles
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsVbpVolumeDivision {
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val styles: js.Any = stylesOuter
    })
  }
}
