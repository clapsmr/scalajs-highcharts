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
  * @note JavaScript name: <code>series&lt;mappoint&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMappointStates extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Overrides for the normal state.</p>
    */
  val normal: js.UndefOr[CleanJsObject[SeriesMappointStatesNormal]] = js.undefined

  /**
    * <p>Options for the hovered series. These settings override the normal
    * state options when a series is moused over or touched.</p>
    */
  val hover: js.Any = js.undefined

  /**
    * <p>Specific options for point in selected states, after being selected
    * by <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> or
    * programmatically.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/">Allow point select demo</a>
    */
  val select: js.UndefOr[CleanJsObject[SeriesMappointStatesSelect]] = js.undefined
}

object SeriesMappointStates {
  /**
    * @param normal <p>Overrides for the normal state.</p>
    * @param hover <p>Options for the hovered series. These settings override the normal. state options when a series is moused over or touched.</p>
    * @param select <p>Specific options for point in selected states, after being selected. by <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> or. programmatically.</p>
    */
  def apply(normal: js.UndefOr[CleanJsObject[SeriesMappointStatesNormal]] = js.undefined, hover: js.UndefOr[js.Any] = js.undefined, select: js.UndefOr[CleanJsObject[SeriesMappointStatesSelect]] = js.undefined): SeriesMappointStates = {
    val normalOuter: js.UndefOr[CleanJsObject[SeriesMappointStatesNormal]] = normal
    val hoverOuter: js.Any = hover
    val selectOuter: js.UndefOr[CleanJsObject[SeriesMappointStatesSelect]] = select
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMappointStates {
      override val normal: js.UndefOr[CleanJsObject[SeriesMappointStatesNormal]] = normalOuter
      override val hover: js.Any = hoverOuter
      override val select: js.UndefOr[CleanJsObject[SeriesMappointStatesSelect]] = selectOuter
    })
  }
}
