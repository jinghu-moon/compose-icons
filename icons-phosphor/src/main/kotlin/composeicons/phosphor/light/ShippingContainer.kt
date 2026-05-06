package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShippingContainer: ImageVector
    get() {
        if (_shippingContainer != null) return _shippingContainer!!
        _shippingContainer = phosphorLightIcon(
            name = "ShippingContainer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.85 72.57 129.65 42.23c-.812-.232-1.664-.29-2.5-.17L22 57.08C15.126 58.102 10.028 63.99 10 70.94v114.12c.028 6.95 5.126 12.838 12 13.86l105.13 15c.282 .04 .566 .06 .85 .06 .558-.001 1.113-.079 1.65-.23L235.83 183.41C241.816 181.687 245.955 176.229 246 170v-84c-.033-6.231-4.164-11.697-10.15-13.43ZM96 122h-18v-60.8l44-6.28v146.16L78 194.8v-60.8h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM22 185.06v-114.12c-.01-1.004 .726-1.86 1.72-2L66 62.94v59.06h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v59.08l-42.28-6c-1.002-.141-1.74-1.009-1.72-2.02ZM234 170c-.001 .892-.593 1.675-1.45 1.92L134 200.05v-144.05l98.55 28.16c.83 .236 1.414 .978 1.45 1.84Z"),
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
        return _shippingContainer!!
    }

private var _shippingContainer: ImageVector? = null
