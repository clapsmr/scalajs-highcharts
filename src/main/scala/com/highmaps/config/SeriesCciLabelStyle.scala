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
  * @note JavaScript name: <code>series&lt;cci&gt;-label-style</code>
  */
@js.annotation.ScalaJSDefined
class SeriesCciLabelStyle extends com.highcharts.HighchartsGenericObject {

  val fontWeight: js.UndefOr[String] = js.undefined
}

object SeriesCciLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): SeriesCciLabelStyle = {
    val fontWeightOuter: js.UndefOr[String] = fontWeight
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesCciLabelStyle {
      override val fontWeight: js.UndefOr[String] = fontWeightOuter
    })
  }
}
