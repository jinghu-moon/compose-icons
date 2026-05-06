package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Usb: ImageVector
    get() {
        if (_usb != null) return _usb!!
        _usb = phosphorLightIcon(
            name = "Usb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M251.33 123l-48-32c-1.842-1.229-4.212-1.344-6.164-.297C195.214 91.749 193.997 93.785 194 96v26h-124v-50c0-1.105 .895-2 2-2h34.6c3.08 15.09 17.086 25.396 32.409 23.848C154.332 92.3 165.994 79.401 165.994 64c0-15.401-11.662-28.3-26.985-29.848C123.686 32.604 109.68 42.91 106.6 58h-34.6C64.268 58 58 64.268 58 72v50h-50c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h50v50c0 7.732 6.268 14 14 14h34v10c0 7.732 6.268 14 14 14h32c7.732 0 14-6.268 14-14v-32c0-7.732-6.268-14-14-14h-32c-7.732 0-14 6.268-14 14v10h-34c-1.105 0-2-.895-2-2v-50h124v26c-.003 2.215 1.214 4.251 3.166 5.297 1.952 1.046 4.322 .932 6.164-.297l48-32c1.676-1.112 2.683-2.989 2.683-5 0-2.011-1.008-3.888-2.683-5ZM136 46c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18ZM118 176c0-1.105 .895-2 2-2h32c1.105 0 2 .895 2 2v32c0 1.105-.895 2-2 2h-32c-1.105 0-2-.895-2-2ZM206 148.79v-41.58L237.18 128Z"),
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
        return _usb!!
    }

private var _usb: ImageVector? = null
