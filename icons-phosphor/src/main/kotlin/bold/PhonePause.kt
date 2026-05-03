package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PhonePause: ImageVector
    get() {
        if (_phonePause != null) return _phonePause!!
        _phonePause = phosphorBoldIcon(
            name = "PhonePause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 162.800 L 168.910 141.700 L 168.730 141.620 C 162.514 138.926 155.354 139.582 149.730 143.360 C 149.342 143.620 148.968 143.900 148.610 144.200 L 126.300 163.200 C 113.300 156.150 99.870 142.830 92.810 129.990 L 111.870 107.330 C 112.179 106.966 112.463 106.582 112.720 106.180 C 116.392 100.577 117.015 93.509 114.380 87.350 L 114.300 87.170 L 93.200 40.000 C 89.644 31.900 81.202 27.086 72.420 28.150 C 42.391 32.095 19.953 57.713 20.000 88.000 C 20.000 169.610 86.390 236.000 168.000 236.000 C 198.287 236.047 223.905 213.609 227.850 183.580 C 228.914 174.798 224.100 166.356 216.000 162.800 ZM 168.000 212.000 C 99.551 211.917 44.083 156.449 44.000 88.000 C 43.950 70.930 55.809 56.136 72.480 52.470 L 91.300 94.470 L 72.140 117.270 C 71.828 117.634 71.541 118.018 71.280 118.420 C 67.431 124.294 66.945 131.756 70.000 138.080 C 79.420 157.360 98.830 176.640 118.310 186.080 C 124.671 189.096 132.149 188.545 138.000 184.630 C 138.387 184.369 138.757 184.085 139.110 183.780 L 161.540 164.710 L 203.540 183.520 C 199.866 200.191 185.071 212.047 168.000 212.000 ZM 188.000 104.000 L 188.000 48.000 C 188.000 41.373 193.373 36.000 200.000 36.000 C 206.627 36.000 212.000 41.373 212.000 48.000 L 212.000 104.000 C 212.000 110.627 206.627 116.000 200.000 116.000 C 193.373 116.000 188.000 110.627 188.000 104.000 ZM 148.000 104.000 L 148.000 48.000 C 148.000 41.373 153.373 36.000 160.000 36.000 C 166.627 36.000 172.000 41.373 172.000 48.000 L 172.000 104.000 C 172.000 110.627 166.627 116.000 160.000 116.000 C 153.373 116.000 148.000 110.627 148.000 104.000 Z"),
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
        return _phonePause!!
    }

private var _phonePause: ImageVector? = null
