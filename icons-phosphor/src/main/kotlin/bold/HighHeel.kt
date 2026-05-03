package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HighHeel: ImageVector
    get() {
        if (_highHeel != null) return _highHeel!!
        _highHeel = phosphorBoldIcon(
            name = "HighHeel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 227.930 152.310 L 182.110 141.140 L 72.490 31.510 C 70.174 29.194 67.011 27.926 63.737 28.000 C 60.462 28.074 57.360 29.483 55.150 31.900 C 32.480 56.680 20.000 88.000 20.000 120.000 L 20.000 192.000 C 20.000 203.046 28.954 212.000 40.000 212.000 L 72.000 212.000 C 83.046 212.000 92.000 203.046 92.000 192.000 L 92.000 150.290 L 93.070 151.000 C 110.586 163.020 124.185 179.919 132.180 199.600 C 135.245 207.134 142.587 212.044 150.720 212.000 L 236.000 212.000 C 247.046 212.000 256.000 203.046 256.000 192.000 L 256.000 187.270 C 256.048 170.459 244.354 155.895 227.930 152.310 ZM 68.000 188.000 L 44.000 188.000 L 44.000 132.670 C 52.186 133.574 60.239 135.423 68.000 138.180 ZM 232.000 188.000 L 153.350 188.000 C 143.460 165.053 127.281 145.372 106.680 131.230 C 88.282 118.522 66.939 110.732 44.680 108.600 C 46.891 90.215 53.849 72.721 64.870 57.840 L 167.510 160.490 C 169.069 162.042 171.023 163.138 173.160 163.660 L 222.360 175.660 L 222.610 175.720 C 228.090 176.879 232.008 181.719 232.000 187.320 Z"),
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
        return _highHeel!!
    }

private var _highHeel: ImageVector? = null
