package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FolderSimpleDashed: ImageVector
    get() {
        if (_folderSimpleDashed != null) return _folderSimpleDashed!!
        _folderSimpleDashed = phosphorRegularIcon(
            name = "FolderSimpleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M24 80v-16C24 55.163 31.163 48 40 48h53.33c3.461 .009 6.826 1.131 9.6 3.2l29.87 22.4c3.535 2.651 4.251 7.665 1.6 11.2-2.651 3.535-7.665 4.251-11.2 1.6L93.33 64h-53.33v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM88 200h-48v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8.62c.011 8.49 6.89 15.369 15.38 15.38h48.62c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM160 200h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM224 144c-4.418 0-8 3.582-8 8v48h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16.89c8.34-.011 15.099-6.77 15.11-15.11v-48.89c0-4.418-3.582-8-8-8ZM216 72h-48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h48v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24c0-8.837-7.163-16-16-16ZM32 160c4.418 0 8-3.582 8-8v-32c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v32c0 4.418 3.582 8 8 8Z"),
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
        return _folderSimpleDashed!!
    }

private var _folderSimpleDashed: ImageVector? = null
