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
  * @note JavaScript name: <code>annotations-events</code>
  */
class AnnotationsEvents extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Event callback when annotation is added to the chart.</p>
    * @since 7.1.0
    */
  var add: js.Any = js.undefined

  /**
    * <p>Event callback when annotation is updated (e.g. drag and
    * droppped or resized by control points).</p>
    * @since 7.1.0
    */
  var afterUpdate: js.Any = js.undefined

  /**
    * <p>Event callback when annotation is removed from the chart.</p>
    * @since 7.1.0
    */
  var remove: js.Any = js.undefined
}

object AnnotationsEvents {
  /**
    * @param add <p>Event callback when annotation is added to the chart.</p>
    * @param afterUpdate <p>Event callback when annotation is updated (e.g. drag and. droppped or resized by control points).</p>
    * @param remove <p>Event callback when annotation is removed from the chart.</p>
    */
  def apply(add: js.UndefOr[js.Any] = js.undefined, afterUpdate: js.UndefOr[js.Any] = js.undefined, remove: js.UndefOr[js.Any] = js.undefined): AnnotationsEvents = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsEvents {
      this.add = add
      this.afterUpdate = afterUpdate
      this.remove = remove
    })
  }
}
