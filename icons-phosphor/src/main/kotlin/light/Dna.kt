package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Dna: ImageVector
    get() {
        if (_dna != null) return _dna!!
        _dna = phosphorLightIcon(
            name = "Dna",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 198.000 204.500 L 198.000 232.000 C 198.000 235.314 195.314 238.000 192.000 238.000 C 188.686 238.000 186.000 235.314 186.000 232.000 L 186.000 204.500 C 186.073 179.489 171.927 156.611 149.520 145.500 L 101.120 121.300 C 74.612 108.161 57.886 81.086 58.000 51.500 L 58.000 24.000 C 58.000 20.686 60.686 18.000 64.000 18.000 C 67.314 18.000 70.000 20.686 70.000 24.000 L 70.000 51.500 C 69.927 76.511 84.073 99.389 106.480 110.500 L 154.880 134.700 C 181.388 147.839 198.114 174.914 198.000 204.500 ZM 160.000 202.000 L 70.050 202.000 C 70.323 195.169 71.655 188.422 74.000 182.000 L 148.130 182.000 C 151.444 182.000 154.130 179.314 154.130 176.000 C 154.130 172.686 151.444 170.000 148.130 170.000 L 79.770 170.000 C 84.223 162.713 90.052 156.362 96.930 151.300 C 99.510 149.310 100.030 145.625 98.102 142.998 C 96.173 140.372 92.501 139.765 89.830 141.630 C 69.853 156.355 58.043 179.682 58.000 204.500 L 58.000 232.000 C 58.000 235.314 60.686 238.000 64.000 238.000 C 67.314 238.000 70.000 235.314 70.000 232.000 L 70.000 214.000 L 160.000 214.000 C 163.314 214.000 166.000 211.314 166.000 208.000 C 166.000 204.686 163.314 202.000 160.000 202.000 ZM 192.000 18.000 C 188.686 18.000 186.000 20.686 186.000 24.000 L 186.000 42.000 L 96.000 42.000 C 92.686 42.000 90.000 44.686 90.000 48.000 C 90.000 51.314 92.686 54.000 96.000 54.000 L 186.000 54.000 C 185.711 60.834 184.362 67.581 182.000 74.000 L 107.890 74.000 C 104.576 74.000 101.890 76.686 101.890 80.000 C 101.890 83.314 104.576 86.000 107.890 86.000 L 176.230 86.000 C 171.777 93.287 165.948 99.638 159.070 104.700 C 156.490 106.690 155.970 110.375 157.898 113.002 C 159.827 115.628 163.499 116.235 166.170 114.370 C 186.147 99.645 197.957 76.318 198.000 51.500 L 198.000 24.000 C 198.000 20.686 195.314 18.000 192.000 18.000 Z"),
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
        return _dna!!
    }

private var _dna: ImageVector? = null
