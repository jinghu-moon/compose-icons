package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MetaLogo: ImageVector
    get() {
        if (_metaLogo != null) return _metaLogo!!
        _metaLogo = phosphorThinIcon(
            name = "MetaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 149.310 C 236.000 164.690 233.000 177.760 227.400 187.090 C 220.730 198.150 210.400 204.000 197.400 204.000 C 171.850 204.000 152.570 168.000 132.150 129.890 C 113.780 95.530 94.740 60.000 74.000 60.000 C 62.900 60.000 51.300 70.530 42.160 88.890 C 33.050 107.742 28.215 128.373 28.000 149.310 C 28.000 163.240 30.580 174.870 35.450 182.960 C 40.670 191.610 48.450 195.960 58.560 195.960 C 75.710 195.960 91.630 171.640 106.290 145.360 C 107.367 143.427 109.807 142.733 111.740 143.810 C 113.673 144.887 114.367 147.327 113.290 149.260 C 98.520 175.760 80.900 204.000 58.560 204.000 C 45.630 204.000 35.270 198.150 28.560 187.090 C 23.000 177.760 20.000 164.690 20.000 149.310 C 20.231 127.133 25.352 105.280 35.000 85.310 C 45.690 63.830 59.540 52.000 74.000 52.000 C 99.540 52.000 118.830 88.000 139.250 126.110 C 157.660 160.470 176.690 196.000 197.450 196.000 C 207.570 196.000 215.340 191.610 220.560 183.000 C 225.430 174.910 228.010 163.280 228.010 149.350 C 227.795 128.413 222.960 107.782 213.850 88.930 C 204.700 70.530 193.100 60.000 182.000 60.000 C 172.250 60.000 161.850 68.000 150.220 84.570 C 148.921 86.294 146.489 86.676 144.724 85.435 C 142.959 84.193 142.497 81.775 143.680 79.970 C 157.100 60.890 169.280 51.970 182.000 51.970 C 196.450 51.970 210.300 63.800 221.000 85.290 C 230.650 105.266 235.772 127.126 236.000 149.310 Z"),
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
        return _metaLogo!!
    }

private var _metaLogo: ImageVector? = null
