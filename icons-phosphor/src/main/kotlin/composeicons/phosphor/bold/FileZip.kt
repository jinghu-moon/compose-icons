package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileZip: ImageVector
    get() {
        if (_fileZip != null) return _fileZip!!
        _fileZip = phosphorBoldIcon(
            name = "FileZip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 140h-16c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4h4c17.673 0 32-14.327 32-32 0-17.673-14.327-32-32-32ZM188 180h-4v-16h4c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM140 152v56c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-56c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM96 208c0 6.627-5.373 12-12 12h-32c-4.277-0-8.23-2.277-10.377-5.975-2.147-3.699-2.163-8.261-.043-11.975L63.32 164h-11.32c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h32c4.292-.01 8.263 2.273 10.413 5.988 2.15 3.715 2.153 8.295 .007 12.012L72.68 196h11.32c6.627 0 12 5.373 12 12ZM216.49 79.52l-56-56C158.239 21.266 155.185 20 152 20h-96C44.954 20 36 28.954 36 40v68c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-64h76v48c0 6.627 5.373 12 12 12h48v4c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-20c-0-3.18-1.263-6.23-3.51-8.48ZM160 80v-23l23 23Z"),
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
        return _fileZip!!
    }

private var _fileZip: ImageVector? = null
