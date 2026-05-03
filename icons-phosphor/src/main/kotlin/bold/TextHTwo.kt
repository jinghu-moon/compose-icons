package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextHTwo: ImageVector
    get() {
        if (_textHTwo != null) return _textHTwo!!
        _textHTwo = phosphorBoldIcon(
            name = "TextHTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 156.000 56.000 L 156.000 176.000 C 156.000 182.627 150.627 188.000 144.000 188.000 C 137.373 188.000 132.000 182.627 132.000 176.000 L 132.000 128.000 L 52.000 128.000 L 52.000 176.000 C 52.000 182.627 46.627 188.000 40.000 188.000 C 33.373 188.000 28.000 182.627 28.000 176.000 L 28.000 56.000 C 28.000 49.373 33.373 44.000 40.000 44.000 C 46.627 44.000 52.000 49.373 52.000 56.000 L 52.000 104.000 L 132.000 104.000 L 132.000 56.000 C 132.000 49.373 137.373 44.000 144.000 44.000 C 150.627 44.000 156.000 49.373 156.000 56.000 ZM 240.000 196.000 L 216.000 196.000 L 244.740 157.670 C 253.275 146.344 254.366 131.062 247.525 118.639 C 240.684 106.216 227.187 98.966 213.052 100.124 C 198.917 101.281 186.779 110.629 182.050 124.000 C 179.841 130.249 183.116 137.106 189.365 139.315 C 195.614 141.524 202.471 138.249 204.680 132.000 C 205.084 130.842 205.668 129.756 206.410 128.780 C 208.962 125.271 213.209 123.413 217.518 123.920 C 221.826 124.427 225.526 127.221 227.193 131.226 C 228.861 135.232 228.236 139.825 225.560 143.240 L 182.400 200.800 C 179.673 204.436 179.234 209.301 181.267 213.367 C 183.300 217.432 187.455 220.000 192.000 220.000 L 240.000 220.000 C 246.627 220.000 252.000 214.627 252.000 208.000 C 252.000 201.373 246.627 196.000 240.000 196.000 Z"),
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
        return _textHTwo!!
    }

private var _textHTwo: ImageVector? = null
