package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChatCircleSlash: ImageVector
    get() {
        if (_chatCircleSlash != null) return _chatCircleSlash!!
        _chatCircleSlash = phosphorFillIcon(
            name = "ChatCircleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 213.920 210.620 C 215.883 212.729 216.561 215.730 215.694 218.478 C 214.827 221.225 212.550 223.294 209.733 223.895 C 206.915 224.496 203.992 223.535 202.080 221.380 L 191.820 210.090 C 159.456 235.266 115.320 239.077 79.120 219.820 L 45.070 231.170 C 39.320 233.088 32.980 231.591 28.695 227.305 C 24.409 223.020 22.912 216.680 24.830 210.930 L 36.180 176.880 C 15.236 137.488 21.732 89.128 52.330 56.660 L 42.080 45.380 C 40.117 43.271 39.439 40.270 40.306 37.522 C 41.173 34.775 43.450 32.706 46.267 32.105 C 49.085 31.504 52.008 32.465 53.920 34.620 ZM 128.000 24.000 C 114.149 23.975 100.434 26.733 87.670 32.110 C 85.280 33.119 83.527 35.225 82.969 37.758 C 82.410 40.292 83.115 42.940 84.860 44.860 L 206.660 178.860 C 208.406 180.797 210.985 181.761 213.573 181.444 C 216.161 181.128 218.433 179.570 219.660 177.270 C 237.004 145.029 236.119 106.042 217.328 74.622 C 198.538 43.201 164.611 23.975 128.000 24.000 Z"),
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
        return _chatCircleSlash!!
    }

private var _chatCircleSlash: ImageVector? = null
