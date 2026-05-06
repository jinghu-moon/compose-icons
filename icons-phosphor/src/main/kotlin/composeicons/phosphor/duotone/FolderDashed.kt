package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FolderDashed: ImageVector
    get() {
        if (_folderDashed != null) return _folderDashed!!
        _folderDashed = phosphorDuotoneIcon(
            name = "FolderDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 80h-96v-24c0-4.418 3.582-8 8-8h52.69c2.119 .001 4.151 .843 5.65 2.34Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M96 208c0 4.418-3.582 8-8 8h-48.62C30.89 215.989 24.011 209.11 24 200.62v-8.62c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v8h48c4.418 0 8 3.582 8 8ZM160 200h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM224 144c-4.418 0-8 3.582-8 8v48h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16.89c8.34-.011 15.099-6.77 15.11-15.11v-48.89c0-4.418-3.582-8-8-8ZM216 72h-48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h48v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24c0-8.837-7.163-16-16-16ZM24 80v-24C24 47.163 31.163 40 40 40h52.69c4.246-.014 8.32 1.676 11.31 4.69l29.66 29.65c2.291 2.288 2.976 5.731 1.737 8.722C134.158 86.053 131.238 88.003 128 88h-96c-4.418 0-8-3.582-8-8ZM40 72h68.69l-16-16h-52.69ZM32 160c4.418 0 8-3.582 8-8v-32c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v32c0 4.418 3.582 8 8 8Z"),
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
        return _folderDashed!!
    }

private var _folderDashed: ImageVector? = null
