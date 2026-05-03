package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Waves: ImageVector
    get() {
        if (_waves != null) return _waves!!
        _waves = phosphorThinIcon(
            name = "Waves",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 219.080 179.840 C 220.488 181.541 220.250 184.061 218.550 185.470 C 203.560 197.900 188.900 204.000 173.930 204.000 C 171.885 204.001 169.842 203.887 167.810 203.660 C 152.810 202.010 139.210 194.660 126.090 187.520 C 100.570 173.660 76.470 160.520 42.550 188.700 C 40.844 190.038 38.383 189.774 37.000 188.104 C 35.617 186.434 35.817 183.966 37.450 182.540 C 54.450 168.420 71.070 162.460 88.190 164.350 C 103.190 165.990 116.790 173.350 129.910 180.490 C 155.430 194.350 179.530 207.430 213.450 179.310 C 215.151 177.902 217.671 178.140 219.080 179.840 ZM 213.450 123.310 C 179.530 151.430 155.450 138.310 129.910 124.480 C 116.790 117.360 103.220 109.990 88.190 108.340 C 71.070 106.460 54.470 112.410 37.450 126.530 C 36.306 127.428 35.739 128.875 35.969 130.311 C 36.200 131.747 37.191 132.945 38.559 133.439 C 39.927 133.933 41.455 133.647 42.550 132.690 C 76.470 104.570 100.550 117.690 126.090 131.520 C 139.210 138.640 152.780 146.010 167.810 147.660 C 169.842 147.882 171.885 147.996 173.930 148.000 C 188.930 148.000 203.560 141.900 218.550 129.470 C 219.694 128.572 220.261 127.125 220.031 125.689 C 219.800 124.253 218.809 123.055 217.441 122.561 C 216.073 122.067 214.545 122.353 213.450 123.310 ZM 42.550 76.690 C 76.470 48.560 100.550 61.690 126.090 75.510 C 139.210 82.640 152.780 90.010 167.810 91.650 C 169.842 91.877 171.885 91.991 173.930 91.990 C 188.930 91.990 203.560 85.890 218.550 73.460 C 219.694 72.562 220.261 71.115 220.031 69.679 C 219.800 68.243 218.809 67.045 217.441 66.551 C 216.073 66.057 214.545 66.343 213.450 67.300 C 179.530 95.430 155.450 82.300 129.910 68.480 C 116.790 61.350 103.220 54.000 88.190 52.340 C 71.070 50.460 54.470 56.410 37.450 70.530 C 36.306 71.428 35.739 72.875 35.969 74.311 C 36.200 75.747 37.191 76.945 38.559 77.439 C 39.927 77.933 41.455 77.647 42.550 76.690 Z"),
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
        return _waves!!
    }

private var _waves: ImageVector? = null
