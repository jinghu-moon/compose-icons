package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sword: ImageVector
    get() {
        if (_sword != null) return _sword!!
        _sword = phosphorLightIcon(
            name = "Sword",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 34.000 L 152.000 34.000 C 150.136 33.998 148.377 34.863 147.240 36.340 L 81.850 121.340 L 70.600 110.100 C 67.974 107.474 64.413 105.999 60.700 105.999 C 56.987 105.999 53.426 107.474 50.800 110.100 L 38.100 122.800 C 35.471 125.426 33.994 128.989 33.994 132.705 C 33.994 136.421 35.471 139.984 38.100 142.610 L 38.100 142.610 L 59.510 164.000 L 30.100 193.420 C 27.474 196.046 25.999 199.607 25.999 203.320 C 25.999 207.033 27.474 210.594 30.100 213.220 L 42.790 225.910 C 45.416 228.536 48.977 230.011 52.690 230.011 C 56.403 230.011 59.964 228.536 62.590 225.910 L 92.000 196.500 L 113.400 217.900 C 116.026 220.526 119.587 222.001 123.300 222.001 C 127.013 222.001 130.574 220.526 133.200 217.900 L 145.900 205.210 C 148.529 202.584 150.006 199.021 150.006 195.305 C 150.006 191.589 148.529 188.026 145.900 185.400 L 134.650 174.150 L 219.650 108.760 C 221.131 107.625 221.999 105.866 222.000 104.000 L 222.000 40.000 C 222.000 36.686 219.314 34.000 216.000 34.000 ZM 54.100 217.420 C 53.725 217.796 53.216 218.007 52.685 218.007 C 52.154 218.007 51.645 217.796 51.270 217.420 L 38.590 204.730 C 37.815 203.950 37.815 202.690 38.590 201.910 L 68.000 172.500 L 83.510 188.000 ZM 137.410 196.720 L 124.720 209.420 C 124.344 209.799 123.833 210.012 123.300 210.012 C 122.767 210.012 122.256 209.799 121.880 209.420 L 46.590 134.120 L 46.590 134.120 C 46.214 133.745 46.003 133.236 46.003 132.705 C 46.003 132.174 46.214 131.665 46.590 131.290 L 59.280 118.590 C 59.656 118.211 60.167 117.998 60.700 117.998 C 61.233 117.998 61.744 118.211 62.120 118.590 L 137.410 193.890 C 137.786 194.265 137.997 194.774 137.997 195.305 C 137.997 195.836 137.786 196.345 137.410 196.720 ZM 210.000 101.050 L 126.090 165.600 L 112.490 152.000 L 164.240 100.240 C 166.443 97.876 166.378 94.192 164.093 91.907 C 161.808 89.622 158.124 89.557 155.760 91.760 L 104.000 143.510 L 90.400 129.910 L 155.000 46.000 L 210.000 46.000 Z"),
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
        return _sword!!
    }

private var _sword: ImageVector? = null
