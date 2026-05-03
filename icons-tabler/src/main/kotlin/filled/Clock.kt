package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Clock: ImageVector
    get() {
        if (_clock != null) return _clock!!
        _clock = tablerFilledIcon(
            name = "Clock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 3.340 C 21.167 5.746 23.030 10.779 21.433 15.319 C 19.836 19.858 15.232 22.617 10.476 21.883 C 5.720 21.150 2.161 17.134 2.005 12.324 L 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 ZM 12.000 6.000 C 11.493 6.000 11.066 6.380 11.007 6.883 L 11.000 7.000 L 11.000 12.000 L 11.009 12.131 C 11.032 12.304 11.100 12.469 11.206 12.608 L 11.293 12.708 L 14.293 15.708 L 14.387 15.790 C 14.748 16.070 15.252 16.070 15.613 15.790 L 15.707 15.707 L 15.790 15.613 C 16.070 15.252 16.070 14.748 15.790 14.387 L 15.707 14.293 L 13.000 11.585 L 13.000 7.000 L 12.993 6.883 C 12.934 6.380 12.507 6.000 12.000 6.000 Z"),
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
        return _clock!!
    }

private var _clock: ImageVector? = null
