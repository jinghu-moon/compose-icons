package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileArchive: ImageVector
    get() {
        if (_fileArchive != null) return _fileArchive!!
        _fileArchive = phosphorDuotoneIcon(
            name = "FileArchive",
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
                pathData = parseSvgPathData("M213.66 82.34l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v176c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-128c.002-2.122-.84-4.158-2.34-5.66ZM160 51.31 188.69 80h-28.69ZM200 216h-88v-16h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-8v-16h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-8v-16h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-8v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8v16h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8v16h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8v16h-40v-176h88v48c0 4.418 3.582 8 8 8h48v120Z"),
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
        return _fileArchive!!
    }

private var _fileArchive: ImageVector? = null
