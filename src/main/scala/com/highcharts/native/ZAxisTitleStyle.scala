/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>zAxis-title-style</code>
  */
class ZAxisTitleStyle extends com.highcharts.HighchartsGenericObject {

  var color: js.UndefOr[String] = js.undefined
}

object ZAxisTitleStyle {
  /**
    */
  def apply(color: js.UndefOr[String] = js.undefined): ZAxisTitleStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ZAxisTitleStyle {
      this.color = color
    })
  }
}
