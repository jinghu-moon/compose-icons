package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Dna: ImageVector
    get() {
        if (_dna != null) return _dna!!
        _dna = phosphorBoldIcon(
            name = "Dna",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.000 204.500 L 204.000 232.000 C 204.000 238.627 198.627 244.000 192.000 244.000 C 185.373 244.000 180.000 238.627 180.000 232.000 L 180.000 204.500 C 180.077 181.750 167.212 160.935 146.830 150.830 L 98.430 126.630 C 69.898 112.484 51.891 83.346 52.000 51.500 L 52.000 24.000 C 52.000 17.373 57.373 12.000 64.000 12.000 C 70.627 12.000 76.000 17.373 76.000 24.000 L 76.000 51.500 C 75.923 74.250 88.788 95.065 109.170 105.170 L 157.570 129.370 C 186.102 143.516 204.109 172.654 204.000 204.500 ZM 152.000 204.000 L 76.000 204.000 C 76.051 198.585 76.839 193.203 78.340 188.000 L 134.540 188.000 C 141.167 188.000 146.540 182.627 146.540 176.000 C 146.540 169.373 141.167 164.000 134.540 164.000 L 91.760 164.000 C 92.760 162.900 93.760 161.820 94.890 160.790 C 99.717 156.247 99.948 148.652 95.405 143.825 C 90.862 138.998 83.267 138.767 78.440 143.310 C 61.602 159.214 52.042 181.339 52.000 204.500 L 52.000 232.000 C 52.000 238.627 57.373 244.000 64.000 244.000 C 70.627 244.000 76.000 238.627 76.000 232.000 L 76.000 228.000 L 152.000 228.000 C 158.627 228.000 164.000 222.627 164.000 216.000 C 164.000 209.373 158.627 204.000 152.000 204.000 ZM 192.000 12.000 C 185.373 12.000 180.000 17.373 180.000 24.000 L 180.000 28.000 L 104.000 28.000 C 97.373 28.000 92.000 33.373 92.000 40.000 C 92.000 46.627 97.373 52.000 104.000 52.000 L 180.000 52.000 C 179.949 57.415 179.161 62.797 177.660 68.000 L 121.440 68.000 C 114.813 68.000 109.440 73.373 109.440 80.000 C 109.440 86.627 114.813 92.000 121.440 92.000 L 164.240 92.000 C 163.240 93.100 162.240 94.180 161.110 95.210 C 156.283 99.753 156.052 107.348 160.595 112.175 C 165.138 117.002 172.733 117.233 177.560 112.690 C 194.398 96.786 203.958 74.661 204.000 51.500 L 204.000 24.000 C 204.000 17.373 198.627 12.000 192.000 12.000 Z"),
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
        return _dna!!
    }

private var _dna: ImageVector? = null
