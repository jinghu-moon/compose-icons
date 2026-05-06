package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Waveform: ImageVector
    get() {
        if (_waveform != null) return _waveform!!
        _waveform = phosphorBoldIcon(
            name = "Waveform",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M60 96v64c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-64C36 89.373 41.373 84 48 84c6.627 0 12 5.373 12 12ZM88 20C81.373 20 76 25.373 76 32v192c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-192C100 25.373 94.627 20 88 20ZM128 52c-6.627 0-12 5.373-12 12v128c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-128c0-6.627-5.373-12-12-12ZM168 84c-6.627 0-12 5.373-12 12v64c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-64c0-6.627-5.373-12-12-12ZM208 68c-6.627 0-12 5.373-12 12v96c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-96c0-6.627-5.373-12-12-12Z"),
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
