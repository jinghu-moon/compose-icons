package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileMagnifyingGlass: ImageVector
    get() {
        if (_fileMagnifyingGlass != null) return _fileMagnifyingGlass!!
        _fileMagnifyingGlass = phosphorBoldIcon(
            name = "FileMagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.490 79.520 L 160.490 23.520 C 158.239 21.266 155.185 20.000 152.000 20.000 L 56.000 20.000 C 44.954 20.000 36.000 28.954 36.000 40.000 L 36.000 216.000 C 36.000 227.046 44.954 236.000 56.000 236.000 L 200.000 236.000 C 211.046 236.000 220.000 227.046 220.000 216.000 L 220.000 88.000 C 220.000 84.820 218.737 81.770 216.490 79.520 ZM 183.000 80.000 L 160.000 80.000 L 160.000 57.000 ZM 60.000 212.000 L 60.000 44.000 L 136.000 44.000 L 136.000 92.000 C 136.000 98.627 141.373 104.000 148.000 104.000 L 196.000 104.000 L 196.000 212.000 ZM 156.480 163.510 C 164.025 147.688 159.076 128.731 144.761 118.615 C 130.445 108.499 110.924 110.164 98.529 122.559 C 86.134 134.954 84.469 154.475 94.585 168.791 C 104.701 183.106 123.658 188.055 139.480 180.510 L 151.480 192.510 C 156.174 197.204 163.786 197.204 168.480 192.510 C 173.174 187.816 173.174 180.204 168.480 175.510 ZM 112.000 148.000 C 112.000 141.373 117.373 136.000 124.000 136.000 C 130.627 136.000 136.000 141.373 136.000 148.000 C 136.000 154.627 130.627 160.000 124.000 160.000 C 117.373 160.000 112.000 154.627 112.000 148.000 Z"),
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
        return _fileMagnifyingGlass!!
    }

private var _fileMagnifyingGlass: ImageVector? = null
