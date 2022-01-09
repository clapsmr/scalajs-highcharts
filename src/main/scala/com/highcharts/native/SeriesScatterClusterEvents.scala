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
  * @note JavaScript name: <code>series&lt;scatter&gt;-cluster-events</code>
  */
class SeriesScatterClusterEvents extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Fires when the cluster point is clicked and <code>drillToCluster</code> is enabled.
    * One parameter, <code>event</code>, is passed to the function. The default action
    * is to zoom to the cluster points range. This can be prevented
    * by calling <code>event.preventDefault()</code>.</p>
    * @since 8.0.0
    */
  var drillToCluster: js.Any = js.undefined
}

object SeriesScatterClusterEvents {
  /**
    * @param drillToCluster <p>Fires when the cluster point is clicked and <code>drillToCluster</code> is enabled.. One parameter, <code>event</code>, is passed to the function. The default action. is to zoom to the cluster points range. This can be prevented. by calling <code>event.preventDefault()</code>.</p>
    */
  def apply(drillToCluster: js.UndefOr[js.Any] = js.undefined): SeriesScatterClusterEvents = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesScatterClusterEvents {
      this.drillToCluster = drillToCluster
    })
  }
}
