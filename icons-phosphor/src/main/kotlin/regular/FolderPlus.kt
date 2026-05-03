package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FolderPlus: ImageVector
    get() {
        if (_folderPlus != null) return _folderPlus!!
        _folderPlus = phosphorRegularIcon(
            name = "FolderPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 72.000 L 131.310 72.000 L 104.000 44.690 C 101.010 41.676 96.936 39.986 92.690 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.620 C 24.011 209.110 30.890 215.989 39.380 216.000 L 216.890 216.000 C 225.230 215.989 231.989 209.230 232.000 200.890 L 232.000 88.000 C 232.000 79.163 224.837 72.000 216.000 72.000 ZM 92.690 56.000 L 108.690 72.000 L 40.000 72.000 L 40.000 56.000 ZM 216.000 200.000 L 40.000 200.000 L 40.000 88.000 L 216.000 88.000 ZM 128.000 112.000 C 132.418 112.000 136.000 115.582 136.000 120.000 L 136.000 136.000 L 152.000 136.000 C 156.418 136.000 160.000 139.582 160.000 144.000 C 160.000 148.418 156.418 152.000 152.000 152.000 L 136.000 152.000 L 136.000 168.000 C 136.000 172.418 132.418 176.000 128.000 176.000 C 123.582 176.000 120.000 172.418 120.000 168.000 L 120.000 152.000 L 104.000 152.000 C 99.582 152.000 96.000 148.418 96.000 144.000 C 96.000 139.582 99.582 136.000 104.000 136.000 L 120.000 136.000 L 120.000 120.000 C 120.000 115.582 123.582 112.000 128.000 112.000 Z"),
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
