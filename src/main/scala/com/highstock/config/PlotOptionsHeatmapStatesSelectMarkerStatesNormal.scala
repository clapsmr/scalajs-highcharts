/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-heatmap-states-select-marker-states-normal</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsHeatmapStatesSelectMarkerStatesNormal extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation when returning to normal state after hovering.</p>
    */
  val animation: js.UndefOr[Boolean | js.Object] = js.undefined
}

object PlotOptionsHeatmapStatesSelectMarkerStatesNormal {
  /**
    * @param animation <p>Animation when returning to normal state after hovering.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined): PlotOptionsHeatmapStatesSelectMarkerStatesNormal = {
    val animationOuter: js.UndefOr[Boolean | js.Object] = animation
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsHeatmapStatesSelectMarkerStatesNormal {
      override val animation: js.UndefOr[Boolean | js.Object] = animationOuter
    })
  }
}
