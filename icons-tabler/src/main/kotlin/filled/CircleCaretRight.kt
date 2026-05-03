package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleCaretRight: ImageVector
    get() {
        if (_circleCaretRight != null) return _circleCaretRight!!
        _circleCaretRight = tablerFilledIcon(
            name = "CircleCaretRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340M 11.707 8.293 C 11.421 8.007 10.991 7.922 10.617 8.076 C 10.244 8.231 10.000 8.596 10.000 9.000 L 10.000 15.000 C 10.000 15.217 10.070 15.433 10.210 15.613 L 10.293 15.707 C 10.684 16.097 11.316 16.097 11.707 15.707 L 14.707 12.707 C 15.097 12.316 15.097 11.684 14.707 11.293 Z"),
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
        return _circleCaretRight!!
    }

private var _circleCaretRight: ImageVector? = null
