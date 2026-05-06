package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FilePpt: ImageVector
    get() {
        if (_filePpt != null) return _filePpt!!
        _filePpt = phosphorBoldIcon(
            name = "FilePpt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 152c0 6.627-5.373 12-12 12h-8v44c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-44h-8c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12ZM92 172c0 17.673-14.327 32-32 32h-4v4c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-56c0-6.627 5.373-12 12-12h16c17.673 0 32 14.327 32 32ZM68 172c0-4.418-3.582-8-8-8h-4v16h4c4.418 0 8-3.582 8-8ZM164 172c0 17.673-14.327 32-32 32h-4v4c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-56c0-6.627 5.373-12 12-12h16c17.673 0 32 14.327 32 32ZM140 172c0-4.418-3.582-8-8-8h-4v16h4c4.418 0 8-3.582 8-8ZM36 108v-68C36 28.954 44.954 20 56 20h96c3.185 0 6.239 1.266 8.49 3.52l56 56c2.247 2.25 3.51 5.3 3.51 8.48v20c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-4h-48c-6.627 0-12-5.373-12-12v-48h-76v64c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM160 80h23L160 57Z"),
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
        return _filePpt!!
    }

private var _filePpt: ImageVector? = null
