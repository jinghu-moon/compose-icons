package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileArchive: ImageVector
    get() {
        if (_fileArchive != null) return _fileArchive!!
        _fileArchive = phosphorFillIcon(
            name = "FileArchive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 92.000 232.000 C 94.209 232.000 96.000 230.209 96.000 228.000 L 96.000 208.000 L 88.270 208.000 C 83.979 208.068 80.367 204.805 80.000 200.530 C 79.853 198.318 80.631 196.144 82.147 194.527 C 83.664 192.910 85.783 191.995 88.000 192.000 L 96.000 192.000 L 96.000 176.000 L 88.270 176.000 C 83.979 176.068 80.367 172.805 80.000 168.530 C 79.853 166.318 80.631 164.144 82.147 162.527 C 83.664 160.910 85.783 159.995 88.000 160.000 L 96.000 160.000 L 96.000 144.000 L 88.270 144.000 C 83.979 144.068 80.367 140.805 80.000 136.530 C 79.853 134.318 80.631 132.144 82.147 130.527 C 83.664 128.910 85.783 127.995 88.000 128.000 L 96.000 128.000 L 96.000 120.270 C 95.947 115.989 99.205 112.391 103.470 112.020 C 105.682 111.873 107.856 112.651 109.473 114.167 C 111.090 115.684 112.005 117.803 112.000 120.020 L 112.000 128.020 L 119.730 128.020 C 124.013 127.962 127.613 131.222 127.980 135.490 C 128.127 137.702 127.349 139.876 125.833 141.493 C 124.316 143.110 122.197 144.025 119.980 144.020 L 111.980 144.020 L 111.980 160.020 L 119.710 160.020 C 123.993 159.962 127.593 163.222 127.960 167.490 C 128.107 169.702 127.329 171.876 125.813 173.493 C 124.296 175.110 122.177 176.025 119.960 176.020 L 111.960 176.020 L 111.960 192.020 L 119.690 192.020 C 123.973 191.962 127.573 195.222 127.940 199.490 C 128.087 201.702 127.309 203.876 125.793 205.493 C 124.276 207.110 122.157 208.025 119.940 208.020 L 111.940 208.020 L 111.940 228.020 C 111.940 230.229 113.731 232.020 115.940 232.020 L 199.940 232.020 C 208.777 232.020 215.940 224.857 215.940 216.020 L 215.940 88.000 C 215.958 85.886 215.138 83.851 213.660 82.340 ZM 152.000 88.000 L 152.000 44.000 L 196.000 88.000 Z"),
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
        return _fileArchive!!
    }

private var _fileArchive: ImageVector? = null
