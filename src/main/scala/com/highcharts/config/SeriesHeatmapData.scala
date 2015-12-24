/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.4 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class SeriesHeatmapData extends js.Object {
  
  /**
   * The color of the point. In heat maps the point color is rarely set explicitly, as we use the color to denote the <code>value</code>. Options for this are set in the <a href="#colorAxis">colorAxis</a> configuration.
   */
  val color: UndefOr[String] = js.undefined
  
  /**
   * Individual data label for each point. The options are the same as the ones for  <a class="internal" href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/point/datalabels/" target="_blank">Show a label for the last value</a>
   */
  val dataLabels: UndefOr[js.Object] = js.undefined
  
  /**
   * The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a> array to use for a drilldown for this point.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/drilldown/basic/" target="_blank">Basic drilldown</a>
   * @since 3.0.8
   */
  val drilldown: String = ""
  
  /**
   * Individual point events
   */
  val events: SeriesHeatmapDataEvents = new SeriesHeatmapDataEvents
  
  /**
   * An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/point/id/" target="_blank">Remove an id'd point</a>
   * @since 1.2.0
   */
  val id: UndefOr[String] = js.undefined
  
  /**
   * <p>The name of the point as shown in the legend, tooltip, dataLabel etc.</p>
   * 
   * <p>If the <a href="#xAxis.type">xAxis.type</a> is set to <code>category</code>, and no <a href="#xAxis.categories">categories</a> option exists, the category will be pulled from the <code>point.name</code> of the last series defined. For multiple series, best practice however is to define <code>xAxis.categories</code>.</p>
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/data-array-of-objects/" target="_blank">Point names</a>
   */
  val name: UndefOr[String] = js.undefined
  
  /**
   * Whether the data point is selected initially.
   */
  val selected: Boolean = false
  
  /**
   * The value of the point, resulting in a color controled by options as set in the <a href="#colorAxis">colorAxis</a> configuration.
   */
  val value: UndefOr[Double] = js.undefined
  
  /**
   * The x value of the point. For datetime axes, the X value is the timestamp in milliseconds since 1970.
   */
  val x: UndefOr[Double] = js.undefined
  
  /**
   * The y value of the point.
   */
  val y: UndefOr[Double] = js.undefined
}
