package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShootingStar: ImageVector
    get() {
        if (_shootingStar != null) return _shootingStar!!
        _shootingStar = phosphorFillIcon(
            name = "ShootingStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 235.240 84.380 L 207.180 108.060 L 215.740 143.450 C 217.010 148.689 215.001 154.178 210.650 157.360 C 206.247 160.595 200.331 160.868 195.650 158.050 L 164.000 139.000 L 132.350 158.060 C 127.671 160.886 121.750 160.613 117.350 157.370 C 112.990 154.194 110.977 148.702 112.250 143.460 L 120.810 108.070 L 92.760 84.380 C 88.605 80.868 86.988 75.191 88.669 70.017 C 90.350 64.843 94.994 61.200 100.420 60.800 L 137.360 57.880 L 151.570 24.220 C 153.692 19.237 158.584 16.003 164.000 16.003 C 169.416 16.003 174.308 19.237 176.430 24.220 L 190.640 57.880 L 227.580 60.800 C 233.006 61.200 237.650 64.843 239.331 70.017 C 241.012 75.191 239.395 80.868 235.240 84.380 ZM 88.110 111.890 C 86.609 110.388 84.573 109.544 82.450 109.544 C 80.327 109.544 78.291 110.388 76.790 111.890 L 18.340 170.340 C 15.214 173.466 15.214 178.534 18.340 181.660 C 21.466 184.786 26.534 184.786 29.660 181.660 L 88.110 123.210 C 89.612 121.709 90.456 119.673 90.456 117.550 C 90.456 115.427 89.612 113.391 88.110 111.890 ZM 87.610 173.080 L 34.340 226.340 C 31.214 229.466 31.214 234.534 34.340 237.660 C 37.466 240.786 42.534 240.786 45.660 237.660 L 98.920 184.390 C 101.908 181.245 101.845 176.291 98.777 173.223 C 95.709 170.155 90.755 170.092 87.610 173.080 ZM 160.610 172.080 L 106.320 226.360 C 103.194 229.486 103.194 234.554 106.320 237.680 C 109.446 240.806 114.514 240.806 117.640 237.680 L 171.920 183.400 C 175.046 180.277 175.048 175.211 171.925 172.085 C 168.802 168.959 163.736 168.957 160.610 172.080 Z"),
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
        return _shootingStar!!
    }

private var _shootingStar: ImageVector? = null
