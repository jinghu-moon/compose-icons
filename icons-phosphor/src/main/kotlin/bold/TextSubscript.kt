package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextSubscript: ImageVector
    get() {
        if (_textSubscript != null) return _textSubscript!!
        _textSubscript = phosphorBoldIcon(
            name = "TextSubscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 252.000 208.000 C 252.000 214.627 246.627 220.000 240.000 220.000 L 192.000 220.000 C 187.455 220.000 183.300 217.432 181.267 213.367 C 179.234 209.301 179.673 204.436 182.400 200.800 L 225.570 143.240 C 227.491 140.699 228.323 137.498 227.882 134.343 C 227.441 131.188 225.764 128.337 223.220 126.420 C 220.166 124.117 216.198 123.407 212.535 124.509 C 208.873 125.612 205.955 128.394 204.680 132.000 C 202.471 138.249 195.614 141.524 189.365 139.315 C 183.116 137.106 179.841 130.249 182.050 124.000 C 183.283 120.532 185.036 117.271 187.250 114.330 C 199.218 98.452 221.792 95.282 237.670 107.250 C 253.548 119.218 256.718 141.792 244.750 157.670 L 216.000 196.000 L 240.000 196.000 C 246.627 196.000 252.000 201.373 252.000 208.000 ZM 151.860 46.930 C 149.455 44.845 146.319 43.801 143.144 44.028 C 139.969 44.255 137.014 45.734 134.930 48.140 L 92.000 97.680 L 49.070 48.140 C 44.729 43.131 37.149 42.589 32.140 46.930 C 27.131 51.271 26.589 58.851 30.930 63.860 L 76.120 116.000 L 30.930 168.140 C 26.589 173.149 27.131 180.729 32.140 185.070 C 37.149 189.411 44.729 188.869 49.070 183.860 L 92.000 134.320 L 134.930 183.860 C 139.271 188.869 146.851 189.411 151.860 185.070 C 156.869 180.729 157.411 173.149 153.070 168.140 L 107.880 116.000 L 153.070 63.860 C 155.155 61.455 156.199 58.319 155.972 55.144 C 155.745 51.969 154.266 49.014 151.860 46.930 Z"),
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
        return _textSubscript!!
    }

private var _textSubscript: ImageVector? = null
