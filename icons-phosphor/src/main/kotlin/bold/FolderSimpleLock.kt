package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderSimpleLock: ImageVector
    get() {
        if (_folderSimpleLock != null) return _folderSimpleLock!!
        _folderSimpleLock = phosphorBoldIcon(
            name = "FolderSimpleLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 88.000 L 236.000 92.000 C 236.000 98.627 230.627 104.000 224.000 104.000 C 217.373 104.000 212.000 98.627 212.000 92.000 L 130.670 92.000 C 126.344 91.991 122.136 90.589 118.670 88.000 L 92.000 68.000 L 44.000 68.000 L 44.000 196.000 L 104.000 196.000 C 110.627 196.000 116.000 201.373 116.000 208.000 C 116.000 214.627 110.627 220.000 104.000 220.000 L 40.000 220.000 C 28.954 220.000 20.000 211.046 20.000 200.000 L 20.000 64.000 C 20.000 52.954 28.954 44.000 40.000 44.000 L 93.330 44.000 C 97.656 44.009 101.864 45.411 105.330 48.000 L 132.000 68.000 L 216.000 68.000 C 227.046 68.000 236.000 76.954 236.000 88.000 ZM 236.000 164.000 L 236.000 208.000 C 236.000 214.627 230.627 220.000 224.000 220.000 L 152.000 220.000 C 145.373 220.000 140.000 214.627 140.000 208.000 L 140.000 164.000 C 140.000 157.373 145.373 152.000 152.000 152.000 L 156.000 152.000 L 156.000 148.000 C 156.000 130.327 170.327 116.000 188.000 116.000 C 205.673 116.000 220.000 130.327 220.000 148.000 L 220.000 152.000 L 224.000 152.000 C 230.627 152.000 236.000 157.373 236.000 164.000 ZM 180.000 152.000 L 196.000 152.000 L 196.000 148.000 C 196.000 143.582 192.418 140.000 188.000 140.000 C 183.582 140.000 180.000 143.582 180.000 148.000 ZM 212.000 176.000 L 164.000 176.000 L 164.000 196.000 L 212.000 196.000 Z"),
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
        return _folderSimpleLock!!
    }

private var _folderSimpleLock: ImageVector? = null
