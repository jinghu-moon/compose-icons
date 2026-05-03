package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Key: ImageVector
    get() {
        if (_key != null) return _key!!
        _key = phosphorRegularIcon(
            name = "Key",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.570 39.430 C 190.412 13.236 149.699 8.409 118.141 27.761 C 86.584 47.113 72.425 85.588 83.910 120.780 L 28.690 176.000 C 25.676 178.990 23.986 183.064 24.000 187.310 L 24.000 216.000 C 24.000 224.837 31.163 232.000 40.000 232.000 L 72.000 232.000 C 76.418 232.000 80.000 228.418 80.000 224.000 L 80.000 208.000 L 96.000 208.000 C 100.418 208.000 104.000 204.418 104.000 200.000 L 104.000 184.000 L 120.000 184.000 C 122.122 184.002 124.158 183.160 125.660 181.660 L 135.220 172.090 C 143.222 174.693 151.585 176.012 160.000 176.000 L 160.100 176.000 C 192.440 175.961 221.575 156.455 233.932 126.569 C 246.290 96.683 239.438 62.297 216.570 39.430 ZM 224.000 98.100 C 222.910 132.190 194.250 159.960 160.110 160.000 L 160.000 160.000 C 151.902 160.014 143.875 158.483 136.350 155.490 C 133.338 154.183 129.833 154.849 127.510 157.170 L 116.690 168.000 L 96.000 168.000 C 91.582 168.000 88.000 171.582 88.000 176.000 L 88.000 192.000 L 72.000 192.000 C 67.582 192.000 64.000 195.582 64.000 200.000 L 64.000 216.000 L 40.000 216.000 L 40.000 187.310 L 98.830 128.490 C 101.151 126.167 101.817 122.662 100.510 119.650 C 97.507 112.100 95.977 104.045 96.000 95.920 C 96.000 61.780 123.810 33.120 157.900 32.030 C 175.600 31.439 192.754 38.209 205.279 50.729 C 217.805 63.249 224.583 80.400 224.000 98.100 ZM 192.000 76.000 C 192.000 82.627 186.627 88.000 180.000 88.000 C 173.373 88.000 168.000 82.627 168.000 76.000 C 168.000 69.373 173.373 64.000 180.000 64.000 C 186.627 64.000 192.000 69.373 192.000 76.000 Z"),
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
        return _key!!
    }

private var _key: ImageVector? = null
