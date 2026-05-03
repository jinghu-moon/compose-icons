package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cricket: ImageVector
    get() {
        if (_cricket != null) return _cricket!!
        _cricket = phosphorBoldIcon(
            name = "Cricket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 246.150 78.540 L 193.460 25.850 C 185.650 18.042 172.990 18.042 165.180 25.850 L 57.860 133.170 C 50.052 140.980 50.052 153.640 57.860 161.450 L 75.720 179.310 L 31.520 223.510 C 26.826 228.204 26.826 235.816 31.520 240.510 C 36.214 245.204 43.826 245.204 48.520 240.510 L 92.720 196.300 L 110.580 214.160 C 118.390 221.968 131.050 221.968 138.860 214.160 L 246.150 106.820 C 253.958 99.010 253.958 86.350 246.150 78.540 ZM 124.690 194.340 L 109.690 179.340 L 136.520 152.510 C 141.214 147.816 141.214 140.204 136.520 135.510 C 131.826 130.816 124.214 130.816 119.520 135.510 L 92.690 162.340 L 77.690 147.340 L 109.000 116.000 L 156.000 116.000 L 156.000 163.000 ZM 180.000 139.000 L 180.000 104.000 C 180.000 97.373 174.627 92.000 168.000 92.000 L 133.000 92.000 L 179.340 45.660 L 226.340 92.660 ZM 60.000 92.000 C 77.673 92.000 92.000 77.673 92.000 60.000 C 92.000 42.327 77.673 28.000 60.000 28.000 C 42.327 28.000 28.000 42.327 28.000 60.000 C 28.000 77.673 42.327 92.000 60.000 92.000 ZM 60.000 52.000 C 64.418 52.000 68.000 55.582 68.000 60.000 C 68.000 64.418 64.418 68.000 60.000 68.000 C 55.582 68.000 52.000 64.418 52.000 60.000 C 52.000 55.582 55.582 52.000 60.000 52.000 Z"),
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
        return _cricket!!
    }

private var _cricket: ImageVector? = null
