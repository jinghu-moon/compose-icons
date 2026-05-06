package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tornado: ImageVector
    get() {
        if (_tornado != null) return _tornado!!
        _tornado = phosphorLightIcon(
            name = "Tornado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 40c0 3.314-2.686 6-6 6h-168c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h168c3.314 0 6 2.686 6 6ZM182 72c0-3.314-2.686-6-6-6h-144c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h144c3.314 0 6-2.686 6-6ZM166 104c0-3.314-2.686-6-6-6h-104c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h104c3.314 0 6-2.686 6-6ZM182 136c0-3.314-2.686-6-6-6h-88c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h88c3.314 0 6-2.686 6-6ZM184 162h-64c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h64c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM160 194h-32c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h32c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM128 226h-16c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h16c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _tornado!!
    }

private var _tornado: ImageVector? = null
