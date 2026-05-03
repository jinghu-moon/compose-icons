package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpinnerBall: ImageVector
    get() {
        if (_spinnerBall != null) return _spinnerBall!!
        _spinnerBall = phosphorBoldIcon(
            name = "SpinnerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 211.650 120.470 C 188.510 136.000 170.710 133.740 151.920 126.000 C 159.790 120.000 167.210 113.270 173.270 104.840 C 181.006 94.074 185.744 81.447 187.000 68.250 C 201.149 82.183 209.886 100.691 211.650 120.470 ZM 163.300 51.800 C 165.200 79.610 154.300 93.890 138.210 106.280 C 136.970 96.460 134.830 86.670 130.570 77.200 C 125.095 65.109 116.509 54.688 105.690 47.000 C 124.854 41.710 145.276 43.411 163.300 51.800 ZM 79.690 59.350 C 104.690 71.600 111.620 88.150 114.290 108.290 C 105.170 104.470 95.630 101.420 85.290 100.380 C 72.082 99.081 58.765 101.310 46.700 106.840 C 51.746 87.612 63.432 70.789 79.690 59.350 ZM 44.350 135.530 C 67.490 120.000 85.290 122.260 104.080 130.000 C 96.210 136.000 88.790 142.730 82.730 151.160 C 74.994 161.926 70.256 174.553 69.000 187.750 C 54.851 173.817 46.114 155.309 44.350 135.530 ZM 92.700 204.200 C 90.800 176.390 101.700 162.110 117.790 149.720 C 119.030 159.540 121.170 169.330 125.430 178.800 C 130.905 190.891 139.491 201.312 150.310 209.000 C 131.146 214.290 110.724 212.589 92.700 204.200 ZM 176.310 196.650 C 151.310 184.400 144.380 167.850 141.710 147.710 C 150.830 151.530 160.370 154.580 170.710 155.620 Q 174.460 156.000 178.180 156.000 C 188.921 155.941 199.527 153.607 209.300 149.150 C 204.257 168.382 192.570 185.209 176.310 196.650 Z"),
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
