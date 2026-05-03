package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Chat: ImageVector
    get() {
        if (_chat != null) return _chat!!
        _chat = phosphorThinIcon(
            name = "Chat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 52.000 L 40.000 52.000 C 33.373 52.000 28.000 57.373 28.000 64.000 L 28.000 224.000 C 27.971 228.673 30.682 232.930 34.930 234.880 C 36.520 235.614 38.249 235.996 40.000 236.000 C 42.818 235.998 45.543 234.995 47.690 233.170 L 47.690 233.170 L 81.490 204.000 L 216.000 204.000 C 222.627 204.000 228.000 198.627 228.000 192.000 L 228.000 64.000 C 228.000 57.373 222.627 52.000 216.000 52.000 ZM 220.000 192.000 C 220.000 194.209 218.209 196.000 216.000 196.000 L 80.000 196.000 C 79.035 196.006 78.104 196.361 77.380 197.000 L 42.560 227.060 C 41.369 228.052 39.713 228.267 38.309 227.612 C 36.905 226.957 36.005 225.549 36.000 224.000 L 36.000 64.000 C 36.000 61.791 37.791 60.000 40.000 60.000 L 216.000 60.000 C 218.209 60.000 220.000 61.791 220.000 64.000 Z"),
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
        return _chat!!
    }

private var _chat: ImageVector? = null
