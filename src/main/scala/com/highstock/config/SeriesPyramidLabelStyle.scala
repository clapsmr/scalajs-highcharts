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
  * @note JavaScript name: <code>series&lt;pyramid&gt;-label-style</code>
  */
@js.annotation.ScalaJSDefined
class SeriesPyramidLabelStyle extends com.highcharts.HighchartsGenericObject {

  val fontWeight: js.UndefOr[String] = js.undefined
}

object SeriesPyramidLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): SeriesPyramidLabelStyle = {
    val fontWeightOuter: js.UndefOr[String] = fontWeight
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesPyramidLabelStyle {
      override val fontWeight: js.UndefOr[String] = fontWeightOuter
    })
  }
}
