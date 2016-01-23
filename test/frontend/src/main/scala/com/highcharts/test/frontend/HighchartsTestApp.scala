package com.highcharts.test.frontend

import com.highcharts.HighchartsUtils._
import com.highcharts.config.HighchartsConfig
import com.highcharts.test.frontend.charts.{Test3dPieChartConfig, TestBarChartConfig}
import org.scalajs.dom
import org.scalajs.jquery._

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport
import scalatags.JsDom.all._

@JSExport
object HighchartsTestApp extends JSApp {
  private def resizeToContainer(container: dom.Element, chart: dom.Element): Unit = {
    val (width, height) = jQuery(container) match { case jq ⇒
      (jq.width(), jq.height())
    }
    jQuery(chart).highcharts().foreach(_.setSize(width, height))
  }

  private def renderChart(chartConfig: HighchartsConfig): dom.Element = {
    val container = div().render
    jQuery(container).highcharts(chartConfig)
    container
  }

  @JSExport
  override def main(): Unit = {
    jQuery(() ⇒ {
      // Create charts
      val barChart = renderChart(new TestBarChartConfig)
      val pieChart = renderChart(new Test3dPieChartConfig)

      // Create navigation elements
      val tabs = new NavigationBar("highcharts-test",
        NavigationTab("Bar chart", "bar", "briefcase", barChart, active = true),
        NavigationTab("Pie chart", "pie", "adjust", pieChart)
      )

      // Bootstrap container
      val container = div(id := "main-container", `class` := "container")(
        div(`class` := "row", div(`class` := "col-md-12")(
          tabs.content
        ))
      ).render

      // Render page
      val body = jQuery(dom.document.body)
      body.append(tabs.navbar("Scala.js Highcharts Test").render)
      body.append(container)

      // Size fix
      Seq(barChart, pieChart).foreach(resizeToContainer(container, _))
    })
  }
}