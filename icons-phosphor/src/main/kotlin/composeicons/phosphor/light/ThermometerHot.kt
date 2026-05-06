package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ThermometerHot: ImageVector
    get() {
        if (_thermometerHot != null) return _thermometerHot!!
        _thermometerHot = phosphorLightIcon(
            name = "ThermometerHot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M126 154.6v-106.6c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v106.6c-15.09 3.08-25.396 17.086-23.848 32.409 1.548 15.323 14.447 26.985 29.848 26.985 15.401 0 28.3-11.662 29.848-26.985C151.396 171.686 141.09 157.68 126 154.6ZM120 202c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM158 135v-87C158 27.013 140.987 10 120 10 99.013 10 82 27.013 82 48v87C61.06 151.243 52.758 179 61.343 204.073c8.584 25.073 32.156 41.917 58.657 41.917 26.502 0 50.073-16.844 58.657-41.917C187.242 179 178.94 151.243 158 135ZM120 234C98.173 233.979 78.882 219.802 72.344 198.977 65.806 178.152 73.532 155.493 91.43 143c1.633-1.137 2.595-3.01 2.57-5v-90C94 33.641 105.641 22 120 22c14.359 0 26 11.641 26 26v90c.001 1.962 .961 3.799 2.57 4.92 17.972 12.47 25.752 35.174 19.205 56.045C161.228 219.836 141.874 234.029 120 234ZM179 79.68c-1.808-2.775-1.024-6.491 1.75-8.3 14.14-9.21 24.95-4.61 33.63-.9 7.9 3.37 13.6 5.8 22.37 .09 1.795-1.237 4.121-1.403 6.073-.433 1.953 .97 3.226 2.923 3.325 5.101 .099 2.178-.991 4.238-2.848 5.382-6.12 4-11.62 5.39-16.59 5.39-6.51 0-12.11-2.39-17-4.49-7.89-3.37-13.59-5.8-22.37-.09-1.336 .881-2.969 1.191-4.535 .863-1.566-.329-2.936-1.269-3.805-2.613ZM245 104.32c1.806 2.778 1.018 6.494-1.76 8.3-6.12 4-11.62 5.39-16.59 5.39-6.51 0-12.11-2.39-17-4.49-7.89-3.37-13.59-5.8-22.37-.09-2.771 1.706-6.396 .893-8.173-1.833-1.777-2.726-1.057-6.371 1.623-8.217 14.14-9.21 24.95-4.6 33.63-.9 7.9 3.37 13.6 5.8 22.37 .09 2.769-1.787 6.462-1.006 8.27 1.75Z"),
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
