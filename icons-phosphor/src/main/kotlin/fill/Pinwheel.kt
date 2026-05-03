package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Pinwheel: ImageVector
    get() {
        if (_pinwheel != null) return _pinwheel!!
        _pinwheel = phosphorFillIcon(
            name = "Pinwheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 229.660 218.340 L 181.240 169.930 C 182.340 169.600 183.430 169.250 184.510 168.860 C 215.626 157.526 231.675 123.126 220.370 92.000 C 218.858 87.851 214.270 85.711 210.120 87.220 L 165.920 103.300 C 166.240 102.680 166.560 102.060 166.850 101.420 C 177.110 79.433 173.119 53.431 156.737 35.535 C 140.354 17.638 114.806 11.369 92.000 19.650 C 90.000 20.368 88.368 21.852 87.464 23.775 C 86.559 25.698 86.457 27.902 87.180 29.900 L 103.270 74.120 C 102.640 73.800 102.020 73.470 101.380 73.120 C 79.389 62.873 53.390 66.878 35.503 83.268 C 17.615 99.659 11.359 125.209 19.650 148.010 C 21.162 152.159 25.750 154.299 29.900 152.790 L 74.100 136.700 C 73.780 137.330 73.460 137.950 73.170 138.590 C 62.923 160.581 66.928 186.580 83.318 204.467 C 99.709 222.355 125.259 228.611 148.060 220.320 C 152.209 218.808 154.349 214.220 152.840 210.070 L 136.760 165.890 C 137.380 166.200 138.000 166.510 138.640 166.800 C 145.699 170.106 153.335 172.001 161.120 172.380 L 218.340 229.610 C 221.466 232.736 226.534 232.736 229.660 229.610 C 232.786 226.484 232.786 221.416 229.660 218.290 ZM 109.000 203.870 C 94.182 196.968 84.412 182.420 83.630 166.092 C 82.847 149.764 91.180 134.348 105.270 126.060 L 134.870 207.390 C 126.090 208.887 117.061 207.658 109.000 203.870 ZM 152.400 94.620 C 148.648 102.724 142.506 109.487 134.800 114.000 L 105.190 32.630 C 121.310 29.922 137.603 36.374 147.499 49.384 C 157.395 62.394 159.263 79.818 152.350 94.630 Z"),
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
        return _pinwheel!!
    }

private var _pinwheel: ImageVector? = null
