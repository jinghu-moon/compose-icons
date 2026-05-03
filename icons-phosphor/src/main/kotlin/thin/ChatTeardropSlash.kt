package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatTeardropSlash: ImageVector
    get() {
        if (_chatTeardropSlash != null) return _chatTeardropSlash!!
        _chatTeardropSlash = phosphorThinIcon(
            name = "ChatTeardropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 51.000 37.310 C 49.514 35.653 46.967 35.514 45.310 37.000 C 43.653 38.486 43.514 41.033 45.000 42.690 L 60.620 59.830 C 44.726 77.419 35.950 100.294 36.000 124.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 132.000 220.000 C 152.558 219.978 172.570 213.379 189.110 201.170 L 205.000 218.690 C 205.956 219.768 207.417 220.248 208.826 219.948 C 210.235 219.647 211.374 218.613 211.807 217.239 C 212.240 215.865 211.902 214.364 210.920 213.310 ZM 132.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 124.000 C 43.947 102.549 51.776 81.827 66.000 65.770 L 183.700 195.210 C 168.705 206.190 150.585 212.075 132.000 212.000 ZM 228.000 124.000 C 228.015 141.474 223.250 158.620 214.220 173.580 C 213.506 174.856 212.154 175.640 210.692 175.627 C 209.230 175.613 207.893 174.803 207.203 173.515 C 206.513 172.226 206.581 170.664 207.380 169.440 C 227.498 136.124 223.343 93.551 197.163 64.754 C 170.982 35.957 128.996 27.777 93.920 44.640 C 92.626 45.303 91.074 45.212 89.866 44.402 C 88.659 43.592 87.986 42.190 88.110 40.741 C 88.233 39.292 89.133 38.024 90.460 37.430 C 103.414 31.183 117.618 27.958 132.000 28.000 C 184.994 28.061 227.939 71.006 228.000 124.000 Z"),
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
        return _chatTeardropSlash!!
    }

private var _chatTeardropSlash: ImageVector? = null
