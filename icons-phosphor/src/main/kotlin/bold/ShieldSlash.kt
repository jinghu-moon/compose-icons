package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) return _shieldSlash!!
        _shieldSlash = phosphorBoldIcon(
            name = "ShieldSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 56.880 31.930 C 53.545 28.261 48.298 27.021 43.674 28.808 C 39.050 30.595 36.001 35.042 36.000 40.000 C 30.964 43.777 28.000 49.705 28.000 56.000 L 28.000 112.000 C 28.000 166.290 54.320 199.220 76.400 217.290 C 100.110 236.680 123.840 243.290 124.840 243.580 C 126.909 244.140 129.091 244.140 131.160 243.580 C 132.510 243.210 161.160 235.160 187.020 210.760 L 199.120 224.070 C 203.598 228.880 211.111 229.194 215.974 224.774 C 220.837 220.355 221.241 212.846 216.880 207.930 ZM 128.000 219.380 C 114.521 214.460 101.979 207.281 90.910 198.150 C 65.090 176.690 52.000 147.710 52.000 112.000 L 52.000 62.240 L 170.870 193.000 C 158.500 204.587 143.919 213.560 128.000 219.380 ZM 228.000 56.000 L 228.000 112.000 C 228.135 128.740 225.350 145.376 219.770 161.160 C 218.052 165.911 213.542 169.078 208.490 169.080 C 207.098 169.081 205.717 168.838 204.410 168.360 C 201.417 167.277 198.976 165.049 197.626 162.166 C 196.276 159.284 196.126 155.983 197.210 152.990 C 201.833 139.824 204.131 125.954 204.000 112.000 L 204.000 60.000 L 109.330 60.000 C 102.703 60.000 97.330 54.627 97.330 48.000 C 97.330 41.373 102.703 36.000 109.330 36.000 L 208.000 36.000 C 219.046 36.000 228.000 44.954 228.000 56.000 Z"),
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
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
