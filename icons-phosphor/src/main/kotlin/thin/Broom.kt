package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Broom: ImageVector
    get() {
        if (_broom != null) return _broom!!
        _broom = phosphorThinIcon(
            name = "Broom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 233.750 220.400 C 209.760 208.750 196.000 183.820 196.000 152.000 L 196.000 134.720 C 196.001 129.806 193.005 125.388 188.440 123.570 L 163.550 113.740 C 157.413 111.288 154.413 104.337 156.840 98.190 L 178.170 45.190 C 181.996 36.120 179.864 25.632 172.802 18.775 C 165.739 11.918 155.193 10.098 146.240 14.190 C 140.519 16.796 136.007 21.484 133.620 27.300 L 112.620 80.400 C 111.447 83.368 109.140 85.747 106.208 87.010 C 103.277 88.273 99.963 88.316 97.000 87.130 L 71.630 76.840 C 67.142 75.050 62.019 76.126 58.630 79.570 C 38.300 100.450 28.000 124.820 28.000 152.000 C 27.948 179.880 38.730 206.689 58.070 226.770 C 58.835 227.567 59.895 228.012 61.000 228.000 L 232.000 228.000 C 233.866 228.003 235.486 226.716 235.904 224.898 C 236.323 223.079 235.429 221.213 233.750 220.400 ZM 64.340 85.150 C 65.460 84.008 67.159 83.656 68.640 84.260 L 94.000 94.550 C 98.933 96.518 104.445 96.443 109.323 94.342 C 114.200 92.241 118.041 88.286 120.000 83.350 L 141.000 30.350 C 144.390 22.190 153.610 18.000 161.580 21.000 C 165.660 22.517 168.946 25.631 170.680 29.623 C 172.414 33.616 172.447 38.143 170.770 42.160 L 149.410 95.220 C 147.441 100.150 147.513 105.661 149.611 110.537 C 151.708 115.414 155.657 119.257 160.590 121.220 L 185.490 131.050 C 187.009 131.660 188.003 133.133 188.000 134.770 L 188.000 152.000 C 188.000 154.360 188.080 156.690 188.220 159.000 L 49.720 103.600 C 53.925 96.948 58.826 90.764 64.340 85.150 ZM 113.560 220.000 C 100.477 207.919 91.211 192.278 86.900 175.000 C 86.348 172.860 84.165 171.573 82.025 172.125 C 79.885 172.677 78.598 174.860 79.150 177.000 C 83.185 193.017 91.117 207.789 102.240 220.000 L 62.680 220.000 C 45.487 201.536 35.951 177.229 36.000 152.000 C 35.865 137.618 39.203 123.416 45.730 110.600 L 189.130 168.000 C 192.350 190.000 202.360 208.090 217.930 220.000 Z"),
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
        return _broom!!
    }

private var _broom: ImageVector? = null
