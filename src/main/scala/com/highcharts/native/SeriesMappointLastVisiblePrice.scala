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
  * @note JavaScript name: <code>series&lt;mappoint&gt;-lastVisiblePrice</code>
  */
class SeriesMappointLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesMappointLastVisiblePriceLabel]] = js.undefined
}

object SeriesMappointLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesMappointLastVisiblePriceLabel]] = js.undefined): SeriesMappointLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMappointLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
