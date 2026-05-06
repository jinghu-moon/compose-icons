package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FolderSimpleMinus: ImageVector
    get() {
        if (_folderSimpleMinus != null) return _folderSimpleMinus!!
        _folderSimpleMinus = phosphorThinIcon(
            name = "FolderSimpleMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 76h-86.67L100.53 54.4C98.451 52.845 95.926 52.004 93.33 52h-53.33C33.373 52 28 57.373 28 64v136c0 6.627 5.373 12 12 12h176.89c6.134-.006 11.104-4.976 11.11-11.11v-112.89c0-6.627-5.373-12-12-12ZM220 200.89c-.005 1.715-1.395 3.105-3.11 3.11h-176.89c-2.209 0-4-1.791-4-4v-136c0-2.209 1.791-4 4-4h53.33c.865 0 1.708 .281 2.4 .8l29.87 22.4c.692 .519 1.535 .8 2.4 .8h88c2.209 0 4 1.791 4 4ZM156 144c0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4Z"),
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
        return _folderSimpleMinus!!
    }

private var _folderSimpleMinus: ImageVector? = null
