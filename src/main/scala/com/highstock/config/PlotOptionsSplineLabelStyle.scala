/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-spline-label-style</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsSplineLabelStyle extends com.highcharts.HighchartsGenericObject {

  val fontWeight: js.UndefOr[String] = js.undefined
}

object PlotOptionsSplineLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): PlotOptionsSplineLabelStyle = {
    val fontWeightOuter: js.UndefOr[String] = fontWeight
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSplineLabelStyle {
      override val fontWeight: js.UndefOr[String] = fontWeightOuter
    })
  }
}
