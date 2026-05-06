package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ThermometerHot: ImageVector
    get() {
        if (_thermometerHot != null) return _thermometerHot!!
        _thermometerHot = phosphorDuotoneIcon(
            name = "ThermometerHot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 138v-90C152 30.327 137.673 16 120 16 102.327 16 88 30.327 88 48v90C67.92 151.982 59.243 177.381 66.57 200.726c7.327 23.345 28.962 39.23 53.43 39.23 24.468 0 46.103-15.885 53.43-39.23C180.757 177.381 172.08 151.982 152 138ZM120 208C106.745 208 96 197.255 96 184c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M128 153v-105c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v105c-15.602 4.029-25.775 19.03-23.745 35.016 2.03 15.986 15.631 27.968 31.745 27.968 16.114 0 29.714-11.982 31.745-27.968C153.775 172.03 143.602 157.029 128 153ZM120 200c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM160 134v-86C160 25.909 142.091 8 120 8 97.909 8 80 25.909 80 48v86C58.786 150.985 50.612 179.514 59.612 205.156c9 25.642 33.213 42.804 60.388 42.804 27.175 0 51.388-17.162 60.388-42.804C189.388 179.514 181.214 150.985 160 134ZM120 232C99.024 232.002 80.476 218.383 74.197 198.369c-6.279-20.014 1.165-41.788 18.383-53.769C94.735 143.095 96.013 140.628 96 138v-90C96 34.745 106.745 24 120 24c13.255 0 24 10.745 24 24v90c-0 2.614 1.277 5.063 3.42 6.56 17.255 11.969 24.726 33.765 18.442 53.803C159.579 218.4 141 232.027 120 232ZM177.3 80.77c-2.413-3.7-1.37-8.656 2.33-11.07 15-9.79 26.87-4.75 35.51-1.06C223 72 227.76 74 235.63 68.89c3.703-2.413 8.662-1.368 11.075 2.335 2.413 3.703 1.368 8.662-2.335 11.075C237.88 86.53 232 88 226.69 88c-7 0-12.92-2.54-17.83-4.63C201 80 196.24 78 188.37 83.11c-1.778 1.158-3.944 1.562-6.02 1.123-2.076-.439-3.893-1.685-5.05-3.463ZM246.7 103.23c2.413 3.7 1.37 8.656-2.33 11.07C237.88 118.53 232 120 226.69 120c-7 0-12.92-2.54-17.83-4.63-7.87-3.36-12.62-5.38-20.49-.25-3.703 2.413-8.662 1.368-11.075-2.335-2.413-3.703-1.368-8.662 2.335-11.075 15-9.79 26.87-4.75 35.51-1.06 7.87 3.36 12.62 5.39 20.49 .25 3.7-2.413 8.656-1.37 11.07 2.33Z"),
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
