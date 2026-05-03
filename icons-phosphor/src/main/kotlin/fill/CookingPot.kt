package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CookingPot: ImageVector
    get() {
        if (_cookingPot != null) return _cookingPot!!
        _cookingPot = phosphorFillIcon(
            name = "CookingPot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 88.000 48.000 L 88.000 16.000 C 88.000 11.582 91.582 8.000 96.000 8.000 C 100.418 8.000 104.000 11.582 104.000 16.000 L 104.000 48.000 C 104.000 52.418 100.418 56.000 96.000 56.000 C 91.582 56.000 88.000 52.418 88.000 48.000 ZM 128.000 56.000 C 132.418 56.000 136.000 52.418 136.000 48.000 L 136.000 16.000 C 136.000 11.582 132.418 8.000 128.000 8.000 C 123.582 8.000 120.000 11.582 120.000 16.000 L 120.000 48.000 C 120.000 52.418 123.582 56.000 128.000 56.000 ZM 160.000 56.000 C 164.418 56.000 168.000 52.418 168.000 48.000 L 168.000 16.000 C 168.000 11.582 164.418 8.000 160.000 8.000 C 155.582 8.000 152.000 11.582 152.000 16.000 L 152.000 48.000 C 152.000 52.418 155.582 56.000 160.000 56.000 ZM 254.400 91.200 C 251.749 87.665 246.735 86.949 243.200 89.600 L 224.000 104.000 L 224.000 80.000 C 224.000 75.582 220.418 72.000 216.000 72.000 L 40.000 72.000 C 35.582 72.000 32.000 75.582 32.000 80.000 L 32.000 104.000 L 12.800 89.600 C 9.265 86.949 4.251 87.665 1.600 91.200 C -1.051 94.735 -0.335 99.749 3.200 102.400 L 32.000 124.000 L 32.000 184.000 C 32.000 201.673 46.327 216.000 64.000 216.000 L 192.000 216.000 C 209.673 216.000 224.000 201.673 224.000 184.000 L 224.000 124.000 L 252.800 102.400 C 256.335 99.749 257.051 94.735 254.400 91.200 Z"),
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
        return _cookingPot!!
    }

private var _cookingPot: ImageVector? = null
