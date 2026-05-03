package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) return _phoneSlash!!
        _phoneSlash = phosphorRegularIcon(
            name = "PhoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 53.930 34.620 C 52.018 32.465 49.095 31.504 46.277 32.105 C 43.460 32.706 41.183 34.775 40.316 37.522 C 39.449 40.270 40.127 43.271 42.090 45.380 L 69.680 75.740 C 52.755 82.849 37.379 93.188 24.410 106.180 C 4.410 126.180 2.490 155.640 19.720 177.850 C 24.061 183.404 31.525 185.464 38.100 182.920 L 87.100 165.550 L 87.390 165.440 C 92.412 163.432 96.080 159.023 97.140 153.720 L 103.040 124.210 C 105.844 123.243 108.702 122.442 111.600 121.810 L 202.110 221.380 C 204.022 223.535 206.945 224.496 209.763 223.895 C 212.580 223.294 214.857 221.225 215.724 218.478 C 216.591 215.730 215.913 212.729 213.950 210.620 ZM 97.630 109.140 C 92.330 111.029 88.411 115.562 87.310 121.080 L 81.410 150.580 L 32.630 167.880 C 32.530 167.880 32.460 168.010 32.360 168.050 C 20.030 152.150 21.360 131.830 35.720 117.490 C 48.592 104.614 64.106 94.685 81.190 88.390 L 99.490 108.530 C 98.870 108.730 98.250 108.920 97.630 109.140 ZM 236.280 177.850 C 231.939 183.404 224.475 185.464 217.900 182.920 L 208.650 179.640 C 204.486 178.163 202.308 173.589 203.785 169.425 C 205.262 165.261 209.836 163.083 214.000 164.560 L 223.370 167.880 L 223.670 168.000 C 235.970 152.150 234.670 131.830 220.280 117.490 C 194.620 91.830 158.400 78.220 120.930 80.180 C 116.512 80.409 112.744 77.013 112.515 72.595 C 112.286 68.177 115.682 64.409 120.100 64.180 C 162.100 61.990 202.730 77.280 231.590 106.180 C 251.580 126.170 253.510 155.640 236.280 177.850 Z"),
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
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
