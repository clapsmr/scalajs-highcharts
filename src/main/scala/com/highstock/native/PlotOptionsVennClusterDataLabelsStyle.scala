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
  * @note JavaScript name: <code>plotOptions-venn-cluster-dataLabels-style</code>
  */
class PlotOptionsVennClusterDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var color: js.UndefOr[String] = js.undefined
}

object PlotOptionsVennClusterDataLabelsStyle {
  /**
    */
  def apply(color: js.UndefOr[String] = js.undefined): PlotOptionsVennClusterDataLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsVennClusterDataLabelsStyle {
      this.color = color
    })
  }
}
