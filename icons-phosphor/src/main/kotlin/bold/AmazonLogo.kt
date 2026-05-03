package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AmazonLogo: ImageVector
    get() {
        if (_amazonLogo != null) return _amazonLogo!!
        _amazonLogo = phosphorBoldIcon(
            name = "AmazonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 252.000 168.000 L 252.000 200.000 C 252.000 206.627 246.627 212.000 240.000 212.000 C 233.373 212.000 228.000 206.627 228.000 200.000 L 228.000 196.910 C 215.560 208.410 180.250 236.000 128.000 236.000 C 63.400 236.000 24.700 193.820 23.080 192.000 C 19.935 188.859 18.784 184.237 20.089 179.989 C 21.393 175.740 24.939 172.560 29.304 171.724 C 33.669 170.888 38.139 172.533 40.920 176.000 C 41.220 176.330 74.400 212.000 128.000 212.000 C 170.650 212.000 200.340 189.420 210.870 180.000 L 208.000 180.000 C 201.373 180.000 196.000 174.627 196.000 168.000 C 196.000 161.373 201.373 156.000 208.000 156.000 L 240.000 156.000 C 246.627 156.000 252.000 161.373 252.000 168.000 ZM 156.000 86.080 L 156.000 84.000 C 156.004 69.828 146.687 57.341 133.100 53.311 C 119.513 49.281 104.894 54.668 97.170 66.550 C 93.553 72.103 86.118 73.672 80.565 70.055 C 75.012 66.438 73.443 59.003 77.060 53.450 C 90.582 32.666 116.162 23.249 139.933 30.303 C 163.703 37.358 180.005 59.205 180.000 84.000 L 180.000 176.000 C 179.958 182.244 175.135 187.413 168.908 187.886 C 162.682 188.358 157.133 183.977 156.150 177.810 C 132.903 194.152 101.102 190.493 82.175 169.298 C 63.247 148.102 63.195 116.091 82.053 94.834 C 100.911 73.577 132.700 69.814 156.000 86.080 ZM 156.000 132.000 C 156.000 114.327 141.673 100.000 124.000 100.000 C 106.327 100.000 92.000 114.327 92.000 132.000 C 92.000 149.673 106.327 164.000 124.000 164.000 C 141.673 164.000 156.000 149.673 156.000 132.000 Z"),
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
        return _amazonLogo!!
    }

private var _amazonLogo: ImageVector? = null
