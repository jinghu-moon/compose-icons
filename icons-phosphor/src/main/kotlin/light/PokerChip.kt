package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PokerChip: ImageVector
    get() {
        if (_pokerChip != null) return _pokerChip!!
        _pokerChip = phosphorLightIcon(
            name = "PokerChip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 178.000 C 100.386 178.000 78.000 155.614 78.000 128.000 C 78.000 100.386 100.386 78.000 128.000 78.000 C 155.614 78.000 178.000 100.386 178.000 128.000 C 177.967 155.601 155.601 177.967 128.000 178.000 ZM 167.370 80.140 C 157.877 72.300 146.255 67.479 134.000 66.300 L 134.000 38.200 C 153.688 39.505 172.395 47.270 187.220 60.290 ZM 122.000 66.300 C 109.745 67.479 98.123 72.300 88.630 80.140 L 68.780 60.290 C 83.605 47.270 102.312 39.505 122.000 38.200 ZM 80.140 88.630 C 72.300 98.123 67.479 109.745 66.300 122.000 L 38.200 122.000 C 39.503 102.312 47.268 83.604 60.290 68.780 ZM 66.300 134.000 C 67.479 146.255 72.300 157.877 80.140 167.370 L 60.290 187.220 C 47.268 172.396 39.503 153.688 38.200 134.000 ZM 88.630 175.860 C 98.123 183.700 109.745 188.521 122.000 189.700 L 122.000 217.800 C 102.312 216.495 83.605 208.730 68.780 195.710 ZM 134.000 189.700 C 146.255 188.521 157.877 183.700 167.370 175.860 L 187.220 195.710 C 172.395 208.730 153.688 216.495 134.000 217.800 ZM 175.860 167.370 C 183.700 157.877 188.521 146.255 189.700 134.000 L 217.800 134.000 C 216.497 153.688 208.732 172.396 195.710 187.220 ZM 189.700 122.000 C 188.521 109.745 183.700 98.123 175.860 88.630 L 195.710 68.780 C 208.732 83.604 216.497 102.312 217.800 122.000 Z"),
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
        return _pokerChip!!
    }

private var _pokerChip: ImageVector? = null
