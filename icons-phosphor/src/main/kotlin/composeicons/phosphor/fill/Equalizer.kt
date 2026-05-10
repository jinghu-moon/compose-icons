package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Equalizer: ImageVector
    get() {
        if (_equalizer != null) return _equalizer!!
        _equalizer = phosphorFillIcon(
            name = "Equalizer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 96c0 4.418-3.582 8-8 8h-48c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h48c4.418 0 8 3.582 8 8ZM152 120h-48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM184 72h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM72 120h-48c-4.418 0-8 3.582-8 8v64c0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8v-64c0-4.418-3.582-8-8-8ZM232 88h-48c-4.418 0-8 3.582-8 8v96c0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8v-96c0-4.418-3.582-8-8-8ZM152 152h-48c-4.418 0-8 3.582-8 8v32c0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8v-32c0-4.418-3.582-8-8-8Z"),
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
        return _equalizer!!
    }

private var _equalizer: ImageVector? = null
