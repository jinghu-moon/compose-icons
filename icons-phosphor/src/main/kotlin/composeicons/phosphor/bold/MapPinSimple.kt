package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MapPinSimple: ImageVector
    get() {
        if (_mapPinSimple != null) return _mapPinSimple!!
        _mapPinSimple = phosphorBoldIcon(
            name = "MapPinSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 72C187.999 40.425 163.526 14.254 132.023 12.137 100.519 10.02 72.765 32.682 68.54 63.973 64.314 95.264 85.063 124.475 116 130.79v101.21c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-101.21C167.917 125.056 187.966 100.5 188 72ZM128 108C108.118 108 92 91.882 92 72 92 52.118 108.118 36 128 36c19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36Z"),
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
        return _mapPinSimple!!
    }

private var _mapPinSimple: ImageVector? = null
