/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-map-point-events</code>
  */
class PlotOptionsMapPointEvents extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Fires when a point is clicked. One parameter, <code>event</code>, is passed
    * to the function, containing common event information.</p>
    * <p>If the <code>series.allowPointSelect</code> option is true, the default
    * action for the point&#39;s click event is to toggle the point&#39;s
    * select state. Returning <code>false</code> cancels this action.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-click/">Click marker to alert values</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-click-column/">Click column</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-click-url/">Go to URL</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-point-events-click/">Click marker to display values</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-point-events-click-url/">Go to URL</a>
    */
  var click: js.Any = js.undefined

  /**
    * <p>Callback that fires while dragging a point. The mouse event is passed in as
    * parameter. The original data can be accessed from <code>e.origin</code>, and the new
    * point values can be accessed from <code>e.newPoints</code>. If there is only a single
    * point being updated, it can be accessed from <code>e.newPoint</code> for simplicity, and
    * its ID can be accessed from <code>e.newPointId</code>. The <code>this</code> context is the point
    * being dragged. To stop the default drag action, return false. See
    * <a href="plotOptions.series.dragDrop">drag and drop options</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Drag events</a>
    * @since 6.2.0
    */
  var drag: js.Any = js.undefined

  /**
    * <p>Callback that fires when starting to drag a point. The mouse event object is
    * passed in as an argument. If a drag handle is used, <code>e.updateProp</code> is set to
    * the data property being dragged. The <code>this</code> context is the point. See
    * <a href="plotOptions.series.dragDrop">drag and drop options</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Drag events</a>
    * @since 6.2.0
    */
  var dragStart: js.Any = js.undefined

  /**
    * <p>Callback that fires when the point is dropped. The parameters passed are the
    * same as for <a href="#plotOptions.series.point.events.drag">drag</a>. To stop the
    * default drop action, return false. See
    * <a href="plotOptions.series.dragDrop">drag and drop options</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Drag events</a>
    * @since 6.2.0
    */
  var drop: js.Any = js.undefined

  /**
    * <p>Fires when the mouse leaves the area close to the point. One
    * parameter, <code>event</code>, is passed to the function, containing common
    * event information.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-mouseover/">Show values in the chart's corner on mouse over</a>
    */
  var mouseOut: js.Any = js.undefined

  /**
    * <p>Fires when the mouse enters the area close to the point. One
    * parameter, <code>event</code>, is passed to the function, containing common
    * event information.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-mouseover/">Show values in the chart's corner on mouse over</a>
    */
  var mouseOver: js.Any = js.undefined

  /**
    * <p>Fires when the point is removed using the <code>.remove()</code> method. One
    * parameter, <code>event</code>, is passed to the function. Returning <code>false</code>
    * cancels the operation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-remove/">Remove point and confirm</a>
    * @since 1.2.0
    */
  var remove: js.Any = js.undefined

  /**
    * <p>Fires when the point is selected either programmatically or
    * following a click on the point. One parameter, <code>event</code>, is passed
    * to the function. Returning <code>false</code> cancels the operation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-select/">Report the last selected point</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/">Report select and unselect</a>
    * @since 1.2.0
    */
  var select: js.Any = js.undefined

  /**
    * <p>Fires when the point is unselected either programmatically or
    * following a click on the point. One parameter, <code>event</code>, is passed
    * to the function.
    *  Returning <code>false</code> cancels the operation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-unselect/">Report the last unselected point</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/">Report select and unselect</a>
    * @since 1.2.0
    */
  var unselect: js.Any = js.undefined

  /**
    * <p>Fires when the point is updated programmatically through the
    * <code>.update()</code> method. One parameter, <code>event</code>, is passed to the
    * function. The new point options can be accessed through
    * <code>event.options</code>. Returning <code>false</code> cancels the operation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-update/">Confirm point updating</a>
    * @since 1.2.0
    */
  var update: js.Any = js.undefined
}

object PlotOptionsMapPointEvents {
  /**
    * @param click <p>Fires when a point is clicked. One parameter, <code>event</code>, is passed. to the function, containing common event information.</p>. <p>If the <code>series.allowPointSelect</code> option is true, the default. action for the point&#39;s click event is to toggle the point&#39;s. select state. Returning <code>false</code> cancels this action.</p>
    * @param drag <p>Callback that fires while dragging a point. The mouse event is passed in as. parameter. The original data can be accessed from <code>e.origin</code>, and the new. point values can be accessed from <code>e.newPoints</code>. If there is only a single. point being updated, it can be accessed from <code>e.newPoint</code> for simplicity, and. its ID can be accessed from <code>e.newPointId</code>. The <code>this</code> context is the point. being dragged. To stop the default drag action, return false. See. <a href="plotOptions.series.dragDrop">drag and drop options</a>.</p>
    * @param dragStart <p>Callback that fires when starting to drag a point. The mouse event object is. passed in as an argument. If a drag handle is used, <code>e.updateProp</code> is set to. the data property being dragged. The <code>this</code> context is the point. See. <a href="plotOptions.series.dragDrop">drag and drop options</a>.</p>
    * @param drop <p>Callback that fires when the point is dropped. The parameters passed are the. same as for <a href="#plotOptions.series.point.events.drag">drag</a>. To stop the. default drop action, return false. See. <a href="plotOptions.series.dragDrop">drag and drop options</a>.</p>
    * @param mouseOut <p>Fires when the mouse leaves the area close to the point. One. parameter, <code>event</code>, is passed to the function, containing common. event information.</p>
    * @param mouseOver <p>Fires when the mouse enters the area close to the point. One. parameter, <code>event</code>, is passed to the function, containing common. event information.</p>
    * @param remove <p>Fires when the point is removed using the <code>.remove()</code> method. One. parameter, <code>event</code>, is passed to the function. Returning <code>false</code>. cancels the operation.</p>
    * @param select <p>Fires when the point is selected either programmatically or. following a click on the point. One parameter, <code>event</code>, is passed. to the function. Returning <code>false</code> cancels the operation.</p>
    * @param unselect <p>Fires when the point is unselected either programmatically or. following a click on the point. One parameter, <code>event</code>, is passed. to the function..  Returning <code>false</code> cancels the operation.</p>
    * @param update <p>Fires when the point is updated programmatically through the. <code>.update()</code> method. One parameter, <code>event</code>, is passed to the. function. The new point options can be accessed through. <code>event.options</code>. Returning <code>false</code> cancels the operation.</p>
    */
  def apply(click: js.UndefOr[js.Any] = js.undefined, drag: js.UndefOr[js.Any] = js.undefined, dragStart: js.UndefOr[js.Any] = js.undefined, drop: js.UndefOr[js.Any] = js.undefined, mouseOut: js.UndefOr[js.Any] = js.undefined, mouseOver: js.UndefOr[js.Any] = js.undefined, remove: js.UndefOr[js.Any] = js.undefined, select: js.UndefOr[js.Any] = js.undefined, unselect: js.UndefOr[js.Any] = js.undefined, update: js.UndefOr[js.Any] = js.undefined): PlotOptionsMapPointEvents = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsMapPointEvents {
      this.click = click
      this.drag = drag
      this.dragStart = dragStart
      this.drop = drop
      this.mouseOut = mouseOut
      this.mouseOver = mouseOver
      this.remove = remove
      this.select = select
      this.unselect = unselect
      this.update = update
    })
  }
}
/**
  * @note JavaScript name: <code>plotOptions-mappoint-events</code>
  */
class PlotOptionsMappointEvents extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Fires after the series has finished its initial animation, or in case
    * animation is disabled, immediately as the series is displayed.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-afteranimate/">Show label after animate</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-afteranimate/">Show label after animate</a>
    * @since 4.0.0
    */
  var afterAnimate: js.Any = js.undefined

  /**
    * <p>Fires when the checkbox next to the series&#39; name in the legend is
    * clicked. One parameter, <code>event</code>, is passed to the function. The state
    * of the checkbox is found by <code>event.checked</code>. The checked item is
    * found by <code>event.item</code>. Return <code>false</code> to prevent the default action
    * which is to toggle the select state of the series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-checkboxclick/">Alert checkbox status</a>
    * @since 1.2.0
    */
  var checkboxClick: js.Any = js.undefined

  /**
    * <p>Fires when the series is clicked. One parameter, <code>event</code>, is passed
    * to the function, containing common event information. Additionally,
    * <code>event.point</code> holds a pointer to the nearest point on the graph.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-click/">Alert click info</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-events-click/">Alert click info</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-events-click/">Display click info in subtitle</a>
    */
  var click: js.Any = js.undefined

  /**
    * <p>Fires when the series is hidden after chart generation time, either
    * by clicking the legend item or by calling <code>.hide()</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-hide/">Alert when the series is hidden by clicking the legend item</a>
    * @since 1.2.0
    */
  var hide: js.Any = js.undefined

  /**
    * <p>Fires when the legend item belonging to the series is clicked. One
    * parameter, <code>event</code>, is passed to the function. The default action
    * is to toggle the visibility of the series. This can be prevented
    * by returning <code>false</code> or calling <code>event.preventDefault()</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-legenditemclick/">Confirm hiding and showing</a>
    */
  var legendItemClick: js.Any = js.undefined

  /**
    * <p>Fires when the mouse leaves the graph. One parameter, <code>event</code>, is
    * passed to the function, containing common event information. If the
    * <a href="#plotOptions.series">stickyTracking</a> option is true, <code>mouseOut</code>
    * doesn&#39;t happen before the mouse enters another graph or leaves the
    * plot area.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-mouseover-sticky/">With sticky tracking by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-mouseover-no-sticky/">Without sticky tracking</a>
    */
  var mouseOut: js.Any = js.undefined

  /**
    * <p>Fires when the mouse enters the graph. One parameter, <code>event</code>, is
    * passed to the function, containing common event information.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-mouseover-sticky/">With sticky tracking by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-mouseover-no-sticky/">Without sticky tracking</a>
    */
  var mouseOver: js.Any = js.undefined

  /**
    * <p>Fires when the series is shown after chart generation time, either
    * by clicking the legend item or by calling <code>.show()</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-show/">Alert when the series is shown by clicking the legend item.</a>
    * @since 1.2.0
    */
  var show: js.Any = js.undefined
}

object PlotOptionsMappointEvents {
  /**
    * @param afterAnimate <p>Fires after the series has finished its initial animation, or in case. animation is disabled, immediately as the series is displayed.</p>
    * @param checkboxClick <p>Fires when the checkbox next to the series&#39; name in the legend is. clicked. One parameter, <code>event</code>, is passed to the function. The state. of the checkbox is found by <code>event.checked</code>. The checked item is. found by <code>event.item</code>. Return <code>false</code> to prevent the default action. which is to toggle the select state of the series.</p>
    * @param click <p>Fires when the series is clicked. One parameter, <code>event</code>, is passed. to the function, containing common event information. Additionally,. <code>event.point</code> holds a pointer to the nearest point on the graph.</p>
    * @param hide <p>Fires when the series is hidden after chart generation time, either. by clicking the legend item or by calling <code>.hide()</code>.</p>
    * @param legendItemClick <p>Fires when the legend item belonging to the series is clicked. One. parameter, <code>event</code>, is passed to the function. The default action. is to toggle the visibility of the series. This can be prevented. by returning <code>false</code> or calling <code>event.preventDefault()</code>.</p>
    * @param mouseOut <p>Fires when the mouse leaves the graph. One parameter, <code>event</code>, is. passed to the function, containing common event information. If the. <a href="#plotOptions.series">stickyTracking</a> option is true, <code>mouseOut</code>. doesn&#39;t happen before the mouse enters another graph or leaves the. plot area.</p>
    * @param mouseOver <p>Fires when the mouse enters the graph. One parameter, <code>event</code>, is. passed to the function, containing common event information.</p>
    * @param show <p>Fires when the series is shown after chart generation time, either. by clicking the legend item or by calling <code>.show()</code>.</p>
    */
  def apply(afterAnimate: js.UndefOr[js.Any] = js.undefined, checkboxClick: js.UndefOr[js.Any] = js.undefined, click: js.UndefOr[js.Any] = js.undefined, hide: js.UndefOr[js.Any] = js.undefined, legendItemClick: js.UndefOr[js.Any] = js.undefined, mouseOut: js.UndefOr[js.Any] = js.undefined, mouseOver: js.UndefOr[js.Any] = js.undefined, show: js.UndefOr[js.Any] = js.undefined): PlotOptionsMappointEvents = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsMappointEvents {
      this.afterAnimate = afterAnimate
      this.checkboxClick = checkboxClick
      this.click = click
      this.hide = hide
      this.legendItemClick = legendItemClick
      this.mouseOut = mouseOut
      this.mouseOver = mouseOver
      this.show = show
    })
  }
}
