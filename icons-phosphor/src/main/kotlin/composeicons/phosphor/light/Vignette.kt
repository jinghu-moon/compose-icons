package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Vignette: ImageVector
    get() {
        if (_vignette != null) return _vignette!!
        _vignette = phosphorLightIcon(
            name = "Vignette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 42h-176C32.268 42 26 48.268 26 56v144c0 7.732 6.268 14 14 14h176c7.732 0 14-6.268 14-14v-144c0-7.732-6.268-14-14-14ZM218 200c0 1.105-.895 2-2 2h-176c-1.105 0-2-.895-2-2v-144c0-1.105 .895-2 2-2h176c1.105 0 2 .895 2 2ZM128 74C89.4 74 58 98.22 58 128c0 29.78 31.4 54 70 54 38.6 0 70-24.22 70-54C198 98.22 166.6 74 128 74ZM128 170C96 170 70 151.16 70 128 70 104.84 96 86 128 86c32 0 58 18.84 58 42 0 23.16-26 42-58 42Z"),
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
        return _vignette!!
    }

private var _vignette: ImageVector? = null
