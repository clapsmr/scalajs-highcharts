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
  * @note JavaScript name: <code>series&lt;flags&gt;</code>
  */
class SeriesFlags extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>An array of data points for the series. For the <code>flags</code> series type,
    * points can be given in the following ways:</p>
    * <ol>
    * <li>An array of objects with named values. The following snippet shows only a
    * few settings, see the complete options set below. If the total number of
    * data points exceeds the series&#39;
    * <a href="#series.flags.turboThreshold">turboThreshold</a>, this option is not
    * available.<pre><code class="language-js">data: [{
    *     x: 1,
    *     title: &quot;A&quot;,
    *     text: &quot;First event&quot;
    * }, {
    *     x: 1,
    *     title: &quot;B&quot;,
    *     text: &quot;Second event&quot;
    * }]
    * </code></pre>
    * </li>
    * </ol>
    */
  var data: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * <p>An id for the series. This can be used after render time to get a pointer
    * to the series object through <code>chart.get()</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-id/">Get series by id</a>
    * @since 1.2.0
    */
  var id: js.UndefOr[String] = js.undefined

  /**
    * <p>The index of the series in the chart, affecting the internal index in the
    * <code>chart.series</code> array, the visible Z index as well as the order in the
    * legend.</p>
    * @since 2.3.0
    */
  var index: js.UndefOr[Double] = js.undefined

  /**
    * <p>The sequential index of the series in the legend.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/legendindex/">Legend in opposite order</a>
    */
  var legendIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>A map data object containing a <code>geometry</code> or <code>path</code> definition and optionally
    * additional properties to join in the <code>data</code> as per the <code>joinBy</code> option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/category-map/">Map data and joinBy</a>
    */
  var mapData: js.UndefOr[js.Array[js.Any] | js.Any] = js.undefined

  /**
    * <p>The name of the series as shown in the legend, tooltip etc.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/name/">Series name</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/category-map/">Series name</a>
    */
  var name: js.UndefOr[String] = js.undefined

  /**
    * <p>This option allows grouping series in a stacked chart. The stack option
    * can be a string or anything else, as long as the grouped series&#39; stack
    * options match each other after conversion into a string.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/stack/">Stacked and grouped columns</a>
    * @since 2.1.0
    */
  var stack: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>The type of series, for example <code>line</code> or <code>column</code>. By default, the
    * series type is inherited from <a href="#chart.type">chart.type</a>, so unless the
    * chart is a combination of series types, there is no need to set it on the
    * series level.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/type/">Line and column in the same chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/type-dynamic/">Dynamic types with button selector</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/mapline-mappoint/">Multiple types in the same map</a>
    */
  var `type`: js.UndefOr[String] = "flags"

  /**
    * <p>When using dual or multiple x axes, this number defines which xAxis the
    * particular series is connected to. It refers to either the
    * {@link #xAxis.id|axis id}
    * or the index of the axis in the xAxis array, with 0 being the first.</p>
    */
  var xAxis: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>When using dual or multiple y axes, this number defines which yAxis the
    * particular series is connected to. It refers to either the
    * {@link #yAxis.id|axis id}
    * or the index of the axis in the yAxis array, with 0 being the first.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/yaxis/">Apply the column series to the secondary Y axis</a>
    */
  var yAxis: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>Define the visual z index of the series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-zindex-default/">With no z index, the series defined last are on top</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-zindex/">With a z index, the series with the highest z index is on top</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-zindex-default/">With no z index, the series defined last are on top</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-zindex/">With a z index, the series with the highest z index is on top</a>
    */
  var zIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether the flags are allowed to overlap sideways. If <code>false</code>, the
    * flags are moved sideways using an algorithm that seeks to place every
    * flag as close as possible to its original position.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/flags-allowoverlapx">Allow sideways overlap</a>
    * @since 6.0.4
    */
  var allowOverlapX: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The fill color for the flags.</p>
    */
  var fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Fixed height of the flag&#39;s shape. By default, height is
    * autocalculated according to the flag&#39;s title.</p>
    */
  var height: js.UndefOr[Double] = js.undefined

  /**
    * <p>The color of the line/border of the flag.</p>
    * <p>In styled mode, the stroke is set in the
    * <code>.highcharts-flag-series.highcharts-point</code> rule.</p>
    */
  var lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>In case the flag is placed on a series, on what point key to place
    * it. Line and columns have one key, <code>y</code>. In range or OHLC-type series,
    * however, the flag can optionally be placed on the <code>open</code>, <code>high</code>,
    * <code>low</code> or <code>close</code> key.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/flags-onkey/">Range series, flag on high</a>
    * @since 4.2.2
    */
  var onKey: js.UndefOr[String] = js.undefined

  /**
    * <p>The id of the series that the flags should be drawn on. If no id
    * is given, the flags are drawn on the x axis.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/flags/">Flags on series and on x axis</a>
    */
  var onSeries: js.UndefOr[String] = js.undefined

  /**
    * <p>The shape of the marker. Can be one of &quot;flag&quot;, &quot;circlepin&quot;,
    * &quot;squarepin&quot;, or an image of the format <code>url(/path-to-image.jpg)</code>.
    * Individual shapes can also be set for each point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/flags/">Different shapes</a>
    */
  var shape: js.Any = js.undefined

  /**
    * <p>When multiple flags in the same series fall on the same value, this
    * number determines the vertical offset between them.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/flags-stackdistance/">A greater stack distance</a>
    */
  var stackDistance: js.UndefOr[Double] = js.undefined

  var states: js.Any = js.undefined

  /**
    * <p>The text styles of the flag.</p>
    * <p>In styled mode, the styles are set in the
    * <code>.highcharts-flag-series .highcharts-point</code> rule.</p>
    */
  var style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Text alignment for the text inside the flag.</p>
    * @since 5.0.0
    */
  var textAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>The Y axis value to serve as the base for the columns, for
    * distinguishing between values above and below a threshold. If <code>null</code>,
    * the columns extend from the padding Y axis minimum.</p>
    * @since 2.0.0
    */
  var threshold: js.Any = js.undefined

  /**
    * <p>The text to display on each flag. This can be defined on series
    * level, or individually for each point. Defaults to <code>&quot;A&quot;</code>.</p>
    */
  var title: js.UndefOr[String] = js.undefined

  /**
    * <p>Specific tooltip options for flag series. Flag series tooltips are
    * different from most other types in that a flag doesn&#39;t have a data
    * value, so the tooltip rather displays the <code>text</code> option for each
    * point.</p>
    * @since 2.3.0
    */
  var tooltip: js.Any = js.undefined

  /**
    * <p>Whether to use HTML to render the flag texts. Using HTML allows for
    * advanced formatting, images and reliable bi-directional text
    * rendering. Note that exported images won&#39;t respect the HTML, and that
    * HTML won&#39;t respect Z-index settings.</p>
    * @since 1.3.0
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Fixed width of the flag&#39;s shape. By default, width is autocalculated
    * according to the flag&#39;s title.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/flags-shapes/">Flags with fixed width</a>
    */
  var width: js.UndefOr[Double] = js.undefined

  /**
    * <p>The y position of the top left corner of the flag relative to either
    * the series (if onSeries is defined), or the x axis. Defaults to
    * <code>-30</code>.</p>
    */
  var y: js.UndefOr[Double] = js.undefined

  /**
    * <p>When <code>true</code>, the columns will center in the category, ignoring null
    * or missing points. When <code>false</code>, space will be reserved for null or
    * missing points.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-column/centerincategory/">Center in category</a>
    * @since 8.0.1
    */
  var centerInCategory: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>A series specific or series type specific color set to apply instead
    * of the global <a href="#colors">colors</a> when <a href="#plotOptions.column.colorByPoint">colorByPoint</a> is true.</p>
    * @since 3.0.0
    */
  var colors: js.UndefOr[js.Array[String | js.Object]] = js.undefined

  /**
    * <p>When the series contains less points than the crop threshold, all
    * points are drawn, event if the points fall outside the visible plot
    * area at the current zoom. The advantage of drawing all points
    * (including markers and columns), is that animation is performed on
    * updates. On the other hand, when the series contains more points than
    * the crop threshold, the series data is cropped to only contain points
    * that fall within the plot area. The advantage of cropping away
    * invisible points is to increase performance on large series.</p>
    * @since 2.2.0
    */
  var cropThreshold: js.UndefOr[Double] = js.undefined

  /**
    * <p>Options for the series data labels, appearing next to each data
    * point.</p>
    * <p>Since v6.2.0, multiple data labels can be applied to each single
    * point by defining them as an array of configs.</p>
    * <p>In styled mode, the data labels can be styled with the
    * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names
    * (<a href="https://www.highcharts.com/samples/highcharts/css/series-datalabels">see example</a>).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-enabled">Data labels enabled</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-multiple">Multiple data labels on a bar series</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-datalabels">Style mode example</a>
    */
  var dataLabels: js.Any = js.undefined

  /**
    * <p>Depth of the columns in a 3D column chart.</p>
    * @since 4.0.0
    */
  var depth: js.UndefOr[Double] = js.undefined

  /**
    * <p>3D columns only. The color of the edges. Similar to <code>borderColor</code>, except it
    * defaults to the same color as the column.</p>
    */
  var edgeColor: js.UndefOr[String] = js.undefined

  /**
    * <p>3D columns only. The width of the colored edges.</p>
    */
  var edgeWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Padding between each value groups, in x axis units.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-grouppadding-default/">0.2 by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-grouppadding-none/">No group padding - all columns are evenly spaced</a>
    */
  var groupPadding: js.UndefOr[Double] = js.undefined

  /**
    * <p>The spacing between columns on the Z Axis in a 3D chart.</p>
    * @since 4.0.0
    */
  var groupZPadding: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to group non-stacked columns or to let them render
    * independent of each other. Non-grouped columns will be laid out
    * individually and overlap each other.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-grouping-false/">Grouping disabled</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-grouping-false/">Grouping disabled</a>
    * @since 2.3.0
    */
  var grouping: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The maximum allowed pixel width for a column, translated to the
    * height of a bar in a bar chart. This prevents the columns from
    * becoming too wide when there is a small number of points in the
    * chart.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-maxpointwidth-20/">Limited to 50</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-maxpointwidth-20/">Limited to 50</a>
    * @since 4.1.8
    */
  var maxPointWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The minimal height for a column or width for a bar. By default,
    * 0 values are not shown. To visualize a 0 (or close to zero) point,
    * set the minimal point length to a pixel value like 3. In stacked
    * column charts, minPointLength might not be respected for tightly
    * packed values.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-minpointlength/">Zero base value</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-minpointlength-pos-and-neg/">Positive and negative close to zero values</a>
    */
  var minPointLength: js.UndefOr[Double] = js.undefined

  /**
    * <p>The X axis range that each point is valid for. This determines the
    * width of the column. On a categorized axis, the range will be 1
    * by default (one category unit). On linear and datetime axes, the
    * range will be computed as the distance between the two closest data
    * points.</p>
    * <p>The default <code>null</code> means it is computed automatically, but this
    * option can be used to override the automatic value.</p>
    * <p>This option is set by default to 1 if data sorting is enabled.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointrange/">Set the point range to one day on a data set with one week between the points</a>
    * @since 2.3.0
    */
  var pointRange: js.UndefOr[Double | Null] = js.undefined

  /**
    * <p>Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a
    * series isn&#39;t triggered until the mouse moves over another series, or
    * out of the plot area. When false, the <code>mouseOut</code> event on a series is
    * triggered when the mouse leaves the area around the series&#39; graph or
    * markers. This also implies the tooltip when not shared. When
    * <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip
    * will be hidden when moving the mouse between series. Defaults to true
    * for line and area type series, but to false for columns, pies etc.</p>
    * <p><strong>Note:</strong> The boost module will force this option because of
    * technical limitations.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stickytracking-true/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stickytracking-false/">False</a>
    * @since 2.0.0
    */
  var stickyTracking: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Accessibility options for a series.</p>
    * @since 7.1.0
    */
  var accessibility: js.Any = js.undefined

  /**
    * <p>Whether all areas of the map defined in <code>mapData</code> should be rendered.
    * If <code>true</code>, areas which don&#39;t correspond to a data point, are rendered
    * as <code>null</code> points. If <code>false</code>, those areas are skipped.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allareas-false/">All areas set to false</a>
    */
  var allAreas: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Allow this series&#39; points to be selected by clicking on the graphic
    * (columns, point markers, pie slices, map areas etc).</p>
    * <p>The selected points can be handled by point select and unselect
    * events, or collectively by the <a href="/class-reference/Highcharts.Chart#getSelectedPoints">getSelectedPoints</a> function.</p>
    * <p>And alternative way of selecting points is through dragging.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-allowpointselect-line/">Line</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-allowpointselect-column/">Column</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-allowpointselect-pie/">Pie</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-selection-points/">Select a range of points through a drag selection</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/">Map area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/mapbubble-allowpointselect/">Map bubble</a>
    * @since 1.2.0
    */
  var allowPointSelect: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>For some series, there is a limit that shuts down initial animation
    * by default when the total number of points in the chart is too high.
    * For example, for a column chart and its derivatives, animation does
    * not run if there is more than 250 points totally. To disable this
    * cap, set <code>animationLimit</code> to <code>Infinity</code>.</p>
    */
  var animationLimit: js.UndefOr[Double] = js.undefined

  /**
    * <p>Sets the color blending in the boost module.</p>
    */
  var boostBlending: js.UndefOr[String] = js.undefined

  /**
    * <p>Set the point threshold for when a series should enter boost mode.</p>
    * <p>Setting it to e.g. 2000 will cause the series to enter boost mode when there
    * are 2000 or more points in the series.</p>
    * <p>To disable boosting on the series, set the <code>boostThreshold</code> to 0. Setting it
    * to 1 will force boosting.</p>
    * <p>Note that the <a href="plotOptions.series.cropThreshold">cropThreshold</a> also affects
    * this setting. When zooming in on a series that has fewer points than the
    * <code>cropThreshold</code>, all points are rendered although outside the visible plot
    * area, and the <code>boostThreshold</code> won&#39;t take effect.</p>
    */
  var boostThreshold: js.UndefOr[Double] = js.undefined

  /**
    * <p>An additional class name to apply to the series&#39; graphical elements.
    * This option does not replace default class names of the graphical
    * element.</p>
    * @since 5.0.0
    */
  var className: js.UndefOr[String] = js.undefined

  /**
    * <p>Disable this option to allow series rendering in the whole plotting
    * area.</p>
    * <p><strong>Note:</strong> Clipping should be always enabled when
    * <a href="#chart.zoomType">chart.zoomType</a> is set</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-clip/">Disabled clipping</a>
    * @since 3.0.0
    */
  var clip: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The main color of the series. In line type series it applies to the
    * line and the point markers unless otherwise specified. In bar type
    * series it applies to the bars unless a color is specified per point.
    * The default value is pulled from the <code>options.colors</code> array.</p>
    * <p>In styled mode, the color can be defined by the
    * <a href="#plotOptions.series.colorIndex">colorIndex</a> option. Also, the series
    * color can be set with the <code>.highcharts-series</code>,
    * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
    * <code>.highcharts-series-{n}</code> class, or individual classes given by the
    * <code>className</code> option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-color-general/">General plot option</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-color-specific/">One specific series</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-color-area/">Area color</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/infographic/">Pattern fill</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/category-map/">Category map by multiple series</a>
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>When using dual or multiple color axes, this number defines which
    * colorAxis the particular series is connected to. It refers to
    * either the
    * {@link #colorAxis.id|axis id}
    * or the index of the axis in the colorAxis array, with 0 being the
    * first. Set this option to false to prevent a series from connecting
    * to the default color axis.</p>
    * <p>Since v7.2.0 the option can also be an axis id or an axis index
    * instead of a boolean flag.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/coloraxis/coloraxis-with-pie/">Color axis with pie series</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/coloraxis/multiple-coloraxis/">Multiple color axis</a>
    */
  var colorAxis: js.UndefOr[Double | String | Boolean] = js.undefined

  /**
    * <p>Styled mode only. A specific color index to use for the series, so
    * its graphic representations are given the class name
    * <code>highcharts-color-{n}</code>.</p>
    * @since 5.0.0
    */
  var colorIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>Determines what data value should be used to calculate point color
    * if <code>colorAxis</code> is used. Requires to set <code>min</code> and <code>max</code> if some
    * custom point property is used or if approximation for data grouping
    * is set to <code>&#39;sum&#39;</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/coloraxis/custom-color-key/">Custom color key</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/coloraxis/changed-default-color-key/">Changed default color key</a>
    * @since 7.2.0
    */
  var colorKey: js.UndefOr[String] = js.undefined

  /**
    * <p>Compare the values of the series against the first non-null, non-
    * zero value in the visible range. The y axis will show percentage
    * or absolute change depending on whether <code>compare</code> is set to <code>&quot;percent&quot;</code>
    * or <code>&quot;value&quot;</code>. When this is applied to multiple series, it allows
    * comparing the development of the series against each other. Adds
    * a <code>change</code> field to every point object.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-compare-percent/">Percent</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-compare-value/">Value</a>
    * @since 1.0.1
    */
  var compare: js.UndefOr[String] = js.undefined

  /**
    * <p>When <a href="#plotOptions.series.compare">compare</a> is <code>percent</code>, this option
    * dictates whether to use 0 or 100 as the base of comparison.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-comparebase/">Compare base is 100</a>
    * @since 5.0.6
    */
  var compareBase: js.UndefOr[Double] = js.undefined

  /**
    * <p>Defines if comparison should start from the first point within the visible
    * range or should start from the first point <strong>before</strong> the range.</p>
    * <p>In other words, this flag determines if first point within the visible range
    * will have 0% (<code>compareStart=true</code>) or should have been already calculated
    * according to the previous point (<code>compareStart=false</code>).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-comparestart/">Calculate compare within visible range</a>
    * @since 6.0.0
    */
  var compareStart: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Override Pathfinder connector options for a series. Requires Highcharts Gantt
    * to be loaded.</p>
    * @since 6.2.0
    */
  var connectors: js.UndefOr[CleanJsObject[SeriesFlagsConnectors]] = js.undefined

  /**
    * <p>When true, each point or column edge is rounded to its nearest pixel
    * in order to render sharp on screen. In some cases, when there are a
    * lot of densely packed columns, this leads to visible difference
    * in column widths or distance between columns. In these cases,
    * setting <code>crisp</code> to <code>false</code> may look better, even though each column
    * is rendered blurry.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-crisp-false/">Crisp is false</a>
    * @since 5.0.10
    */
  var crisp: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Cumulative Sum feature replaces points&#39; values with the following formula:
    * <code>sum of all previous points&#39; values + current point&#39;s value</code>.
    * Works only for points in a visible range.
    * Adds the <code>cumulativeSum</code> field to each point object that can be accessed
    * e.g. in the <a href="https://api.highcharts.com/highstock/tooltip.pointFormat">tooltip.pointFormat</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-cumulative-sum/">Cumulative Sum</a>
    * @since 9.3.0
    */
  var cumulative: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>You can set the cursor to &quot;pointer&quot; if you have click events attached
    * to the series, to signal to the user that the points and lines can
    * be clicked.</p>
    * <p>In styled mode, the series cursor can be set with the same classes
    * as listed under <a href="#plotOptions.series.color">series.color</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-cursor-line/">On line graph</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-cursor-column/">On columns</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-cursor-scatter/">On scatter markers</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/cursor/">Pointer on a line graph</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/">Map area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/mapbubble-allowpointselect/">Map bubble</a>
    */
  var cursor: js.UndefOr[String] = js.undefined

  /**
    * <p>A reserved subspace to store options and values for customized
    * functionality. Here you can add additional data for your own event
    * callbacks and formatter callbacks.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/custom/">Point and series with custom data</a>
    */
  var custom: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Options for the series data sorting.</p>
    * @since 8.0.0
    */
  var dataSorting: js.Any = js.undefined

  /**
    * <p>A description of the series to add to the screen reader information
    * about the series.</p>
    * @since 5.0.0
    */
  var description: js.UndefOr[String] = js.undefined

  /**
    * <p>The draggable-points module allows points to be moved around or modified in
    * the chart. In addition to the options mentioned under the <code>dragDrop</code> API
    * structure, the module fires three events,
    * <a href="plotOptions.series.point.events.dragStart">point.dragStart</a>,
    * <a href="plotOptions.series.point.events.drag">point.drag</a> and
    * <a href="plotOptions.series.point.events.drop">point.drop</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/resize-column">Draggable column and line series</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/bar-series">Draggable bar</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-bubble">Draggable bubbles</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Draggable X range series</a>
    * @since 6.2.0
    */
  var dragDrop: js.Any = js.undefined

  /**
    * <p>Enable or disable the mouse tracking for a specific series. This
    * includes point tooltips and click events on graphs and points. For
    * large datasets it improves performance.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-enablemousetracking-false/">No mouse tracking</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-enablemousetracking-false/">No mouse tracking</a>
    */
  var enableMouseTracking: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>General event handlers for the series items. These event hooks can
    * also be attached to the series at run time using the
    * <code>Highcharts.addEvent</code> function.</p>
    */
  var events: js.Any = js.undefined

  /**
    * <p>Determines whether the series should look for the nearest point
    * in both dimensions or just the x-dimension when hovering the series.
    * Defaults to <code>&#39;xy&#39;</code> for scatter series and <code>&#39;x&#39;</code> for most other
    * series. If the data has duplicate x-values, it is recommended to
    * set this to <code>&#39;xy&#39;</code> to allow hovering over all points.</p>
    * <p>Applies only to series types using nearest neighbor search (not
    * direct hover) for tooltip.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/findnearestpointby/">Different hover behaviors</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/findnearestpointby/">Different hover behaviors</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/findnearestpointby/">Different hover behaviors</a>
    * @since 5.0.10
    */
  var findNearestPointBy: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to use the Y extremes of the total chart width or only the
    * zoomed area when zooming in on parts of the X axis. By default, the
    * Y axis adjusts to the min and max of the visible data. Cartesian
    * series only.</p>
    * @since 4.1.6
    */
  var getExtremesFromAll: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>When set to <code>false</code> will prevent the series data from being included in
    * any form of data export.</p>
    * <p>Since version 6.0.0 until 7.1.0 the option was existing undocumented
    * as <code>includeInCSVExport</code>.</p>
    * @since 7.1.0
    */
  var includeInDataExport: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>What property to join the <code>mapData</code> to the value data. For example,
    * if joinBy is &quot;code&quot;, the mapData items with a specific code is merged
    * into the data with the same code. For maps loaded from GeoJSON, the
    * keys may be held in each point&#39;s <code>properties</code> object.</p>
    * <p>The joinBy option can also be an array of two values, where the first
    * points to a key in the <code>mapData</code>, and the second points to another
    * key in the <code>data</code>.</p>
    * <p>When joinBy is <code>null</code>, the map items are joined by their position in
    * the array, which performs much better in maps with many data points.
    * This is the recommended option if you are printing more than a
    * thousand data points and have a backend that can preprocess the data
    * into a parallel array of the mapData.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-border/">Joined by "code"</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/geojson/">GeoJSON joined by an array</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/series/joinby-null/">Simple data joined by null</a>
    */
  var joinBy: js.UndefOr[String | js.Array[String]] = js.undefined

  /**
    * <p>An array specifying which option maps to which key in the data point
    * array. This makes it convenient to work with unstructured data arrays
    * from different sources.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-keys/">An extended data array with keys</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-nested-keys/">Nested keys used to access object properties</a>
    * @since 4.1.6
    */
  var keys: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * <p>Series labels are placed as close to the series as possible in a
    * natural way, seeking to avoid other series. The goal of this
    * feature is to make the chart more easily readable, like if a
    * human designer placed the labels in the optimal position.</p>
    * <p>The series labels currently work with series types having a
    * <code>graph</code> or an <code>area</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-label/line-chart">Line chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/streamgraph">Stream graph</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-label/stock-chart">Stock chart</a>
    * @since 6.0.0
    */
  var label: js.Any = js.undefined

  /**
    * <p>The line marks the last price from all points.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/last-price">Last price</a>
    */
  var lastPrice: js.Any = js.undefined

  /**
    * <p>The line marks the last price from visible range of points.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/last-visible-price">Last visible price</a>
    */
  var lastVisiblePrice: js.Any = js.undefined

  /**
    * <p>The <a href="#series.id">id</a> of another series to link to. Additionally,
    * the value can be &quot;:previous&quot; to link to the previous series. When
    * two series are linked, only the first one appears in the legend.
    * Toggling the visibility of this also toggles the linked series.</p>
    * <p>If master series uses data sorting and linked series does not have
    * its own sorting definition, the linked series will be sorted in the
    * same order as the master one.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/arearange-line/">Linked series</a>
    * @since 3.0.0
    */
  var linkedTo: js.UndefOr[String] = js.undefined

  /**
    * <p>Options for the corresponding navigator series if <code>showInNavigator</code>
    * is <code>true</code> for this series. Available options are the same as any
    * series, documented at <a href="#plotOptions.series">plotOptions</a> and
    * <a href="#series">series</a>.</p>
    * <p>These options are merged with options in <a href="#navigator.series">navigator.series</a>, and will take precedence if the same option is
    * defined both places.</p>
    * @since 5.0.0
    */
  var navigatorOptions: js.Any = js.undefined

  /**
    * <p>The color for the parts of the graph or points that are below the
    * <a href="#plotOptions.series.threshold">threshold</a>. Note that <code>zones</code> takes
    * precedence over the negative color. Using <code>negativeColor</code> is
    * equivalent to applying a zone with value of 0.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-negative-color/">Spline, area and column</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-negativecolor/">Arearange</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-negative-color/">Styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-negative-color/">Spline, area and column</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-negativecolor/">Arearange</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-negative-color/">Spline, area and column</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-negativecolor/">Arearange</a>
    * @since 3.0.0
    */
  var negativeColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Opacity of a series parts: line, fill (e.g. area) and dataLabels.</p>
    * @since 7.1.0
    */
  var opacity: js.UndefOr[Double] = js.undefined

  /**
    * <p>Properties for each single point.</p>
    */
  var point: js.Any = js.undefined

  /**
    * <p>Same as
    * <a href="#accessibility.series.descriptionFormatter">accessibility.series.descriptionFormatter</a>,
    * but for an individual series. Overrides the chart wide configuration.</p>
    * @since 5.0.12
    */
  var pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>If no x values are given for the points in a series, <code>pointInterval</code>
    * defines the interval of the x values. For example, if a series
    * contains one value every decade starting from year 0, set
    * <code>pointInterval</code> to <code>10</code>. In true <code>datetime</code> axes, the <code>pointInterval</code>
    * is set in milliseconds.</p>
    * <p>It can be also be combined with <code>pointIntervalUnit</code> to draw irregular
    * time intervals.</p>
    * <p>If combined with <code>relativeXValue</code>, an x value can be set on each
    * point, and the <code>pointInterval</code> is added x times to the <code>pointStart</code>
    * setting.</p>
    * <p>Please note that this options applies to the <em>series data</em>, not the
    * interval of the axis ticks, which is independent.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointstart-datetime/">Datetime X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-relativexvalue/">Relative x value</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/pointinterval-pointstart/">Using pointStart and pointInterval</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/relativexvalue/">Relative x value</a>
    */
  var pointInterval: js.UndefOr[Double] = js.undefined

  /**
    * <p>On datetime series, this allows for setting the
    * <a href="#plotOptions.series.pointInterval">pointInterval</a> to irregular time
    * units, <code>day</code>, <code>month</code> and <code>year</code>. A day is usually the same as 24
    * hours, but <code>pointIntervalUnit</code> also takes the DST crossover into
    * consideration when dealing with local time. Combine this option with
    * <code>pointInterval</code> to draw weeks, quarters, 6 months, 10 years etc.</p>
    * <p>Please note that this options applies to the <em>series data</em>, not the
    * interval of the axis ticks, which is independent.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointintervalunit/">One point a month</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointintervalunit/">One point a month</a>
    * @since 4.1.0
    */
  var pointIntervalUnit: js.UndefOr[String] = js.undefined

  /**
    * <p>Possible values: <code>&quot;on&quot;</code>, <code>&quot;between&quot;</code>, <code>number</code>.</p>
    * <p>In a column chart, when pointPlacement is <code>&quot;on&quot;</code>, the point will not
    * create any padding of the X axis. In a polar column chart this means
    * that the first column points directly north. If the pointPlacement is
    * <code>&quot;between&quot;</code>, the columns will be laid out between ticks. This is
    * useful for example for visualising an amount between two points in
    * time or in a certain sector of a polar chart.</p>
    * <p>Since Highcharts 3.0.2, the point placement can also be numeric,
    * where 0 is on the axis value, -0.5 is between this value and the
    * previous, and 0.5 is between this value and the next. Unlike the
    * textual options, numeric point placement options won&#39;t affect axis
    * padding.</p>
    * <p>Note that pointPlacement needs a <a href="#plotOptions.series.pointRange">pointRange</a> to work. For column series this is
    * computed, but for line-type series it needs to be set.</p>
    * <p>For the <code>xrange</code> series type and gantt charts, if the Y axis is a
    * category axis, the <code>pointPlacement</code> applies to the Y axis rather than
    * the (typically datetime) X axis.</p>
    * <p>Defaults to <code>undefined</code> in cartesian charts, <code>&quot;between&quot;</code> in polar
    * charts.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointplacement-between/">Between in a column chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointplacement-numeric/">Numeric placement for custom layout</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/heatmap-pointplacement/">Placement in heatmap</a>
    * @since 2.3.0
    */
  var pointPlacement: js.UndefOr[String | Double] = js.undefined

  /**
    * <p>If no x values are given for the points in a series, pointStart
    * defines on what value to start. For example, if a series contains one
    * yearly value starting from 1945, set pointStart to 1945.</p>
    * <p>If combined with <code>relativeXValue</code>, an x value can be set on each
    * point. The x value from the point options is multiplied by
    * <code>pointInterval</code> and added to <code>pointStart</code> to produce a modified x
    * value.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointstart-linear/">Linear</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointstart-datetime/">Datetime</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-relativexvalue/">Relative x value</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/pointinterval-pointstart/">Using pointStart and pointInterval</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/relativexvalue/">Relative x value</a>
    */
  var pointStart: js.UndefOr[Double] = js.undefined

  /**
    * <p>When true, X values in the data set are relative to the current
    * <code>pointStart</code>, <code>pointInterval</code> and <code>pointIntervalUnit</code> settings. This
    * allows compression of the data for datasets with irregular X values.</p>
    * <p>The real X values are computed on the formula <code>f(x) = ax + b</code>, where
    * <code>a</code> is the <code>pointInterval</code> (optionally with a time unit given by
    * <code>pointIntervalUnit</code>), and <code>b</code> is the <code>pointStart</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-relativexvalue/">Relative X value</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/relativexvalue/">Relative X value</a>
    */
  var relativeXValue: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to select the series initially. If <code>showCheckbox</code> is true,
    * the checkbox next to the series name in the legend will be checked
    * for a selected series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-selected/">One out of two series selected</a>
    * @since 1.2.0
    */
  var selected: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to apply a drop shadow to the graph line. Since 2.3 the
    * shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,
    * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-shadow/">Shadow enabled</a>
    */
  var shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>If true, a checkbox is displayed next to the legend item to allow
    * selecting the series. The state of the checkbox is determined by
    * the <code>selected</code> option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-showcheckbox-true/">Show select box</a>
    * @since 1.2.0
    */
  var showCheckbox: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to display this particular series or series type in the
    * legend. Standalone series are shown in legend by default, and linked
    * series are not. Since v7.2.0 it is possible to show series that use
    * colorAxis by setting this option to <code>true</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-showinlegend/">One series in the legend, one hidden</a>
    */
  var showInLegend: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether or not to show the series in the navigator. Takes precedence
    * over <a href="#navigator.baseSeries">navigator.baseSeries</a> if defined.</p>
    * @since 5.0.0
    */
  var showInNavigator: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>If set to <code>true</code>, the accessibility module will skip past the points
    * in this series for keyboard navigation.</p>
    * @since 5.0.12
    */
  var skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>When this is true, the series will not cause the Y axis to cross
    * the zero plane (or <a href="#plotOptions.series.threshold">threshold</a> option)
    * unless the data actually crosses the plane.</p>
    * <p>For example, if <code>softThreshold</code> is <code>false</code>, a series of 0, 1, 2,
    * 3 will make the Y axis show negative values according to the
    * <code>minPadding</code> option. If <code>softThreshold</code> is <code>true</code>, the Y axis starts
    * at 0.</p>
    * @since 4.1.9
    */
  var softThreshold: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to stack the values of each series on top of each other.
    * Possible values are <code>undefined</code> to disable, <code>&quot;normal&quot;</code> to stack by
    * value or <code>&quot;percent&quot;</code>.</p>
    * <p>When stacking is enabled, data must be sorted
    * in ascending X order.</p>
    * <p>Some stacking options are related to specific series types. In the
    * streamgraph series type, the stacking option is set to <code>&quot;stream&quot;</code>.
    * The second one is <code>&quot;overlap&quot;</code>, which only applies to waterfall
    * series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stacking-line/">Line</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stacking-column/">Column</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stacking-bar/">Bar</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stacking-area/">Area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stacking-percent-line/">Line</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stacking-percent-column/">Column</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stacking-percent-bar/">Bar</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stacking-percent-area/">Area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-waterfall-with-normal-stacking">Waterfall with normal stacking</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-waterfall-with-overlap-stacking">Waterfall with overlap stacking</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/stacking/">Area</a>
    */
  var stacking: js.UndefOr[String] = js.undefined

  /**
    * <p>Set the initial visibility of the series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-visible/">Two series, one hidden and one visible</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-visibility/">Hidden series</a>
    */
  var visible: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Defines the Axis on which the zones are applied.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/color-zones-zoneaxis-x/">Zones on the X-Axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/color-zones-zoneaxis-x/">Zones on the X-Axis</a>
    * @since 4.1.0
    */
  var zoneAxis: js.UndefOr[String] = js.undefined

  /**
    * <p>An array defining zones within a series. Zones can be applied to the
    * X axis, Y axis or Z axis for bubbles, according to the <code>zoneAxis</code>
    * option. The zone definitions have to be in ascending order regarding
    * to the value.</p>
    * <p>In styled mode, the color zones are styled with the
    * <code>.highcharts-zone-{n}</code> class, or custom classed from the <code>className</code>
    * option
    * (<a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/color-zones/">view live demo</a>).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/color-zones-simple/">Color zones</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/color-zones-simple/">Color zones</a>
    * @since 4.1.0
    */
  var zones: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * <p>Polar charts only. Whether to connect the ends of a line series
    * plot across the extremes.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/line-connectends-false/">Do not connect</a>
    * @since 2.3.0
    */
  var connectEnds: js.UndefOr[Boolean] = js.undefined
}

object SeriesFlags {
  /**
    * @param data <p>An array of data points for the series. For the <code>flags</code> series type,. points can be given in the following ways:</p>. <ol>. <li>An array of objects with named values. The following snippet shows only a. few settings, see the complete options set below. If the total number of. data points exceeds the series&#39;. <a href="#series.flags.turboThreshold">turboThreshold</a>, this option is not. available.<pre><code class="language-js">data: [{.     x: 1,.     title: &quot;A&quot;,.     text: &quot;First event&quot;. }, {.     x: 1,.     title: &quot;B&quot;,.     text: &quot;Second event&quot;. }]. </code></pre>. </li>. </ol>
    * @param id <p>An id for the series. This can be used after render time to get a pointer. to the series object through <code>chart.get()</code>.</p>
    * @param index <p>The index of the series in the chart, affecting the internal index in the. <code>chart.series</code> array, the visible Z index as well as the order in the. legend.</p>
    * @param legendIndex <p>The sequential index of the series in the legend.</p>
    * @param mapData <p>A map data object containing a <code>geometry</code> or <code>path</code> definition and optionally. additional properties to join in the <code>data</code> as per the <code>joinBy</code> option.</p>
    * @param name <p>The name of the series as shown in the legend, tooltip etc.</p>
    * @param stack <p>This option allows grouping series in a stacked chart. The stack option. can be a string or anything else, as long as the grouped series&#39; stack. options match each other after conversion into a string.</p>
    * @param `type` <p>The type of series, for example <code>line</code> or <code>column</code>. By default, the. series type is inherited from <a href="#chart.type">chart.type</a>, so unless the. chart is a combination of series types, there is no need to set it on the. series level.</p>
    * @param xAxis <p>When using dual or multiple x axes, this number defines which xAxis the. particular series is connected to. It refers to either the. {@link #xAxis.id|axis id}. or the index of the axis in the xAxis array, with 0 being the first.</p>
    * @param yAxis <p>When using dual or multiple y axes, this number defines which yAxis the. particular series is connected to. It refers to either the. {@link #yAxis.id|axis id}. or the index of the axis in the yAxis array, with 0 being the first.</p>
    * @param zIndex <p>Define the visual z index of the series.</p>
    * @param allowOverlapX <p>Whether the flags are allowed to overlap sideways. If <code>false</code>, the. flags are moved sideways using an algorithm that seeks to place every. flag as close as possible to its original position.</p>
    * @param fillColor <p>The fill color for the flags.</p>
    * @param height <p>Fixed height of the flag&#39;s shape. By default, height is. autocalculated according to the flag&#39;s title.</p>
    * @param lineColor <p>The color of the line/border of the flag.</p>. <p>In styled mode, the stroke is set in the. <code>.highcharts-flag-series.highcharts-point</code> rule.</p>
    * @param onKey <p>In case the flag is placed on a series, on what point key to place. it. Line and columns have one key, <code>y</code>. In range or OHLC-type series,. however, the flag can optionally be placed on the <code>open</code>, <code>high</code>,. <code>low</code> or <code>close</code> key.</p>
    * @param onSeries <p>The id of the series that the flags should be drawn on. If no id. is given, the flags are drawn on the x axis.</p>
    * @param shape <p>The shape of the marker. Can be one of &quot;flag&quot;, &quot;circlepin&quot;,. &quot;squarepin&quot;, or an image of the format <code>url(/path-to-image.jpg)</code>.. Individual shapes can also be set for each point.</p>
    * @param stackDistance <p>When multiple flags in the same series fall on the same value, this. number determines the vertical offset between them.</p>
    * @param style <p>The text styles of the flag.</p>. <p>In styled mode, the styles are set in the. <code>.highcharts-flag-series .highcharts-point</code> rule.</p>
    * @param textAlign <p>Text alignment for the text inside the flag.</p>
    * @param threshold <p>The Y axis value to serve as the base for the columns, for. distinguishing between values above and below a threshold. If <code>null</code>,. the columns extend from the padding Y axis minimum.</p>
    * @param title <p>The text to display on each flag. This can be defined on series. level, or individually for each point. Defaults to <code>&quot;A&quot;</code>.</p>
    * @param tooltip <p>Specific tooltip options for flag series. Flag series tooltips are. different from most other types in that a flag doesn&#39;t have a data. value, so the tooltip rather displays the <code>text</code> option for each. point.</p>
    * @param useHTML <p>Whether to use HTML to render the flag texts. Using HTML allows for. advanced formatting, images and reliable bi-directional text. rendering. Note that exported images won&#39;t respect the HTML, and that. HTML won&#39;t respect Z-index settings.</p>
    * @param width <p>Fixed width of the flag&#39;s shape. By default, width is autocalculated. according to the flag&#39;s title.</p>
    * @param y <p>The y position of the top left corner of the flag relative to either. the series (if onSeries is defined), or the x axis. Defaults to. <code>-30</code>.</p>
    * @param centerInCategory <p>When <code>true</code>, the columns will center in the category, ignoring null. or missing points. When <code>false</code>, space will be reserved for null or. missing points.</p>
    * @param colors <p>A series specific or series type specific color set to apply instead. of the global <a href="#colors">colors</a> when <a href="#plotOptions.column.colorByPoint">colorByPoint</a> is true.</p>
    * @param cropThreshold <p>When the series contains less points than the crop threshold, all. points are drawn, event if the points fall outside the visible plot. area at the current zoom. The advantage of drawing all points. (including markers and columns), is that animation is performed on. updates. On the other hand, when the series contains more points than. the crop threshold, the series data is cropped to only contain points. that fall within the plot area. The advantage of cropping away. invisible points is to increase performance on large series.</p>
    * @param dataLabels <p>Options for the series data labels, appearing next to each data. point.</p>. <p>Since v6.2.0, multiple data labels can be applied to each single. point by defining them as an array of configs.</p>. <p>In styled mode, the data labels can be styled with the. <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names. (<a href="https://www.highcharts.com/samples/highcharts/css/series-datalabels">see example</a>).</p>
    * @param depth <p>Depth of the columns in a 3D column chart.</p>
    * @param edgeColor <p>3D columns only. The color of the edges. Similar to <code>borderColor</code>, except it. defaults to the same color as the column.</p>
    * @param edgeWidth <p>3D columns only. The width of the colored edges.</p>
    * @param groupPadding <p>Padding between each value groups, in x axis units.</p>
    * @param groupZPadding <p>The spacing between columns on the Z Axis in a 3D chart.</p>
    * @param grouping <p>Whether to group non-stacked columns or to let them render. independent of each other. Non-grouped columns will be laid out. individually and overlap each other.</p>
    * @param maxPointWidth <p>The maximum allowed pixel width for a column, translated to the. height of a bar in a bar chart. This prevents the columns from. becoming too wide when there is a small number of points in the. chart.</p>
    * @param minPointLength <p>The minimal height for a column or width for a bar. By default,. 0 values are not shown. To visualize a 0 (or close to zero) point,. set the minimal point length to a pixel value like 3. In stacked. column charts, minPointLength might not be respected for tightly. packed values.</p>
    * @param pointRange <p>The X axis range that each point is valid for. This determines the. width of the column. On a categorized axis, the range will be 1. by default (one category unit). On linear and datetime axes, the. range will be computed as the distance between the two closest data. points.</p>. <p>The default <code>null</code> means it is computed automatically, but this. option can be used to override the automatic value.</p>. <p>This option is set by default to 1 if data sorting is enabled.</p>
    * @param stickyTracking <p>Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a. series isn&#39;t triggered until the mouse moves over another series, or. out of the plot area. When false, the <code>mouseOut</code> event on a series is. triggered when the mouse leaves the area around the series&#39; graph or. markers. This also implies the tooltip when not shared. When. <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip. will be hidden when moving the mouse between series. Defaults to true. for line and area type series, but to false for columns, pies etc.</p>. <p><strong>Note:</strong> The boost module will force this option because of. technical limitations.</p>
    * @param accessibility <p>Accessibility options for a series.</p>
    * @param allAreas <p>Whether all areas of the map defined in <code>mapData</code> should be rendered.. If <code>true</code>, areas which don&#39;t correspond to a data point, are rendered. as <code>null</code> points. If <code>false</code>, those areas are skipped.</p>
    * @param allowPointSelect <p>Allow this series&#39; points to be selected by clicking on the graphic. (columns, point markers, pie slices, map areas etc).</p>. <p>The selected points can be handled by point select and unselect. events, or collectively by the <a href="/class-reference/Highcharts.Chart#getSelectedPoints">getSelectedPoints</a> function.</p>. <p>And alternative way of selecting points is through dragging.</p>
    * @param animationLimit <p>For some series, there is a limit that shuts down initial animation. by default when the total number of points in the chart is too high.. For example, for a column chart and its derivatives, animation does. not run if there is more than 250 points totally. To disable this. cap, set <code>animationLimit</code> to <code>Infinity</code>.</p>
    * @param boostBlending <p>Sets the color blending in the boost module.</p>
    * @param boostThreshold <p>Set the point threshold for when a series should enter boost mode.</p>. <p>Setting it to e.g. 2000 will cause the series to enter boost mode when there. are 2000 or more points in the series.</p>. <p>To disable boosting on the series, set the <code>boostThreshold</code> to 0. Setting it. to 1 will force boosting.</p>. <p>Note that the <a href="plotOptions.series.cropThreshold">cropThreshold</a> also affects. this setting. When zooming in on a series that has fewer points than the. <code>cropThreshold</code>, all points are rendered although outside the visible plot. area, and the <code>boostThreshold</code> won&#39;t take effect.</p>
    * @param className <p>An additional class name to apply to the series&#39; graphical elements.. This option does not replace default class names of the graphical. element.</p>
    * @param clip <p>Disable this option to allow series rendering in the whole plotting. area.</p>. <p><strong>Note:</strong> Clipping should be always enabled when. <a href="#chart.zoomType">chart.zoomType</a> is set</p>
    * @param color <p>The main color of the series. In line type series it applies to the. line and the point markers unless otherwise specified. In bar type. series it applies to the bars unless a color is specified per point.. The default value is pulled from the <code>options.colors</code> array.</p>. <p>In styled mode, the color can be defined by the. <a href="#plotOptions.series.colorIndex">colorIndex</a> option. Also, the series. color can be set with the <code>.highcharts-series</code>,. <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or. <code>.highcharts-series-{n}</code> class, or individual classes given by the. <code>className</code> option.</p>
    * @param colorAxis <p>When using dual or multiple color axes, this number defines which. colorAxis the particular series is connected to. It refers to. either the. {@link #colorAxis.id|axis id}. or the index of the axis in the colorAxis array, with 0 being the. first. Set this option to false to prevent a series from connecting. to the default color axis.</p>. <p>Since v7.2.0 the option can also be an axis id or an axis index. instead of a boolean flag.</p>
    * @param colorIndex <p>Styled mode only. A specific color index to use for the series, so. its graphic representations are given the class name. <code>highcharts-color-{n}</code>.</p>
    * @param colorKey <p>Determines what data value should be used to calculate point color. if <code>colorAxis</code> is used. Requires to set <code>min</code> and <code>max</code> if some. custom point property is used or if approximation for data grouping. is set to <code>&#39;sum&#39;</code>.</p>
    * @param compare <p>Compare the values of the series against the first non-null, non-. zero value in the visible range. The y axis will show percentage. or absolute change depending on whether <code>compare</code> is set to <code>&quot;percent&quot;</code>. or <code>&quot;value&quot;</code>. When this is applied to multiple series, it allows. comparing the development of the series against each other. Adds. a <code>change</code> field to every point object.</p>
    * @param compareBase <p>When <a href="#plotOptions.series.compare">compare</a> is <code>percent</code>, this option. dictates whether to use 0 or 100 as the base of comparison.</p>
    * @param compareStart <p>Defines if comparison should start from the first point within the visible. range or should start from the first point <strong>before</strong> the range.</p>. <p>In other words, this flag determines if first point within the visible range. will have 0% (<code>compareStart=true</code>) or should have been already calculated. according to the previous point (<code>compareStart=false</code>).</p>
    * @param connectors <p>Override Pathfinder connector options for a series. Requires Highcharts Gantt. to be loaded.</p>
    * @param crisp <p>When true, each point or column edge is rounded to its nearest pixel. in order to render sharp on screen. In some cases, when there are a. lot of densely packed columns, this leads to visible difference. in column widths or distance between columns. In these cases,. setting <code>crisp</code> to <code>false</code> may look better, even though each column. is rendered blurry.</p>
    * @param cumulative <p>Cumulative Sum feature replaces points&#39; values with the following formula:. <code>sum of all previous points&#39; values + current point&#39;s value</code>.. Works only for points in a visible range.. Adds the <code>cumulativeSum</code> field to each point object that can be accessed. e.g. in the <a href="https://api.highcharts.com/highstock/tooltip.pointFormat">tooltip.pointFormat</a>.</p>
    * @param cursor <p>You can set the cursor to &quot;pointer&quot; if you have click events attached. to the series, to signal to the user that the points and lines can. be clicked.</p>. <p>In styled mode, the series cursor can be set with the same classes. as listed under <a href="#plotOptions.series.color">series.color</a>.</p>
    * @param custom <p>A reserved subspace to store options and values for customized. functionality. Here you can add additional data for your own event. callbacks and formatter callbacks.</p>
    * @param dataSorting <p>Options for the series data sorting.</p>
    * @param description <p>A description of the series to add to the screen reader information. about the series.</p>
    * @param dragDrop <p>The draggable-points module allows points to be moved around or modified in. the chart. In addition to the options mentioned under the <code>dragDrop</code> API. structure, the module fires three events,. <a href="plotOptions.series.point.events.dragStart">point.dragStart</a>,. <a href="plotOptions.series.point.events.drag">point.drag</a> and. <a href="plotOptions.series.point.events.drop">point.drop</a>.</p>
    * @param enableMouseTracking <p>Enable or disable the mouse tracking for a specific series. This. includes point tooltips and click events on graphs and points. For. large datasets it improves performance.</p>
    * @param events <p>General event handlers for the series items. These event hooks can. also be attached to the series at run time using the. <code>Highcharts.addEvent</code> function.</p>
    * @param findNearestPointBy <p>Determines whether the series should look for the nearest point. in both dimensions or just the x-dimension when hovering the series.. Defaults to <code>&#39;xy&#39;</code> for scatter series and <code>&#39;x&#39;</code> for most other. series. If the data has duplicate x-values, it is recommended to. set this to <code>&#39;xy&#39;</code> to allow hovering over all points.</p>. <p>Applies only to series types using nearest neighbor search (not. direct hover) for tooltip.</p>
    * @param getExtremesFromAll <p>Whether to use the Y extremes of the total chart width or only the. zoomed area when zooming in on parts of the X axis. By default, the. Y axis adjusts to the min and max of the visible data. Cartesian. series only.</p>
    * @param includeInDataExport <p>When set to <code>false</code> will prevent the series data from being included in. any form of data export.</p>. <p>Since version 6.0.0 until 7.1.0 the option was existing undocumented. as <code>includeInCSVExport</code>.</p>
    * @param joinBy <p>What property to join the <code>mapData</code> to the value data. For example,. if joinBy is &quot;code&quot;, the mapData items with a specific code is merged. into the data with the same code. For maps loaded from GeoJSON, the. keys may be held in each point&#39;s <code>properties</code> object.</p>. <p>The joinBy option can also be an array of two values, where the first. points to a key in the <code>mapData</code>, and the second points to another. key in the <code>data</code>.</p>. <p>When joinBy is <code>null</code>, the map items are joined by their position in. the array, which performs much better in maps with many data points.. This is the recommended option if you are printing more than a. thousand data points and have a backend that can preprocess the data. into a parallel array of the mapData.</p>
    * @param keys <p>An array specifying which option maps to which key in the data point. array. This makes it convenient to work with unstructured data arrays. from different sources.</p>
    * @param label <p>Series labels are placed as close to the series as possible in a. natural way, seeking to avoid other series. The goal of this. feature is to make the chart more easily readable, like if a. human designer placed the labels in the optimal position.</p>. <p>The series labels currently work with series types having a. <code>graph</code> or an <code>area</code>.</p>
    * @param lastPrice <p>The line marks the last price from all points.</p>
    * @param lastVisiblePrice <p>The line marks the last price from visible range of points.</p>
    * @param linkedTo <p>The <a href="#series.id">id</a> of another series to link to. Additionally,. the value can be &quot;:previous&quot; to link to the previous series. When. two series are linked, only the first one appears in the legend.. Toggling the visibility of this also toggles the linked series.</p>. <p>If master series uses data sorting and linked series does not have. its own sorting definition, the linked series will be sorted in the. same order as the master one.</p>
    * @param navigatorOptions <p>Options for the corresponding navigator series if <code>showInNavigator</code>. is <code>true</code> for this series. Available options are the same as any. series, documented at <a href="#plotOptions.series">plotOptions</a> and. <a href="#series">series</a>.</p>. <p>These options are merged with options in <a href="#navigator.series">navigator.series</a>, and will take precedence if the same option is. defined both places.</p>
    * @param negativeColor <p>The color for the parts of the graph or points that are below the. <a href="#plotOptions.series.threshold">threshold</a>. Note that <code>zones</code> takes. precedence over the negative color. Using <code>negativeColor</code> is. equivalent to applying a zone with value of 0.</p>
    * @param opacity <p>Opacity of a series parts: line, fill (e.g. area) and dataLabels.</p>
    * @param point <p>Properties for each single point.</p>
    * @param pointDescriptionFormatter <p>Same as. <a href="#accessibility.series.descriptionFormatter">accessibility.series.descriptionFormatter</a>,. but for an individual series. Overrides the chart wide configuration.</p>
    * @param pointInterval <p>If no x values are given for the points in a series, <code>pointInterval</code>. defines the interval of the x values. For example, if a series. contains one value every decade starting from year 0, set. <code>pointInterval</code> to <code>10</code>. In true <code>datetime</code> axes, the <code>pointInterval</code>. is set in milliseconds.</p>. <p>It can be also be combined with <code>pointIntervalUnit</code> to draw irregular. time intervals.</p>. <p>If combined with <code>relativeXValue</code>, an x value can be set on each. point, and the <code>pointInterval</code> is added x times to the <code>pointStart</code>. setting.</p>. <p>Please note that this options applies to the <em>series data</em>, not the. interval of the axis ticks, which is independent.</p>
    * @param pointIntervalUnit <p>On datetime series, this allows for setting the. <a href="#plotOptions.series.pointInterval">pointInterval</a> to irregular time. units, <code>day</code>, <code>month</code> and <code>year</code>. A day is usually the same as 24. hours, but <code>pointIntervalUnit</code> also takes the DST crossover into. consideration when dealing with local time. Combine this option with. <code>pointInterval</code> to draw weeks, quarters, 6 months, 10 years etc.</p>. <p>Please note that this options applies to the <em>series data</em>, not the. interval of the axis ticks, which is independent.</p>
    * @param pointPlacement <p>Possible values: <code>&quot;on&quot;</code>, <code>&quot;between&quot;</code>, <code>number</code>.</p>. <p>In a column chart, when pointPlacement is <code>&quot;on&quot;</code>, the point will not. create any padding of the X axis. In a polar column chart this means. that the first column points directly north. If the pointPlacement is. <code>&quot;between&quot;</code>, the columns will be laid out between ticks. This is. useful for example for visualising an amount between two points in. time or in a certain sector of a polar chart.</p>. <p>Since Highcharts 3.0.2, the point placement can also be numeric,. where 0 is on the axis value, -0.5 is between this value and the. previous, and 0.5 is between this value and the next. Unlike the. textual options, numeric point placement options won&#39;t affect axis. padding.</p>. <p>Note that pointPlacement needs a <a href="#plotOptions.series.pointRange">pointRange</a> to work. For column series this is. computed, but for line-type series it needs to be set.</p>. <p>For the <code>xrange</code> series type and gantt charts, if the Y axis is a. category axis, the <code>pointPlacement</code> applies to the Y axis rather than. the (typically datetime) X axis.</p>. <p>Defaults to <code>undefined</code> in cartesian charts, <code>&quot;between&quot;</code> in polar. charts.</p>
    * @param pointStart <p>If no x values are given for the points in a series, pointStart. defines on what value to start. For example, if a series contains one. yearly value starting from 1945, set pointStart to 1945.</p>. <p>If combined with <code>relativeXValue</code>, an x value can be set on each. point. The x value from the point options is multiplied by. <code>pointInterval</code> and added to <code>pointStart</code> to produce a modified x. value.</p>
    * @param relativeXValue <p>When true, X values in the data set are relative to the current. <code>pointStart</code>, <code>pointInterval</code> and <code>pointIntervalUnit</code> settings. This. allows compression of the data for datasets with irregular X values.</p>. <p>The real X values are computed on the formula <code>f(x) = ax + b</code>, where. <code>a</code> is the <code>pointInterval</code> (optionally with a time unit given by. <code>pointIntervalUnit</code>), and <code>b</code> is the <code>pointStart</code>.</p>
    * @param selected <p>Whether to select the series initially. If <code>showCheckbox</code> is true,. the checkbox next to the series name in the legend will be checked. for a selected series.</p>
    * @param shadow <p>Whether to apply a drop shadow to the graph line. Since 2.3 the. shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,. <code>offsetY</code>, <code>opacity</code> and <code>width</code>.</p>
    * @param showCheckbox <p>If true, a checkbox is displayed next to the legend item to allow. selecting the series. The state of the checkbox is determined by. the <code>selected</code> option.</p>
    * @param showInLegend <p>Whether to display this particular series or series type in the. legend. Standalone series are shown in legend by default, and linked. series are not. Since v7.2.0 it is possible to show series that use. colorAxis by setting this option to <code>true</code>.</p>
    * @param showInNavigator <p>Whether or not to show the series in the navigator. Takes precedence. over <a href="#navigator.baseSeries">navigator.baseSeries</a> if defined.</p>
    * @param skipKeyboardNavigation <p>If set to <code>true</code>, the accessibility module will skip past the points. in this series for keyboard navigation.</p>
    * @param softThreshold <p>When this is true, the series will not cause the Y axis to cross. the zero plane (or <a href="#plotOptions.series.threshold">threshold</a> option). unless the data actually crosses the plane.</p>. <p>For example, if <code>softThreshold</code> is <code>false</code>, a series of 0, 1, 2,. 3 will make the Y axis show negative values according to the. <code>minPadding</code> option. If <code>softThreshold</code> is <code>true</code>, the Y axis starts. at 0.</p>
    * @param stacking <p>Whether to stack the values of each series on top of each other.. Possible values are <code>undefined</code> to disable, <code>&quot;normal&quot;</code> to stack by. value or <code>&quot;percent&quot;</code>.</p>. <p>When stacking is enabled, data must be sorted. in ascending X order.</p>. <p>Some stacking options are related to specific series types. In the. streamgraph series type, the stacking option is set to <code>&quot;stream&quot;</code>.. The second one is <code>&quot;overlap&quot;</code>, which only applies to waterfall. series.</p>
    * @param visible <p>Set the initial visibility of the series.</p>
    * @param zoneAxis <p>Defines the Axis on which the zones are applied.</p>
    * @param zones <p>An array defining zones within a series. Zones can be applied to the. X axis, Y axis or Z axis for bubbles, according to the <code>zoneAxis</code>. option. The zone definitions have to be in ascending order regarding. to the value.</p>. <p>In styled mode, the color zones are styled with the. <code>.highcharts-zone-{n}</code> class, or custom classed from the <code>className</code>. option. (<a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/color-zones/">view live demo</a>).</p>
    * @param connectEnds <p>Polar charts only. Whether to connect the ends of a line series. plot across the extremes.</p>
    */
  def apply(data: js.UndefOr[js.Array[js.Any]] = js.undefined, id: js.UndefOr[String] = js.undefined, index: js.UndefOr[Double] = js.undefined, legendIndex: js.UndefOr[Double] = js.undefined, mapData: js.UndefOr[js.Array[js.Any] | js.Any] = js.undefined, name: js.UndefOr[String] = js.undefined, stack: js.UndefOr[Double | String] = js.undefined, `type`: js.UndefOr[String] = "flags", xAxis: js.UndefOr[Double | String] = js.undefined, yAxis: js.UndefOr[Double | String] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined, allowOverlapX: js.UndefOr[Boolean] = js.undefined, fillColor: js.UndefOr[String | js.Object] = js.undefined, height: js.UndefOr[Double] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, onKey: js.UndefOr[String] = js.undefined, onSeries: js.UndefOr[String] = js.undefined, shape: js.UndefOr[js.Any] = js.undefined, stackDistance: js.UndefOr[Double] = js.undefined, states: js.UndefOr[js.Any] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, textAlign: js.UndefOr[String] = js.undefined, threshold: js.UndefOr[js.Any] = js.undefined, title: js.UndefOr[String] = js.undefined, tooltip: js.UndefOr[js.Any] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, width: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined, centerInCategory: js.UndefOr[Boolean] = js.undefined, colors: js.UndefOr[js.Array[String | js.Object]] = js.undefined, cropThreshold: js.UndefOr[Double] = js.undefined, dataLabels: js.UndefOr[js.Any] = js.undefined, depth: js.UndefOr[Double] = js.undefined, edgeColor: js.UndefOr[String] = js.undefined, edgeWidth: js.UndefOr[Double] = js.undefined, groupPadding: js.UndefOr[Double] = js.undefined, groupZPadding: js.UndefOr[Double] = js.undefined, grouping: js.UndefOr[Boolean] = js.undefined, maxPointWidth: js.UndefOr[Double] = js.undefined, minPointLength: js.UndefOr[Double] = js.undefined, pointRange: js.UndefOr[Double | Null] = js.undefined, stickyTracking: js.UndefOr[Boolean] = js.undefined, accessibility: js.UndefOr[js.Any] = js.undefined, allAreas: js.UndefOr[Boolean] = js.undefined, allowPointSelect: js.UndefOr[Boolean] = js.undefined, animationLimit: js.UndefOr[Double] = js.undefined, boostBlending: js.UndefOr[String] = js.undefined, boostThreshold: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, clip: js.UndefOr[Boolean] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colorAxis: js.UndefOr[Double | String | Boolean] = js.undefined, colorIndex: js.UndefOr[Double] = js.undefined, colorKey: js.UndefOr[String] = js.undefined, compare: js.UndefOr[String] = js.undefined, compareBase: js.UndefOr[Double] = js.undefined, compareStart: js.UndefOr[Boolean] = js.undefined, connectors: js.UndefOr[CleanJsObject[SeriesFlagsConnectors]] = js.undefined, crisp: js.UndefOr[Boolean] = js.undefined, cumulative: js.UndefOr[Boolean] = js.undefined, cursor: js.UndefOr[String] = js.undefined, custom: js.UndefOr[js.Object] = js.undefined, dataSorting: js.UndefOr[js.Any] = js.undefined, description: js.UndefOr[String] = js.undefined, dragDrop: js.UndefOr[js.Any] = js.undefined, enableMouseTracking: js.UndefOr[Boolean] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, findNearestPointBy: js.UndefOr[String] = js.undefined, getExtremesFromAll: js.UndefOr[Boolean] = js.undefined, includeInDataExport: js.UndefOr[Boolean] = js.undefined, joinBy: js.UndefOr[String | js.Array[String]] = js.undefined, keys: js.UndefOr[js.Array[String]] = js.undefined, label: js.UndefOr[js.Any] = js.undefined, lastPrice: js.UndefOr[js.Any] = js.undefined, lastVisiblePrice: js.UndefOr[js.Any] = js.undefined, linkedTo: js.UndefOr[String] = js.undefined, navigatorOptions: js.UndefOr[js.Any] = js.undefined, negativeColor: js.UndefOr[String | js.Object] = js.undefined, opacity: js.UndefOr[Double] = js.undefined, point: js.UndefOr[js.Any] = js.undefined, pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined, pointInterval: js.UndefOr[Double] = js.undefined, pointIntervalUnit: js.UndefOr[String] = js.undefined, pointPlacement: js.UndefOr[String | Double] = js.undefined, pointStart: js.UndefOr[Double] = js.undefined, relativeXValue: js.UndefOr[Boolean] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, shadow: js.UndefOr[Boolean | js.Object] = js.undefined, showCheckbox: js.UndefOr[Boolean] = js.undefined, showInLegend: js.UndefOr[Boolean] = js.undefined, showInNavigator: js.UndefOr[Boolean] = js.undefined, skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined, softThreshold: js.UndefOr[Boolean] = js.undefined, stacking: js.UndefOr[String] = js.undefined, visible: js.UndefOr[Boolean] = js.undefined, zoneAxis: js.UndefOr[String] = js.undefined, zones: js.UndefOr[js.Array[js.Any]] = js.undefined, connectEnds: js.UndefOr[Boolean] = js.undefined): SeriesFlags = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesFlags {
      this.data = data
      this.id = id
      this.index = index
      this.legendIndex = legendIndex
      this.mapData = mapData
      this.name = name
      this.stack = stack
      this.`type` = `type`
      this.xAxis = xAxis
      this.yAxis = yAxis
      this.zIndex = zIndex
      this.allowOverlapX = allowOverlapX
      this.fillColor = fillColor
      this.height = height
      this.lineColor = lineColor
      this.onKey = onKey
      this.onSeries = onSeries
      this.shape = shape
      this.stackDistance = stackDistance
      this.states = states
      this.style = style
      this.textAlign = textAlign
      this.threshold = threshold
      this.title = title
      this.tooltip = tooltip
      this.useHTML = useHTML
      this.width = width
      this.y = y
      this.centerInCategory = centerInCategory
      this.colors = colors
      this.cropThreshold = cropThreshold
      this.dataLabels = dataLabels
      this.depth = depth
      this.edgeColor = edgeColor
      this.edgeWidth = edgeWidth
      this.groupPadding = groupPadding
      this.groupZPadding = groupZPadding
      this.grouping = grouping
      this.maxPointWidth = maxPointWidth
      this.minPointLength = minPointLength
      this.pointRange = pointRange
      this.stickyTracking = stickyTracking
      this.accessibility = accessibility
      this.allAreas = allAreas
      this.allowPointSelect = allowPointSelect
      this.animationLimit = animationLimit
      this.boostBlending = boostBlending
      this.boostThreshold = boostThreshold
      this.className = className
      this.clip = clip
      this.color = color
      this.colorAxis = colorAxis
      this.colorIndex = colorIndex
      this.colorKey = colorKey
      this.compare = compare
      this.compareBase = compareBase
      this.compareStart = compareStart
      this.connectors = connectors
      this.crisp = crisp
      this.cumulative = cumulative
      this.cursor = cursor
      this.custom = custom
      this.dataSorting = dataSorting
      this.description = description
      this.dragDrop = dragDrop
      this.enableMouseTracking = enableMouseTracking
      this.events = events
      this.findNearestPointBy = findNearestPointBy
      this.getExtremesFromAll = getExtremesFromAll
      this.includeInDataExport = includeInDataExport
      this.joinBy = joinBy
      this.keys = keys
      this.label = label
      this.lastPrice = lastPrice
      this.lastVisiblePrice = lastVisiblePrice
      this.linkedTo = linkedTo
      this.navigatorOptions = navigatorOptions
      this.negativeColor = negativeColor
      this.opacity = opacity
      this.point = point
      this.pointDescriptionFormatter = pointDescriptionFormatter
      this.pointInterval = pointInterval
      this.pointIntervalUnit = pointIntervalUnit
      this.pointPlacement = pointPlacement
      this.pointStart = pointStart
      this.relativeXValue = relativeXValue
      this.selected = selected
      this.shadow = shadow
      this.showCheckbox = showCheckbox
      this.showInLegend = showInLegend
      this.showInNavigator = showInNavigator
      this.skipKeyboardNavigation = skipKeyboardNavigation
      this.softThreshold = softThreshold
      this.stacking = stacking
      this.visible = visible
      this.zoneAxis = zoneAxis
      this.zones = zones
      this.connectEnds = connectEnds
    })
  }
}
