package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomQuestion: ImageVector
    get() {
        if (_zoomQuestion != null) return _zoomQuestion!!
        _zoomQuestion = tablerFilledIcon(
            name = "ZoomQuestion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 3.072c2.002 1.156 3.406 3.121 3.851 5.389 .445 2.269-.114 4.618-1.531 6.445l5.387 5.387c.379 .392 .374 1.016-.012 1.402-.386 .386-1.009 .391-1.402 .012L14.905 16.32c-2.413 1.872-5.681 2.208-8.424 .865C3.739 15.842 2 13.054 2 10l.005-.285C2.105 6.91 3.668 4.362 6.124 3.002 8.58 1.642 11.569 1.668 14 3.072M10 12c-.507 0-.934 .38-.993 .883L9 13.01c.001 .529 .413 .966 .941 .997 .528 .031 .989-.355 1.052-.88L11 13c0-.552-.448-1-1-1M8.1 6.877c-.341 .402-.312 .999 .066 1.365 .378 .367 .976 .377 1.367 .024l.088-.09c.15-.176 .401-.227 .608-.122 .206 .105 .313 .338 .259 .563C10.433 8.843 10.232 9.001 10 9 9.448 8.999 9 9.447 8.999 9.999c-.001 .552 .447 1 .999 1.001 1.156 .001 2.162-.791 2.432-1.916C12.701 7.96 12.165 6.797 11.134 6.272 10.104 5.748 8.849 5.998 8.098 6.877"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _zoomQuestion!!
    }

private var _zoomQuestion: ImageVector? = null
