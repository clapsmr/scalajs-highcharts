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
  * @note JavaScript name: <code>plotOptions-stochastic-smoothedLine</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsStochasticSmoothedLine extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Styles for a smoothed line.</p>
    * @since 6.0.0
    */
  val styles: js.Any = js.undefined
}

object PlotOptionsStochasticSmoothedLine {
  /**
    * @param styles <p>Styles for a smoothed line.</p>
    */
  def apply(styles: js.UndefOr[js.Any] = js.undefined): PlotOptionsStochasticSmoothedLine = {
    val stylesOuter: js.Any = styles
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsStochasticSmoothedLine {
      override val styles: js.Any = stylesOuter
    })
  }
}
