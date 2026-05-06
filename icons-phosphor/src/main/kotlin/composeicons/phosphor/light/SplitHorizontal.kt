package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SplitHorizontal: ImageVector
    get() {
        if (_splitHorizontal != null) return _splitHorizontal!!
        _splitHorizontal = phosphorLightIcon(
            name = "SplitHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M110 48v160c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-74h-59.51l21.75 21.76c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723l-32-32c-2.34-2.343-2.34-6.137 0-8.48l32-32c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333L38.49 122h59.51v-74c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM236.24 123.76l-32-32c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L217.51 122h-59.51v-74c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v160c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-74h59.51l-21.75 21.76c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723l32-32c2.34-2.343 2.34-6.137 0-8.48Z"),
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
        return _splitHorizontal!!
    }

private var _splitHorizontal: ImageVector? = null
