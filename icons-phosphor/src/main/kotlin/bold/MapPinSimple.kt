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
                pathData = parseSvgPathData("M 188.000 72.000 C 187.999 40.425 163.526 14.254 132.023 12.137 C 100.519 10.020 72.765 32.682 68.540 63.973 C 64.314 95.264 85.063 124.475 116.000 130.790 L 116.000 232.000 C 116.000 238.627 121.373 244.000 128.000 244.000 C 134.627 244.000 140.000 238.627 140.000 232.000 L 140.000 130.790 C 167.917 125.056 187.966 100.500 188.000 72.000 ZM 128.000 108.000 C 108.118 108.000 92.000 91.882 92.000 72.000 C 92.000 52.118 108.118 36.000 128.000 36.000 C 147.882 36.000 164.000 52.118 164.000 72.000 C 164.000 91.882 147.882 108.000 128.000 108.000 Z"),
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
