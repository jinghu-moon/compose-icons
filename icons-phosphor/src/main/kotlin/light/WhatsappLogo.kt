package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WhatsappLogo: ImageVector
    get() {
        if (_whatsappLogo != null) return _whatsappLogo!!
        _whatsappLogo = phosphorLightIcon(
            name = "WhatsappLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 186.680 146.630 L 154.680 130.630 C 152.756 129.673 150.468 129.818 148.680 131.010 L 133.000 141.460 C 125.062 137.396 118.604 130.938 114.540 123.000 L 125.000 107.330 C 126.192 105.542 126.337 103.254 125.380 101.330 L 109.380 69.330 C 108.365 67.288 106.280 65.997 104.000 66.000 C 83.013 66.000 66.000 83.013 66.000 104.000 C 66.055 151.474 104.526 189.945 152.000 190.000 C 172.987 190.000 190.000 172.987 190.000 152.000 C 190.001 149.725 188.715 147.646 186.680 146.630 ZM 152.000 178.000 C 111.151 177.950 78.050 144.849 78.000 104.000 C 78.001 91.025 87.568 80.037 100.420 78.250 L 113.080 103.570 L 102.690 119.150 C 101.581 120.819 101.379 122.931 102.150 124.780 C 107.667 137.898 118.102 148.333 131.220 153.850 C 133.069 154.621 135.181 154.419 136.850 153.310 L 152.430 142.920 L 177.750 155.580 C 175.963 168.432 164.975 177.999 152.000 178.000 ZM 128.000 26.000 C 92.028 25.992 58.711 44.934 40.319 75.849 C 21.927 106.764 21.179 145.081 38.350 176.690 L 26.730 211.560 C 25.052 216.591 26.361 222.138 30.111 225.889 C 33.862 229.639 39.409 230.948 44.440 229.270 L 79.310 217.650 C 116.706 237.944 162.770 232.893 194.880 204.979 C 226.990 177.065 238.401 132.152 223.508 92.296 C 208.615 52.441 170.547 26.016 128.000 26.000 ZM 128.000 218.000 C 112.179 218.004 96.637 213.837 82.940 205.920 C 82.027 205.395 80.993 205.116 79.940 205.110 C 79.294 205.114 78.653 205.218 78.040 205.420 L 40.650 217.880 C 39.931 218.120 39.139 217.933 38.603 217.397 C 38.067 216.861 37.880 216.069 38.120 215.350 L 50.580 178.000 C 51.125 176.367 50.943 174.579 50.080 173.090 C 29.669 137.830 35.489 93.257 64.270 64.421 C 93.051 35.585 137.614 29.680 172.912 50.024 C 208.211 70.369 225.440 111.888 214.916 151.247 C 204.393 190.606 168.741 217.987 128.000 218.000 Z"),
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
        return _whatsappLogo!!
    }

private var _whatsappLogo: ImageVector? = null
