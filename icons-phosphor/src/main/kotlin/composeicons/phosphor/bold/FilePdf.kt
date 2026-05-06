package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FilePdf: ImageVector
    get() {
        if (_filePdf != null) return _filePdf!!
        _filePdf = phosphorBoldIcon(
            name = "FilePdf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 164v8h12c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-12v12c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-56c0-6.627 5.373-12 12-12h32c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM92 172c0 17.673-14.327 32-32 32h-4v4c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-56c0-6.627 5.373-12 12-12h16c17.673 0 32 14.327 32 32ZM68 172c0-4.418-3.582-8-8-8h-4v16h4c4.418 0 8-3.582 8-8ZM168 180c0 22.091-17.909 40-40 40h-16c-6.627 0-12-5.373-12-12v-56c0-6.627 5.373-12 12-12h16c22.091 0 40 17.909 40 40ZM144 180c0-8.837-7.163-16-16-16h-4v32h4c8.837 0 16-7.163 16-16ZM36 108v-68C36 28.954 44.954 20 56 20h96c3.185 0 6.239 1.266 8.49 3.52l56 56c2.247 2.25 3.51 5.3 3.51 8.48v20c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-4h-48c-6.627 0-12-5.373-12-12v-48h-76v64c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM160 57v23h23Z"),
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
        return _filePdf!!
    }

private var _filePdf: ImageVector? = null
