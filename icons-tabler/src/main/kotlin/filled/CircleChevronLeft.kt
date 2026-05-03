package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleChevronLeft: ImageVector
    get() {
        if (_circleChevronLeft != null) return _circleChevronLeft!!
        _circleChevronLeft = tablerFilledIcon(
            name = "CircleChevronLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 20.094 5.126 22.000 8.427 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 8.427 3.906 5.126 7.000 3.340 C 10.094 1.554 13.906 1.554 17.000 3.340M 13.707 8.293 C 13.316 7.903 12.684 7.903 12.293 8.293 L 9.293 11.293 C 8.903 11.684 8.903 12.316 9.293 12.707 L 12.293 15.707 C 12.684 16.097 13.316 16.097 13.707 15.707 L 13.790 15.613 C 14.099 15.215 14.063 14.649 13.707 14.293 L 11.415 12.000 L 13.707 9.707 C 14.097 9.316 14.097 8.684 13.707 8.293"),
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
        return _circleChevronLeft!!
    }

private var _circleChevronLeft: ImageVector? = null
