package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsInCardinal: ImageVector
    get() {
        if (_arrowsInCardinal != null) return _arrowsInCardinal!!
        _arrowsInCardinal = phosphorLightIcon(
            name = "ArrowsInCardinal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M91.76 68.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L122 81.51v-57.51c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v57.51L155.76 59.76c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333l-32 32c-2.343 2.34-6.137 2.34-8.48 0ZM132.24 155.76c-2.343-2.34-6.137-2.34-8.48 0l-32 32c-2.203 2.364-2.138 6.048 .147 8.333 2.285 2.285 5.969 2.35 8.333 .147L122 174.49v57.51c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-57.51l21.76 21.75c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333ZM232 122h-57.51l21.75-21.76c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147l-32 32c-2.34 2.343-2.34 6.137 0 8.48l32 32c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333L174.49 134h57.51c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM100.24 123.76l-32-32c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L81.51 122h-57.51c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h57.51L59.76 155.76c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723l32-32c2.34-2.343 2.34-6.137 0-8.48Z"),
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
        return _arrowsInCardinal!!
    }

private var _arrowsInCardinal: ImageVector? = null
