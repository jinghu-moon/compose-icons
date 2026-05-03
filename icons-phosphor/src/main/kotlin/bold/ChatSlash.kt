package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatSlash: ImageVector
    get() {
        if (_chatSlash != null) return _chatSlash!!
        _chatSlash = phosphorBoldIcon(
            name = "ChatSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 56.880 31.930 C 52.996 27.677 46.639 26.784 41.733 29.801 C 36.827 32.818 34.757 38.895 36.800 44.280 C 27.124 45.848 20.011 54.198 20.000 64.000 L 20.000 224.000 C 19.967 231.779 24.489 238.858 31.560 242.100 C 34.218 243.344 37.115 243.993 40.050 244.000 C 44.746 243.988 49.287 242.316 52.870 239.280 L 52.990 239.170 L 84.470 212.000 L 188.150 212.000 L 199.150 224.070 C 203.610 228.974 211.201 229.335 216.105 224.875 C 221.009 220.415 221.370 212.824 216.910 207.920 ZM 80.000 188.000 C 77.120 187.995 74.335 189.032 72.160 190.920 L 44.000 215.230 L 44.000 68.000 L 57.240 68.000 L 166.330 188.000 ZM 236.000 64.000 L 236.000 174.120 C 236.000 180.747 230.627 186.120 224.000 186.120 C 217.373 186.120 212.000 180.747 212.000 174.120 L 212.000 68.000 L 116.600 68.000 C 109.973 68.000 104.600 62.627 104.600 56.000 C 104.600 49.373 109.973 44.000 116.600 44.000 L 216.000 44.000 C 227.046 44.000 236.000 52.954 236.000 64.000 Z"),
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
