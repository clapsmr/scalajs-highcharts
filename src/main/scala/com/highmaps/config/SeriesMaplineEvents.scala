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
  * @note JavaScript name: <code>series&lt;mapline&gt;-events</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMaplineEvents extends js.Object {

  /**
    * Fires when the checkbox next to the series' name in the legend is clicked. One parameter, <code>event</code>, is passed to the function. The state of the checkbox is found by <code>event.checked</code>. The checked item is found by <code>event.item</code>. Return <code>false</code> to prevent the default action which is to toggle the select state of the series.
    */
  val checkboxClick: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the series is clicked. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts. Additionally, <code>event.point</code> holds a pointer to the nearest point on the graph.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-events-click/" target="_blank">Display click info in subtitle</a>
    */
  val click: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the series is hidden after chart generation time, either by clicking the legend item or by calling <code>.hide()</code>.
    */
  val hide: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the legend item belonging to the series is clicked. One parameter, <code>event</code>, is passed to the function. The default action is to toggle the visibility of the series. This can be prevented by returning <code>false</code> or calling <code>event.preventDefault()</code>.
    */
  val legendItemClick: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the mouse leaves the graph. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts. If the  <a class="internal" href="#plotOptions.series">stickyTracking</a> option is true, <code>mouseOut</code> doesn't happen before the mouse enters another graph or leaves the plot area.
    */
  val mouseOut: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the mouse enters the graph. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.
    */
  val mouseOver: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the series is shown after chart generation time, either by clicking the legend item or by calling <code>.show()</code>.
    */
  val show: js.UndefOr[js.Function] = js.undefined
}

object SeriesMaplineEvents {
  /**
    * @param checkboxClick Fires when the checkbox next to the series' name in the legend is clicked. One parameter, <code>event</code>, is passed to the function. The state of the checkbox is found by <code>event.checked</code>. The checked item is found by <code>event.item</code>. Return <code>false</code> to prevent the default action which is to toggle the select state of the series.
    * @param click Fires when the series is clicked. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts. Additionally, <code>event.point</code> holds a pointer to the nearest point on the graph.
    * @param hide Fires when the series is hidden after chart generation time, either by clicking the legend item or by calling <code>.hide()</code>.
    * @param legendItemClick Fires when the legend item belonging to the series is clicked. One parameter, <code>event</code>, is passed to the function. The default action is to toggle the visibility of the series. This can be prevented by returning <code>false</code> or calling <code>event.preventDefault()</code>.
    * @param mouseOut Fires when the mouse leaves the graph. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts. If the  <a class="internal" href="#plotOptions.series">stickyTracking</a> option is true, <code>mouseOut</code> doesn't happen before the mouse enters another graph or leaves the plot area.
    * @param mouseOver Fires when the mouse enters the graph. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.
    * @param show Fires when the series is shown after chart generation time, either by clicking the legend item or by calling <code>.show()</code>.
    */
  def apply(checkboxClick: js.UndefOr[js.Function] = js.undefined, click: js.UndefOr[js.Function] = js.undefined, hide: js.UndefOr[js.Function] = js.undefined, legendItemClick: js.UndefOr[js.Function] = js.undefined, mouseOut: js.UndefOr[js.Function] = js.undefined, mouseOver: js.UndefOr[js.Function] = js.undefined, show: js.UndefOr[js.Function] = js.undefined): SeriesMaplineEvents = {
    val checkboxClickOuter: js.UndefOr[js.Function] = checkboxClick
    val clickOuter: js.UndefOr[js.Function] = click
    val hideOuter: js.UndefOr[js.Function] = hide
    val legendItemClickOuter: js.UndefOr[js.Function] = legendItemClick
    val mouseOutOuter: js.UndefOr[js.Function] = mouseOut
    val mouseOverOuter: js.UndefOr[js.Function] = mouseOver
    val showOuter: js.UndefOr[js.Function] = show
    new SeriesMaplineEvents {
      override val checkboxClick: js.UndefOr[js.Function] = checkboxClickOuter
      override val click: js.UndefOr[js.Function] = clickOuter
      override val hide: js.UndefOr[js.Function] = hideOuter
      override val legendItemClick: js.UndefOr[js.Function] = legendItemClickOuter
      override val mouseOut: js.UndefOr[js.Function] = mouseOutOuter
      override val mouseOver: js.UndefOr[js.Function] = mouseOverOuter
      override val show: js.UndefOr[js.Function] = showOuter
    }
  }
}
