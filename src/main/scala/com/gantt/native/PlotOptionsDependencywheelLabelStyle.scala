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
  * @note JavaScript name: <code>plotOptions-dependencywheel-label-style</code>
  */
class PlotOptionsDependencywheelLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object PlotOptionsDependencywheelLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): PlotOptionsDependencywheelLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsDependencywheelLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}
