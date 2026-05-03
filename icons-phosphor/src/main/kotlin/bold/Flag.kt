package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Flag: ImageVector
    get() {
        if (_flag != null) return _flag!!
        _flag = phosphorBoldIcon(
            name = "Flag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 40.140 46.880 C 37.497 49.171 35.985 52.502 36.000 56.000 L 36.000 224.000 C 36.000 230.627 41.373 236.000 48.000 236.000 C 54.627 236.000 60.000 230.627 60.000 224.000 L 60.000 181.720 C 82.840 164.600 102.100 172.600 130.680 186.720 C 146.910 194.720 165.420 203.920 185.480 203.920 C 200.200 203.920 215.760 198.980 231.860 185.040 C 234.482 182.767 235.992 179.470 236.000 176.000 L 236.000 56.000 C 236.001 51.301 233.259 47.034 228.985 45.082 C 224.711 43.130 219.691 43.852 216.140 46.930 C 191.430 68.340 171.610 60.240 141.320 45.250 C 113.190 31.270 78.170 13.940 40.140 46.880 ZM 212.000 170.260 C 189.160 187.390 169.900 179.370 141.320 165.260 C 118.160 153.760 90.330 140.000 60.000 153.870 L 60.000 61.690 C 82.840 44.570 102.100 52.570 130.680 66.690 C 146.910 74.690 165.420 83.890 185.480 83.890 C 194.637 83.904 203.687 81.921 212.000 78.080 Z"),
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
        return _flag!!
    }

private var _flag: ImageVector? = null
