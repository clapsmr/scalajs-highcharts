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
  * @note JavaScript name: <code>plotOptions-linearregressionangle-zones</code>
  */
class PlotOptionsLinearregressionangleZones extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Styled mode only. A custom class name for the zone.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/color-zones/">Zones styled by class name</a>
    * @since 5.0.0
    */
  var className: js.UndefOr[String] = js.undefined

  /**
    * <p>Defines the color of the series.</p>
    * @since 4.1.0
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>A name for the dash style to use for the graph.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/color-zones-dashstyle-dot/">Dashed line indicates prognosis</a>
    * @since 4.1.0
    */
  var dashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>Defines the fill color for the series (in area type series)</p>
    * @since 4.1.0
    */
  var fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The value up to where the zone extends, if undefined the zones
    * stretches to the last value in the series.</p>
    * @since 4.1.0
    */
  var value: js.UndefOr[Double] = js.undefined
}

object PlotOptionsLinearregressionangleZones {
  /**
    * @param className <p>Styled mode only. A custom class name for the zone.</p>
    * @param color <p>Defines the color of the series.</p>
    * @param dashStyle <p>A name for the dash style to use for the graph.</p>
    * @param fillColor <p>Defines the fill color for the series (in area type series)</p>
    * @param value <p>The value up to where the zone extends, if undefined the zones. stretches to the last value in the series.</p>
    */
  def apply(className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, dashStyle: js.UndefOr[String] = js.undefined, fillColor: js.UndefOr[String | js.Object] = js.undefined, value: js.UndefOr[Double] = js.undefined): PlotOptionsLinearregressionangleZones = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsLinearregressionangleZones {
      this.className = className
      this.color = color
      this.dashStyle = dashStyle
      this.fillColor = fillColor
      this.value = value
    })
  }
}
