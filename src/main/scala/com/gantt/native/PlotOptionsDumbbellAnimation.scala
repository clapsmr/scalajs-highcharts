/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-dumbbell-animation</code>
  */
class PlotOptionsDumbbellAnimation extends com.highcharts.HighchartsGenericObject {

  var defer: js.UndefOr[Double] = js.undefined

  var duration: js.UndefOr[Double] = js.undefined
}

object PlotOptionsDumbbellAnimation {
  /**
    */
  def apply(defer: js.UndefOr[Double] = js.undefined, duration: js.UndefOr[Double] = js.undefined): PlotOptionsDumbbellAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsDumbbellAnimation {
      this.defer = defer
      this.duration = duration
    })
  }
}
