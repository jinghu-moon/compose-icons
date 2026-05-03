package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lasso: ImageVector
    get() {
        if (_lasso != null) return _lasso!!
        _lasso = phosphorThinIcon(
            name = "Lasso",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 203.640 63.340 C 183.370 50.870 156.510 44.000 128.000 44.000 C 99.490 44.000 72.630 50.870 52.360 63.340 C 31.490 76.190 20.000 93.480 20.000 112.000 C 20.000 130.520 31.490 147.830 52.360 160.680 C 71.650 172.550 96.910 179.330 123.870 179.960 C 123.950 181.230 124.000 182.520 124.000 183.860 C 124.000 199.350 116.720 212.300 103.490 220.320 C 87.700 229.890 66.150 230.600 49.850 222.090 C 48.579 221.385 47.026 221.425 45.792 222.194 C 44.559 222.963 43.840 224.341 43.914 225.792 C 43.989 227.244 44.845 228.541 46.150 229.180 C 55.051 233.727 64.915 236.066 74.910 236.000 C 86.417 236.077 97.730 233.029 107.640 227.180 C 123.350 217.660 132.000 202.280 132.000 183.880 C 132.000 182.560 131.950 181.270 131.880 179.980 C 158.940 179.390 184.290 172.600 203.640 160.700 C 224.510 147.850 236.000 130.560 236.000 112.000 C 236.000 93.440 224.510 76.190 203.640 63.340 ZM 62.160 157.150 C 67.460 142.660 80.990 138.930 91.460 140.300 C 105.100 142.080 118.840 152.490 122.840 171.960 C 99.660 171.250 78.550 165.780 62.160 157.150 ZM 131.000 172.000 C 129.535 162.952 125.674 154.462 119.820 147.410 C 112.907 139.173 103.175 133.804 92.520 132.350 C 75.700 130.160 61.280 138.350 55.190 153.090 C 38.330 142.350 28.000 127.900 28.000 112.000 C 28.000 78.910 72.860 52.000 128.000 52.000 C 183.140 52.000 228.000 78.930 228.000 112.000 C 228.000 144.520 184.740 171.060 131.000 172.000 Z"),
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
        return _lasso!!
    }

private var _lasso: ImageVector? = null
