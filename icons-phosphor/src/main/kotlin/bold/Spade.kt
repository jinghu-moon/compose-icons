package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Spade: ImageVector
    get() {
        if (_spade != null) return _spade!!
        _spade = phosphorBoldIcon(
            name = "Spade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 133.370 13.270 C 129.990 11.579 126.010 11.579 122.630 13.270 C 118.440 15.360 20.000 65.400 20.000 136.000 C 19.998 153.576 27.702 170.269 41.078 181.671 C 54.454 193.072 72.156 198.036 89.510 195.250 L 84.230 221.650 C 83.526 225.175 84.440 228.831 86.719 231.610 C 88.999 234.390 92.405 236.001 96.000 236.000 L 160.000 236.000 C 163.595 236.001 167.001 234.390 169.281 231.610 C 171.560 228.831 172.474 225.175 171.770 221.650 L 166.490 195.250 C 183.844 198.036 201.546 193.072 214.922 181.671 C 228.298 170.269 236.002 153.576 236.000 136.000 C 236.000 65.400 137.560 15.360 133.370 13.270 ZM 176.000 172.000 C 169.249 172.009 162.632 170.113 156.910 166.530 C 152.850 163.985 147.665 164.100 143.721 166.822 C 139.777 169.544 137.831 174.351 138.770 179.050 L 145.360 212.000 L 110.640 212.000 L 117.230 179.050 C 118.169 174.351 116.223 169.544 112.279 166.822 C 108.335 164.100 103.150 163.985 99.090 166.530 C 87.992 173.472 74.000 173.842 62.550 167.496 C 51.100 161.151 43.997 149.091 44.000 136.000 C 44.000 107.710 67.570 82.050 87.340 65.510 C 100.030 55.017 113.638 45.686 128.000 37.630 C 142.363 45.683 155.971 55.014 168.660 65.510 C 188.430 82.050 212.000 107.710 212.000 136.000 C 212.000 155.882 195.882 172.000 176.000 172.000 Z"),
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
        return _spade!!
    }

private var _spade: ImageVector? = null
