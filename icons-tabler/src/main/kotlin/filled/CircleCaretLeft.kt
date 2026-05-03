package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleCaretLeft: ImageVector
    get() {
        if (_circleCaretLeft != null) return _circleCaretLeft!!
        _circleCaretLeft = tablerFilledIcon(
            name = "CircleCaretLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000M 14.000 15.000 L 14.000 9.000 C 14.000 8.595 13.757 8.231 13.383 8.076 C 13.009 7.921 12.579 8.006 12.293 8.292 L 9.293 11.292 C 9.105 11.480 9.000 11.734 9.000 12.000 C 9.000 12.265 9.105 12.519 9.293 12.707 L 12.293 15.707 C 12.684 16.097 13.316 16.097 13.707 15.707 L 13.790 15.613 C 13.930 15.433 14.000 15.217 14.000 15.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _circleCaretLeft!!
    }

private var _circleCaretLeft: ImageVector? = null
