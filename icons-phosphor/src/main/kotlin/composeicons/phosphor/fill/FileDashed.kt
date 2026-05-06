package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileDashed: ImageVector
    get() {
        if (_fileDashed != null) return _fileDashed!!
        _fileDashed = phosphorFillIcon(
            name = "FileDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 224c0 4.418-3.582 8-8 8h-16c-8.837 0-16-7.163-16-16v-32c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v32h16c4.418 0 8 3.582 8 8ZM213.66 82.34l-56-56C156.158 24.84 154.122 23.998 152 24h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24v48c0 4.418 3.582 8 8 8h48v40c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48c.002-2.122-.84-4.158-2.34-5.66ZM80 24h-24C47.163 24 40 31.163 40 40v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM208 168c-4.418 0-8 3.582-8 8v40h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8c8.837 0 16-7.163 16-16v-40c0-4.418-3.582-8-8-8ZM48 152c4.418 0 8-3.582 8-8v-40c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v40c0 4.418 3.582 8 8 8ZM152 216h-40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h40c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _fileDashed!!
    }

private var _fileDashed: ImageVector? = null
