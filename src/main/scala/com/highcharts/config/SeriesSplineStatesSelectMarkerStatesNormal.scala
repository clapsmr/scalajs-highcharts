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
  * @note JavaScript name: <code>series&lt;spline&gt;-states-select-marker-states-normal</code>
  */
@js.annotation.ScalaJSDefined
class SeriesSplineStatesSelectMarkerStatesNormal extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation when returning to normal state after hovering.</p>
    */
  val animation: js.UndefOr[Boolean | js.Object] = js.undefined
}

object SeriesSplineStatesSelectMarkerStatesNormal {
  /**
    * @param animation <p>Animation when returning to normal state after hovering.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined): SeriesSplineStatesSelectMarkerStatesNormal = {
    val animationOuter: js.UndefOr[Boolean | js.Object] = animation
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesSplineStatesSelectMarkerStatesNormal {
      override val animation: js.UndefOr[Boolean | js.Object] = animationOuter
    })
  }
}
