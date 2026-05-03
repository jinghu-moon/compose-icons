package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatDots: ImageVector
    get() {
        if (_chatDots != null) return _chatDots!!
        _chatDots = phosphorThinIcon(
            name = "ChatDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 136.000 128.000 C 136.000 132.418 132.418 136.000 128.000 136.000 C 123.582 136.000 120.000 132.418 120.000 128.000 C 120.000 123.582 123.582 120.000 128.000 120.000 C 132.418 120.000 136.000 123.582 136.000 128.000 ZM 84.000 120.000 C 79.582 120.000 76.000 123.582 76.000 128.000 C 76.000 132.418 79.582 136.000 84.000 136.000 C 88.418 136.000 92.000 132.418 92.000 128.000 C 92.000 123.582 88.418 120.000 84.000 120.000 ZM 172.000 120.000 C 167.582 120.000 164.000 123.582 164.000 128.000 C 164.000 132.418 167.582 136.000 172.000 136.000 C 176.418 136.000 180.000 132.418 180.000 128.000 C 180.000 123.582 176.418 120.000 172.000 120.000 ZM 228.000 64.000 L 228.000 192.000 C 228.000 198.627 222.627 204.000 216.000 204.000 L 81.490 204.000 L 47.760 233.130 L 47.760 233.130 C 45.600 234.985 42.847 236.003 40.000 236.000 C 38.238 235.994 36.497 235.605 34.900 234.860 C 30.671 232.905 27.973 228.659 28.000 224.000 L 28.000 64.000 C 28.000 57.373 33.373 52.000 40.000 52.000 L 216.000 52.000 C 222.627 52.000 228.000 57.373 228.000 64.000 ZM 220.000 64.000 C 220.000 61.791 218.209 60.000 216.000 60.000 L 40.000 60.000 C 37.791 60.000 36.000 61.791 36.000 64.000 L 36.000 224.000 C 35.997 225.553 36.894 226.967 38.300 227.627 C 39.706 228.287 41.367 228.074 42.560 227.080 L 77.380 197.000 C 78.104 196.361 79.035 196.006 80.000 196.000 L 216.000 196.000 C 218.209 196.000 220.000 194.209 220.000 192.000 Z"),
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
        return _chatDots!!
    }

private var _chatDots: ImageVector? = null
