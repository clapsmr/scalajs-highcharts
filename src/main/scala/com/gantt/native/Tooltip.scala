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
  * @note JavaScript name: <code>tooltip</code>
  */
class Tooltip extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable animation of the tooltip.</p>
    * @since 2.3.0
    */
  var animation: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The background color or gradient for the tooltip.</p>
    * <p>In styled mode, the stroke width is set in the
    * <code>.highcharts-tooltip-box</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/backgroundcolor-solid/">Yellowish background</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/backgroundcolor-gradient/">Gradient</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/tooltip-border-background/">Tooltip in styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/tooltip/general/">Custom tooltip</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/tooltip-border-background/">Tooltip in styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/background-border/">Background and border demo</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/tooltip-border-background/">Tooltip in styled mode</a>
    */
  var backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the tooltip border. When <code>undefined</code>, the border takes
    * the color of the corresponding series or point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/bordercolor-default/">Follow series by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/bordercolor-black/">Black border</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/tooltip/general/">Styled tooltip</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/background-border/">Background and border demo</a>
    */
  var borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The radius of the rounded border corners.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/bordercolor-default/">5px by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/borderradius-0/">Square borders</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/background-border/">Background and border demo</a>
    */
  var borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>The pixel width of the tooltip border.</p>
    * <p>In styled mode, the stroke width is set in the
    * <code>.highcharts-tooltip-box</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/bordercolor-default/">2px by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/borderwidth/">No border (shadow only)</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/tooltip-border-background/">Tooltip in styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/tooltip/general/">Custom tooltip</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/tooltip-border-background/">Tooltip in styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/background-border/">Background and border demo</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/tooltip-border-background/">Tooltip in styled mode</a>
    */
  var borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>How many decimals to show for the <code>point.change</code>
    * or the <code>point.cumulativeSum</code> value when the <code>series.compare</code>
    * or the <code>series.cumulative</code> option is set.
    * This is overridable in each series&#39; tooltip options object.</p>
    * @since 1.0.1
    */
  var changeDecimals: js.UndefOr[Double] = js.undefined

  /**
    * <p>A CSS class name to apply to the tooltip&#39;s container div,
    * allowing unique CSS styling for each chart.</p>
    */
  var className: js.UndefOr[String] = js.undefined

  /**
    * <p>The HTML of the cluster point&#39;s in the tooltip. Works only with
    * marker-clusters module and analogously to
    * <a href="#tooltip.pointFormat">pointFormat</a>.</p>
    * <p>The cluster tooltip can be also formatted using
    * <code>tooltip.formatter</code> callback function and <code>point.isCluster</code> flag.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/marker-clusters/grid">Format tooltip for cluster points.</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/marker-clusters/europe/">Format tooltip for clusters using tooltip.formatter</a>
    */
  var clusterFormat: js.Any = js.undefined

  /**
    * <p>Since 4.1, the crosshair definitions are moved to the Axis object
    * in order for a better separation from the tooltip. See
    * <a href="#xAxis.crosshair">xAxis.crosshair</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/crosshairs-x/">Enable a crosshair for the x value</a>
    */
  var crosshairs: js.Any = js.undefined

  /**
    * <p>For series on datetime axes, the date format in the tooltip&#39;s
    * header will by default be guessed based on the closest data points.
    * This member gives the default string representations used for
    * each unit. For an overview of the replacement codes, see
    * <a href="/class-reference/Highcharts.Time#dateFormat">dateFormat</a>.</p>
    */
  var dateTimeLabelFormats: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Distance from point to tooltip in pixels.</p>
    */
  var distance: js.UndefOr[Double] = js.undefined

  /**
    * <p>Enable or disable the tooltip.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/enabled/">Disabled</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-mouseover/">Disable tooltip and show values on chart instead</a>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether the tooltip should follow the mouse as it moves across
    * columns, pie slices and other point types with an extent.
    * By default it behaves this way for pie, polygon, map, sankey
    * and wordcloud series by override in the <code>plotOptions</code>
    * for those series types.</p>
    * <p>Does not apply if <a href="#tooltip.split">split</a> is <code>true</code>.</p>
    * <p>For touch moves to behave the same way, <a href="#tooltip.followTouchMove">followTouchMove</a> must be <code>true</code> also.</p>
    * @since 3.0.0
    */
  var followPointer: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether the tooltip should update as the finger moves on a touch
    * device. If this is <code>true</code> and <a href="#chart.panning">chart.panning</a> is
    * set,<code>followTouchMove</code> will take over one-finger touches, so the user
    * needs to use two fingers for zooming and panning.</p>
    * <p>Note the difference to <a href="#tooltip.followPointer">followPointer</a> that
    * only defines the <em>position</em> of the tooltip. If <code>followPointer</code> is
    * false in for example a column series, the tooltip will show above or
    * below the column, but as <code>followTouchMove</code> is true, the tooltip will
    * jump from column to column as the user swipes across the plot area.</p>
    * @since 3.0.1
    */
  var followTouchMove: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>A string to append to the tooltip format.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/footerformat/">A table for value alignment</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/format/">Format demo</a>
    * @since 2.2.0
    */
  var footerFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>Callback function to format the text of the tooltip from scratch. In
    * case of single or <a href="#tooltip.shared">shared</a> tooltips, a string should
    * be returned. In case of <a href="#tooltip.split">split</a> tooltips, it should
    * return an array where the first item is the header, and subsequent
    * items are mapped to the points. Return <code>false</code> to disable tooltip for
    * a specific point on series.</p>
    * <p>A subset of HTML is supported. Unless <code>useHTML</code> is true, the HTML of
    * the tooltip is parsed and converted to SVG, therefore this isn&#39;t a
    * complete HTML renderer. The following HTML tags are supported: <code>b</code>,
    * <code>br</code>, <code>em</code>, <code>i</code>, <code>span</code>, <code>strong</code>. Spans can be styled with a <code>style</code>
    * attribute, but only text-related CSS, that is shared with SVG, is
    * handled.</p>
    * <p>The available data in the formatter differ a bit depending on whether
    * the tooltip is shared or split, or belongs to a single point. In a
    * shared/split tooltip, all properties except <code>x</code>, which is common for
    * all points, are kept in an array, <code>this.points</code>.</p>
    * <p>Available data are:</p>
    * <ul>
    * <li><p><strong>this.percentage (not shared) /</strong>
    * <strong>this.points[i].percentage (shared)</strong>:
    * Stacked series and pies only. The point&#39;s percentage of the total.</p>
    * </li>
    * <li><p><strong>this.point (not shared) / this.points[i].point (shared)</strong>:
    * The point object. The point name, if defined, is available through
    * <code>this.point.name</code>.</p>
    * </li>
    * <li><p><strong>this.points</strong>:
    * In a shared tooltip, this is an array containing all other
    * properties for each point.</p>
    * </li>
    * <li><p><strong>this.series (not shared) / this.points[i].series (shared)</strong>:
    * The series object. The series name is available through
    * <code>this.series.name</code>.</p>
    * </li>
    * <li><p><strong>this.total (not shared) / this.points[i].total (shared)</strong>:
    * Stacked series only. The total value at this point&#39;s x value.</p>
    * </li>
    * <li><p><strong>this.x</strong>:
    * The x value. This property is the same regardless of the tooltip
    * being shared or not.</p>
    * </li>
    * <li><p><strong>this.y (not shared) / this.points[i].y (shared)</strong>:
    * The y value.</p>
    * </li>
    * </ul>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/formatter-simple/">Simple string formatting</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/formatter-shared/">Formatting with shared tooltip</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/formatter-split/">Formatting with split tooltip</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/formatter-conditional-default/">Extending default formatter</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/tooltip/formatter/">Formatting with shared tooltip</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/formatter/">String formatting</a>
    */
  var formatter: js.Any = js.undefined

  /**
    * <p>The HTML of the tooltip header line. Variables are enclosed by
    * curly brackets. Available variables are <code>point.key</code>, <code>series.name</code>,
    * <code>series.color</code> and other members from the <code>point</code> and <code>series</code>
    * objects. The <code>point.key</code> variable contains the category name, x
    * value or datetime string depending on the type of axis. For datetime
    * axes, the <code>point.key</code> date format can be set using
    * <code>tooltip.xDateFormat</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/footerformat/">An HTML table in the tooltip</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/footerformat/">An HTML table in the tooltip</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/format/">Format demo</a>
    */
  var headerFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>The name of a symbol to use for the border around the tooltip
    * header. Applies only when <a href="#tooltip.split">tooltip.split</a> is
    * enabled.</p>
    * <p>Custom callbacks for symbol path generation can also be added to
    * <code>Highcharts.SVGRenderer.prototype.symbols</code> the same way as for
    * <a href="plotOptions.line.marker.symbol">series.marker.symbol</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/tooltip/split-positioner/">Different shapes for header and split boxes</a>
    * @since 7.0.0
    */
  var headerShape: js.UndefOr[String] = js.undefined

  /**
    * <p>The number of milliseconds to wait until the tooltip is hidden when
    * mouse out from a point or chart.</p>
    * @since 3.0.0
    */
  var hideDelay: js.UndefOr[Double] = js.undefined

  /**
    * <p>The HTML of the null point&#39;s line in the tooltip. Works analogously
    * to <a href="#tooltip.pointFormat">pointFormat</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-nullformat">Format data label and tooltip for null point.</a>
    */
  var nullFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>Callback function to format the text of the tooltip for
    * visible null points.
    * Works analogously to <a href="#tooltip.formatter">formatter</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-nullformat">Format data label and tooltip for null point.</a>
    */
  var nullFormatter: js.Any = js.undefined

  /**
    * <p>Whether to allow the tooltip to render outside the chart&#39;s SVG
    * element box. By default (<code>false</code>), the tooltip is rendered within the
    * chart&#39;s SVG element, which results in the tooltip being aligned
    * inside the chart area. For small charts, this may result in clipping
    * or overlapping. When <code>true</code>, a separate SVG element is created and
    * overlaid on the page, allowing the tooltip to be aligned inside the
    * page itself.</p>
    * <p>Defaults to <code>true</code> if <code>chart.scrollablePlotArea</code> is activated,
    * otherwise <code>false</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/outside">Small charts with tooltips outside</a>
    * @since 6.1.1
    */
  var outside: js.UndefOr[js.UndefOr[Boolean]] = js.undefined

  /**
    * <p>Padding inside the tooltip, in pixels.</p>
    * @since 5.0.0
    */
  var padding: js.UndefOr[Double] = js.undefined

  /**
    * <p>The HTML of the point&#39;s line in the tooltip. Variables are enclosed
    * by curly brackets. Available variables are <code>point.x</code>, <code>point.y</code>,
    * <code>series.name</code> and <code>series.color</code> and other properties on the same
    * form. Furthermore, <code>point.y</code> can be extended by the
    * <code>tooltip.valuePrefix</code> and <code>tooltip.valueSuffix</code> variables. This can
    * also be overridden for each series, which makes it a good hook for
    * displaying units.</p>
    * <p>In styled mode, the dot is colored by a class name rather
    * than the point color.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/pointformat/">A different point format with value suffix</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/format/">Format demo</a>
    * @since 2.2.0
    */
  var pointFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>A callback function for formatting the HTML output for a single point
    * in the tooltip. Like the <code>pointFormat</code> string, but with more
    * flexibility.</p>
    * @since 4.1.0
    */
  var pointFormatter: js.Any = js.undefined

  /**
    * <p>A callback function to place the tooltip in a default position. The
    * callback receives three parameters: <code>labelWidth</code>, <code>labelHeight</code> and
    * <code>point</code>, where point contains values for <code>plotX</code> and <code>plotY</code> telling
    * where the reference point is in the plot area. Add <code>chart.plotLeft</code>
    * and <code>chart.plotTop</code> to get the full coordinates.</p>
    * <p>Since v7, when <a href="#tooltip.split">tooltip.split</a> option is enabled,
    * positioner is called for each of the boxes separately, including
    * xAxis header. xAxis header is not a point, instead <code>point</code> argument
    * contains info:
    * <code>{ plotX: Number, plotY: Number, isHeader: Boolean }</code></p>
    * <p>The return should be an object containing x and y values, for example
    * <code>{ x: 100, y: 100 }</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/positioner/">A fixed tooltip position</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/tooltip/positioner/">A fixed tooltip position on top of the chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/positioner/">A fixed tooltip position</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/tooltip/split-positioner/">Split tooltip with fixed positions</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/tooltip/positioner-scrollable-plotarea/">Scrollable plot area combined with tooltip positioner</a>
    * @since 2.2.4
    */
  var positioner: js.Any = js.undefined

  /**
    * <p>Whether to apply a drop shadow to the tooltip.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/bordercolor-default/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/shadow/">False</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/positioner/">Fixed tooltip position, border and shadow disabled</a>
    */
  var shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>The name of a symbol to use for the border around the tooltip. Can
    * be one of: <code>&quot;callout&quot;</code>, <code>&quot;circle&quot;</code> or <code>&quot;rect&quot;</code>. When
    * <a href="#tooltip.split">tooltip.split</a>
    * option is enabled, shape is applied to all boxes except header, which
    * is controlled by
    * <a href="#tooltip.headerShape">tooltip.headerShape</a>.</p>
    * <p>Custom callbacks for symbol path generation can also be added to
    * <code>Highcharts.SVGRenderer.prototype.symbols</code> the same way as for
    * <a href="plotOptions.line.marker.symbol">series.marker.symbol</a>.</p>
    * @since 4.0.0
    */
  var shape: js.UndefOr[String] = js.undefined

  /**
    * <p>When the tooltip is shared, the entire plot area will capture mouse
    * movement or touch events. Tooltip texts for series types with ordered
    * data (not pie, scatter, flags etc) will be shown in a single bubble.
    * This is recommended for single series charts and for tablet/mobile
    * optimized charts.</p>
    * <p>See also <a href="#tooltip.split">tooltip.split</a>, that is better suited for
    * charts with many series, especially line-type series. The
    * <code>tooltip.split</code> option takes precedence over <code>tooltip.shared</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/shared-false/">False by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/shared-true/">True</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/shared-x-crosshair/">True with x axis crosshair</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/shared-true-mixed-types/">True with mixed series types</a>
    * @since 2.1.0
    */
  var shared: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Proximity snap for graphs or single points. It defaults to 10 for
    * mouse-powered devices and 25 for touch devices.</p>
    * <p>Note that in most cases the whole plot area captures the mouse
    * movement, and in these cases <code>tooltip.snap</code> doesn&#39;t make sense. This
    * applies when <a href="#plotOptions.series.stickyTracking">stickyTracking</a>
    * is <code>true</code> (default) and when the tooltip is <a href="#tooltip.shared">shared</a>
    * or <a href="#tooltip.split">split</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/bordercolor-default/">10 px by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/snap-50/">50 px on graph</a>
    * @since 1.2.0
    */
  var snap: js.UndefOr[Double] = js.undefined

  /**
    * <p>Split the tooltip into one label per series, with the header close
    * to the axis. This is recommended over <a href="#tooltip.shared">shared</a>
    * tooltips for charts with multiple line series, generally making them
    * easier to read. This option takes precedence over <code>tooltip.shared</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/split/">Split tooltip</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/formatter-split/">Split tooltip and custom formatter callback</a>
    * @since 5.0.0
    */
  var split: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Prevents the tooltip from switching or closing when touched or
    * pointed.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/stickoncontact/">Tooltip sticks on pointer contact</a>
    * @since 8.0.1
    */
  var stickOnContact: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>CSS styles for the tooltip. The tooltip can also be styled through
    * the CSS class <code>.highcharts-tooltip</code>.</p>
    * <p>Note that the default <code>pointerEvents</code> style makes the tooltip ignore
    * mouse events, so in order to use clickable tooltips, this value must
    * be set to <code>auto</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/style/">Greater padding, bold text</a>
    */
  var style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Use HTML to render the contents of the tooltip instead of SVG. Using
    * HTML allows advanced formatting like tables and images in the
    * tooltip. It is also recommended for rtl languages as it works around
    * rtl bugs in early Firefox.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/footerformat/">A table for value alignment</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/fullhtml/">Full HTML tooltip</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/usehtml/">Pure HTML tooltip</a>
    * @since 2.2.0
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>How many decimals to show in each series&#39; y value. This is
    * overridable in each series&#39; tooltip options object. The default is to
    * preserve all decimals.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/valuedecimals/">Set decimals, prefix and suffix for the value</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/valuedecimals/">Set decimals, prefix and suffix for the value</a>
    * @since 2.2.0
    */
  var valueDecimals: js.UndefOr[js.UndefOr[Double]] = js.undefined

  /**
    * <p>A string to prepend to each series&#39; y value. Overridable in each
    * series&#39; tooltip options object.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/valuedecimals/">Set decimals, prefix and suffix for the value</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/valuedecimals/">Set decimals, prefix and suffix for the value</a>
    * @since 2.2.0
    */
  var valuePrefix: js.UndefOr[String] = js.undefined

  /**
    * <p>A string to append to each series&#39; y value. Overridable in each
    * series&#39; tooltip options object.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/valuedecimals/">Set decimals, prefix and suffix for the value</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/valuedecimals/">Set decimals, prefix and suffix for the value</a>
    * @since 2.2.0
    */
  var valueSuffix: js.UndefOr[String] = js.undefined

  /**
    * <p>The format for the date in the tooltip header if the X axis is a
    * datetime axis. The default is a best guess based on the smallest
    * distance between points in the chart.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/xdateformat/">A different format</a>
    */
  var xDateFormat: js.UndefOr[String] = js.undefined
}

object Tooltip {
  /**
    * @param animation <p>Enable or disable animation of the tooltip.</p>
    * @param backgroundColor <p>The background color or gradient for the tooltip.</p>. <p>In styled mode, the stroke width is set in the. <code>.highcharts-tooltip-box</code> class.</p>
    * @param borderColor <p>The color of the tooltip border. When <code>undefined</code>, the border takes. the color of the corresponding series or point.</p>
    * @param borderRadius <p>The radius of the rounded border corners.</p>
    * @param borderWidth <p>The pixel width of the tooltip border.</p>. <p>In styled mode, the stroke width is set in the. <code>.highcharts-tooltip-box</code> class.</p>
    * @param changeDecimals <p>How many decimals to show for the <code>point.change</code>. or the <code>point.cumulativeSum</code> value when the <code>series.compare</code>. or the <code>series.cumulative</code> option is set.. This is overridable in each series&#39; tooltip options object.</p>
    * @param className <p>A CSS class name to apply to the tooltip&#39;s container div,. allowing unique CSS styling for each chart.</p>
    * @param clusterFormat <p>The HTML of the cluster point&#39;s in the tooltip. Works only with. marker-clusters module and analogously to. <a href="#tooltip.pointFormat">pointFormat</a>.</p>. <p>The cluster tooltip can be also formatted using. <code>tooltip.formatter</code> callback function and <code>point.isCluster</code> flag.</p>
    * @param crosshairs <p>Since 4.1, the crosshair definitions are moved to the Axis object. in order for a better separation from the tooltip. See. <a href="#xAxis.crosshair">xAxis.crosshair</a>.</p>
    * @param dateTimeLabelFormats <p>For series on datetime axes, the date format in the tooltip&#39;s. header will by default be guessed based on the closest data points.. This member gives the default string representations used for. each unit. For an overview of the replacement codes, see. <a href="/class-reference/Highcharts.Time#dateFormat">dateFormat</a>.</p>
    * @param distance <p>Distance from point to tooltip in pixels.</p>
    * @param enabled <p>Enable or disable the tooltip.</p>
    * @param followPointer <p>Whether the tooltip should follow the mouse as it moves across. columns, pie slices and other point types with an extent.. By default it behaves this way for pie, polygon, map, sankey. and wordcloud series by override in the <code>plotOptions</code>. for those series types.</p>. <p>Does not apply if <a href="#tooltip.split">split</a> is <code>true</code>.</p>. <p>For touch moves to behave the same way, <a href="#tooltip.followTouchMove">followTouchMove</a> must be <code>true</code> also.</p>
    * @param followTouchMove <p>Whether the tooltip should update as the finger moves on a touch. device. If this is <code>true</code> and <a href="#chart.panning">chart.panning</a> is. set,<code>followTouchMove</code> will take over one-finger touches, so the user. needs to use two fingers for zooming and panning.</p>. <p>Note the difference to <a href="#tooltip.followPointer">followPointer</a> that. only defines the <em>position</em> of the tooltip. If <code>followPointer</code> is. false in for example a column series, the tooltip will show above or. below the column, but as <code>followTouchMove</code> is true, the tooltip will. jump from column to column as the user swipes across the plot area.</p>
    * @param footerFormat <p>A string to append to the tooltip format.</p>
    * @param formatter <p>Callback function to format the text of the tooltip from scratch. In. case of single or <a href="#tooltip.shared">shared</a> tooltips, a string should. be returned. In case of <a href="#tooltip.split">split</a> tooltips, it should. return an array where the first item is the header, and subsequent. items are mapped to the points. Return <code>false</code> to disable tooltip for. a specific point on series.</p>. <p>A subset of HTML is supported. Unless <code>useHTML</code> is true, the HTML of. the tooltip is parsed and converted to SVG, therefore this isn&#39;t a. complete HTML renderer. The following HTML tags are supported: <code>b</code>,. <code>br</code>, <code>em</code>, <code>i</code>, <code>span</code>, <code>strong</code>. Spans can be styled with a <code>style</code>. attribute, but only text-related CSS, that is shared with SVG, is. handled.</p>. <p>The available data in the formatter differ a bit depending on whether. the tooltip is shared or split, or belongs to a single point. In a. shared/split tooltip, all properties except <code>x</code>, which is common for. all points, are kept in an array, <code>this.points</code>.</p>. <p>Available data are:</p>. <ul>. <li><p><strong>this.percentage (not shared) /</strong>. <strong>this.points[i].percentage (shared)</strong>:. Stacked series and pies only. The point&#39;s percentage of the total.</p>. </li>. <li><p><strong>this.point (not shared) / this.points[i].point (shared)</strong>:. The point object. The point name, if defined, is available through. <code>this.point.name</code>.</p>. </li>. <li><p><strong>this.points</strong>:. In a shared tooltip, this is an array containing all other. properties for each point.</p>. </li>. <li><p><strong>this.series (not shared) / this.points[i].series (shared)</strong>:. The series object. The series name is available through. <code>this.series.name</code>.</p>. </li>. <li><p><strong>this.total (not shared) / this.points[i].total (shared)</strong>:. Stacked series only. The total value at this point&#39;s x value.</p>. </li>. <li><p><strong>this.x</strong>:. The x value. This property is the same regardless of the tooltip. being shared or not.</p>. </li>. <li><p><strong>this.y (not shared) / this.points[i].y (shared)</strong>:. The y value.</p>. </li>. </ul>
    * @param headerFormat <p>The HTML of the tooltip header line. Variables are enclosed by. curly brackets. Available variables are <code>point.key</code>, <code>series.name</code>,. <code>series.color</code> and other members from the <code>point</code> and <code>series</code>. objects. The <code>point.key</code> variable contains the category name, x. value or datetime string depending on the type of axis. For datetime. axes, the <code>point.key</code> date format can be set using. <code>tooltip.xDateFormat</code>.</p>
    * @param headerShape <p>The name of a symbol to use for the border around the tooltip. header. Applies only when <a href="#tooltip.split">tooltip.split</a> is. enabled.</p>. <p>Custom callbacks for symbol path generation can also be added to. <code>Highcharts.SVGRenderer.prototype.symbols</code> the same way as for. <a href="plotOptions.line.marker.symbol">series.marker.symbol</a>.</p>
    * @param hideDelay <p>The number of milliseconds to wait until the tooltip is hidden when. mouse out from a point or chart.</p>
    * @param nullFormat <p>The HTML of the null point&#39;s line in the tooltip. Works analogously. to <a href="#tooltip.pointFormat">pointFormat</a>.</p>
    * @param nullFormatter <p>Callback function to format the text of the tooltip for. visible null points.. Works analogously to <a href="#tooltip.formatter">formatter</a>.</p>
    * @param outside <p>Whether to allow the tooltip to render outside the chart&#39;s SVG. element box. By default (<code>false</code>), the tooltip is rendered within the. chart&#39;s SVG element, which results in the tooltip being aligned. inside the chart area. For small charts, this may result in clipping. or overlapping. When <code>true</code>, a separate SVG element is created and. overlaid on the page, allowing the tooltip to be aligned inside the. page itself.</p>. <p>Defaults to <code>true</code> if <code>chart.scrollablePlotArea</code> is activated,. otherwise <code>false</code>.</p>
    * @param padding <p>Padding inside the tooltip, in pixels.</p>
    * @param pointFormat <p>The HTML of the point&#39;s line in the tooltip. Variables are enclosed. by curly brackets. Available variables are <code>point.x</code>, <code>point.y</code>,. <code>series.name</code> and <code>series.color</code> and other properties on the same. form. Furthermore, <code>point.y</code> can be extended by the. <code>tooltip.valuePrefix</code> and <code>tooltip.valueSuffix</code> variables. This can. also be overridden for each series, which makes it a good hook for. displaying units.</p>. <p>In styled mode, the dot is colored by a class name rather. than the point color.</p>
    * @param pointFormatter <p>A callback function for formatting the HTML output for a single point. in the tooltip. Like the <code>pointFormat</code> string, but with more. flexibility.</p>
    * @param positioner <p>A callback function to place the tooltip in a default position. The. callback receives three parameters: <code>labelWidth</code>, <code>labelHeight</code> and. <code>point</code>, where point contains values for <code>plotX</code> and <code>plotY</code> telling. where the reference point is in the plot area. Add <code>chart.plotLeft</code>. and <code>chart.plotTop</code> to get the full coordinates.</p>. <p>Since v7, when <a href="#tooltip.split">tooltip.split</a> option is enabled,. positioner is called for each of the boxes separately, including. xAxis header. xAxis header is not a point, instead <code>point</code> argument. contains info:. <code>{ plotX: Number, plotY: Number, isHeader: Boolean }</code></p>. <p>The return should be an object containing x and y values, for example. <code>{ x: 100, y: 100 }</code>.</p>
    * @param shadow <p>Whether to apply a drop shadow to the tooltip.</p>
    * @param shape <p>The name of a symbol to use for the border around the tooltip. Can. be one of: <code>&quot;callout&quot;</code>, <code>&quot;circle&quot;</code> or <code>&quot;rect&quot;</code>. When. <a href="#tooltip.split">tooltip.split</a>. option is enabled, shape is applied to all boxes except header, which. is controlled by. <a href="#tooltip.headerShape">tooltip.headerShape</a>.</p>. <p>Custom callbacks for symbol path generation can also be added to. <code>Highcharts.SVGRenderer.prototype.symbols</code> the same way as for. <a href="plotOptions.line.marker.symbol">series.marker.symbol</a>.</p>
    * @param shared <p>When the tooltip is shared, the entire plot area will capture mouse. movement or touch events. Tooltip texts for series types with ordered. data (not pie, scatter, flags etc) will be shown in a single bubble.. This is recommended for single series charts and for tablet/mobile. optimized charts.</p>. <p>See also <a href="#tooltip.split">tooltip.split</a>, that is better suited for. charts with many series, especially line-type series. The. <code>tooltip.split</code> option takes precedence over <code>tooltip.shared</code>.</p>
    * @param snap <p>Proximity snap for graphs or single points. It defaults to 10 for. mouse-powered devices and 25 for touch devices.</p>. <p>Note that in most cases the whole plot area captures the mouse. movement, and in these cases <code>tooltip.snap</code> doesn&#39;t make sense. This. applies when <a href="#plotOptions.series.stickyTracking">stickyTracking</a>. is <code>true</code> (default) and when the tooltip is <a href="#tooltip.shared">shared</a>. or <a href="#tooltip.split">split</a>.</p>
    * @param split <p>Split the tooltip into one label per series, with the header close. to the axis. This is recommended over <a href="#tooltip.shared">shared</a>. tooltips for charts with multiple line series, generally making them. easier to read. This option takes precedence over <code>tooltip.shared</code>.</p>
    * @param stickOnContact <p>Prevents the tooltip from switching or closing when touched or. pointed.</p>
    * @param style <p>CSS styles for the tooltip. The tooltip can also be styled through. the CSS class <code>.highcharts-tooltip</code>.</p>. <p>Note that the default <code>pointerEvents</code> style makes the tooltip ignore. mouse events, so in order to use clickable tooltips, this value must. be set to <code>auto</code>.</p>
    * @param useHTML <p>Use HTML to render the contents of the tooltip instead of SVG. Using. HTML allows advanced formatting like tables and images in the. tooltip. It is also recommended for rtl languages as it works around. rtl bugs in early Firefox.</p>
    * @param valueDecimals <p>How many decimals to show in each series&#39; y value. This is. overridable in each series&#39; tooltip options object. The default is to. preserve all decimals.</p>
    * @param valuePrefix <p>A string to prepend to each series&#39; y value. Overridable in each. series&#39; tooltip options object.</p>
    * @param valueSuffix <p>A string to append to each series&#39; y value. Overridable in each. series&#39; tooltip options object.</p>
    * @param xDateFormat <p>The format for the date in the tooltip header if the X axis is a. datetime axis. The default is a best guess based on the smallest. distance between points in the chart.</p>
    */
  def apply(animation: js.UndefOr[Boolean] = js.undefined, backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderRadius: js.UndefOr[Double] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, changeDecimals: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, clusterFormat: js.UndefOr[js.Any] = js.undefined, crosshairs: js.UndefOr[js.Any] = js.undefined, dateTimeLabelFormats: js.UndefOr[js.Object] = js.undefined, distance: js.UndefOr[Double] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, followPointer: js.UndefOr[Boolean] = js.undefined, followTouchMove: js.UndefOr[Boolean] = js.undefined, footerFormat: js.UndefOr[String] = js.undefined, formatter: js.UndefOr[js.Any] = js.undefined, headerFormat: js.UndefOr[String] = js.undefined, headerShape: js.UndefOr[String] = js.undefined, hideDelay: js.UndefOr[Double] = js.undefined, nullFormat: js.UndefOr[String] = js.undefined, nullFormatter: js.UndefOr[js.Any] = js.undefined, outside: js.UndefOr[js.UndefOr[Boolean]] = js.undefined, padding: js.UndefOr[Double] = js.undefined, pointFormat: js.UndefOr[String] = js.undefined, pointFormatter: js.UndefOr[js.Any] = js.undefined, positioner: js.UndefOr[js.Any] = js.undefined, shadow: js.UndefOr[Boolean | js.Object] = js.undefined, shape: js.UndefOr[String] = js.undefined, shared: js.UndefOr[Boolean] = js.undefined, snap: js.UndefOr[Double] = js.undefined, split: js.UndefOr[Boolean] = js.undefined, stickOnContact: js.UndefOr[Boolean] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, valueDecimals: js.UndefOr[js.UndefOr[Double]] = js.undefined, valuePrefix: js.UndefOr[String] = js.undefined, valueSuffix: js.UndefOr[String] = js.undefined, xDateFormat: js.UndefOr[String] = js.undefined): Tooltip = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new Tooltip {
      this.animation = animation
      this.backgroundColor = backgroundColor
      this.borderColor = borderColor
      this.borderRadius = borderRadius
      this.borderWidth = borderWidth
      this.changeDecimals = changeDecimals
      this.className = className
      this.clusterFormat = clusterFormat
      this.crosshairs = crosshairs
      this.dateTimeLabelFormats = dateTimeLabelFormats
      this.distance = distance
      this.enabled = enabled
      this.followPointer = followPointer
      this.followTouchMove = followTouchMove
      this.footerFormat = footerFormat
      this.formatter = formatter
      this.headerFormat = headerFormat
      this.headerShape = headerShape
      this.hideDelay = hideDelay
      this.nullFormat = nullFormat
      this.nullFormatter = nullFormatter
      this.outside = outside
      this.padding = padding
      this.pointFormat = pointFormat
      this.pointFormatter = pointFormatter
      this.positioner = positioner
      this.shadow = shadow
      this.shape = shape
      this.shared = shared
      this.snap = snap
      this.split = split
      this.stickOnContact = stickOnContact
      this.style = style
      this.useHTML = useHTML
      this.valueDecimals = valueDecimals
      this.valuePrefix = valuePrefix
      this.valueSuffix = valueSuffix
      this.xDateFormat = xDateFormat
    })
  }
}
