package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileLock: ImageVector
    get() {
        if (_fileLock != null) return _fileLock!!
        _fileLock = phosphorBoldIcon(
            name = "FileLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 168h-4v-4c0-17.673-14.327-32-32-32-17.673 0-32 14.327-32 32v4h-4c-6.627 0-12 5.373-12 12v44c0 6.627 5.373 12 12 12h72c6.627 0 12-5.373 12-12v-44c0-6.627-5.373-12-12-12ZM76 164c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v4h-16ZM108 212h-48v-20h48ZM216.49 79.52l-56-56C158.239 21.266 155.185 20 152 20h-96C44.954 20 36 28.954 36 40v68c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-64h76v48c0 6.627 5.373 12 12 12h48v108h-32c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h36c11.046 0 20-8.954 20-20v-128c-0-3.18-1.263-6.23-3.51-8.48ZM160 57l23 23h-23Z"),
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
        return _fileLock!!
    }

private var _fileLock: ImageVector? = null
