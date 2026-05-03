package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatCircle: ImageVector
    get() {
        if (_chatCircle != null) return _chatCircle!!
        _chatCircle = phosphorLightIcon(
            name = "ChatCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 92.028 25.992 58.711 44.934 40.319 75.849 C 21.927 106.764 21.179 145.081 38.350 176.690 L 26.730 211.560 C 25.052 216.591 26.361 222.138 30.111 225.889 C 33.862 229.639 39.409 230.948 44.440 229.270 L 79.310 217.650 C 116.706 237.944 162.770 232.893 194.880 204.979 C 226.990 177.065 238.401 132.152 223.508 92.296 C 208.615 52.441 170.547 26.016 128.000 26.000 ZM 128.000 218.000 C 112.179 218.004 96.637 213.837 82.940 205.920 C 82.027 205.395 80.993 205.116 79.940 205.110 C 79.294 205.114 78.653 205.218 78.040 205.420 L 40.650 217.880 C 39.931 218.120 39.139 217.933 38.603 217.397 C 38.067 216.861 37.880 216.069 38.120 215.350 L 50.580 178.000 C 51.125 176.367 50.943 174.579 50.080 173.090 C 29.669 137.830 35.489 93.257 64.270 64.421 C 93.051 35.585 137.614 29.680 172.912 50.024 C 208.211 70.369 225.440 111.888 214.916 151.247 C 204.393 190.606 168.741 217.987 128.000 218.000 Z"),
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
        return _chatCircle!!
    }

private var _chatCircle: ImageVector? = null
