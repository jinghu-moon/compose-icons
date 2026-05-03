package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileLock: ImageVector
    get() {
        if (_fileLock != null) return _fileLock!!
        _fileLock = phosphorBoldIcon(
            name = "FileLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 120.000 168.000 L 116.000 168.000 L 116.000 164.000 C 116.000 146.327 101.673 132.000 84.000 132.000 C 66.327 132.000 52.000 146.327 52.000 164.000 L 52.000 168.000 L 48.000 168.000 C 41.373 168.000 36.000 173.373 36.000 180.000 L 36.000 224.000 C 36.000 230.627 41.373 236.000 48.000 236.000 L 120.000 236.000 C 126.627 236.000 132.000 230.627 132.000 224.000 L 132.000 180.000 C 132.000 173.373 126.627 168.000 120.000 168.000 ZM 76.000 164.000 C 76.000 159.582 79.582 156.000 84.000 156.000 C 88.418 156.000 92.000 159.582 92.000 164.000 L 92.000 168.000 L 76.000 168.000 ZM 108.000 212.000 L 60.000 212.000 L 60.000 192.000 L 108.000 192.000 ZM 216.490 79.520 L 160.490 23.520 C 158.239 21.266 155.185 20.000 152.000 20.000 L 56.000 20.000 C 44.954 20.000 36.000 28.954 36.000 40.000 L 36.000 108.000 C 36.000 114.627 41.373 120.000 48.000 120.000 C 54.627 120.000 60.000 114.627 60.000 108.000 L 60.000 44.000 L 136.000 44.000 L 136.000 92.000 C 136.000 98.627 141.373 104.000 148.000 104.000 L 196.000 104.000 L 196.000 212.000 L 164.000 212.000 C 157.373 212.000 152.000 217.373 152.000 224.000 C 152.000 230.627 157.373 236.000 164.000 236.000 L 200.000 236.000 C 211.046 236.000 220.000 227.046 220.000 216.000 L 220.000 88.000 C 220.000 84.820 218.737 81.770 216.490 79.520 ZM 160.000 57.000 L 183.000 80.000 L 160.000 80.000 Z"),
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
        return _fileLock!!
    }

private var _fileLock: ImageVector? = null
