package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ThermometerSimple: ImageVector
    get() {
        if (_thermometerSimple != null) return _thermometerSimple!!
        _thermometerSimple = phosphorRegularIcon(
            name = "ThermometerSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 153v-65c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v65c-15.602 4.029-25.775 19.03-23.745 35.016 2.03 15.986 15.631 27.968 31.745 27.968 16.114 0 29.714-11.982 31.745-27.968C161.775 172.03 151.602 157.029 136 153ZM128 200c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM168 134v-86C168 25.909 150.091 8 128 8 105.909 8 88 25.909 88 48v86C66.786 150.985 58.612 179.514 67.612 205.156c9 25.642 33.213 42.804 60.388 42.804 27.175 0 51.388-17.162 60.388-42.804C197.388 179.514 189.214 150.985 168 134ZM128 232c-20.976 .002-39.524-13.617-45.803-33.631-6.279-20.014 1.165-41.788 18.383-53.769 2.155-1.505 3.433-3.972 3.42-6.6v-90c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24v90c-0 2.614 1.277 5.063 3.42 6.56 17.255 11.969 24.726 33.765 18.442 53.803C167.579 218.4 149 232.027 128 232Z"),
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
        return _thermometerSimple!!
    }

private var _thermometerSimple: ImageVector? = null
