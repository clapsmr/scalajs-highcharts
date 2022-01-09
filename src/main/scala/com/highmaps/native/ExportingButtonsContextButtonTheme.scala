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
  * @note JavaScript name: <code>exporting-buttons-contextButton-theme</code>
  */
class ExportingButtonsContextButtonTheme extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The default fill exists only to capture hover events.</p>
    */
  var fill: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Default stroke for the buttons.</p>
    */
  var stroke: js.UndefOr[String] = js.undefined
}

object ExportingButtonsContextButtonTheme {
  /**
    * @param fill <p>The default fill exists only to capture hover events.</p>
    * @param stroke <p>Default stroke for the buttons.</p>
    */
  def apply(fill: js.UndefOr[String | js.Object] = js.undefined, stroke: js.UndefOr[String] = js.undefined): ExportingButtonsContextButtonTheme = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ExportingButtonsContextButtonTheme {
      this.fill = fill
      this.stroke = stroke
    })
  }
}
