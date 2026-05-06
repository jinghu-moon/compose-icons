package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileDashed: ImageVector
    get() {
        if (_fileDashed != null) return _fileDashed!!
        _fileDashed = phosphorDuotoneIcon(
            name = "FileDashed",
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
                pathData = parseSvgPathData("M80 224c0 4.418-3.582 8-8 8h-16c-8.837 0-16-7.163-16-16v-32c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v32h16c4.418 0 8 3.582 8 8ZM216 88v48c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-40h-48c-4.418 0-8-3.582-8-8v-48h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32c2.122-.002 4.158 .84 5.66 2.34l56 56c1.5 1.502 2.342 3.538 2.34 5.66ZM160 80h28.69L160 51.31ZM80 24h-24C47.163 24 40 31.163 40 40v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM208 168c-4.418 0-8 3.582-8 8v40h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8c8.837 0 16-7.163 16-16v-40c0-4.418-3.582-8-8-8ZM48 152c4.418 0 8-3.582 8-8v-40c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v40c0 4.418 3.582 8 8 8ZM152 216h-40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h40c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
