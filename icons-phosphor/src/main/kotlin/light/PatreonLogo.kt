package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PatreonLogo: ImageVector
    get() {
        if (_patreonLogo != null) return _patreonLogo!!
        _patreonLogo = phosphorLightIcon(
            name = "PatreonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 186.610 33.840 C 168.160 26.300 146.200 24.100 124.770 27.670 C 101.770 31.490 81.840 41.390 67.190 56.290 C 56.310 67.360 43.130 88.940 42.060 128.940 C 41.370 155.170 46.400 183.810 55.520 205.560 C 64.290 226.480 75.650 238.000 87.520 238.000 C 109.240 238.000 119.240 218.470 128.910 199.590 C 135.990 185.770 143.310 171.480 155.120 163.470 L 155.120 163.470 C 161.120 159.360 169.210 156.260 177.730 152.970 C 201.000 144.000 230.000 132.810 230.000 93.170 C 230.000 66.750 214.190 45.130 186.610 33.840 ZM 173.410 141.780 C 164.240 145.320 155.570 148.660 148.410 153.540 C 134.050 163.270 125.660 179.660 118.260 194.120 C 109.470 211.230 101.900 226.000 87.520 226.000 C 82.520 226.000 74.340 219.410 66.580 200.920 C 58.090 180.660 53.410 153.920 54.060 129.260 C 54.810 101.100 62.510 78.170 75.750 64.710 C 94.200 45.930 120.320 38.060 144.610 38.060 C 157.425 37.959 170.141 40.315 182.070 45.000 C 213.330 57.740 218.000 80.650 218.000 93.170 C 218.000 124.580 196.340 132.930 173.410 141.780 Z"),
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
        return _patreonLogo!!
    }

private var _patreonLogo: ImageVector? = null
