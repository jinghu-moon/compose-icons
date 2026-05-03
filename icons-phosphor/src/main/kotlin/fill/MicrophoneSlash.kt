package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) return _microphoneSlash!!
        _microphoneSlash = phosphorFillIcon(
            name = "MicrophoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 213.380 229.920 C 210.110 232.891 205.051 232.649 202.080 229.380 L 171.160 195.380 C 160.583 202.198 148.527 206.385 136.000 207.590 L 136.000 240.000 C 136.000 244.418 132.418 248.000 128.000 248.000 C 123.582 248.000 120.000 244.418 120.000 240.000 L 120.000 207.600 C 79.145 203.443 48.050 169.066 48.000 128.000 C 48.000 123.582 51.582 120.000 56.000 120.000 C 60.418 120.000 64.000 123.582 64.000 128.000 C 64.039 163.330 92.670 191.961 128.000 192.000 C 139.319 192.033 150.440 189.036 160.210 183.320 L 149.110 171.120 C 134.231 178.406 116.647 177.504 102.591 168.735 C 88.536 159.965 79.996 144.567 80.000 128.000 L 80.000 95.090 L 42.080 53.380 C 39.173 50.103 39.442 45.097 42.684 42.151 C 45.926 39.204 50.935 39.413 53.920 42.620 L 213.920 218.620 C 216.891 221.890 216.649 226.949 213.380 229.920 ZM 189.190 166.790 C 190.281 167.331 191.482 167.612 192.700 167.610 C 195.758 167.610 198.548 165.868 199.890 163.120 C 205.258 152.193 208.033 140.175 208.000 128.000 C 208.000 123.582 204.418 120.000 200.000 120.000 C 195.582 120.000 192.000 123.582 192.000 128.000 C 192.029 137.737 189.811 147.349 185.520 156.090 C 183.579 160.058 185.222 164.848 189.190 166.790 ZM 161.860 137.570 C 163.984 139.907 167.283 140.777 170.283 139.789 C 173.283 138.801 175.420 136.142 175.740 133.000 C 175.911 131.339 175.998 129.670 176.000 128.000 L 176.000 64.000 C 175.975 41.277 160.019 21.684 137.772 17.058 C 115.524 12.432 93.081 24.040 84.000 44.870 C 82.743 47.755 83.295 51.109 85.410 53.440 Z"),
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
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
