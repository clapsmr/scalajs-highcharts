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
  * @note JavaScript name: <code>series&lt;heatmap&gt;-marker-states-normal</code>
  */
class SeriesHeatmapMarkerStatesNormal extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation when returning to normal state after hovering.</p>
    * @since 8.1
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined
}

object SeriesHeatmapMarkerStatesNormal {
  /**
    * @param animation <p>Animation when returning to normal state after hovering.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined): SeriesHeatmapMarkerStatesNormal = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesHeatmapMarkerStatesNormal {
      this.animation = animation
    })
  }
}
