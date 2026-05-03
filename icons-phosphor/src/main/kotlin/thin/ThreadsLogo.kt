package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ThreadsLogo: ImageVector
    get() {
        if (_threadsLogo != null) return _threadsLogo!!
        _threadsLogo = phosphorThinIcon(
            name = "ThreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 126.840 C 180.162 123.964 175.992 121.560 171.580 119.680 C 168.580 90.300 149.580 81.280 141.020 78.680 C 122.860 73.180 102.020 79.680 92.660 93.770 C 91.434 95.609 91.931 98.094 93.770 99.320 C 95.609 100.546 98.094 100.049 99.320 98.210 C 106.720 87.110 124.020 81.890 138.700 86.340 C 146.820 88.790 159.650 95.940 163.110 116.660 C 156.373 114.748 149.403 113.779 142.400 113.780 C 129.260 113.780 117.030 117.120 107.960 123.210 C 97.510 130.210 91.960 140.210 91.960 151.990 C 91.960 172.690 108.960 183.510 125.670 183.510 C 137.564 183.423 148.917 178.524 157.140 169.930 C 166.700 159.990 171.820 145.740 171.960 128.700 C 174.480 129.998 176.885 131.506 179.150 133.210 C 190.150 141.530 195.960 153.550 195.960 167.990 C 195.960 179.720 189.710 192.450 179.260 202.040 C 170.360 210.240 154.210 220.000 128.000 220.000 C 77.570 220.000 52.000 189.050 52.000 128.000 C 52.000 66.950 77.570 36.000 128.000 36.000 C 162.290 36.000 185.260 50.500 196.270 79.080 C 196.740 80.472 197.935 81.494 199.382 81.743 C 200.830 81.992 202.298 81.427 203.205 80.272 C 204.113 79.117 204.314 77.558 203.730 76.210 C 191.420 44.220 165.940 28.000 128.000 28.000 C 73.050 28.000 44.000 62.580 44.000 128.000 C 44.000 193.420 73.050 228.000 128.000 228.000 C 156.790 228.000 174.720 217.100 184.700 207.950 C 196.790 196.870 204.000 181.950 204.000 168.000 C 204.000 151.000 197.090 136.730 184.000 126.840 ZM 151.400 164.390 C 144.692 171.424 135.420 175.440 125.700 175.520 C 113.320 175.520 99.990 168.160 99.990 152.000 C 99.990 131.240 121.990 121.790 142.400 121.790 C 149.744 121.770 157.041 122.956 164.000 125.300 C 164.000 126.180 164.050 127.080 164.050 128.000 C 164.000 143.250 159.650 155.830 151.410 164.390 Z"),
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
        return _threadsLogo!!
    }

private var _threadsLogo: ImageVector? = null
