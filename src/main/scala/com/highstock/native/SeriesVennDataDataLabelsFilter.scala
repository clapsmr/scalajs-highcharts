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
  * @note JavaScript name: <code>series&lt;venn&gt;-data-dataLabels-filter</code>
  */
class SeriesVennDataDataLabelsFilter extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The operator to compare by. Can be one of <code>&gt;</code>, <code>&lt;</code>, <code>&gt;=</code>, <code>&lt;=</code>,
    * <code>==</code>, and <code>===</code>.</p>
    * @since 6.0.3
    */
  var operator: js.UndefOr[String] = js.undefined

  /**
    * <p>The point property to filter by. Point options are passed
    * directly to properties, additionally there are <code>y</code> value,
    * <code>percentage</code> and others listed under {@link Highcharts.Point}
    * members.</p>
    * @since 6.0.3
    */
  var property: js.UndefOr[String] = js.undefined

  /**
    * <p>The value to compare against.</p>
    * @since 6.0.3
    */
  var value: js.UndefOr[Double] = js.undefined
}

object SeriesVennDataDataLabelsFilter {
  /**
    * @param operator <p>The operator to compare by. Can be one of <code>&gt;</code>, <code>&lt;</code>, <code>&gt;=</code>, <code>&lt;=</code>,. <code>==</code>, and <code>===</code>.</p>
    * @param property <p>The point property to filter by. Point options are passed. directly to properties, additionally there are <code>y</code> value,. <code>percentage</code> and others listed under {@link Highcharts.Point}. members.</p>
    * @param value <p>The value to compare against.</p>
    */
  def apply(operator: js.UndefOr[String] = js.undefined, property: js.UndefOr[String] = js.undefined, value: js.UndefOr[Double] = js.undefined): SeriesVennDataDataLabelsFilter = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesVennDataDataLabelsFilter {
      this.operator = operator
      this.property = property
      this.value = value
    })
  }
}
