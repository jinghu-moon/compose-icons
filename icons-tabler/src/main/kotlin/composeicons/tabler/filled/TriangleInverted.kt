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
                pathData = parseSvgPathData("M20.118 3h-16.225C2.856 3.007 1.9 3.566 1.385 4.466 .869 5.366 .871 6.473 1.39 7.371L9.506 20.92c.528 .872 1.473 1.405 2.492 1.406 1.019 .001 1.965-.53 2.495-1.401L22.603 7.386c.525-.897 .533-2.005 .02-2.909C22.111 3.573 21.156 3.01 20.117 3Z"),
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
