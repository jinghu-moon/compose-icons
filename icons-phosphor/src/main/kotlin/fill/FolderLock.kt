package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FolderLock: ImageVector
    get() {
        if (_folderLock != null) return _folderLock!!
        _folderLock = phosphorFillIcon(
            name = "FolderLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 72.000 L 131.310 72.000 L 104.000 44.690 C 101.010 41.676 96.936 39.986 92.690 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.620 C 24.011 209.110 30.890 215.989 39.380 216.000 L 112.560 216.000 C 116.978 216.000 120.560 212.418 120.560 208.000 C 120.560 203.582 116.978 200.000 112.560 200.000 L 40.000 200.000 L 40.000 88.000 L 216.000 88.000 L 216.000 104.000 C 216.000 108.418 219.582 112.000 224.000 112.000 C 228.418 112.000 232.000 108.418 232.000 104.000 L 232.000 88.000 C 232.000 79.163 224.837 72.000 216.000 72.000 ZM 40.000 72.000 L 40.000 56.000 L 92.690 56.000 L 108.690 72.000 ZM 224.000 160.000 L 216.000 160.000 L 216.000 156.000 C 216.000 140.536 203.464 128.000 188.000 128.000 C 172.536 128.000 160.000 140.536 160.000 156.000 L 160.000 160.000 L 152.000 160.000 C 147.582 160.000 144.000 163.582 144.000 168.000 L 144.000 208.000 C 144.000 212.418 147.582 216.000 152.000 216.000 L 224.000 216.000 C 228.418 216.000 232.000 212.418 232.000 208.000 L 232.000 168.000 C 232.000 163.582 228.418 160.000 224.000 160.000 ZM 200.000 160.000 L 176.000 160.000 L 176.000 156.000 C 176.000 149.373 181.373 144.000 188.000 144.000 C 194.627 144.000 200.000 149.373 200.000 156.000 Z"),
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
        return _folderLock!!
    }

private var _folderLock: ImageVector? = null
