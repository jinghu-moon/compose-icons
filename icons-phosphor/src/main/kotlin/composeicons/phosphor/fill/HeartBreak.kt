package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) return _heartBreak!!
        _heartBreak = phosphorFillIcon(
            name = "HeartBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M239.81 107.5c-5.19 67.42-103.7 121.23-108 123.54-2.366 1.273-5.214 1.273-7.58 0C119.8 228.67 16 172 16 102 15.994 79.115 28.596 58.088 48.78 47.302c20.184-10.786 44.668-9.575 63.69 3.148 1.002 .664 1.652 1.744 1.77 2.94 .118 1.196-.308 2.382-1.16 3.23L99.72 70c-3.122 3.124-3.122 8.186 0 11.31l32.53 32.53L111 135c-2.107 2.002-2.963 4.99-2.235 7.804 .728 2.814 2.926 5.012 5.74 5.74 2.814 .728 5.802-.127 7.804-2.235l26.88-26.87c3.122-3.124 3.122-8.186 0-11.31L116.7 75.63 134.17 58.16h0C145.871 46.399 161.82 39.852 178.41 40c36.32 .23 64.18 31.29 61.4 67.5Z"),
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
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
