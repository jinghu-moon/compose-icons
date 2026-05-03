package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Planet: ImageVector
    get() {
        if (_planet != null) return _planet!!
        _planet = phosphorThinIcon(
            name = "Planet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 241.660 62.680 C 234.930 51.100 215.080 48.880 185.660 56.380 C 156.134 32.620 115.058 29.397 82.188 48.263 C 49.317 67.128 31.379 104.220 37.000 141.700 C 15.620 163.390 7.560 181.700 14.320 193.320 C 18.450 200.430 27.320 204.030 40.320 204.030 C 48.636 203.880 56.910 202.831 65.000 200.900 C 66.740 200.510 68.520 200.080 70.320 199.620 C 97.902 221.817 135.773 226.217 167.709 210.936 C 199.645 195.655 219.980 163.404 220.000 128.000 C 220.007 123.405 219.673 118.816 219.000 114.270 C 231.770 101.270 240.310 88.990 243.000 78.800 C 244.690 72.540 244.230 67.120 241.660 62.680 ZM 128.000 44.000 C 168.038 44.049 202.494 72.307 210.380 111.560 C 194.210 127.250 171.580 144.040 145.890 158.800 C 118.580 174.490 93.080 185.050 72.280 190.800 C 46.212 167.643 37.160 130.790 49.534 98.192 C 61.907 65.593 93.132 44.028 128.000 44.000 ZM 21.250 189.300 C 17.000 182.000 23.750 167.700 39.000 151.240 C 43.135 167.077 51.420 181.523 63.000 193.090 C 40.860 198.000 25.470 196.580 21.250 189.300 ZM 128.000 212.000 C 110.829 212.017 94.069 206.745 80.000 196.900 C 101.580 190.320 125.830 179.530 149.850 165.740 C 174.100 151.800 195.460 136.280 211.680 121.300 C 211.860 123.510 211.980 125.740 211.980 128.000 C 211.925 174.361 174.361 211.934 128.000 212.000 ZM 235.280 76.730 C 233.150 84.730 226.700 94.380 217.030 104.790 C 212.869 88.917 204.542 74.444 192.910 62.870 C 214.760 58.050 230.500 59.410 234.740 66.700 C 236.200 69.230 236.390 72.600 235.280 76.730 Z"),
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
        return _planet!!
    }

private var _planet: ImageVector? = null
