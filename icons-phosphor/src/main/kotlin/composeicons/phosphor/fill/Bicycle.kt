package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bicycle: ImageVector
    get() {
        if (_bicycle != null) return _bicycle!!
        _bicycle = phosphorFillIcon(
            name = "Bicycle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M54.46 164.71 82.33 126.5c17.413 17.874 18.226 46.108 1.871 64.955-16.355 18.847-44.422 22.018-64.571 7.297C-.518 184.03-6.026 156.326 6.959 135.018 19.944 113.709 47.09 105.903 69.41 117.06L41.54 155.29c-1.809 2.301-2.217 5.407-1.064 8.098 1.154 2.69 3.685 4.536 6.599 4.812 2.914 .276 5.747-1.063 7.384-3.489ZM208 112c-5.784-.003-11.52 1.044-16.93 3.09L214.91 156c1.651 2.479 1.788 5.669 .356 8.281-1.432 2.611-4.196 4.211-7.173 4.152-2.978-.059-5.676-1.767-7.003-4.433L177.26 123.14c-17.899 14.93-22.485 40.56-10.874 60.77 11.61 20.21 36.062 29.159 57.975 21.218 21.913-7.941 34.955-30.477 30.922-53.433C251.249 128.738 231.308 111.997 208 112ZM165.93 72h26.07c4.418 0 8 3.582 8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C216 66.745 205.255 56 192 56h-40c-2.855 .006-5.49 1.534-6.915 4.008-1.425 2.474-1.423 5.52 .005 7.992l11.65 20h-57.48L82.91 60C81.484 57.53 78.852 56.006 76 56h-28c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h23.41L85.12 95.51 69.41 117.06c4.806 2.399 9.173 5.591 12.92 9.44L93.92 110.6 125.09 164c1.327 2.666 4.026 4.374 7.003 4.433 2.977 .059 5.741-1.541 7.173-4.152 1.432-2.611 1.295-5.802-.356-8.281L108.59 104h57.48l11.19 19.17c4.12-3.445 8.788-6.176 13.81-8.08Z"),
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
        return _bicycle!!
    }

private var _bicycle: ImageVector? = null
