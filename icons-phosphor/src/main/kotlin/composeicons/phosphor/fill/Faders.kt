package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Faders: ImageVector
    get() {
        if (_faders != null) return _faders!!
        _faders = phosphorFillIcon(
            name = "Faders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 120v96c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-96c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM200 192c-4.418 0-8 3.582-8 8v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16c0-4.418-3.582-8-8-8ZM224 144h-16v-104c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v104h-16c-4.418 0-8 3.582-8 8v16c0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8v-16c0-4.418-3.582-8-8-8ZM56 160c-4.418 0-8 3.582-8 8v48c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8ZM80 112h-16v-72c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v72h-16c-4.418 0-8 3.582-8 8v16c0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8v-16c0-4.418-3.582-8-8-8ZM152 64h-16v-24c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v24h-16c-4.418 0-8 3.582-8 8v16c0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8v-16c0-4.418-3.582-8-8-8Z"),
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
