package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderSimple: ImageVector
    get() {
        if (_folderSimple != null) return _folderSimple!!
        _folderSimple = phosphorBoldIcon(
            name = "FolderSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 68.000 L 132.000 68.000 L 105.330 48.000 C 101.864 45.411 97.656 44.009 93.330 44.000 L 40.000 44.000 C 28.954 44.000 20.000 52.954 20.000 64.000 L 20.000 200.000 C 20.000 211.046 28.954 220.000 40.000 220.000 L 216.890 220.000 C 227.440 219.989 235.989 211.440 236.000 200.890 L 236.000 88.000 C 236.000 76.954 227.046 68.000 216.000 68.000 ZM 212.000 196.000 L 44.000 196.000 L 44.000 68.000 L 92.000 68.000 L 120.800 89.600 C 122.877 91.158 125.404 92.000 128.000 92.000 L 212.000 92.000 Z"),
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
        return _folderSimple!!
    }

private var _folderSimple: ImageVector? = null
