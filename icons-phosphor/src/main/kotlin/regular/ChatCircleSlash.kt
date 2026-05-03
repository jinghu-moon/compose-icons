package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatCircleSlash: ImageVector
    get() {
        if (_chatCircleSlash != null) return _chatCircleSlash!!
        _chatCircleSlash = phosphorRegularIcon(
            name = "ChatCircleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 52.330 56.660 C 21.732 89.128 15.236 137.488 36.180 176.880 L 24.830 210.930 C 22.912 216.680 24.409 223.020 28.695 227.305 C 32.980 231.591 39.320 233.088 45.070 231.170 L 79.120 219.820 C 115.320 239.077 159.456 235.266 191.820 210.090 L 202.080 221.380 C 203.992 223.535 206.915 224.496 209.733 223.895 C 212.550 223.294 214.827 221.225 215.694 218.478 C 216.561 215.730 215.883 212.729 213.920 210.620 ZM 128.000 216.000 C 112.530 216.011 97.331 211.937 83.940 204.190 C 81.955 203.043 79.574 202.803 77.400 203.530 L 40.000 216.000 L 52.470 178.600 C 53.197 176.426 52.957 174.045 51.810 172.060 C 32.573 138.782 37.160 96.869 63.140 68.540 L 181.000 198.230 C 165.742 209.771 147.131 216.011 128.000 216.000 ZM 232.000 128.000 C 232.000 145.187 227.747 162.106 219.620 177.250 C 217.508 181.103 212.684 182.532 208.814 180.450 C 204.945 178.369 203.478 173.556 205.530 169.670 C 223.218 136.813 218.259 96.372 193.158 68.761 C 168.056 41.150 128.269 32.373 93.880 46.860 C 89.807 48.575 85.115 46.663 83.400 42.590 C 81.685 38.517 83.597 33.825 87.670 32.110 C 119.785 18.631 156.515 22.114 185.525 41.388 C 214.535 60.661 231.979 93.171 232.000 128.000 Z"),
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
        return _chatCircleSlash!!
    }

private var _chatCircleSlash: ImageVector? = null
