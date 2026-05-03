package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderMinus: ImageVector
    get() {
        if (_folderMinus != null) return _folderMinus!!
        _folderMinus = phosphorBoldIcon(
            name = "FolderMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 92.000 144.000 C 92.000 137.373 97.373 132.000 104.000 132.000 L 152.000 132.000 C 158.627 132.000 164.000 137.373 164.000 144.000 C 164.000 150.627 158.627 156.000 152.000 156.000 L 104.000 156.000 C 97.373 156.000 92.000 150.627 92.000 144.000 ZM 236.000 88.000 L 236.000 200.890 C 235.989 211.440 227.440 219.989 216.890 220.000 L 39.380 220.000 C 28.684 219.983 20.017 211.316 20.000 200.620 L 20.000 52.000 C 20.000 40.954 28.954 32.000 40.000 32.000 L 92.410 32.000 C 98.140 31.984 103.602 34.428 107.410 38.710 L 133.410 68.000 L 216.000 68.000 C 227.046 68.000 236.000 76.954 236.000 88.000 ZM 44.000 68.000 L 101.280 68.000 L 90.610 56.000 L 44.000 56.000 ZM 212.000 92.000 L 44.000 92.000 L 44.000 196.000 L 212.000 196.000 Z"),
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
        return _folderMinus!!
    }

private var _folderMinus: ImageVector? = null
