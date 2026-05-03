package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) return _microphoneSlash!!
        _microphoneSlash = phosphorDuotoneIcon(
            name = "MicrophoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 168.000 64.000 L 168.000 128.000 C 168.000 150.091 150.091 168.000 128.000 168.000 L 128.000 168.000 C 105.909 168.000 88.000 150.091 88.000 128.000 L 88.000 64.000 C 88.000 41.909 105.909 24.000 128.000 24.000 L 128.000 24.000 C 150.091 24.000 168.000 41.909 168.000 64.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 213.920 218.620 L 53.920 42.620 C 50.935 39.413 45.926 39.204 42.684 42.151 C 39.442 45.097 39.173 50.103 42.080 53.380 L 80.000 95.090 L 80.000 128.000 C 79.996 144.567 88.536 159.965 102.591 168.735 C 116.647 177.504 134.231 178.406 149.110 171.120 L 160.210 183.320 C 150.440 189.036 139.319 192.033 128.000 192.000 C 92.670 191.961 64.039 163.330 64.000 128.000 C 64.000 123.582 60.418 120.000 56.000 120.000 C 51.582 120.000 48.000 123.582 48.000 128.000 C 48.050 169.066 79.145 203.443 120.000 207.600 L 120.000 240.000 C 120.000 244.418 123.582 248.000 128.000 248.000 C 132.418 248.000 136.000 244.418 136.000 240.000 L 136.000 207.590 C 148.527 206.382 160.584 202.192 171.160 195.370 L 202.080 229.370 C 203.992 231.525 206.915 232.486 209.733 231.885 C 212.550 231.284 214.827 229.215 215.694 226.468 C 216.561 223.720 215.883 220.719 213.920 218.610 ZM 128.000 160.000 C 110.327 160.000 96.000 145.673 96.000 128.000 L 96.000 112.690 L 137.660 158.510 C 134.535 159.498 131.277 160.001 128.000 160.000 ZM 185.520 156.090 C 189.811 147.349 192.029 137.737 192.000 128.000 C 192.000 123.582 195.582 120.000 200.000 120.000 C 204.418 120.000 208.000 123.582 208.000 128.000 C 208.033 140.175 205.258 152.193 199.890 163.120 C 198.548 165.868 195.758 167.610 192.700 167.610 C 191.482 167.612 190.281 167.331 189.190 166.790 C 185.222 164.848 183.579 160.058 185.520 156.090 ZM 84.000 44.870 C 93.081 24.040 115.524 12.432 137.772 17.058 C 160.019 21.684 175.975 41.277 176.000 64.000 L 176.000 128.000 C 175.998 129.670 175.911 131.339 175.740 133.000 C 175.313 137.091 171.853 140.192 167.740 140.170 C 167.460 140.184 167.180 140.184 166.900 140.170 C 162.507 139.708 159.320 135.773 159.780 131.380 C 159.890 130.280 159.950 129.140 159.950 128.020 L 159.950 64.000 C 159.907 48.873 149.276 35.842 134.465 32.762 C 119.655 29.682 104.711 37.394 98.640 51.250 C 97.621 54.046 95.135 56.045 92.185 56.440 C 89.236 56.835 86.311 55.560 84.593 53.131 C 82.874 50.702 82.646 47.520 84.000 44.870 Z"),
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
