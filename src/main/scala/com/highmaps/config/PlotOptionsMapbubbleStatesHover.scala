/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-mapbubble-states-hover</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsMapbubbleStatesHover extends js.Object {

  /**
    * The border color of the point in this state.
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The border width of the point in this state
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * The relative brightness of the point when hovered, relative to the normal point color.
    */
  val brightness: js.UndefOr[Double] = js.undefined

  /**
    * The color of the shape in this state
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-states-hover/" target="_blank">Hover options</a>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Enable separate styles for the series in different states.
    */
  val enabled: js.UndefOr[Boolean] = js.undefined
}

object PlotOptionsMapbubbleStatesHover {
  /**
    * @param borderColor The border color of the point in this state.
    * @param borderWidth The border width of the point in this state
    * @param brightness The relative brightness of the point when hovered, relative to the normal point color.
    * @param color The color of the shape in this state
    * @param enabled Enable separate styles for the series in different states.
    */
  def apply(borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, brightness: js.UndefOr[Double] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined): PlotOptionsMapbubbleStatesHover = {
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val brightnessOuter: js.UndefOr[Double] = brightness
    val colorOuter: js.UndefOr[String | js.Object] = color
    val enabledOuter: js.UndefOr[Boolean] = enabled
    new PlotOptionsMapbubbleStatesHover {
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val brightness: js.UndefOr[Double] = brightnessOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
    }
  }
}
