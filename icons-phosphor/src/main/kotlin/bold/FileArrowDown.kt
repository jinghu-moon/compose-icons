package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileArrowDown: ImageVector
    get() {
        if (_fileArrowDown != null) return _fileArrowDown!!
        _fileArrowDown = phosphorBoldIcon(
            name = "FileArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.490 79.520 L 160.490 23.520 C 158.239 21.266 155.185 20.000 152.000 20.000 L 56.000 20.000 C 44.954 20.000 36.000 28.954 36.000 40.000 L 36.000 216.000 C 36.000 227.046 44.954 236.000 56.000 236.000 L 200.000 236.000 C 211.046 236.000 220.000 227.046 220.000 216.000 L 220.000 88.000 C 220.000 84.820 218.737 81.770 216.490 79.520 ZM 160.000 57.000 L 183.000 80.000 L 160.000 80.000 ZM 60.000 212.000 L 60.000 44.000 L 136.000 44.000 L 136.000 92.000 C 136.000 98.627 141.373 104.000 148.000 104.000 L 196.000 104.000 L 196.000 212.000 ZM 160.490 151.510 C 162.749 153.762 164.019 156.820 164.019 160.010 C 164.019 163.200 162.749 166.258 160.490 168.510 L 136.490 192.510 C 134.238 194.769 131.180 196.039 127.990 196.039 C 124.800 196.039 121.742 194.769 119.490 192.510 L 95.490 168.510 C 90.796 163.816 90.796 156.204 95.490 151.510 C 100.184 146.816 107.796 146.816 112.490 151.510 L 116.000 155.000 L 116.000 124.000 C 116.000 117.373 121.373 112.000 128.000 112.000 C 134.627 112.000 140.000 117.373 140.000 124.000 L 140.000 155.000 L 143.510 151.480 C 145.765 149.231 148.821 147.970 152.006 147.976 C 155.191 147.981 158.243 149.253 160.490 151.510 Z"),
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
        return _fileArrowDown!!
    }

private var _fileArrowDown: ImageVector? = null
