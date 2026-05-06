package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Screencast: ImageVector
    get() {
        if (_screencast != null) return _screencast!!
        _screencast = phosphorLightIcon(
            name = "Screencast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 56v144c0 7.732-6.268 14-14 14h-72c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h72c1.105 0 2-.895 2-2v-144c0-1.105-.895-2-2-2h-176c-1.105 0-2 .895-2 2v40c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-40C26 48.268 32.268 42 40 42h176c7.732 0 14 6.268 14 14ZM32 186c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 5.523 0 10 4.477 10 10 0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C54 195.85 44.15 186 32 186ZM32 154c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 23.196 0 42 18.804 42 42 0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C85.967 178.19 61.81 154.033 32 154ZM32 122c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 40.849 .05 73.95 33.151 74 74 0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C117.945 160.526 79.474 122.055 32 122Z"),
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
        return _screencast!!
    }

private var _screencast: ImageVector? = null
