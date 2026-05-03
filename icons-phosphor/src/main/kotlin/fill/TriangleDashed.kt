package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TriangleDashed: ImageVector
    get() {
        if (_triangleDashed != null) return _triangleDashed!!
        _triangleDashed = phosphorFillIcon(
            name = "TriangleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.800 188.090 L 149.350 36.220 C 144.903 28.649 136.780 23.999 128.000 23.999 C 119.220 23.999 111.097 28.649 106.650 36.220 L 19.200 188.090 C 14.919 195.417 14.919 204.483 19.200 211.810 C 23.591 219.433 31.753 224.093 40.550 224.000 L 215.450 224.000 C 224.240 224.086 232.393 219.427 236.780 211.810 C 241.067 204.486 241.075 195.421 236.800 188.090 ZM 108.000 200.000 L 60.790 200.000 C 56.503 199.999 52.542 197.712 50.399 193.999 C 48.256 190.286 48.257 185.712 50.400 182.000 L 74.580 140.000 C 76.789 136.170 81.685 134.856 85.515 137.065 C 89.345 139.274 90.659 144.170 88.450 148.000 L 67.710 184.000 L 108.000 184.000 C 112.418 184.000 116.000 187.582 116.000 192.000 C 116.000 196.418 112.418 200.000 108.000 200.000 ZM 106.880 116.000 C 104.671 119.833 99.773 121.149 95.940 118.940 C 92.107 116.731 90.791 111.833 93.000 108.000 L 117.590 65.300 C 119.732 61.580 123.697 59.287 127.990 59.287 C 132.283 59.287 136.248 61.580 138.390 65.300 L 163.000 108.000 C 165.209 111.830 163.895 116.726 160.065 118.935 C 156.235 121.144 151.339 119.830 149.130 116.000 L 128.000 79.310 ZM 205.600 194.000 C 203.449 197.705 199.494 199.989 195.210 200.000 L 148.000 200.000 C 143.582 200.000 140.000 196.418 140.000 192.000 C 140.000 187.582 143.582 184.000 148.000 184.000 L 188.290 184.000 L 167.550 148.000 C 165.341 144.170 166.655 139.274 170.485 137.065 C 174.315 134.856 179.211 136.170 181.420 140.000 L 205.600 182.000 C 207.744 185.713 207.744 190.287 205.600 194.000 Z"),
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
        return _triangleDashed!!
    }

private var _triangleDashed: ImageVector? = null
