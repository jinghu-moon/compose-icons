package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sun: ImageVector
    get() {
        if (_sun != null) return _sun!!
        _sun = phosphorLightIcon(
            name = "Sun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M122 40v-24c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v24c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM190 128c0 34.242-27.758 62-62 62C93.758 190 66 162.242 66 128 66 93.758 93.758 66 128 66c34.226 .039 61.961 27.774 62 62ZM178 128C178 100.386 155.614 78 128 78c-27.614 0-50 22.386-50 50 0 27.614 22.386 50 50 50 27.601-.033 49.967-22.399 50-50ZM59.76 68.24c1.496 1.605 3.748 2.266 5.874 1.723 2.126-.543 3.786-2.203 4.329-4.329 .543-2.126-.118-4.379-1.723-5.874l-16-16c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333ZM59.76 187.76l-16 16c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723l16-16c1.605-1.496 2.266-3.748 1.723-5.874-.543-2.126-2.203-3.786-4.329-4.329-2.126-.543-4.379 .118-5.874 1.723ZM192 70c1.591-.001 3.116-.634 4.24-1.76l16-16c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147l-16 16c-1.714 1.716-2.226 4.295-1.298 6.535 .928 2.241 3.113 3.702 5.538 3.705ZM196.24 187.76c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333l16 16c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333ZM46 128c0-3.314-2.686-6-6-6h-24c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h24c3.314 0 6-2.686 6-6ZM128 210c-3.314 0-6 2.686-6 6v24c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-24c0-3.314-2.686-6-6-6ZM240 122h-24c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h24c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _sun!!
    }

private var _sun: ImageVector? = null
