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
  * @note JavaScript name: <code>yAxis-dateTimeLabelFormats-millisecond</code>
  */
@js.annotation.ScalaJSDefined
class YAxisDateTimeLabelFormatsMillisecond extends com.highcharts.HighchartsGenericObject {

  val main: js.UndefOr[String] = js.undefined

  val range: js.UndefOr[Boolean] = js.undefined
}

object YAxisDateTimeLabelFormatsMillisecond {
  /**
    */
  def apply(main: js.UndefOr[String] = js.undefined, range: js.UndefOr[Boolean] = js.undefined): YAxisDateTimeLabelFormatsMillisecond = {
    val mainOuter: js.UndefOr[String] = main
    val rangeOuter: js.UndefOr[Boolean] = range
    com.highcharts.HighchartsGenericObject.toCleanObject(new YAxisDateTimeLabelFormatsMillisecond {
      override val main: js.UndefOr[String] = mainOuter
      override val range: js.UndefOr[Boolean] = rangeOuter
    })
  }
}
