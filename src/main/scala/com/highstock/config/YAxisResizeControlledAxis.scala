/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>yAxis-resize-controlledAxis</code>
  */
@js.annotation.ScalaJSDefined
class YAxisResizeControlledAxis extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Array of axes that should move out of the way of resizing
    * being done for the current axis. If not set, the next axis
    * will be used.</p>
    * <p>This feature requires the <code>drag-panes.js</code> module.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/multiple-resizers">Three panes with resizers</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/resize-multiple-axes">One resizer controlling multiple axes</a>
    */
  val next: js.UndefOr[js.Array[String | Double]] = js.undefined

  /**
    * <p>Array of axes that should move with the current axis
    * while resizing.</p>
    * <p>This feature requires the <code>drag-panes.js</code> module.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/multiple-resizers">Three panes with resizers</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/resize-multiple-axes">One resizer controlling multiple axes</a>
    */
  val prev: js.UndefOr[js.Array[String | Double]] = js.undefined
}

object YAxisResizeControlledAxis {
  /**
    * @param next <p>Array of axes that should move out of the way of resizing. being done for the current axis. If not set, the next axis. will be used.</p>. <p>This feature requires the <code>drag-panes.js</code> module.</p>
    * @param prev <p>Array of axes that should move with the current axis. while resizing.</p>. <p>This feature requires the <code>drag-panes.js</code> module.</p>
    */
  def apply(next: js.UndefOr[js.Array[String | Double]] = js.undefined, prev: js.UndefOr[js.Array[String | Double]] = js.undefined): YAxisResizeControlledAxis = {
    val nextOuter: js.UndefOr[js.Array[String | Double]] = next
    val prevOuter: js.UndefOr[js.Array[String | Double]] = prev
    com.highcharts.HighchartsGenericObject.toCleanObject(new YAxisResizeControlledAxis {
      override val next: js.UndefOr[js.Array[String | Double]] = nextOuter
      override val prev: js.UndefOr[js.Array[String | Double]] = prevOuter
    })
  }
}
