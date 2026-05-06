package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsOutCardinal: ImageVector
    get() {
        if (_arrowsOutCardinal != null) return _arrowsOutCardinal!!
        _arrowsOutCardinal = phosphorLightIcon(
            name = "ArrowsOutCardinal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M91.76 60.24c-2.34-2.343-2.34-6.137 0-8.48l32-32c2.343-2.34 6.137-2.34 8.48 0l32 32c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L134 38.49v57.51c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-57.51L100.24 60.24c-2.343 2.34-6.137 2.34-8.48 0ZM155.76 195.76 134 217.51v-57.51c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v57.51L100.24 195.76c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333l32 32c2.343 2.34 6.137 2.34 8.48 0l32-32c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147ZM236.24 123.76l-32-32c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L217.51 122h-57.51c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h57.51l-21.75 21.76c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723l32-32c2.34-2.343 2.34-6.137 0-8.48ZM38.49 134h57.51c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-57.51L60.24 100.24c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147l-32 32c-2.34 2.343-2.34 6.137 0 8.48l32 32c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333Z"),
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
        return _arrowsOutCardinal!!
    }

private var _arrowsOutCardinal: ImageVector? = null
