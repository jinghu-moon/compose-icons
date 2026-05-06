package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsOutLineHorizontal: ImageVector
    get() {
        if (_arrowsOutLineHorizontal != null) return _arrowsOutLineHorizontal!!
        _arrowsOutLineHorizontal = phosphorLightIcon(
            name = "ArrowsOutLineHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M134 40v176c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-176c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM96 122h-65.51L52.24 100.24c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147l-32 32c-2.34 2.343-2.34 6.137 0 8.48l32 32c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333L30.49 134h65.51c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM244.24 123.76l-32-32c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L225.51 122h-65.51c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h65.51l-21.75 21.76c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723l32-32c2.34-2.343 2.34-6.137 0-8.48Z"),
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
        return _arrowsOutLineHorizontal!!
    }

private var _arrowsOutLineHorizontal: ImageVector? = null
