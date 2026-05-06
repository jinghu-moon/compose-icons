package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileZip: ImageVector
    get() {
        if (_fileZip != null) return _fileZip!!
        _fileZip = phosphorDuotoneIcon(
            name = "FileZip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 88h-56v-56Z"),
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
                pathData = parseSvgPathData("M184 144h-16c-4.418 0-8 3.582-8 8v56c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h8c15.464 0 28-12.536 28-28 0-15.464-12.536-28-28-28ZM184 184h-8v-24h8c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM136 152v56c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-56c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM96 208c0 4.418-3.582 8-8 8h-32c-2.871 .026-5.536-1.489-6.982-3.969C47.571 209.551 47.564 206.486 49 204L74.16 160h-18.16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32c2.871-.026 5.536 1.489 6.982 3.969 1.447 2.48 1.453 5.545 .018 8.031L69.79 200h18.21c4.418 0 8 3.582 8 8ZM213.66 82.34l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v72c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-72h88v48c0 4.418 3.582 8 8 8h48v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24c.002-2.122-.84-4.158-2.34-5.66ZM160 80v-28.69L188.69 80Z"),
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
