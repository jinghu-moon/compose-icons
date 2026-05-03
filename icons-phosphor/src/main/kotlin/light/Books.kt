package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Books: ImageVector
    get() {
        if (_books != null) return _books!!
        _books = phosphorLightIcon(
            name = "Books",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 104.000 34.000 L 56.000 34.000 C 48.268 34.000 42.000 40.268 42.000 48.000 L 42.000 208.000 C 42.000 215.732 48.268 222.000 56.000 222.000 L 104.000 222.000 C 111.732 222.000 118.000 215.732 118.000 208.000 L 118.000 48.000 C 118.000 40.268 111.732 34.000 104.000 34.000 ZM 54.000 78.000 L 106.000 78.000 L 106.000 178.000 L 54.000 178.000 ZM 56.000 46.000 L 104.000 46.000 C 105.105 46.000 106.000 46.895 106.000 48.000 L 106.000 66.000 L 54.000 66.000 L 54.000 48.000 C 54.000 46.895 54.895 46.000 56.000 46.000 ZM 104.000 210.000 L 56.000 210.000 C 54.895 210.000 54.000 209.105 54.000 208.000 L 54.000 190.000 L 106.000 190.000 L 106.000 208.000 C 106.000 209.105 105.105 210.000 104.000 210.000 ZM 229.700 195.000 L 196.510 37.160 C 195.753 33.510 193.573 30.313 190.451 28.277 C 187.330 26.240 183.525 25.532 179.880 26.310 L 133.070 36.370 C 125.531 38.027 120.728 45.442 122.300 53.000 L 155.490 210.810 C 156.253 214.473 158.449 217.678 161.590 219.710 C 163.840 221.182 166.471 221.968 169.160 221.970 C 170.169 221.975 171.175 221.868 172.160 221.650 L 218.970 211.600 C 226.479 209.924 231.255 202.535 229.700 195.000 ZM 146.890 111.680 L 197.620 100.780 L 211.740 167.940 L 161.000 178.810 ZM 140.260 80.120 L 191.000 69.190 L 195.150 89.000 L 144.420 99.900 ZM 135.600 48.120 L 182.400 38.070 C 182.540 38.056 182.680 38.056 182.820 38.070 C 183.194 38.070 183.559 38.182 183.870 38.390 C 184.334 38.686 184.656 39.159 184.760 39.700 L 188.510 57.520 L 137.790 68.340 L 134.050 50.560 C 133.807 49.454 134.497 48.358 135.600 48.100 ZM 216.410 199.920 L 169.600 210.000 C 169.094 210.112 168.563 210.015 168.130 209.730 C 167.666 209.434 167.344 208.961 167.240 208.420 L 163.490 190.600 L 214.210 179.700 L 218.000 197.430 C 218.119 197.969 218.018 198.532 217.719 198.996 C 217.421 199.460 216.949 199.785 216.410 199.900 Z"),
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
        return _books!!
    }

private var _books: ImageVector? = null
