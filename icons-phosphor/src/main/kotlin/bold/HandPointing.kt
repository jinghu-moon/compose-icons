package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandPointing: ImageVector
    get() {
        if (_handPointing != null) return _handPointing!!
        _handPointing = phosphorBoldIcon(
            name = "HandPointing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 196.000 84.000 C 192.170 83.989 188.370 84.666 184.780 86.000 C 178.126 72.305 162.743 65.195 148.000 69.000 L 148.000 44.000 C 148.000 26.327 133.673 12.000 116.000 12.000 C 98.327 12.000 84.000 26.327 84.000 44.000 L 84.000 110.830 C 73.151 98.390 54.621 96.243 41.215 105.872 C 27.809 115.501 23.926 133.747 32.250 148.000 L 36.930 156.240 C 71.110 216.480 86.720 244.000 136.000 244.000 C 186.787 243.945 227.945 202.787 228.000 152.000 L 228.000 116.000 C 228.000 98.327 213.673 84.000 196.000 84.000 ZM 204.000 152.000 C 203.956 189.537 173.537 219.956 136.000 220.000 C 102.000 220.000 92.510 205.550 57.800 144.350 L 53.110 136.070 C 53.105 136.047 53.105 136.023 53.110 136.000 C 50.901 132.173 52.213 127.279 56.040 125.070 C 59.867 122.861 64.761 124.173 66.970 128.000 C 67.030 128.120 67.100 128.230 67.170 128.350 L 85.850 158.350 C 88.696 162.862 94.179 164.954 99.307 163.484 C 104.435 162.014 107.977 157.335 108.000 152.000 L 108.000 44.000 C 108.000 39.582 111.582 36.000 116.000 36.000 C 120.418 36.000 124.000 39.582 124.000 44.000 L 124.000 112.000 C 124.000 118.627 129.373 124.000 136.000 124.000 C 142.627 124.000 148.000 118.627 148.000 112.000 L 148.000 100.000 C 148.000 95.582 151.582 92.000 156.000 92.000 C 160.418 92.000 164.000 95.582 164.000 100.000 L 164.000 120.000 C 164.000 126.627 169.373 132.000 176.000 132.000 C 182.627 132.000 188.000 126.627 188.000 120.000 L 188.000 116.000 C 188.000 111.582 191.582 108.000 196.000 108.000 C 200.418 108.000 204.000 111.582 204.000 116.000 Z"),
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
        return _handPointing!!
    }

private var _handPointing: ImageVector? = null
