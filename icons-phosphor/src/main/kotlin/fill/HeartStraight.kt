package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HeartStraight: ImageVector
    get() {
        if (_heartStraight != null) return _heartStraight!!
        _heartStraight = phosphorFillIcon(
            name = "HeartStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 98.000 C 240.034 113.388 233.913 128.151 223.000 139.000 L 133.700 229.620 C 132.196 231.147 130.143 232.007 128.000 232.007 C 125.857 232.007 123.804 231.147 122.300 229.620 L 33.000 139.000 C 10.329 116.356 10.306 79.621 32.950 56.950 C 55.594 34.279 92.329 34.256 115.000 56.900 L 128.000 69.050 L 141.090 56.860 C 157.704 40.329 182.634 35.421 204.274 44.422 C 225.914 53.423 240.010 74.563 240.000 98.000 Z"),
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
        return _heartStraight!!
    }

private var _heartStraight: ImageVector? = null
