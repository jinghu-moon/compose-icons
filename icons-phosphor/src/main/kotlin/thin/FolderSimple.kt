package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FolderSimple: ImageVector
    get() {
        if (_folderSimple != null) return _folderSimple!!
        _folderSimple = phosphorThinIcon(
            name = "FolderSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 76.000 L 129.330 76.000 L 100.530 54.400 C 98.451 52.845 95.926 52.004 93.330 52.000 L 40.000 52.000 C 33.373 52.000 28.000 57.373 28.000 64.000 L 28.000 200.000 C 28.000 206.627 33.373 212.000 40.000 212.000 L 216.890 212.000 C 223.024 211.994 227.994 207.024 228.000 200.890 L 228.000 88.000 C 228.000 81.373 222.627 76.000 216.000 76.000 ZM 220.000 200.890 C 219.995 202.605 218.605 203.995 216.890 204.000 L 40.000 204.000 C 37.791 204.000 36.000 202.209 36.000 200.000 L 36.000 64.000 C 36.000 61.791 37.791 60.000 40.000 60.000 L 93.330 60.000 C 94.195 60.000 95.038 60.281 95.730 60.800 L 125.600 83.200 C 126.292 83.719 127.135 84.000 128.000 84.000 L 216.000 84.000 C 218.209 84.000 220.000 85.791 220.000 88.000 Z"),
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
