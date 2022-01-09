/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-mfi-lastVisiblePrice</code>
  */
class PlotOptionsMfiLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    * @since 6.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[PlotOptionsMfiLastVisiblePriceLabel]] = js.undefined
}

object PlotOptionsMfiLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[PlotOptionsMfiLastVisiblePriceLabel]] = js.undefined): PlotOptionsMfiLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsMfiLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
