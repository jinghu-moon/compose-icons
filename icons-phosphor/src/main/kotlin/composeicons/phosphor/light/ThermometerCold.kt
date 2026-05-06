package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ThermometerCold: ImageVector
    get() {
        if (_thermometerCold != null) return _thermometerCold!!
        _thermometerCold = phosphorLightIcon(
            name = "ThermometerCold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248.29 75.82l-22.58 7.33 13.95 19.21c1.317 1.73 1.595 4.037 .726 6.031-.868 1.993-2.747 3.361-4.911 3.575-2.164 .214-4.274-.76-5.515-2.545L216 90.21l-14 19.21c-1.241 1.785-3.352 2.759-5.515 2.545-2.164-.214-4.043-1.581-4.911-3.575-.868-1.993-.591-4.301 .726-6.031L206.25 83.15 183.67 75.82c-2.075-.633-3.647-2.337-4.11-4.457-.464-2.12 .253-4.324 1.875-5.766 1.621-1.442 3.895-1.896 5.946-1.187L210 71.74v-23.74c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v23.74l22.58-7.33c3.129-.955 6.446 .773 7.457 3.883 1.011 3.111-.655 6.459-3.747 7.527ZM150 184c-.003 15.787-12.241 28.87-27.992 29.927C106.257 214.983 92.381 203.652 90.27 188.007 88.158 172.362 98.532 157.757 114 154.6v-34.6c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v34.6c13.959 2.869 23.984 15.149 24 29.4ZM138 184c0-9.941-8.059-18-18-18-9.941 0-18 8.059-18 18 0 9.941 8.059 18 18 18 9.941 0 18-8.059 18-18ZM182 184c-.005 29.029-20.151 54.169-48.482 60.498-28.331 6.329-57.26-7.846-69.619-34.113C51.541 184.118 59.062 152.792 82 135v-87C82 27.013 99.013 10 120 10c20.987 0 38 17.013 38 38v87c15.136 11.752 23.994 29.837 24 49ZM170 184c-.023-16.345-8.023-31.65-21.43-41-1.633-1.137-2.595-3.01-2.57-5v-90C146 33.641 134.359 22 120 22 105.641 22 94 33.641 94 48v90c.025 1.99-.937 3.863-2.57 5C71.949 156.564 64.69 181.956 74.059 203.767c9.368 21.811 32.781 34.029 56.031 29.238C153.339 228.215 170.016 207.738 170 184Z"),
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
        return _thermometerCold!!
    }

private var _thermometerCold: ImageVector? = null
