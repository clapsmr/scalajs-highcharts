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
  * @note JavaScript name: <code>plotOptions-pareto-states-inactive-animation</code>
  */
class PlotOptionsParetoStatesInactiveAnimation extends com.highcharts.HighchartsGenericObject {

  var duration: js.UndefOr[Double] = js.undefined
}

object PlotOptionsParetoStatesInactiveAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): PlotOptionsParetoStatesInactiveAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsParetoStatesInactiveAnimation {
      this.duration = duration
    })
  }
}
