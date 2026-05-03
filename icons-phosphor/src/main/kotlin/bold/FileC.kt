package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileC: ImageVector
    get() {
        if (_fileC != null) return _fileC!!
        _fileC = phosphorBoldIcon(
            name = "FileC",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.490 79.510 L 160.490 23.510 C 158.238 21.260 155.184 19.997 152.000 20.000 L 56.000 20.000 C 44.954 20.000 36.000 28.954 36.000 40.000 L 36.000 108.000 C 36.000 114.627 41.373 120.000 48.000 120.000 C 54.627 120.000 60.000 114.627 60.000 108.000 L 60.000 44.000 L 136.000 44.000 L 136.000 92.000 C 136.000 98.627 141.373 104.000 148.000 104.000 L 196.000 104.000 L 196.000 212.000 L 124.000 212.000 C 117.373 212.000 112.000 217.373 112.000 224.000 C 112.000 230.627 117.373 236.000 124.000 236.000 L 200.000 236.000 C 211.046 236.000 220.000 227.046 220.000 216.000 L 220.000 88.000 C 220.003 84.816 218.740 81.762 216.490 79.510 ZM 160.000 57.000 L 183.000 80.000 L 160.000 80.000 ZM 48.000 180.000 C 48.000 188.670 53.500 196.000 60.000 196.000 C 62.810 195.908 65.459 194.668 67.330 192.570 C 71.914 187.782 79.512 187.616 84.300 192.200 C 89.088 196.784 89.254 204.382 84.670 209.170 C 78.289 216.023 69.364 219.941 60.000 220.000 C 40.150 220.000 24.000 202.060 24.000 180.000 C 24.000 157.940 40.150 140.000 60.000 140.000 C 69.364 140.059 78.289 143.977 84.670 150.830 C 89.254 155.618 89.088 163.216 84.300 167.800 C 79.512 172.384 71.914 172.218 67.330 167.430 C 65.459 165.332 62.810 164.092 60.000 164.000 C 53.500 164.000 48.000 171.330 48.000 180.000 Z"),
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
        return _fileC!!
    }

private var _fileC: ImageVector? = null
