package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudSlash: ImageVector
    get() {
        if (_cloudSlash != null) return _cloudSlash!!
        _cloudSlash = phosphorLightIcon(
            name = "CloudSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52.44 36c-2.277-2.113-5.79-2.139-8.098-.06-2.308 2.079-2.647 5.576-.782 8.06L83.74 88.2c-.45 .87-.9 1.75-1.32 2.64C59.395 87.012 36.171 96.44 22.329 115.234 8.488 134.029 6.375 159.004 16.862 179.857 27.349 200.709 48.659 213.905 72 214h88c11.091 .025 22.079-2.115 32.35-6.3L203.56 220c2.231 2.452 6.028 2.631 8.48 .4 2.452-2.231 2.631-6.028 .4-8.48ZM160 202h-88C53.409 202.033 36.335 191.749 27.672 175.3c-8.663-16.449-7.485-36.346 3.059-51.658C41.275 108.331 59.443 100.133 77.9 102.36 75.315 110.661 74 119.306 74 128c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6-.003-10.408 2.191-20.699 6.44-30.2l91.22 100.34c-7.623 2.57-15.615 3.874-23.66 3.86ZM246 128c.012 21.128-7.768 41.519-21.85 57.27-1.138 1.272-2.763 1.999-4.47 2-2.366-.001-4.51-1.392-5.476-3.551-.965-2.16-.572-4.685 1.006-6.449 25.21-28.265 25.009-71.002-.465-99.029C189.271 50.214 146.747 45.946 116.21 68.35c-2.67 1.963-6.427 1.39-8.39-1.28-1.963-2.67-1.39-6.427 1.28-8.39 26.13-19.187 60.829-22.05 89.75-7.405C227.771 65.919 246 95.582 246 128Z"),
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
        return _cloudSlash!!
    }

private var _cloudSlash: ImageVector? = null
