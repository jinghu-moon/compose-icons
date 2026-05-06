package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ThermometerHot: ImageVector
    get() {
        if (_thermometerHot != null) return _thermometerHot!!
        _thermometerHot = phosphorFillIcon(
            name = "ThermometerHot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 146.08v-106.08C152 22.327 137.673 8 120 8 102.327 8 88 22.327 88 40v106.08C67.92 160.062 59.243 185.461 66.57 208.806c7.327 23.345 28.962 39.23 53.43 39.23 24.468 0 46.103-15.885 53.43-39.23C180.757 185.461 172.08 160.062 152 146.08ZM136 56h-32v-16c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM177.3 80.77c-2.413-3.7-1.37-8.656 2.33-11.07 15-9.79 26.87-4.75 35.51-1.06C223 72 227.76 74 235.63 68.89c3.703-2.413 8.662-1.368 11.075 2.335 2.413 3.703 1.368 8.662-2.335 11.075C237.88 86.53 232 88 226.69 88c-7 0-12.92-2.54-17.83-4.63C201 80 196.24 78 188.37 83.11c-1.778 1.158-3.944 1.562-6.02 1.123-2.076-.439-3.893-1.685-5.05-3.463ZM246.7 103.23c2.413 3.7 1.37 8.656-2.33 11.07C237.88 118.53 232 120 226.69 120c-7 0-12.92-2.54-17.83-4.63-7.87-3.36-12.62-5.38-20.49-.25-3.703 2.413-8.662 1.368-11.075-2.335-2.413-3.703-1.368-8.662 2.335-11.075 15-9.79 26.87-4.75 35.51-1.06 7.87 3.36 12.62 5.39 20.49 .25 3.7-2.413 8.656-1.37 11.07 2.33Z"),
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
        return _thermometerHot!!
    }

private var _thermometerHot: ImageVector? = null
