package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileDashed: ImageVector
    get() {
        if (_fileDashed != null) return _fileDashed!!
        _fileDashed = phosphorBoldIcon(
            name = "FileDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 84.000 224.000 C 84.000 230.627 78.627 236.000 72.000 236.000 L 56.000 236.000 C 44.954 236.000 36.000 227.046 36.000 216.000 L 36.000 184.000 C 36.000 177.373 41.373 172.000 48.000 172.000 C 54.627 172.000 60.000 177.373 60.000 184.000 L 60.000 212.000 L 72.000 212.000 C 78.627 212.000 84.000 217.373 84.000 224.000 ZM 220.000 88.000 L 220.000 136.000 C 220.000 142.627 214.627 148.000 208.000 148.000 C 201.373 148.000 196.000 142.627 196.000 136.000 L 196.000 104.000 L 148.000 104.000 C 141.373 104.000 136.000 98.627 136.000 92.000 L 136.000 44.000 L 120.000 44.000 C 113.373 44.000 108.000 38.627 108.000 32.000 C 108.000 25.373 113.373 20.000 120.000 20.000 L 152.000 20.000 C 155.184 19.997 158.238 21.260 160.490 23.510 L 216.490 79.510 C 218.740 81.762 220.003 84.816 220.000 88.000 ZM 160.000 80.000 L 183.000 80.000 L 160.000 57.000 ZM 80.000 20.000 L 56.000 20.000 C 44.954 20.000 36.000 28.954 36.000 40.000 L 36.000 64.000 C 36.000 70.627 41.373 76.000 48.000 76.000 C 54.627 76.000 60.000 70.627 60.000 64.000 L 60.000 44.000 L 80.000 44.000 C 86.627 44.000 92.000 38.627 92.000 32.000 C 92.000 25.373 86.627 20.000 80.000 20.000 ZM 208.000 164.000 C 201.373 164.000 196.000 169.373 196.000 176.000 L 196.000 212.000 L 192.000 212.000 C 185.373 212.000 180.000 217.373 180.000 224.000 C 180.000 230.627 185.373 236.000 192.000 236.000 L 200.000 236.000 C 211.046 236.000 220.000 227.046 220.000 216.000 L 220.000 176.000 C 220.000 169.373 214.627 164.000 208.000 164.000 ZM 48.000 156.000 C 54.627 156.000 60.000 150.627 60.000 144.000 L 60.000 104.000 C 60.000 97.373 54.627 92.000 48.000 92.000 C 41.373 92.000 36.000 97.373 36.000 104.000 L 36.000 144.000 C 36.000 150.627 41.373 156.000 48.000 156.000 ZM 152.000 212.000 L 112.000 212.000 C 105.373 212.000 100.000 217.373 100.000 224.000 C 100.000 230.627 105.373 236.000 112.000 236.000 L 152.000 236.000 C 158.627 236.000 164.000 230.627 164.000 224.000 C 164.000 217.373 158.627 212.000 152.000 212.000 Z"),
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
        return _fileDashed!!
    }

private var _fileDashed: ImageVector? = null
