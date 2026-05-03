package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) return _phoneSlash!!
        _phoneSlash = phosphorFillIcon(
            name = "PhoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.280 177.850 C 231.939 183.404 224.475 185.464 217.900 182.920 L 193.140 163.920 C 192.947 163.779 192.769 163.618 192.610 163.440 L 109.180 71.620 C 108.159 70.504 107.855 68.907 108.394 67.493 C 108.934 66.080 110.225 65.092 111.730 64.940 C 154.730 60.320 199.470 74.060 231.590 106.180 L 231.590 106.180 C 251.580 126.170 253.510 155.640 236.280 177.850 ZM 53.930 34.620 C 52.018 32.465 49.095 31.504 46.277 32.105 C 43.460 32.706 41.183 34.775 40.316 37.522 C 39.449 40.270 40.127 43.271 42.090 45.380 L 69.710 75.770 C 52.786 82.883 37.402 93.210 24.410 106.180 C 4.410 126.180 2.490 155.640 19.720 177.850 C 24.061 183.404 31.525 185.464 38.100 182.920 L 87.100 165.550 L 87.390 165.440 C 92.412 163.432 96.080 159.023 97.140 153.720 L 103.040 124.210 C 105.846 123.241 108.708 122.443 111.610 121.820 L 202.110 221.380 C 204.022 223.535 206.945 224.496 209.763 223.895 C 212.580 223.294 214.857 221.225 215.724 218.478 C 216.591 215.730 215.913 212.729 213.950 210.620 Z"),
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
