package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FilePy: ImageVector
    get() {
        if (_filePy != null) return _filePy!!
        _filePy = phosphorFillIcon(
            name = "FilePy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 116.000 C 40.000 118.209 41.791 120.000 44.000 120.000 L 172.000 120.000 C 174.209 120.000 176.000 121.791 176.000 124.000 L 176.000 228.000 C 176.000 230.209 177.791 232.000 180.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 ZM 152.000 88.000 L 152.000 44.000 L 196.000 88.000 ZM 64.000 144.000 L 48.000 144.000 C 43.582 144.000 40.000 147.582 40.000 152.000 L 40.000 207.730 C 39.932 212.021 43.195 215.633 47.470 216.000 C 49.682 216.147 51.856 215.369 53.473 213.853 C 55.090 212.336 56.005 210.217 56.000 208.000 L 56.000 200.000 L 63.400 200.000 C 78.640 200.000 91.540 188.080 91.990 172.850 C 92.220 165.280 89.373 157.939 84.099 152.503 C 78.825 147.067 71.574 143.999 64.000 144.000 ZM 63.650 184.000 L 56.000 184.000 L 56.000 160.000 L 64.000 160.000 C 67.394 159.984 70.636 161.406 72.923 163.914 C 75.210 166.422 76.328 169.782 76.000 173.160 C 75.277 179.408 69.939 184.093 63.650 184.000 ZM 154.650 156.520 L 136.000 186.290 L 136.000 207.730 C 136.058 212.013 132.798 215.613 128.530 215.980 C 126.318 216.127 124.144 215.349 122.527 213.833 C 120.910 212.316 119.995 210.197 120.000 207.980 L 120.000 186.290 L 101.390 156.520 C 99.001 152.819 99.953 147.893 103.550 145.350 C 105.349 144.147 107.559 143.725 109.675 144.179 C 111.791 144.633 113.633 145.925 114.780 147.760 L 128.000 168.910 L 141.220 147.760 C 142.367 145.925 144.209 144.633 146.325 144.179 C 148.441 143.725 150.651 144.147 152.450 145.350 C 156.047 147.893 156.999 152.819 154.610 156.520 Z"),
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
        return _filePy!!
    }

private var _filePy: ImageVector? = null
