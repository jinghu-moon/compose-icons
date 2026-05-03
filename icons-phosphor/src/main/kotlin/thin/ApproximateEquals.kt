package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ApproximateEquals: ImageVector
    get() {
        if (_approximateEquals != null) return _approximateEquals!!
        _approximateEquals = phosphorThinIcon(
            name = "ApproximateEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 219.080 155.840 C 220.488 157.541 220.250 160.061 218.550 161.470 C 203.560 173.900 188.900 180.000 173.930 180.000 C 171.885 180.001 169.842 179.887 167.810 179.660 C 152.810 178.010 139.210 170.660 126.090 163.520 C 100.570 149.660 76.470 136.520 42.550 164.700 C 40.844 166.038 38.383 165.774 37.000 164.104 C 35.617 162.434 35.817 159.966 37.450 158.540 C 54.450 144.420 71.070 138.470 88.190 140.340 C 103.190 141.990 116.790 149.340 129.910 156.490 C 155.430 170.350 179.530 183.430 213.450 155.310 C 215.151 153.902 217.671 154.140 219.080 155.840 ZM 42.550 100.690 C 76.470 72.570 100.550 85.690 126.090 99.510 C 139.210 106.640 152.780 114.010 167.810 115.660 C 169.843 115.879 171.886 115.989 173.930 115.990 C 188.930 115.990 203.560 109.890 218.550 97.460 C 219.694 96.562 220.261 95.115 220.031 93.679 C 219.800 92.243 218.809 91.045 217.441 90.551 C 216.073 90.057 214.545 90.343 213.450 91.300 C 179.530 119.430 155.450 106.300 129.910 92.480 C 116.790 85.350 103.220 78.000 88.190 76.340 C 71.070 74.460 54.470 80.410 37.450 94.530 C 36.306 95.428 35.739 96.875 35.969 98.311 C 36.200 99.747 37.191 100.945 38.559 101.439 C 39.927 101.933 41.455 101.647 42.550 100.690 Z"),
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
        return _approximateEquals!!
    }

private var _approximateEquals: ImageVector? = null
