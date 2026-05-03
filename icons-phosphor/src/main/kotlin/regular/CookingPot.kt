package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CookingPot: ImageVector
    get() {
        if (_cookingPot != null) return _cookingPot!!
        _cookingPot = phosphorRegularIcon(
            name = "CookingPot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 88.000 48.000 L 88.000 16.000 C 88.000 11.582 91.582 8.000 96.000 8.000 C 100.418 8.000 104.000 11.582 104.000 16.000 L 104.000 48.000 C 104.000 52.418 100.418 56.000 96.000 56.000 C 91.582 56.000 88.000 52.418 88.000 48.000 ZM 128.000 56.000 C 132.418 56.000 136.000 52.418 136.000 48.000 L 136.000 16.000 C 136.000 11.582 132.418 8.000 128.000 8.000 C 123.582 8.000 120.000 11.582 120.000 16.000 L 120.000 48.000 C 120.000 52.418 123.582 56.000 128.000 56.000 ZM 160.000 56.000 C 164.418 56.000 168.000 52.418 168.000 48.000 L 168.000 16.000 C 168.000 11.582 164.418 8.000 160.000 8.000 C 155.582 8.000 152.000 11.582 152.000 16.000 L 152.000 48.000 C 152.000 52.418 155.582 56.000 160.000 56.000 ZM 252.800 102.400 L 224.000 124.000 L 224.000 184.000 C 224.000 201.673 209.673 216.000 192.000 216.000 L 64.000 216.000 C 46.327 216.000 32.000 201.673 32.000 184.000 L 32.000 124.000 L 3.200 102.400 C -0.335 99.749 -1.051 94.735 1.600 91.200 C 4.251 87.665 9.265 86.949 12.800 89.600 L 32.000 104.000 L 32.000 80.000 C 32.000 75.582 35.582 72.000 40.000 72.000 L 216.000 72.000 C 220.418 72.000 224.000 75.582 224.000 80.000 L 224.000 104.000 L 243.200 89.600 C 246.735 86.949 251.749 87.665 254.400 91.200 C 257.051 94.735 256.335 99.749 252.800 102.400 ZM 208.000 88.000 L 48.000 88.000 L 48.000 184.000 C 48.000 192.837 55.163 200.000 64.000 200.000 L 192.000 200.000 C 200.837 200.000 208.000 192.837 208.000 184.000 Z"),
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
        return _cookingPot!!
    }

private var _cookingPot: ImageVector? = null
