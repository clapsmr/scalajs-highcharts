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
  * @note JavaScript name: <code>plotOptions-pareto-marker-states-hover-animation</code>
  */
class PlotOptionsParetoMarkerStatesHoverAnimation extends com.highcharts.HighchartsGenericObject {

  var duration: js.UndefOr[Double] = js.undefined
}

object PlotOptionsParetoMarkerStatesHoverAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): PlotOptionsParetoMarkerStatesHoverAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsParetoMarkerStatesHoverAnimation {
      this.duration = duration
    })
  }
}
