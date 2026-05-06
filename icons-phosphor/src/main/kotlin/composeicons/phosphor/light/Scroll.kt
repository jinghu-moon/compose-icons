package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Scroll: ImageVector
    get() {
        if (_scroll != null) return _scroll!!
        _scroll = phosphorLightIcon(
            name = "Scroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M98 136c0-3.314 2.686-6 6-6h64c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-64c-3.314 0-6-2.686-6-6ZM104 110h64c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-64c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM230 192c0 16.569-13.431 30-30 30h-112C71.431 222 58 208.569 58 192v-128C58 54.059 49.941 46 40 46 30.059 46 22 54.059 22 64c0 6.76 5.58 11.19 5.64 11.23 2.643 1.999 3.164 5.762 1.165 8.405-1.999 2.643-5.762 3.164-8.405 1.165C20 84.48 10 76.85 10 64 10 47.431 23.431 34 40 34h136c16.569 0 30 13.431 30 30v106h10c1.298 0 2.561 .421 3.6 1.2C220 171.52 230 179.15 230 192ZM106 192c0-6.76-5.59-11.19-5.64-11.23-2.046-1.561-2.868-4.253-2.044-6.691 .824-2.438 3.111-4.079 5.684-4.079h90v-106c0-9.941-8.059-18-18-18h-112c3.906 5.187 6.013 11.507 6 18v128c0 9.941 8.059 18 18 18 9.941 0 18-8.059 18-18ZM218 192c-.136-3.761-1.685-7.332-4.34-10h-97.78c1.393 3.15 2.115 6.556 2.12 10 .009 6.493-2.097 12.812-6 18h88c9.941 0 18-8.059 18-18Z"),
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
        return _scroll!!
    }

private var _scroll: ImageVector? = null
