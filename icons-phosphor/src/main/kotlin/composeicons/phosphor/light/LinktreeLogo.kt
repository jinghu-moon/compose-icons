package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LinktreeLogo: ImageVector
    get() {
        if (_linktreeLogo != null) return _linktreeLogo!!
        _linktreeLogo = phosphorLightIcon(
            name = "LinktreeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M134 160v72c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-72c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM208 98h-65.52L188.24 52.24c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147L134 89.52v-65.52c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v65.52L76.24 43.76c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L113.52 98h-65.52c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h65.52L67.76 155.76c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723L128 112.48l51.76 51.76c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333L142.48 110h65.52c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _linktreeLogo!!
    }

private var _linktreeLogo: ImageVector? = null
