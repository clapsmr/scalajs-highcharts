/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>yAxis-title-style</code>
  */
class YAxisTitleStyle extends com.highcharts.HighchartsGenericObject {

  var color: js.UndefOr[String] = js.undefined
}

object YAxisTitleStyle {
  /**
    */
  def apply(color: js.UndefOr[String] = js.undefined): YAxisTitleStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new YAxisTitleStyle {
      this.color = color
    })
  }
}
