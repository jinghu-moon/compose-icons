package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleCaretDown: ImageVector
    get() {
        if (_circleCaretDown != null) return _circleCaretDown!!
        _circleCaretDown = tablerFilledIcon(
            name = "CircleCaretDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340M 15.000 10.000 L 9.000 10.000 C 8.595 10.000 8.231 10.243 8.076 10.617 C 7.921 10.991 8.006 11.421 8.292 11.707 L 11.292 14.707 C 11.480 14.895 11.734 15.000 12.000 15.000 C 12.265 15.000 12.519 14.895 12.707 14.707 L 15.707 11.707 C 16.097 11.316 16.097 10.684 15.707 10.293 L 15.613 10.210 C 15.438 10.074 15.222 10.000 15.000 10.000"),
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
        return _circleCaretDown!!
    }

private var _circleCaretDown: ImageVector? = null
