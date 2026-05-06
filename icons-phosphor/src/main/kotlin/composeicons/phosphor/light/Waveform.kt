package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Waveform: ImageVector
    get() {
        if (_waveform != null) return _waveform!!
        _waveform = phosphorLightIcon(
            name = "Waveform",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M54 96v64c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-64c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM88 26c-3.314 0-6 2.686-6 6v192c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-192c0-3.314-2.686-6-6-6ZM128 58c-3.314 0-6 2.686-6 6v128c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-128c0-3.314-2.686-6-6-6ZM168 90c-3.314 0-6 2.686-6 6v64c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-64c0-3.314-2.686-6-6-6ZM208 74c-3.314 0-6 2.686-6 6v96c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-96c0-3.314-2.686-6-6-6Z"),
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
