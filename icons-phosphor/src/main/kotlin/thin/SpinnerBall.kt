package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SpinnerBall: ImageVector
    get() {
        if (_spinnerBall != null) return _spinnerBall!!
        _spinnerBall = phosphorThinIcon(
            name = "SpinnerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 219.920 124.440 C 186.230 149.150 161.370 139.890 135.980 127.440 C 159.520 111.580 181.830 93.490 179.320 51.630 C 203.704 68.024 218.790 95.079 219.920 124.440 ZM 170.860 46.610 C 175.400 88.130 155.000 105.000 131.550 120.830 C 129.550 92.510 125.080 64.140 87.550 45.380 C 113.917 32.453 144.876 32.910 170.850 46.610 ZM 79.000 50.180 C 117.220 67.010 121.630 93.180 123.580 121.340 C 98.080 108.880 71.250 98.590 36.240 121.720 C 38.266 92.418 54.151 65.841 79.000 50.180 ZM 36.100 131.560 C 69.790 106.850 94.650 116.110 120.040 128.510 C 96.500 144.370 74.190 162.510 76.700 204.320 C 52.323 187.941 37.230 160.907 36.080 131.560 ZM 85.160 209.390 C 80.600 167.870 101.000 151.000 124.450 135.170 C 126.450 163.490 130.920 191.860 168.450 210.620 C 142.083 223.547 111.124 223.090 85.150 209.390 ZM 177.000 205.820 C 138.780 188.990 134.370 162.820 132.420 134.660 C 146.850 141.710 161.710 148.070 178.230 148.070 C 190.900 148.070 204.560 144.330 219.760 134.290 C 217.732 163.589 201.847 190.162 177.000 205.820 Z"),
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
        return _spinnerBall!!
    }

private var _spinnerBall: ImageVector? = null
