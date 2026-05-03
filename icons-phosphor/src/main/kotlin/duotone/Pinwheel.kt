package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Pinwheel: ImageVector
    get() {
        if (_pinwheel != null) return _pinwheel!!
        _pinwheel = phosphorDuotoneIcon(
            name = "Pinwheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 124.880 109.740 L 27.150 145.330 C 17.322 118.343 31.233 88.498 58.220 78.670 C 85.207 68.842 115.052 82.753 124.880 109.740 ZM 212.880 94.670 L 115.150 130.260 C 124.978 157.247 154.823 171.158 181.810 161.330 C 208.797 151.502 222.708 121.657 212.880 94.670 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 229.660 218.340 L 181.240 169.930 C 182.340 169.600 183.430 169.250 184.510 168.860 C 215.626 157.526 231.675 123.126 220.370 92.000 C 218.858 87.851 214.270 85.711 210.120 87.220 L 165.920 103.300 C 166.240 102.680 166.560 102.060 166.850 101.420 C 177.110 79.433 173.119 53.431 156.737 35.535 C 140.354 17.638 114.806 11.369 92.000 19.650 C 90.000 20.368 88.368 21.852 87.464 23.775 C 86.559 25.698 86.457 27.902 87.180 29.900 L 103.260 74.100 C 102.640 73.780 102.020 73.460 101.380 73.170 C 79.389 62.923 53.390 66.928 35.503 83.318 C 17.615 99.709 11.359 125.259 19.650 148.060 C 21.162 152.209 25.750 154.349 29.900 152.840 L 74.100 136.750 C 73.780 137.380 73.460 138.000 73.170 138.640 C 62.923 160.631 66.928 186.630 83.318 204.517 C 99.709 222.405 125.259 228.661 148.060 220.370 C 152.209 218.858 154.349 214.270 152.840 210.120 L 136.750 165.920 C 137.380 166.240 138.000 166.560 138.640 166.850 C 145.699 170.156 153.335 172.051 161.120 172.430 L 218.340 229.660 C 221.466 232.786 226.534 232.786 229.660 229.660 C 232.786 226.534 232.786 221.466 229.660 218.340 ZM 131.070 36.150 C 145.908 43.045 155.695 57.604 156.478 73.947 C 157.262 90.290 148.911 105.718 134.800 114.000 L 105.190 32.630 C 113.974 31.133 123.005 32.362 131.070 36.150 ZM 32.630 134.820 C 29.043 113.854 40.969 93.324 60.958 86.052 C 80.948 78.780 103.277 86.850 114.000 105.220 ZM 109.000 203.870 C 94.182 196.968 84.412 182.420 83.630 166.092 C 82.847 149.764 91.180 134.348 105.270 126.060 L 134.870 207.390 C 126.090 208.887 117.061 207.658 109.000 203.870 ZM 164.560 156.490 L 164.450 156.490 C 148.718 156.609 134.111 148.346 126.110 134.800 L 207.440 105.190 C 209.553 117.865 206.026 130.831 197.785 140.691 C 189.544 150.550 177.409 156.321 164.560 156.490 Z"),
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
