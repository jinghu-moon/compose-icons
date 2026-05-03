package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Toilet: ImageVector
    get() {
        if (_toilet != null) return _toilet!!
        _toilet = phosphorFillIcon(
            name = "Toilet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 60.000 88.000 L 196.000 88.000 C 198.209 88.000 200.000 86.209 200.000 84.000 L 200.000 40.000 C 200.000 31.163 192.837 24.000 184.000 24.000 L 72.000 24.000 C 63.163 24.000 56.000 31.163 56.000 40.000 L 56.000 84.000 C 56.000 86.209 57.791 88.000 60.000 88.000 ZM 88.000 48.000 L 103.730 48.000 C 108.019 47.937 111.628 51.197 112.000 55.470 C 112.147 57.682 111.369 59.856 109.853 61.473 C 108.336 63.090 106.217 64.005 104.000 64.000 L 88.270 64.000 C 83.981 64.063 80.372 60.803 80.000 56.530 C 79.853 54.318 80.631 52.144 82.147 50.527 C 83.664 48.910 85.783 47.995 88.000 48.000 ZM 224.000 112.060 C 224.016 109.928 223.180 107.878 221.678 106.364 C 220.176 104.851 218.132 104.000 216.000 104.000 L 40.000 104.000 C 37.868 104.000 35.824 104.851 34.322 106.364 C 32.820 107.878 31.984 109.928 32.000 112.060 C 32.051 147.828 51.963 180.607 83.680 197.140 L 80.210 221.410 C 79.686 224.832 80.257 228.332 81.840 231.410 C 84.596 236.683 90.050 239.992 96.000 240.000 L 159.660 240.000 C 163.135 240.047 166.536 238.997 169.380 237.000 C 174.194 233.517 176.682 227.652 175.840 221.770 L 172.320 197.170 C 204.047 180.632 223.960 147.838 224.000 112.060 ZM 96.000 224.000 L 98.930 203.500 C 117.846 209.500 138.154 209.500 157.070 203.500 L 160.000 224.000 Z"),
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
        return _toilet!!
    }

private var _toilet: ImageVector? = null
