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
                pathData = parseSvgPathData("M240 98c.034 15.388-6.087 30.151-17 41l-89.3 90.62c-1.504 1.527-3.557 2.387-5.7 2.387-2.143 0-4.196-.86-5.7-2.387L33 139C10.329 116.356 10.306 79.621 32.95 56.95 55.594 34.279 92.329 34.256 115 56.9l13 12.15L141.09 56.86C157.704 40.329 182.634 35.421 204.274 44.422 225.914 53.423 240.01 74.563 240 98Z"),
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
