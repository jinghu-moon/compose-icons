package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatSlash: ImageVector
    get() {
        if (_chatSlash != null) return _chatSlash!!
        _chatSlash = phosphorThinIcon(
            name = "ChatSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 51.000 37.310 C 49.514 35.653 46.967 35.514 45.310 37.000 C 43.653 38.486 43.514 41.033 45.000 42.690 L 53.500 52.000 L 40.000 52.000 C 33.373 52.000 28.000 57.373 28.000 64.000 L 28.000 224.000 C 27.971 228.673 30.682 232.930 34.930 234.880 C 36.519 235.616 38.249 235.998 40.000 236.000 C 42.838 235.989 45.581 234.972 47.740 233.130 L 81.490 204.000 L 191.680 204.000 L 205.000 218.690 C 205.767 219.535 206.859 220.011 208.000 220.000 C 209.590 220.016 211.039 219.088 211.690 217.637 C 212.340 216.186 212.070 214.487 211.000 213.310 ZM 80.000 196.000 C 79.038 196.009 78.111 196.364 77.390 197.000 L 42.570 227.000 C 41.388 227.991 39.741 228.215 38.338 227.574 C 36.935 226.933 36.025 225.542 36.000 224.000 L 36.000 64.000 C 36.000 61.791 37.791 60.000 40.000 60.000 L 60.780 60.000 L 184.410 196.000 ZM 228.000 64.000 L 228.000 186.000 C 228.000 188.209 226.209 190.000 224.000 190.000 C 221.791 190.000 220.000 188.209 220.000 186.000 L 220.000 64.000 C 220.000 61.791 218.209 60.000 216.000 60.000 L 105.790 60.000 C 103.581 60.000 101.790 58.209 101.790 56.000 C 101.790 53.791 103.581 52.000 105.790 52.000 L 216.000 52.000 C 222.627 52.000 228.000 57.373 228.000 64.000 Z"),
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
        return _chatSlash!!
    }

private var _chatSlash: ImageVector? = null
