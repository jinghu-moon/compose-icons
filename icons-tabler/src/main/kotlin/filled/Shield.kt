package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Shield: ImageVector
    get() {
        if (_shield != null) return _shield!!
        _shield = tablerFilledIcon(
            name = "Shield",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.884 2.007 L 11.998 2.000 L 12.116 2.007 L 12.175 2.015 L 12.236 2.028 L 12.347 2.062 C 12.424 2.090 12.497 2.128 12.564 2.174 L 12.668 2.256 L 12.923 2.474 C 14.940 4.150 17.490 5.049 20.112 5.011 L 20.454 5.001 C 20.914 4.980 21.329 5.276 21.459 5.718 C 22.452 9.095 22.033 12.731 20.297 15.793 C 18.562 18.856 15.658 21.084 12.251 21.968 C 12.086 22.011 11.914 22.011 11.749 21.968 C 8.341 21.084 5.438 18.856 3.702 15.794 C 1.967 12.731 1.547 9.095 2.540 5.718 C 2.670 5.276 3.085 4.980 3.545 5.001 C 6.282 5.126 8.968 4.225 11.076 2.474 L 11.339 2.249 L 11.435 2.174 C 11.502 2.128 11.575 2.090 11.652 2.062 L 11.764 2.028 C 11.803 2.019 11.843 2.012 11.883 2.007 Z"),
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
        return _shield!!
    }

private var _shield: ImageVector? = null
