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
  * @note JavaScript name: <code>series&lt;treemap&gt;-traverseUpButton-position</code>
  */
class SeriesTreemapTraverseUpButtonPosition extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Horizontal alignment of the button.</p>
    */
  var align: js.UndefOr[String] = js.undefined

  /**
    * <p>Vertical alignment of the button.</p>
    */
  var verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>Horizontal offset of the button.</p>
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>Vertical offset of the button.</p>
    */
  var y: js.UndefOr[Double] = js.undefined
}

object SeriesTreemapTraverseUpButtonPosition {
  /**
    * @param align <p>Horizontal alignment of the button.</p>
    * @param verticalAlign <p>Vertical alignment of the button.</p>
    * @param x <p>Horizontal offset of the button.</p>
    * @param y <p>Vertical offset of the button.</p>
    */
  def apply(align: js.UndefOr[String] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): SeriesTreemapTraverseUpButtonPosition = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesTreemapTraverseUpButtonPosition {
      this.align = align
      this.verticalAlign = verticalAlign
      this.x = x
      this.y = y
    })
  }
}
