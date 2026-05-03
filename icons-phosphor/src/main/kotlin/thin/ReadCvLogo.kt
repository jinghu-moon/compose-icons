package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ReadCvLogo: ImageVector
    get() {
        if (_readCvLogo != null) return _readCvLogo!!
        _readCvLogo = phosphorThinIcon(
            name = "ReadCvLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 210.090 43.190 L 79.840 20.190 C 76.705 19.635 73.478 20.348 70.869 22.173 C 68.260 23.998 66.483 26.785 65.930 29.920 L 36.180 198.920 C 35.030 205.445 39.386 211.667 45.910 212.820 L 176.170 235.820 C 176.866 235.948 177.572 236.011 178.280 236.010 C 184.094 235.996 189.062 231.816 190.070 226.090 L 219.820 57.090 C 220.970 50.565 216.614 44.343 210.090 43.190 ZM 211.940 55.700 L 182.190 224.700 C 181.809 226.876 179.736 228.331 177.560 227.950 L 47.300 204.950 C 45.128 204.564 43.679 202.493 44.060 200.320 L 73.810 31.320 C 74.191 29.144 76.264 27.689 78.440 28.070 L 208.700 51.070 C 210.872 51.456 212.321 53.527 211.940 55.700 ZM 184.140 75.170 C 183.801 77.076 182.146 78.466 180.210 78.470 C 179.975 78.470 179.741 78.450 179.510 78.410 L 96.510 63.750 C 94.334 63.366 92.881 61.291 93.265 59.115 C 93.649 56.939 95.724 55.486 97.900 55.870 L 180.900 70.530 C 181.945 70.715 182.874 71.308 183.482 72.179 C 184.089 73.049 184.326 74.125 184.140 75.170 ZM 178.600 106.680 C 178.265 108.594 176.603 109.990 174.660 109.990 C 174.425 109.991 174.190 109.968 173.960 109.920 L 91.000 95.270 C 88.824 94.886 87.371 92.811 87.755 90.635 C 88.139 88.459 90.214 87.006 92.390 87.390 L 175.390 102.050 C 177.550 102.450 178.983 104.517 178.600 106.680 ZM 131.600 130.870 C 131.261 132.780 129.600 134.171 127.660 134.170 C 127.425 134.169 127.191 134.149 126.960 134.110 L 85.470 126.780 C 84.010 126.590 82.773 125.613 82.249 124.237 C 81.725 122.861 81.999 121.309 82.962 120.196 C 83.926 119.082 85.423 118.589 86.860 118.910 L 128.350 126.230 C 130.514 126.630 131.949 128.704 131.560 130.870 Z"),
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
        return _readCvLogo!!
    }

private var _readCvLogo: ImageVector? = null
