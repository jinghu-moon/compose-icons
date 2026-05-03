package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TriangleInverted: ImageVector
    get() {
        if (_triangleInverted != null) return _triangleInverted!!
        _triangleInverted = tablerFilledIcon(
            name = "TriangleInverted",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.118 3.000 L 3.893 3.000 C 2.856 3.007 1.900 3.566 1.385 4.466 C 0.869 5.366 0.871 6.473 1.390 7.371 L 9.506 20.920 C 10.034 21.792 10.979 22.325 11.998 22.326 C 13.017 22.327 13.963 21.796 14.493 20.925 L 22.603 7.386 C 23.128 6.489 23.136 5.381 22.623 4.477 C 22.111 3.573 21.156 3.010 20.117 3.000 Z"),
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
        return _triangleInverted!!
    }

private var _triangleInverted: ImageVector? = null
