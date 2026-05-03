package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderLock: ImageVector
    get() {
        if (_folderLock != null) return _folderLock!!
        _folderLock = phosphorBoldIcon(
            name = "FolderLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 152.000 L 220.000 152.000 L 220.000 148.000 C 220.000 130.327 205.673 116.000 188.000 116.000 C 170.327 116.000 156.000 130.327 156.000 148.000 L 156.000 152.000 L 152.000 152.000 C 145.373 152.000 140.000 157.373 140.000 164.000 L 140.000 208.000 C 140.000 214.627 145.373 220.000 152.000 220.000 L 224.000 220.000 C 230.627 220.000 236.000 214.627 236.000 208.000 L 236.000 164.000 C 236.000 157.373 230.627 152.000 224.000 152.000 ZM 180.000 148.000 C 180.000 143.582 183.582 140.000 188.000 140.000 C 192.418 140.000 196.000 143.582 196.000 148.000 L 196.000 152.000 L 180.000 152.000 ZM 212.000 196.000 L 164.000 196.000 L 164.000 176.000 L 212.000 176.000 ZM 216.000 68.000 L 133.390 68.000 L 107.390 38.710 C 103.582 34.428 98.120 31.984 92.390 32.000 L 40.000 32.000 C 28.954 32.000 20.000 40.954 20.000 52.000 L 20.000 200.620 C 20.017 211.316 28.684 219.983 39.380 220.000 L 104.560 220.000 C 111.187 220.000 116.560 214.627 116.560 208.000 C 116.560 201.373 111.187 196.000 104.560 196.000 L 44.000 196.000 L 44.000 92.000 L 212.000 92.000 C 212.000 98.627 217.373 104.000 224.000 104.000 C 230.627 104.000 236.000 98.627 236.000 92.000 L 236.000 88.000 C 236.000 76.954 227.046 68.000 216.000 68.000 ZM 44.000 68.000 L 44.000 56.000 L 90.610 56.000 L 101.280 68.000 Z"),
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
        return _folderLock!!
    }

private var _folderLock: ImageVector? = null
