package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileIni: ImageVector
    get() {
        if (_fileIni != null) return _fileIni!!
        _fileIni = phosphorFillIcon(
            name = "FileIni",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 48.000 152.000 L 48.000 207.730 C 48.068 212.021 44.805 215.633 40.530 216.000 C 38.318 216.147 36.144 215.369 34.527 213.853 C 32.910 212.336 31.995 210.217 32.000 208.000 L 32.000 152.270 C 31.932 147.979 35.195 144.367 39.470 144.000 C 41.682 143.853 43.856 144.631 45.473 146.147 C 47.090 147.664 48.005 149.783 48.000 152.000 ZM 119.470 144.000 C 115.202 144.367 111.942 147.967 112.000 152.250 L 112.000 183.000 L 86.690 147.600 C 84.903 145.012 81.802 143.662 78.690 144.120 C 74.835 144.760 72.006 148.092 72.000 152.000 L 72.000 207.730 C 71.932 212.021 75.195 215.633 79.470 216.000 C 81.682 216.147 83.856 215.369 85.473 213.853 C 87.090 212.336 88.005 210.217 88.000 208.000 L 88.000 177.000 L 113.490 212.690 C 115.864 215.981 120.325 216.974 123.870 215.000 C 126.460 213.512 128.041 210.737 128.000 207.750 L 128.000 152.000 C 128.005 149.783 127.090 147.664 125.473 146.147 C 123.856 144.631 121.682 143.853 119.470 144.000 ZM 159.470 144.000 C 155.202 144.367 151.942 147.967 152.000 152.250 L 152.000 207.710 C 151.942 211.993 155.202 215.593 159.470 215.960 C 161.682 216.107 163.856 215.329 165.473 213.813 C 167.090 212.296 168.005 210.177 168.000 207.960 L 168.000 152.000 C 168.005 149.783 167.090 147.664 165.473 146.147 C 163.856 144.631 161.682 143.853 159.470 144.000 ZM 216.000 88.000 L 216.000 223.750 C 216.060 227.780 213.165 231.248 209.190 231.910 C 206.887 232.256 204.547 231.582 202.781 230.062 C 201.016 228.543 200.000 226.329 200.000 224.000 L 200.000 124.000 C 200.000 121.791 198.209 120.000 196.000 120.000 L 44.000 120.000 C 41.791 120.000 40.000 118.209 40.000 116.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 152.000 24.000 C 154.122 23.998 156.158 24.840 157.660 26.340 L 213.660 82.340 C 215.160 83.842 216.002 85.878 216.000 88.000 ZM 196.000 88.000 L 152.000 44.000 L 152.000 88.000 Z"),
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
        return _fileIni!!
    }

private var _fileIni: ImageVector? = null
