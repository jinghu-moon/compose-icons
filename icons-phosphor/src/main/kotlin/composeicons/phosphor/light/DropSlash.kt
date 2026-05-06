package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DropSlash: ImageVector
    get() {
        if (_dropSlash != null) return _dropSlash!!
        _dropSlash = phosphorLightIcon(
            name = "DropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52.44 36c-2.277-2.113-5.79-2.139-8.098-.06-2.308 2.079-2.647 5.576-.782 8.06L67.26 70.07C50.51 94.93 42 119.77 42 144c.004 34.903 21.102 66.343 53.401 79.573 32.299 13.23 69.39 5.627 93.879-19.243L203.56 220c2.231 2.452 6.028 2.631 8.48 .4 2.452-2.231 2.631-6.028 .4-8.48ZM128 218C87.151 217.95 54.05 184.849 54 144c0-21 7.27-42.76 21.59-64.73L181.18 195.42C167.258 209.86 148.058 218.012 128 218ZM91.4 49.07C90.246 47.971 89.577 46.459 89.54 44.866c-.038-1.593 .56-3.135 1.66-4.286C101.404 29.76 112.57 19.89 124.56 11.09c2.066-1.445 4.814-1.445 6.88 0 15.068 11.098 28.85 23.844 41.09 38C199.66 80.26 214 113.09 214 144c.003 7.727-1.033 15.419-3.08 22.87-.715 2.603-3.081 4.408-5.78 4.41-.537-.001-1.071-.071-1.59-.21-1.536-.421-2.842-1.435-3.63-2.819-.788-1.384-.993-3.025-.57-4.561 1.764-6.414 2.656-13.037 2.65-19.69C202 84.37 143 35.06 128 23.48c-9.992 7.748-19.392 16.231-28.12 25.38-2.284 2.399-6.08 2.493-8.48 .21Z"),
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
        return _dropSlash!!
    }

private var _dropSlash: ImageVector? = null
