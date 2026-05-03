package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileMinus: ImageVector
    get() {
        if (_fileMinus != null) return _fileMinus!!
        _fileMinus = phosphorBoldIcon(
            name = "FileMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.490 79.510 L 160.490 23.510 C 158.238 21.260 155.184 19.997 152.000 20.000 L 56.000 20.000 C 44.954 20.000 36.000 28.954 36.000 40.000 L 36.000 216.000 C 36.000 227.046 44.954 236.000 56.000 236.000 L 200.000 236.000 C 211.046 236.000 220.000 227.046 220.000 216.000 L 220.000 88.000 C 220.003 84.816 218.740 81.762 216.490 79.510 ZM 160.000 57.000 L 183.000 80.000 L 160.000 80.000 ZM 60.000 212.000 L 60.000 44.000 L 136.000 44.000 L 136.000 92.000 C 136.000 98.627 141.373 104.000 148.000 104.000 L 196.000 104.000 L 196.000 212.000 ZM 164.000 152.000 C 164.000 158.627 158.627 164.000 152.000 164.000 L 104.000 164.000 C 97.373 164.000 92.000 158.627 92.000 152.000 C 92.000 145.373 97.373 140.000 104.000 140.000 L 152.000 140.000 C 158.627 140.000 164.000 145.373 164.000 152.000 Z"),
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
        return _fileMinus!!
    }

private var _fileMinus: ImageVector? = null
