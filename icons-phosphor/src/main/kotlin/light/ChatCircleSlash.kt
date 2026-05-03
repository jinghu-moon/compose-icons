package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatCircleSlash: ImageVector
    get() {
        if (_chatCircleSlash != null) return _chatCircleSlash!!
        _chatCircleSlash = phosphorLightIcon(
            name = "ChatCircleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 52.440 36.000 C 50.163 33.887 46.650 33.861 44.342 35.940 C 42.034 38.019 41.695 41.516 43.560 44.000 L 55.070 56.700 C 23.770 88.698 16.989 137.364 38.350 176.700 L 26.730 211.560 C 25.052 216.591 26.361 222.138 30.111 225.889 C 33.862 229.639 39.409 230.948 44.440 229.270 L 79.310 217.650 C 115.505 237.284 159.955 233.229 192.000 207.370 L 203.560 220.000 C 205.791 222.452 209.588 222.631 212.040 220.400 C 214.492 218.169 214.671 214.372 212.440 211.920 ZM 128.000 218.000 C 112.179 218.004 96.637 213.837 82.940 205.920 C 81.451 205.057 79.663 204.875 78.030 205.420 L 40.650 217.880 C 39.931 218.120 39.139 217.933 38.603 217.397 C 38.067 216.861 37.880 216.069 38.120 215.350 L 50.580 178.000 C 51.125 176.367 50.943 174.579 50.080 173.090 C 29.987 138.351 35.323 94.507 63.160 65.600 L 184.000 198.470 C 168.086 211.138 148.341 218.025 128.000 218.000 ZM 230.000 128.000 C 229.998 144.858 225.827 161.454 217.860 176.310 C 216.811 178.254 214.779 179.464 212.570 179.460 C 210.460 179.458 208.506 178.348 207.424 176.537 C 206.342 174.725 206.291 172.479 207.290 170.620 C 225.327 137.013 220.236 95.687 194.580 67.463 C 168.924 39.240 128.270 30.241 93.100 45.000 C 90.153 45.918 86.991 44.451 85.789 41.608 C 84.587 38.765 85.738 35.474 88.450 34.000 C 119.940 20.786 155.952 24.198 184.400 43.090 C 212.849 61.982 229.963 93.850 230.000 128.000 Z"),
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
