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
  * @note JavaScript name: <code>series&lt;histogram&gt;-lastVisiblePrice</code>
  */
class SeriesHistogramLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    * @since 6.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesHistogramLastVisiblePriceLabel]] = js.undefined
}

object SeriesHistogramLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesHistogramLastVisiblePriceLabel]] = js.undefined): SeriesHistogramLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesHistogramLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
