package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Keyboard: ImageVector
    get() {
        if (_keyboard != null) return _keyboard!!
        _keyboard = phosphorLightIcon(
            name = "Keyboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 50h-192C24.268 50 18 56.268 18 64v128c0 7.732 6.268 14 14 14h192c7.732 0 14-6.268 14-14v-128c0-7.732-6.268-14-14-14ZM226 192c0 1.105-.895 2-2 2h-192c-1.105 0-2-.895-2-2v-128c0-1.105 .895-2 2-2h192c1.105 0 2 .895 2 2ZM206 128c0 3.314-2.686 6-6 6h-144c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h144c3.314 0 6 2.686 6 6ZM206 96c0 3.314-2.686 6-6 6h-144c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h144c3.314 0 6 2.686 6 6ZM70 160c0 3.314-2.686 6-6 6h-8c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h8c3.314 0 6 2.686 6 6ZM166 160c0 3.314-2.686 6-6 6h-64c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h64c3.314 0 6 2.686 6 6ZM206 160c0 3.314-2.686 6-6 6h-8c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h8c3.314 0 6 2.686 6 6Z"),
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
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
