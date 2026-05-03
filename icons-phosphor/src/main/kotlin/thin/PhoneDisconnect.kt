package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PhoneDisconnect: ImageVector
    get() {
        if (_phoneDisconnect != null) return _phoneDisconnect!!
        _phoneDisconnect = phosphorThinIcon(
            name = "PhoneDisconnect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.790 93.000 C 174.150 38.340 81.850 38.340 27.210 93.000 C 8.690 111.500 6.900 138.810 22.850 159.390 C 26.121 163.565 31.743 165.097 36.680 163.160 L 85.680 145.770 L 85.830 145.710 C 89.595 144.204 92.345 140.897 93.140 136.920 L 99.040 107.410 C 99.284 106.035 100.240 104.893 101.550 104.410 C 118.546 98.511 137.027 98.469 154.050 104.290 C 155.347 104.761 156.303 105.876 156.570 107.230 L 162.810 137.000 C 163.631 140.935 166.368 144.197 170.100 145.690 L 170.250 145.750 L 219.320 163.160 C 224.257 165.097 229.879 163.565 233.150 159.390 C 249.100 138.810 247.310 111.500 228.790 93.000 ZM 226.790 154.510 C 225.688 155.885 223.815 156.376 222.180 155.720 L 222.030 155.660 L 173.000 138.240 C 171.786 137.732 170.900 136.658 170.630 135.370 L 164.420 105.620 C 163.565 101.512 160.627 98.148 156.670 96.750 C 137.947 90.350 117.621 90.400 98.930 96.890 C 94.951 98.320 92.018 101.739 91.210 105.890 L 85.310 135.400 C 85.050 136.672 84.188 137.738 83.000 138.260 L 34.000 155.640 L 33.850 155.700 C 32.215 156.356 30.342 155.865 29.240 154.490 C 15.820 137.190 17.340 114.230 32.930 98.640 C 58.650 72.850 93.330 60.000 128.000 60.000 C 162.670 60.000 197.350 72.890 223.130 98.680 C 238.710 114.230 240.240 137.190 226.820 154.490 ZM 220.000 200.000 C 220.000 202.209 218.209 204.000 216.000 204.000 L 40.000 204.000 C 37.791 204.000 36.000 202.209 36.000 200.000 C 36.000 197.791 37.791 196.000 40.000 196.000 L 216.000 196.000 C 218.209 196.000 220.000 197.791 220.000 200.000 Z"),
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
        return _phoneDisconnect!!
    }

private var _phoneDisconnect: ImageVector? = null
