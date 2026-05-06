package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HeartHalf: ImageVector
    get() {
        if (_heartHalf != null) return _heartHalf!!
        _heartHalf = phosphorDuotoneIcon(
            name = "HeartHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 80v144C128 224 24 168 24 102 24 72.177 48.177 48 78 48c22.59 0 41.94 12.31 50 32Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M178 40c-20.65 0-38.73 8.88-50 23.89C116.73 48.88 98.65 40 78 40 43.774 40.039 16.039 67.774 16 102c0 70 103.79 126.67 108.21 129 2.366 1.273 5.214 1.273 7.58 0C136.21 228.67 240 172 240 102 239.961 67.774 212.226 40.039 178 40ZM32 102C32.033 76.609 52.609 56.033 78 56c18.91 0 34.86 9.79 42 25.65v128.35C93.59 193.44 32 149.78 32 102ZM136 210v-128.35C143.14 65.79 159.09 56 178 56c25.391 .033 45.967 20.609 46 46 0 47.71-61.58 91.41-88 108Z"),
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
        return _heartHalf!!
    }

private var _heartHalf: ImageVector? = null
