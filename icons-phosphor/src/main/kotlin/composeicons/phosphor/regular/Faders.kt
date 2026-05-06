package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Faders: ImageVector
    get() {
        if (_faders != null) return _faders!!
        _faders = phosphorRegularIcon(
            name = "Faders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 120v96c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-96c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM200 192c-4.418 0-8 3.582-8 8v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16c0-4.418-3.582-8-8-8ZM224 160h-16v-120c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v120h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM56 160c-4.418 0-8 3.582-8 8v48c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8ZM80 128h-16v-88c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v88h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM152 80h-16v-40c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v40h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _faders!!
    }

private var _faders: ImageVector? = null
