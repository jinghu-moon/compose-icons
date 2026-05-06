package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ListChecks: ImageVector
    get() {
        if (_listChecks != null) return _listChecks!!
        _listChecks = phosphorLightIcon(
            name = "ListChecks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 128c0 3.314-2.686 6-6 6h-88c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h88c3.314 0 6 2.686 6 6ZM128 70h88c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-88c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM216 186h-88c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h88c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM83.76 43.76 56 71.51 44.24 59.76c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333l16 16c2.343 2.34 6.137 2.34 8.48 0L92.24 52.24c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147ZM83.76 107.76 56 135.51 44.24 123.76c-1.496-1.605-3.748-2.266-5.874-1.723-2.126 .543-3.786 2.203-4.329 4.329-.543 2.126 .118 4.379 1.723 5.874l16 16c2.343 2.34 6.137 2.34 8.48 0L92.24 116.24c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147ZM83.76 171.76 56 199.51 44.24 187.76c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333l16 16c2.343 2.34 6.137 2.34 8.48 0l32-32c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147Z"),
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
        return _listChecks!!
    }

private var _listChecks: ImageVector? = null
