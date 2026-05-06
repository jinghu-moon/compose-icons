package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Backspace: ImageVector
    get() {
        if (_backspace != null) return _backspace!!
        _backspace = phosphorLightIcon(
            name = "Backspace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 42h-147.47c-4.917 .002-9.472 2.583-12 6.8L10.86 124.91c-1.142 1.902-1.142 4.278 0 6.18l45.67 76.11c2.528 4.217 7.083 6.798 12 6.8h147.47c7.732 0 14-6.268 14-14v-144c0-7.732-6.268-14-14-14ZM218 200c0 1.105-.895 2-2 2h-147.47c-.707-.008-1.357-.388-1.71-1h0L23 128 66.82 55c.353-.612 1.003-.992 1.71-1h147.47c1.105 0 2 .895 2 2ZM164.24 108.24 144.48 128l19.76 19.76c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L136 136.48l-19.76 19.76c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L127.52 128 107.76 108.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L136 119.52 155.76 99.76c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333Z"),
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
        return _backspace!!
    }

private var _backspace: ImageVector? = null
