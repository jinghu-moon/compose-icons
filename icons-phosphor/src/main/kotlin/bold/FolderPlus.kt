package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderPlus: ImageVector
    get() {
        if (_folderPlus != null) return _folderPlus!!
        _folderPlus = phosphorBoldIcon(
            name = "FolderPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 68.000 L 133.390 68.000 L 107.390 38.710 C 103.582 34.428 98.120 31.984 92.390 32.000 L 40.000 32.000 C 28.954 32.000 20.000 40.954 20.000 52.000 L 20.000 200.620 C 20.017 211.316 28.684 219.983 39.380 220.000 L 216.890 220.000 C 227.440 219.989 235.989 211.440 236.000 200.890 L 236.000 88.000 C 236.000 76.954 227.046 68.000 216.000 68.000 ZM 90.610 56.000 L 101.280 68.000 L 44.000 68.000 L 44.000 56.000 ZM 212.000 196.000 L 44.000 196.000 L 44.000 92.000 L 212.000 92.000 ZM 140.000 120.000 L 140.000 132.000 L 152.000 132.000 C 158.627 132.000 164.000 137.373 164.000 144.000 C 164.000 150.627 158.627 156.000 152.000 156.000 L 140.000 156.000 L 140.000 168.000 C 140.000 174.627 134.627 180.000 128.000 180.000 C 121.373 180.000 116.000 174.627 116.000 168.000 L 116.000 156.000 L 104.000 156.000 C 97.373 156.000 92.000 150.627 92.000 144.000 C 92.000 137.373 97.373 132.000 104.000 132.000 L 116.000 132.000 L 116.000 120.000 C 116.000 113.373 121.373 108.000 128.000 108.000 C 134.627 108.000 140.000 113.373 140.000 120.000 Z"),
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
        return _folderPlus!!
    }

private var _folderPlus: ImageVector? = null
