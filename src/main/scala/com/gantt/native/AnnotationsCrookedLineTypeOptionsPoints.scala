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
  * @note JavaScript name: <code>annotations-crookedLine-typeOptions-points</code>
  */
class AnnotationsCrookedLineTypeOptionsPoints extends com.highcharts.HighchartsGenericObject {

  var controlPoint: js.UndefOr[Double] = js.undefined

  /**
    * <p>The x position of the point.</p>
    * @since 6.0.0
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The y position of the point.</p>
    * @since 6.0.0
    */
  var y: js.UndefOr[Double] = js.undefined
}

object AnnotationsCrookedLineTypeOptionsPoints {
  /**
    * @param x <p>The x position of the point.</p>
    * @param y <p>The y position of the point.</p>
    */
  def apply(controlPoint: js.UndefOr[Double] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): AnnotationsCrookedLineTypeOptionsPoints = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsCrookedLineTypeOptionsPoints {
      this.controlPoint = controlPoint
      this.x = x
      this.y = y
    })
  }
}
