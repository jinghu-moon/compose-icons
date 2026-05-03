package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PushPinSimple: ImageVector
    get() {
        if (_pushPinSimple != null) return _pushPinSimple!!
        _pushPinSimple = phosphorBoldIcon(
            name = "PushPinSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 164.000 L 210.070 164.000 L 190.300 52.000 L 192.000 52.000 C 198.627 52.000 204.000 46.627 204.000 40.000 C 204.000 33.373 198.627 28.000 192.000 28.000 L 64.000 28.000 C 57.373 28.000 52.000 33.373 52.000 40.000 C 52.000 46.627 57.373 52.000 64.000 52.000 L 65.700 52.000 L 45.930 164.000 L 40.000 164.000 C 33.373 164.000 28.000 169.373 28.000 176.000 C 28.000 182.627 33.373 188.000 40.000 188.000 L 116.000 188.000 L 116.000 240.000 C 116.000 246.627 121.373 252.000 128.000 252.000 C 134.627 252.000 140.000 246.627 140.000 240.000 L 140.000 188.000 L 216.000 188.000 C 222.627 188.000 228.000 182.627 228.000 176.000 C 228.000 169.373 222.627 164.000 216.000 164.000 ZM 90.070 52.000 L 165.930 52.000 L 185.700 164.000 L 70.300 164.000 Z"),
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
        return _pushPinSimple!!
    }

private var _pushPinSimple: ImageVector? = null
