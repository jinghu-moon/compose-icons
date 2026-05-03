package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileArrowUp: ImageVector
    get() {
        if (_fileArrowUp != null) return _fileArrowUp!!
        _fileArrowUp = phosphorBoldIcon(
            name = "FileArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.490 79.520 L 160.490 23.520 C 158.239 21.266 155.185 20.000 152.000 20.000 L 56.000 20.000 C 44.954 20.000 36.000 28.954 36.000 40.000 L 36.000 216.000 C 36.000 227.046 44.954 236.000 56.000 236.000 L 200.000 236.000 C 211.046 236.000 220.000 227.046 220.000 216.000 L 220.000 88.000 C 220.000 84.820 218.737 81.770 216.490 79.520 ZM 183.000 80.000 L 160.000 80.000 L 160.000 57.000 ZM 60.000 212.000 L 60.000 44.000 L 136.000 44.000 L 136.000 92.000 C 136.000 98.627 141.373 104.000 148.000 104.000 L 196.000 104.000 L 196.000 212.000 ZM 160.490 139.510 C 165.184 144.204 165.184 151.816 160.490 156.510 C 155.796 161.204 148.184 161.204 143.490 156.510 L 140.000 153.000 L 140.000 184.000 C 140.000 190.627 134.627 196.000 128.000 196.000 C 121.373 196.000 116.000 190.627 116.000 184.000 L 116.000 153.000 L 112.490 156.520 C 107.796 161.214 100.184 161.214 95.490 156.520 C 90.796 151.826 90.796 144.214 95.490 139.520 L 119.490 115.520 C 121.742 113.261 124.800 111.991 127.990 111.991 C 131.180 111.991 134.238 113.261 136.490 115.520 Z"),
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
        return _fileArrowUp!!
    }

private var _fileArrowUp: ImageVector? = null
