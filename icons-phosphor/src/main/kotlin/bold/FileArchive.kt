package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileArchive: ImageVector
    get() {
        if (_fileArchive != null) return _fileArchive!!
        _fileArchive = phosphorBoldIcon(
            name = "FileArchive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.490 79.510 L 160.490 23.510 C 158.238 21.260 155.184 19.997 152.000 20.000 L 56.000 20.000 C 44.954 20.000 36.000 28.954 36.000 40.000 L 36.000 216.000 C 36.000 227.046 44.954 236.000 56.000 236.000 L 200.000 236.000 C 211.046 236.000 220.000 227.046 220.000 216.000 L 220.000 88.000 C 220.003 84.816 218.740 81.762 216.490 79.510 ZM 183.000 80.000 L 160.000 80.000 L 160.000 57.000 ZM 116.000 212.000 L 116.000 192.000 L 124.000 192.000 C 130.627 192.000 136.000 186.627 136.000 180.000 C 136.000 173.373 130.627 168.000 124.000 168.000 L 116.000 168.000 L 116.000 152.000 L 124.000 152.000 C 130.627 152.000 136.000 146.627 136.000 140.000 C 136.000 133.373 130.627 128.000 124.000 128.000 L 116.000 128.000 L 116.000 116.000 C 116.000 109.373 110.627 104.000 104.000 104.000 C 97.373 104.000 92.000 109.373 92.000 116.000 L 92.000 128.000 L 84.000 128.000 C 77.373 128.000 72.000 133.373 72.000 140.000 C 72.000 146.627 77.373 152.000 84.000 152.000 L 92.000 152.000 L 92.000 168.000 L 84.000 168.000 C 77.373 168.000 72.000 173.373 72.000 180.000 C 72.000 186.627 77.373 192.000 84.000 192.000 L 92.000 192.000 L 92.000 212.000 L 60.000 212.000 L 60.000 44.000 L 136.000 44.000 L 136.000 92.000 C 136.000 98.627 141.373 104.000 148.000 104.000 L 196.000 104.000 L 196.000 212.000 Z"),
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
