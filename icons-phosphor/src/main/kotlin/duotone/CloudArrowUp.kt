package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CloudArrowUp: ImageVector
    get() {
        if (_cloudArrowUp != null) return _cloudArrowUp!!
        _cloudArrowUp = phosphorDuotoneIcon(
            name = "CloudArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 240.000 128.000 C 240.000 172.183 204.183 208.000 160.000 208.000 L 72.000 208.000 C 50.325 207.973 30.612 195.441 21.390 175.826 C 12.169 156.210 15.094 133.035 28.902 116.327 C 42.709 99.619 64.919 92.379 85.920 97.740 L 85.920 97.840 C 100.357 62.428 137.838 42.186 175.368 49.532 C 212.898 56.878 239.980 89.758 240.000 128.000 Z"),
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
        pathData = parseSvgPathData("M 178.340 165.660 L 160.000 147.310 L 160.000 208.000 C 160.000 212.418 156.418 216.000 152.000 216.000 C 147.582 216.000 144.000 212.418 144.000 208.000 L 144.000 147.310 L 125.660 165.660 C 122.534 168.786 117.466 168.786 114.340 165.660 C 111.214 162.534 111.214 157.466 114.340 154.340 L 146.340 122.340 C 147.841 120.838 149.877 119.994 152.000 119.994 C 154.123 119.994 156.159 120.838 157.660 122.340 L 189.660 154.340 C 192.786 157.466 192.786 162.534 189.660 165.660 C 186.534 168.786 181.466 168.786 178.340 165.660 ZM 160.000 40.000 C 126.665 40.025 96.201 58.866 81.290 88.680 C 57.562 85.193 33.877 95.265 19.927 114.773 C 5.976 134.280 4.103 159.950 15.074 181.276 C 26.045 202.603 48.018 216.006 72.000 216.000 L 112.000 216.000 C 116.418 216.000 120.000 212.418 120.000 208.000 C 120.000 203.582 116.418 200.000 112.000 200.000 L 72.000 200.000 C 45.490 200.000 24.000 178.510 24.000 152.000 C 24.000 125.490 45.490 104.000 72.000 104.000 C 73.100 104.000 74.200 104.000 75.290 104.120 C 73.103 111.891 71.996 119.927 72.000 128.000 C 72.000 132.418 75.582 136.000 80.000 136.000 C 84.418 136.000 88.000 132.418 88.000 128.000 C 88.005 92.041 114.540 61.600 150.162 56.686 C 185.783 51.773 219.568 73.894 229.308 108.508 C 239.048 143.123 221.757 179.617 188.800 194.000 C 185.318 195.510 183.375 199.258 184.150 202.974 C 184.925 206.689 188.205 209.349 192.000 209.340 C 193.102 209.339 194.192 209.107 195.200 208.660 C 233.401 191.996 254.674 150.820 246.159 110.021 C 237.644 69.223 201.677 39.993 160.000 40.000 Z"),
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
        return _cloudArrowUp!!
    }

private var _cloudArrowUp: ImageVector? = null
