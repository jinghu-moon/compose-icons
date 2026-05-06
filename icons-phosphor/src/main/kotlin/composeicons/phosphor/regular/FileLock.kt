package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FileLock: ImageVector
    get() {
        if (_fileLock != null) return _fileLock!!
        _fileLock = phosphorRegularIcon(
            name = "FileLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 176h-8v-4C112 156.536 99.464 144 84 144c-15.464 0-28 12.536-28 28v4h-8c-4.418 0-8 3.582-8 8v40c0 4.418 3.582 8 8 8h72c4.418 0 8-3.582 8-8v-40c0-4.418-3.582-8-8-8ZM72 172c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v4h-24ZM112 216h-56v-24h56ZM213.66 82.34l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v88c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-88h88v48c0 4.418 3.582 8 8 8h48v120h-40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h40c8.837 0 16-7.163 16-16v-128c.002-2.122-.84-4.158-2.34-5.66ZM160 51.31 188.69 80h-28.69Z"),
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
