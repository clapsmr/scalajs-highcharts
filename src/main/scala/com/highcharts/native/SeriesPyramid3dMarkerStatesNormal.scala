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
  * @note JavaScript name: <code>series&lt;pyramid3d&gt;-marker-states-normal</code>
  */
class SeriesPyramid3dMarkerStatesNormal extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation when returning to normal state after hovering.</p>
    * @since 7.1.0
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined
}

object SeriesPyramid3dMarkerStatesNormal {
  /**
    * @param animation <p>Animation when returning to normal state after hovering.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined): SeriesPyramid3dMarkerStatesNormal = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesPyramid3dMarkerStatesNormal {
      this.animation = animation
    })
  }
}
