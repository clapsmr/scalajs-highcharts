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
  * @note JavaScript name: <code>series&lt;sankey&gt;-states-inactive</code>
  */
class SeriesSankeyStatesInactive extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Opacity for the links between nodes in the sankey diagram in
    * inactive mode.</p>
    */
  var linkOpacity: js.UndefOr[Double] = js.undefined

  /**
    * <p>Animation when not hovering over the marker.</p>
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>Enable or disable the inactive state for a series</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-inactive-disabled">Disabled inactive state</a>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Opacity of inactive markers.</p>
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object SeriesSankeyStatesInactive {
  /**
    * @param linkOpacity <p>Opacity for the links between nodes in the sankey diagram in. inactive mode.</p>
    * @param animation <p>Animation when not hovering over the marker.</p>
    * @param enabled <p>Enable or disable the inactive state for a series</p>
    * @param opacity <p>Opacity of inactive markers.</p>
    */
  def apply(linkOpacity: js.UndefOr[Double] = js.undefined, animation: js.UndefOr[Boolean | js.Object] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, opacity: js.UndefOr[Double] = js.undefined): SeriesSankeyStatesInactive = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesSankeyStatesInactive {
      this.linkOpacity = linkOpacity
      this.animation = animation
      this.enabled = enabled
      this.opacity = opacity
    })
  }
}
