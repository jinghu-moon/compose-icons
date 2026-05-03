package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatCenteredSlash: ImageVector
    get() {
        if (_chatCenteredSlash != null) return _chatCenteredSlash!!
        _chatCenteredSlash = phosphorThinIcon(
            name = "ChatCenteredSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 51.000 37.310 C 49.514 35.653 46.967 35.514 45.310 37.000 C 43.653 38.486 43.514 41.033 45.000 42.690 L 46.230 44.000 L 40.000 44.000 C 33.373 44.000 28.000 49.373 28.000 56.000 L 28.000 184.000 C 28.000 190.627 33.373 196.000 40.000 196.000 L 102.750 196.000 L 117.580 222.000 C 119.716 225.740 123.693 228.048 128.000 228.048 C 132.307 228.048 136.284 225.740 138.420 222.000 L 153.250 196.000 L 184.410 196.000 L 205.000 218.690 C 205.956 219.768 207.417 220.248 208.826 219.948 C 210.235 219.647 211.374 218.613 211.807 217.239 C 212.240 215.865 211.902 214.364 210.920 213.310 ZM 150.930 188.000 C 149.499 187.998 148.176 188.761 147.460 190.000 L 131.460 218.000 C 130.747 219.243 129.423 220.010 127.990 220.010 C 126.557 220.010 125.233 219.243 124.520 218.000 L 108.520 190.000 C 107.804 188.761 106.481 187.998 105.050 188.000 L 40.000 188.000 C 37.791 188.000 36.000 186.209 36.000 184.000 L 36.000 56.000 C 36.000 53.791 37.791 52.000 40.000 52.000 L 53.500 52.000 L 177.140 188.000 ZM 228.000 56.000 L 228.000 186.000 C 228.000 188.209 226.209 190.000 224.000 190.000 C 221.791 190.000 220.000 188.209 220.000 186.000 L 220.000 56.000 C 220.000 53.791 218.209 52.000 216.000 52.000 L 98.520 52.000 C 96.311 52.000 94.520 50.209 94.520 48.000 C 94.520 45.791 96.311 44.000 98.520 44.000 L 216.000 44.000 C 222.627 44.000 228.000 49.373 228.000 56.000 Z"),
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
        return _chatCenteredSlash!!
    }

private var _chatCenteredSlash: ImageVector? = null
