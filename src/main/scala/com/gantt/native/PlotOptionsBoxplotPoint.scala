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
  * @note JavaScript name: <code>plotOptions-boxplot-point</code>
  */
class PlotOptionsBoxplotPoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    */
  var events: js.Any = js.undefined
}

object PlotOptionsBoxplotPoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): PlotOptionsBoxplotPoint = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsBoxplotPoint {
      this.events = events
    })
  }
}
