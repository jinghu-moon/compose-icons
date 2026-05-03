package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FolderMinus: ImageVector
    get() {
        if (_folderMinus != null) return _folderMinus!!
        _folderMinus = phosphorFillIcon(
            name = "FolderMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 72.000 L 131.310 72.000 L 104.000 44.690 C 101.008 41.678 96.935 39.989 92.690 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.620 C 24.017 209.111 30.899 215.989 39.390 216.000 L 216.890 216.000 C 225.230 215.989 231.989 209.230 232.000 200.890 L 232.000 88.000 C 232.000 79.163 224.837 72.000 216.000 72.000 ZM 40.000 56.000 L 92.690 56.000 L 108.690 72.000 L 40.000 72.000 ZM 152.000 152.000 L 104.000 152.000 C 99.582 152.000 96.000 148.418 96.000 144.000 C 96.000 139.582 99.582 136.000 104.000 136.000 L 152.000 136.000 C 156.418 136.000 160.000 139.582 160.000 144.000 C 160.000 148.418 156.418 152.000 152.000 152.000 Z"),
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
        return _folderMinus!!
    }

private var _folderMinus: ImageVector? = null
