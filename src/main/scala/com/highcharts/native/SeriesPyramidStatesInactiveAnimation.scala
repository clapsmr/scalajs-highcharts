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
  * @note JavaScript name: <code>series&lt;pyramid&gt;-states-inactive-animation</code>
  */
class SeriesPyramidStatesInactiveAnimation extends com.highcharts.HighchartsGenericObject {

  var duration: js.UndefOr[Double] = js.undefined
}

object SeriesPyramidStatesInactiveAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): SeriesPyramidStatesInactiveAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesPyramidStatesInactiveAnimation {
      this.duration = duration
    })
  }
}
