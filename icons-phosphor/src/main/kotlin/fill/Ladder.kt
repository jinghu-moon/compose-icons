package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Ladder: ImageVector
    get() {
        if (_ladder != null) return _ladder!!
        _ladder = phosphorFillIcon(
            name = "Ladder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 215.520 213.260 L 164.510 73.000 L 173.600 48.000 L 184.000 48.000 C 188.418 48.000 192.000 44.418 192.000 40.000 C 192.000 35.582 188.418 32.000 184.000 32.000 L 88.000 32.000 C 83.582 32.000 80.000 35.582 80.000 40.000 C 80.000 44.418 83.582 48.000 88.000 48.000 L 92.580 48.000 L 32.480 213.260 C 31.753 215.256 31.849 217.459 32.748 219.383 C 33.646 221.308 35.273 222.796 37.270 223.520 C 38.146 223.835 39.069 223.997 40.000 224.000 C 43.366 224.000 46.371 221.894 47.520 218.730 L 57.240 192.000 L 104.240 192.000 L 96.500 213.260 C 95.773 215.256 95.869 217.459 96.768 219.383 C 97.666 221.308 99.293 222.796 101.290 223.520 C 102.160 223.833 103.076 223.995 104.000 224.000 C 107.366 224.000 110.371 221.894 111.520 218.730 L 130.000 168.000 L 182.000 168.000 L 200.450 218.730 C 201.602 221.904 204.623 224.013 208.000 224.000 C 208.931 223.997 209.854 223.835 210.730 223.520 C 212.727 222.796 214.354 221.308 215.252 219.383 C 216.151 217.459 216.247 215.256 215.520 213.260 ZM 109.390 64.000 L 139.390 64.000 C 143.808 64.000 147.390 67.582 147.390 72.000 C 147.390 76.418 143.808 80.000 139.390 80.000 L 109.390 80.000 C 104.972 80.000 101.390 76.418 101.390 72.000 C 101.390 67.582 104.972 64.000 109.390 64.000 ZM 110.250 160.000 L 80.300 160.000 C 75.882 160.000 72.300 156.418 72.300 152.000 C 72.300 147.582 75.882 144.000 80.300 144.000 L 110.300 144.000 C 114.718 144.000 118.300 147.582 118.300 152.000 C 118.300 156.418 114.718 160.000 110.300 160.000 ZM 124.790 120.000 L 94.840 120.000 C 90.422 120.000 86.840 116.418 86.840 112.000 C 86.840 107.582 90.422 104.000 94.840 104.000 L 124.840 104.000 C 129.258 104.000 132.840 107.582 132.840 112.000 C 132.840 116.418 129.258 120.000 124.840 120.000 ZM 135.790 152.000 L 156.000 96.410 L 176.210 152.000 Z"),
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
        return _ladder!!
    }

private var _ladder: ImageVector? = null
