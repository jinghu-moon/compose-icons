package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Waveform: ImageVector
    get() {
        if (_waveform != null) return _waveform!!
        _waveform = phosphorDuotoneIcon(
            name = "Waveform",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 96v64h-160v-64Z"),
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
                pathData = parseSvgPathData("M56 96v64c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-64c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM88 24c-4.418 0-8 3.582-8 8v192c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-192c0-4.418-3.582-8-8-8ZM128 56c-4.418 0-8 3.582-8 8v128c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-128c0-4.418-3.582-8-8-8ZM168 88c-4.418 0-8 3.582-8 8v64c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-64c0-4.418-3.582-8-8-8ZM208 72c-4.418 0-8 3.582-8 8v96c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-96c0-4.418-3.582-8-8-8Z"),
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
        return _waveform!!
    }

private var _waveform: ImageVector? = null
