package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileImage: ImageVector
    get() {
        if (_fileImage != null) return _fileImage!!
        _fileImage = phosphorBoldIcon(
            name = "FileImage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 114.000 145.340 C 111.777 141.988 108.022 139.973 104.000 139.973 C 99.978 139.973 96.223 141.988 94.000 145.340 L 79.000 167.820 L 72.300 157.730 C 70.054 154.366 66.264 152.361 62.219 152.395 C 58.174 152.429 54.419 154.499 52.230 157.900 L 13.910 217.510 C 11.536 221.202 11.367 225.895 13.470 229.748 C 15.572 233.601 19.611 235.999 24.000 236.000 L 152.000 236.000 C 156.430 236.007 160.502 233.572 162.595 229.668 C 164.687 225.764 164.458 221.025 162.000 217.340 ZM 46.000 212.000 L 62.500 186.300 L 69.050 196.110 C 71.273 199.462 75.028 201.477 79.050 201.477 C 83.072 201.477 86.827 199.462 89.050 196.110 L 104.050 173.630 L 129.580 212.000 ZM 216.490 79.510 L 160.490 23.510 C 158.238 21.260 155.184 19.997 152.000 20.000 L 56.000 20.000 C 44.954 20.000 36.000 28.954 36.000 40.000 L 36.000 124.000 C 36.000 130.627 41.373 136.000 48.000 136.000 C 54.627 136.000 60.000 130.627 60.000 124.000 L 60.000 44.000 L 136.000 44.000 L 136.000 92.000 C 136.000 98.627 141.373 104.000 148.000 104.000 L 196.000 104.000 L 196.000 212.000 C 189.373 212.000 184.000 217.373 184.000 224.000 C 184.000 230.627 189.373 236.000 196.000 236.000 L 200.000 236.000 C 211.046 236.000 220.000 227.046 220.000 216.000 L 220.000 88.000 C 220.003 84.816 218.740 81.762 216.490 79.510 ZM 160.000 57.000 L 183.000 80.000 L 160.000 80.000 Z"),
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
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null
