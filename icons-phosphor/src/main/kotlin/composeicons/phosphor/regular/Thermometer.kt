package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Thermometer: ImageVector
    get() {
        if (_thermometer != null) return _thermometer!!
        _thermometer = phosphorRegularIcon(
            name = "Thermometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 56c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28C240 68.536 227.464 56 212 56ZM212 96c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM128 153v-65c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v65c-15.602 4.029-25.775 19.03-23.745 35.016 2.03 15.986 15.631 27.968 31.745 27.968 16.114 0 29.714-11.982 31.745-27.968C153.775 172.03 143.602 157.029 128 153ZM120 200c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM160 134v-86C160 25.909 142.091 8 120 8 97.909 8 80 25.909 80 48v86C58.786 150.985 50.612 179.514 59.612 205.156c9 25.642 33.213 42.804 60.388 42.804 27.175 0 51.388-17.162 60.388-42.804C189.388 179.514 181.214 150.985 160 134ZM120 232C99.024 232.002 80.476 218.383 74.197 198.369c-6.279-20.014 1.165-41.788 18.383-53.769C94.735 143.095 96.013 140.628 96 138v-90C96 34.745 106.745 24 120 24c13.255 0 24 10.745 24 24v90c-0 2.614 1.277 5.063 3.42 6.56 17.255 11.969 24.726 33.765 18.442 53.803C159.579 218.4 141 232.027 120 232Z"),
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
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
