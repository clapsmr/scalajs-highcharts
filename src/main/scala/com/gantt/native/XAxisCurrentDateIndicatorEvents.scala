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
  * @note JavaScript name: <code>xAxis-currentDateIndicator-events</code>
  */
class XAxisCurrentDateIndicatorEvents extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Click event on a plot band.</p>
    * @since 1.2.0
    */
  var click: js.Any = js.undefined

  /**
    * <p>Mouse move event on a plot band.</p>
    * @since 1.2.0
    */
  var mousemove: js.Any = js.undefined

  /**
    * <p>Mouse out event on the corner of a plot band.</p>
    * @since 1.2.0
    */
  var mouseout: js.Any = js.undefined

  /**
    * <p>Mouse over event on a plot band.</p>
    * @since 1.2.0
    */
  var mouseover: js.Any = js.undefined
}

object XAxisCurrentDateIndicatorEvents {
  /**
    * @param click <p>Click event on a plot band.</p>
    * @param mousemove <p>Mouse move event on a plot band.</p>
    * @param mouseout <p>Mouse out event on the corner of a plot band.</p>
    * @param mouseover <p>Mouse over event on a plot band.</p>
    */
  def apply(click: js.UndefOr[js.Any] = js.undefined, mousemove: js.UndefOr[js.Any] = js.undefined, mouseout: js.UndefOr[js.Any] = js.undefined, mouseover: js.UndefOr[js.Any] = js.undefined): XAxisCurrentDateIndicatorEvents = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new XAxisCurrentDateIndicatorEvents {
      this.click = click
      this.mousemove = mousemove
      this.mouseout = mouseout
      this.mouseover = mouseover
    })
  }
}
