package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Slideshow: ImageVector
    get() {
        if (_slideshow != null) return _slideshow!!
        _slideshow = phosphorLightIcon(
            name = "Slideshow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 50h-128C56.268 50 50 56.268 50 64v128c0 7.732 6.268 14 14 14h128c7.732 0 14-6.268 14-14v-128c0-7.732-6.268-14-14-14ZM194 192c0 1.105-.895 2-2 2h-128c-1.105 0-2-.895-2-2v-128c0-1.105 .895-2 2-2h128c1.105 0 2 .895 2 2ZM238 56v144c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-144c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM30 56v144c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-144c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z"),
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
        return _slideshow!!
    }

private var _slideshow: ImageVector? = null
