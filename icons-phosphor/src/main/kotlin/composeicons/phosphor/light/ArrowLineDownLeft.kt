package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowLineDownLeft: ImageVector
    get() {
        if (_arrowLineDownLeft != null) return _arrowLineDownLeft!!
        _arrowLineDownLeft = phosphorLightIcon(
            name = "ArrowLineDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 48c0 3.314-2.686 6-6 6h-176c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h176c3.314 0 6 2.686 6 6ZM179.76 91.76 78 193.52v-81.52c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v96c0 3.314 2.686 6 6 6h96c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-81.52L188.24 100.24c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147Z"),
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
        return _arrowLineDownLeft!!
    }

private var _arrowLineDownLeft: ImageVector? = null
