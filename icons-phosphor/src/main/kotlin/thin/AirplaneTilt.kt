package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AirplaneTilt: ImageVector
    get() {
        if (_airplaneTilt != null) return _airplaneTilt!!
        _airplaneTilt = phosphorThinIcon(
            name = "AirplaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 180.670 113.100 L 211.720 83.870 L 211.810 83.790 C 222.745 72.855 222.745 55.125 211.810 44.190 C 200.875 33.255 183.145 33.255 172.210 44.190 L 172.130 44.280 L 142.900 75.330 L 57.370 44.230 C 55.908 43.697 54.270 44.060 53.170 45.160 L 29.170 69.160 C 28.321 70.007 27.898 71.191 28.016 72.384 C 28.134 73.578 28.782 74.655 29.780 75.320 L 97.780 120.610 L 78.350 140.000 L 56.000 140.000 C 54.937 140.002 53.919 140.426 53.170 141.180 L 29.170 165.180 C 28.220 166.130 27.811 167.494 28.081 168.810 C 28.350 170.127 29.263 171.220 30.510 171.720 L 68.930 187.080 L 84.270 225.450 L 84.270 225.540 C 84.788 226.790 85.902 227.693 87.232 227.941 C 88.561 228.190 89.926 227.749 90.860 226.770 L 114.790 202.840 C 115.557 202.093 115.993 201.070 116.000 200.000 L 116.000 177.650 L 135.380 158.270 L 180.670 226.220 C 181.335 227.218 182.412 227.866 183.606 227.984 C 184.799 228.102 185.983 227.679 186.830 226.830 L 210.830 202.830 C 211.930 201.730 212.293 200.092 211.760 198.630 ZM 184.670 217.720 L 139.380 149.780 C 138.709 148.764 137.612 148.109 136.400 148.000 L 136.010 148.000 C 134.947 148.002 133.929 148.426 133.180 149.180 L 109.180 173.180 C 108.429 173.927 108.004 174.941 108.000 176.000 L 108.000 198.340 L 89.470 216.880 L 75.720 182.510 C 75.313 181.493 74.507 180.687 73.490 180.280 L 39.120 166.530 L 57.660 148.000 L 80.000 148.000 C 81.061 148.001 82.079 147.580 82.830 146.830 L 106.830 122.830 C 107.679 121.983 108.102 120.799 107.984 119.606 C 107.866 118.412 107.218 117.335 106.220 116.670 L 38.280 71.370 L 57.000 52.620 L 142.610 83.750 C 144.108 84.301 145.791 83.908 146.890 82.750 L 177.890 49.820 C 185.697 42.002 198.362 41.993 206.180 49.800 C 213.998 57.607 214.007 70.272 206.200 78.090 L 173.270 109.090 C 172.112 110.189 171.719 111.872 172.270 113.370 L 203.380 199.000 Z"),
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
        return _airplaneTilt!!
    }

private var _airplaneTilt: ImageVector? = null
