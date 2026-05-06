package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ThermometerSimple: ImageVector
    get() {
        if (_thermometerSimple != null) return _thermometerSimple!!
        _thermometerSimple = phosphorLightIcon(
            name = "ThermometerSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M134 154.6v-66.6c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v66.6c-15.09 3.08-25.396 17.086-23.848 32.409 1.548 15.323 14.447 26.985 29.848 26.985 15.401 0 28.3-11.662 29.848-26.985C159.396 171.686 149.09 157.68 134 154.6ZM128 202c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM166 135v-87C166 27.013 148.987 10 128 10 107.013 10 90 27.013 90 48v87C69.06 151.243 60.758 179 69.343 204.073c8.584 25.073 32.156 41.917 58.657 41.917 26.502 0 50.073-16.844 58.657-41.917C195.242 179 186.94 151.243 166 135ZM128 234C106.173 233.979 86.882 219.802 80.344 198.977 73.806 178.152 81.532 155.493 99.43 143c1.633-1.137 2.595-3.01 2.57-5v-90c0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26v90c.001 1.962 .961 3.799 2.57 4.92 17.972 12.47 25.752 35.174 19.205 56.045C169.228 219.836 149.874 234.029 128 234Z"),
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
