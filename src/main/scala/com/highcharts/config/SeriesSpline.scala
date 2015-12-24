/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.4 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class SeriesSpline extends js.Object {
  
  /**
   * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-allowpointselect-line/" target="_blank">Line</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-allowpointselect-column/" target="_blank">column</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-allowpointselect-pie/" target="_blank">pie</a>
   * @since 1.2.0
   */
  val allowPointSelect: Boolean = false
  
  /**
   * <p>Enable or disable the initial animation when a series is displayed. The animation can also be set as a configuration object. Please note that this option only applies to the initial animation of the series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods.		The following properties are supported:</p>
   * <dl>
   *   <dt>duration</dt>
   *   <dd>The duration of the animation in milliseconds.</dd>
   * <dt>easing</dt>
   * <dd>A string reference to an easing function set on the <code>Math</code> object. See <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">the easing demo</a>.</dd>
   * </dl>
   * <p>
   * Due to poor performance, animation is disabled in old IE browsers for column charts and polar charts.</p>
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-animation-disabled/" target="_blank">Animation disabled</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-animation-slower/" target="_blank">slower animation</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-animation-easing/" target="_blank">easing "easeOutBounce" through jQuery UI</a>.
   */
  val animation: Boolean = true
  
  /**
   * The main color or the series. In line type series it applies to the line and the point markers unless otherwise specified. In bar type series it applies to the bars unless a color is specified per point. The default value is pulled from the  <code>options.colors</code> array.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-color-general/" target="_blank">General plot option</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-color-specific/" target="_blank">one specific series</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-color-area/" target="_blank">area color</a>
   */
  val color: UndefOr[String] = js.undefined
  
  /**
   * Polar charts only. Whether to connect the ends of a line series plot across the extremes.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/line-connectends-false/" target="_blank">Do not connect</a>
   * @since 2.3.0
   */
  val connectEnds: Boolean = true
  
  /**
   * Whether to connect a graph line across null points.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-connectnulls-false/" target="_blank">False by default</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-connectnulls-true/" target="_blank">true</a>
   */
  val connectNulls: Boolean = false
  
  /**
   * When the series contains less points than the crop threshold, all points are drawn,  event if the points fall outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and columns), is that animation is performed on updates. On the other hand, when the series contains more points than the crop threshold, the series data is cropped to only contain points that fall within the plot area. The advantage of cropping away invisible points is to increase performance on large series.  .
   * @since 2.2
   */
  val cropThreshold: Double = 300
  
  /**
   * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
   * @example Pointer cursor <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-cursor-line/" target="_blank">on line graph</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-cursor-column/" target="_blank">on columns</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-cursor-scatter/" target="_blank">on scatter markers</a>
   */
  val cursor: UndefOr[String] = js.undefined
  
  /**
   * A name for the dash style to use for the graph. Applies only to series type having a graph, like <code>line</code>, <code>spline</code>, <code>area</code> and <code>scatter</code> in  case it has a <code>lineWidth</code>. The value for the <code>dashStyle</code> include:
   * 		    <ul>
   * 		    	<li>Solid</li>
   * 		    	<li>ShortDash</li>
   * 		    	<li>ShortDot</li>
   * 		    	<li>ShortDashDot</li>
   * 		    	<li>ShortDashDotDot</li>
   * 		    	<li>Dot</li>
   * 		    	<li>Dash</li>
   * 		    	<li>LongDash</li>
   * 		    	<li>DashDot</li>
   * 		    	<li>LongDashDot</li>
   * 		    	<li>LongDashDotDot</li>
   * 		    </ul>
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/" target="_blank">Possible values demonstrated</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle/" target="_blank">chart suitable for printing in black and white</a>
   * @since 2.1
   */
  val dashStyle: String = "Solid"
  
  /**
   * An array of data points for the series. For the <code>spline</code> series type, points can be given in the following ways:
   *  <ol>
   *  	<li>An array of numerical values. In this case, the numerical values will 
   *  	be interpreted as <code>y</code> options. The <code>x</code> values will be automatically calculated,
   *  	either starting at 0 and incremented by 1, or from <code>pointStart</code> 
   *  	and <code>pointInterval</code> given in the series options. If the axis
   *  	has categories, these will be used.  Example:
   * <pre>data: [0, 5, 3, 5]</pre>
   *  	</li>
   *  	<li><p>An array of arrays with 2 values. In this case, the values correspond to <code>x,y</code>. If the first value is a string, it is
   *  	applied as the name of the point, and the <code>x</code> value is inferred. <pre>data: [
   *     [0, 9], 
   *     [1, 2], 
   *     [2, 8]
   * ]</pre></li>
   * 
   * 
   * <li><p>An array of objects with named values. The objects are
   *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<spline>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
   * 
   * <pre>data: [{
   *     x: 1,
   *     y: 9,
   *     name: "Point2",
   *     color: "#00FF00"
   * }, {
   *     x: 1,
   *     y: 0,
   *     name: "Point1",
   *     color: "#FF00FF"
   * }]</pre></li>
   *  </ol>
   * @example <p>The demos use a line series, but the principle is the same for all types.</p>
<ul>
<li><a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/reflow-true/" target="_blank">Numerical values</a></li>
<li><a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/data-array-of-arrays/" target="_blank">Arrays of numeric x and y</a></li>
<li><a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/data-array-of-arrays-datetime/" target="_blank">Arrays of datetime x and y</a></li>
<li><a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/data-array-of-name-value/" target="_blank">Arrays of point.name and y</a></li>
<li><a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/data-array-of-objects/" target="_blank"> Config objects</a></li>
</ul>
   */
  val data: js.Any = js.Array()
  
  val dataLabels: SeriesSplineDataLabels = new SeriesSplineDataLabels
  
  /**
   * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-enablemousetracking-false/" target="_blank">No mouse tracking</a>
   */
  val enableMouseTracking: Boolean = true
  
  val events: SeriesSplineEvents = new SeriesSplineEvents
  
  /**
   * Whether to use the Y extremes of the total chart width or only the zoomed area when zooming in on parts of the X axis. By default, the Y axis adjusts to the min and max of the visible data. Cartesian series only.
   * @since 4.1.6
   */
  val getExtremesFromAll: Boolean = false
  
  /**
   * An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-id/" target="_blank">Get series by id</a>
   * @since 1.2.0
   */
  val id: String = ""
  
  /**
   * The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
   * @since 2.3.0
   */
  val index: UndefOr[Double] = js.undefined
  
  /**
   * An array specifying which option maps to which key in the data point array. This makes it convenient to work with unstructured data arrays from different sources.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/data-keys/" target="_blank">An extended data array with keys</a>
   * @since 4.1.6
   */
  val keys: UndefOr[js.Array[String]] = js.undefined
  
  /**
   * The sequential index of the series in the legend.  <div class="demo">Try it:  	<a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/series/legendindex/" target="_blank">Legend in opposite order</a> </div>.
   */
  val legendIndex: UndefOr[Double] = js.undefined
  
  /**
   * Pixel with of the graph line.
   * @example 5px <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-linewidth-general/" target="_blank">on all series</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-linewidth-specific/" target="_blank">on one single series</a>
   */
  val lineWidth: Double = 2
  
  /**
   * The line cap used for line ends and line joins on the graph.
   */
  val linecap: String = "round"
  
  /**
   * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/arearange-line/" target="_blank">Linked series</a>
   * @since 3.0
   */
  val linkedTo: String = ""
  
  val marker: SeriesSplineMarker = new SeriesSplineMarker
  
  /**
   * The name of the series as shown in the legend, tooltip etc.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/name/" target="_blank">Series name</a>
   */
  val name: UndefOr[String] = js.undefined
  
  /**
   * The color for the parts of the graph or points that are below the <a href="#plotOptions.series.threshold">threshold</a>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-negative-color/" target="_blank">Spline, area and column</a> - <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/arearange-negativecolor/" target="_blank">arearange</a>.
   * @since 3.0
   */
  val negativeColor: String = null.asInstanceOf[String]
  
  /**
   * Properties for each single point
   */
  val point: SeriesSplinePoint = new SeriesSplinePoint
  
  /**
   * <p>If no x values are given for the points in a series, pointInterval defines
   *  the interval of the x values. For example, if a series contains one value
   *  every decade starting from year 0, set pointInterval to 10.</p>
   * <p>Since Highcharts 4.1, it can be combined with <code>pointIntervalUnit</code> to draw irregular intervals.</p>
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-pointstart-datetime/" target="_blank">Datetime X axis</a>
   */
  val pointInterval: Double = 1
  
  /**
   * On datetime series, this allows for setting the <a href="plotOptions.series.pointInterval">pointInterval</a> to the two irregular time units, <code>month</code> and <code>year</code>. Combine it with <code>pointInterval</code> to draw quarters, 6 months, 10 years etc.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-pointintervalunit/" target="_blank">One point a month</a>
   * @since 4.1.0
   */
  val pointIntervalUnit: UndefOr[String] = js.undefined
  
  /**
   * <p>Possible values: <code>null</code>, <code>"on"</code>, <code>"between"</code>.</p>
   * <p>In a column chart, when pointPlacement is <code>"on"</code>, the point will not create any padding of the X axis. In a polar column chart this means that the first column points directly north. If the pointPlacement is <code>"between"</code>, the columns will be laid out between ticks. This is useful for example for visualising an amount between two points in time or in a certain sector of a polar chart.</p>
   * <p>Since Highcharts 3.0.2, the point placement can also be numeric, where 0 is on the axis value, -0.5 is between this value and the previous, and 0.5 is between this value and the next. Unlike the textual options, numeric point placement options won't affect axis padding.</p>
   * <p>Note that pointPlacement needs a <a href="#plotOptions.series.pointRange">pointRange</a> to work. For column series this is computed, but for line-type series it needs to be set.</p>
   * <p>Defaults to <code>null</code> in cartesian charts, <code>"between"</code> in polar charts.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-pointplacement-between/" target="_blank">Between in a column chart</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-pointplacement-numeric/" target="_blank">numeric placement for custom layout</a>.
   * @since 2.3.0
   */
  val pointPlacement: UndefOr[js.Any] = js.undefined
  
  /**
   * If no x values are given for the points in a series, pointStart defines on what value to start. For example, if a series contains one yearly value starting from 1945, set pointStart to 1945.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-pointstart-linear/" target="_blank">Linear</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-pointstart-datetime/" target="_blank">datetime</a> X axis
   */
  val pointStart: Double = 0
  
  /**
   * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-selected/" target="_blank">One out of two series selected</a>
   * @since 1.2.0
   */
  val selected: Boolean = false
  
  /**
   * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-shadow/" target="_blank">Shadow enabled</a>
   */
  val shadow: js.Any = false
  
  /**
   * If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-showcheckbox-true/" target="_blank">Show select box</a>
   * @since 1.2.0
   */
  val showCheckbox: Boolean = false
  
  /**
   * Whether to display this particular series or series type in the legend. The default value is <code>true</code> for standalone series, <code>false</code> for linked series.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-showinlegend/" target="_blank">One series in the legend, one hidden</a>
   */
  val showInLegend: Boolean = true
  
  /**
   * <p>When this is true, the series will not cause the Y axis to cross the zero plane (or <a href="#plotOptions.series.threshold">threshold</a> option) unless the data actually crosses the plane.</p>
   * 
   * <p>For example, if <code>softThreshold</code> is <code>false</code>, a series of 0, 1, 2, 3 will make the Y axis show negative values according to the <code>minPadding</code> option. If <code>softThreshold</code> is <code>true</code>, the Y axis starts at 0.</p>
   * @since 4.1.9
   */
  val softThreshold: Boolean = true
  
  /**
   * This option allows grouping series in a stacked chart. The stack option can be a string  or a number or anything else, as long as the grouped series' stack options match each other.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/stack/" target="_blank">Stacked and grouped columns</a>
   * @since 2.1
   */
  val stack: UndefOr[String] = js.undefined
  
  /**
   * Whether to stack the values of each series on top of each other. Possible values are null to disable, "normal" to stack by value or "percent".
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-stacking-line/" target="_blank">Line</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-stacking-column/" target="_blank">column</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-stacking-bar/" target="_blank">bar</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-stacking-area/" target="_blank">area</a> with "normal" stacking. 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-stacking-percent-line/" target="_blank">Line</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-stacking-percent-column/" target="_blank">column</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-stacking-percent-bar/" target="_blank">bar</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-stacking-percent-area/" target="_blank">area</a> with "percent" stacking.
   */
  val stacking: UndefOr[String] = js.undefined
  
  /**
   * A wrapper object for all the series options in specific states.
   */
  val states: PlotOptionsSeriesStates = new PlotOptionsSeriesStates
  
  /**
   * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event
   *  on a series isn't triggered until the mouse moves over another series, or out
   *  of the plot area. When false, the <code>mouseOut</code> event on a series is
   *  triggered when the mouse leaves the area around the series' graph or markers.
   *  This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the 
   *  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, pies etc.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-stickytracking-true/" target="_blank">True by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-stickytracking-false/" target="_blank">false</a>
   * @since 2.0
   */
  val stickyTracking: Boolean = true
  
  /**
   * The threshold, also called zero level or base level. For line type series this is only used in conjunction with <a href="#plotOptions.series.negativeColor">negativeColor</a>.
   * @since 3.0
   */
  val threshold: Double = 0
  
  /**
   * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
   * @since 2.3
   */
  val tooltip: js.Object = new js.Object
  
  /**
   * When a series contains a data array that is longer than this, only one dimensional arrays of numbers,
   *  or two dimensional arrays with x and y values are allowed. Also, only the first
   *  point is tested, and the rest are assumed to be the same format. This saves expensive
   *  data checking and indexing in long series. Set it to <code>0</code> disable.
   * @since 2.2
   */
  val turboThreshold: Double = 1000
  
  /**
   * The type of series. Can be one of <code>area</code>, <code>areaspline</code>,
   *  <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>,
   *  <code>scatter</code> or <code>spline</code>. From version 2.3, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/type/" target="_blank">Line and column in the same chart</a>
   */
  val `type`: UndefOr[String] = js.undefined
  
  /**
   * Set the initial visibility of the series.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-visible/" target="_blank">Two series, one hidden and one visible</a>
   */
  val visible: Boolean = true
  
  /**
   * When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the <a href="#xAxis.id">axis id</a> or the index of the axis in the xAxis array, with 0 being the first.
   */
  val xAxis: js.Any = "0"
  
  /**
   * When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the <a href="#yAxis.id">axis id</a> or the index of the axis in the yAxis array, with 0 being the first.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/yaxis/" target="_blank">Apply the column series to the secondary Y axis</a>
   */
  val yAxis: js.Any = "0"
  
  /**
   * Define the visual z index of the series.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-zindex-default/" target="_blank">With no z index, the series defined last are on top</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-zindex/" target="_blank">with a z index, the series with the highest z index is on top</a>.
   */
  val zIndex: UndefOr[Double] = js.undefined
  
  /**
   * Defines the Axis on which the zones are applied.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/color-zones-zoneaxis-x/" target="_blank">Zones on the X-Axis</a>
   * @since 4.1.0
   */
  val zoneAxis: String = "y"
  
  /**
   * An array defining zones within a series. Zones can be applied to the X axis, Y axis or Z axis for bubbles, according to the <code>zoneAxis</code> option.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/color-zones-simple/" target="_blank">Color zones</a>
   * @since 4.1.0
   */
  val zones: js.Array[SeriesSplineZones] = new js.Array[SeriesSplineZones]
}
