package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sword: ImageVector
    get() {
        if (_sword != null) return _sword!!
        _sword = phosphorLightIcon(
            name = "Sword",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 34h-64c-1.864-.002-3.623 .863-4.76 2.34L81.85 121.34 70.6 110.1c-2.626-2.626-6.187-4.101-9.9-4.101-3.713 0-7.274 1.475-9.9 4.101L38.1 122.8c-2.629 2.626-4.106 6.189-4.106 9.905 0 3.716 1.477 7.279 4.106 9.905h0L59.51 164 30.1 193.42c-2.626 2.626-4.101 6.187-4.101 9.9 0 3.713 1.475 7.274 4.101 9.9l12.69 12.69c2.626 2.626 6.187 4.101 9.9 4.101 3.713 0 7.274-1.475 9.9-4.101L92 196.5l21.4 21.4c2.626 2.626 6.187 4.101 9.9 4.101 3.713 0 7.274-1.475 9.9-4.101l12.7-12.69c2.629-2.626 4.106-6.189 4.106-9.905 0-3.716-1.477-7.279-4.106-9.905L134.65 174.15l85-65.39c1.481-1.135 2.349-2.894 2.35-4.76v-64c0-3.314-2.686-6-6-6ZM54.1 217.42c-.375 .376-.884 .587-1.415 .587-.531 0-1.04-.211-1.415-.587L38.59 204.73c-.775-.78-.775-2.04 0-2.82L68 172.5 83.51 188ZM137.41 196.72l-12.69 12.7c-.376 .379-.887 .592-1.42 .592-.533 0-1.044-.213-1.42-.592L46.59 134.12h0c-.376-.375-.587-.884-.587-1.415 0-.531 .211-1.04 .587-1.415L59.28 118.59c.376-.379 .887-.592 1.42-.592 .533 0 1.044 .213 1.42 .592l75.29 75.3c.376 .375 .587 .884 .587 1.415 0 .531-.211 1.04-.587 1.415ZM210 101.05l-83.91 64.55L112.49 152l51.75-51.76c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147L104 143.51 90.4 129.91 155 46h55Z"),
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
        return _sword!!
    }

private var _sword: ImageVector? = null
