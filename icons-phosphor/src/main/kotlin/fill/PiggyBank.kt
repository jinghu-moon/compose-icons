package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PiggyBank: ImageVector
    get() {
        if (_piggyBank != null) return _piggyBank!!
        _piggyBank = phosphorFillIcon(
            name = "PiggyBank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 226.000 88.080 C 225.600 87.080 225.180 86.080 224.750 85.080 C 218.298 70.200 207.856 57.395 194.580 48.080 L 216.000 48.080 C 220.418 48.080 224.000 44.498 224.000 40.080 C 224.000 35.662 220.418 32.080 216.000 32.080 L 112.000 32.080 C 66.136 32.138 27.986 67.366 24.280 113.080 C 10.063 116.614 0.062 129.351 0.000 144.000 C 0.000 148.418 3.582 152.000 8.000 152.000 C 12.418 152.000 16.000 148.418 16.000 144.000 C 16.004 138.054 19.304 132.601 24.570 129.840 C 26.561 147.789 34.045 164.685 46.000 178.220 L 58.560 213.380 C 60.835 219.753 66.873 224.005 73.640 224.000 L 86.360 224.000 C 93.123 224.001 99.156 219.749 101.430 213.380 L 103.350 208.000 L 160.650 208.000 L 162.570 213.380 C 164.844 219.749 170.877 224.001 177.640 224.000 L 190.360 224.000 C 197.123 224.001 203.156 219.749 205.430 213.380 L 221.640 168.000 L 224.000 168.000 C 237.255 168.000 248.000 157.255 248.000 144.000 L 248.000 112.000 C 248.002 99.519 238.437 89.120 226.000 88.080 ZM 152.000 72.000 L 112.000 72.000 C 107.582 72.000 104.000 68.418 104.000 64.000 C 104.000 59.582 107.582 56.000 112.000 56.000 L 152.000 56.000 C 156.418 56.000 160.000 59.582 160.000 64.000 C 160.000 68.418 156.418 72.000 152.000 72.000 ZM 180.000 128.000 C 173.373 128.000 168.000 122.627 168.000 116.000 C 168.000 109.373 173.373 104.000 180.000 104.000 C 186.627 104.000 192.000 109.373 192.000 116.000 C 192.000 122.627 186.627 128.000 180.000 128.000 Z"),
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
        return _piggyBank!!
    }

private var _piggyBank: ImageVector? = null
