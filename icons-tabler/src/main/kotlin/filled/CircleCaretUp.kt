package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleCaretUp: ImageVector
    get() {
        if (_circleCaretUp != null) return _circleCaretUp!!
        _circleCaretUp = tablerFilledIcon(
            name = "CircleCaretUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340M 12.707 9.293 C 12.316 8.903 11.684 8.903 11.293 9.293 L 8.293 12.293 C 8.007 12.579 7.922 13.009 8.076 13.383 C 8.231 13.756 8.596 14.000 9.000 14.000 L 15.000 14.000 C 15.217 14.000 15.433 13.930 15.613 13.790 L 15.707 13.707 C 16.097 13.316 16.097 12.684 15.707 12.293 Z"),
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
        return _circleCaretUp!!
    }

private var _circleCaretUp: ImageVector? = null
