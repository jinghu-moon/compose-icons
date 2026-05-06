package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Trolley: ImageVector
    get() {
        if (_trolley != null) return _trolley!!
        _trolley = phosphorLightIcon(
            name = "Trolley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M86 224c0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14ZM216 210c-7.732 0-14 6.268-14 14 0 7.732 6.268 14 14 14 7.732 0 14-6.268 14-14 0-7.732-6.268-14-14-14ZM240 178h-186v-102.69c.007-3.714-1.469-7.278-4.1-9.9L28.24 43.76C26.744 42.155 24.492 41.494 22.366 42.037c-2.126 .543-3.786 2.203-4.329 4.329-.543 2.126 .118 4.379 1.723 5.874L41.41 73.9c.376 .373 .588 .88 .59 1.41v102.69h-10c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h208c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _trolley!!
    }

private var _trolley: ImageVector? = null
