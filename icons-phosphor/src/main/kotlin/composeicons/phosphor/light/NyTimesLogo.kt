package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NyTimesLogo: ImageVector
    get() {
        if (_nyTimesLogo != null) return _nyTimesLogo!!
        _nyTimesLogo = phosphorLightIcon(
            name = "NyTimesLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 138c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10ZM185.46 101.44 119.24 70.53C82.027 74.966 54.005 106.523 54 144c0 .22 0 .44 0 .66l71.16-37.95c1.86-1 4.109-.948 5.921 .137 1.812 1.084 2.921 3.042 2.919 5.153v105.76c30.062-2.336 55.662-22.765 64.61-51.56 .994-3.162 4.363-4.919 7.525-3.925 3.162 .994 4.919 4.363 3.925 7.525-9.992 31.665-37.321 54.75-70.211 59.307C106.959 233.664 74.383 218.879 56.158 191.123 37.933 163.367 37.315 127.599 54.57 99.23 39.754 92.853 31.458 76.943 34.71 61.144 37.963 45.345 51.87 34.006 68 34c.877-.001 1.744 .19 2.54 .56L189.26 90c12.15-.348 21.718-10.48 21.37-22.63C210.282 55.22 200.15 45.652 188 46c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6 18.778 0 34 15.222 34 34 0 18.778-15.222 34-34 34-.877 .001-1.744-.19-2.54-.56ZM102 213.27c6.425 2.417 13.157 3.922 20 4.47v-95.74l-20 10.67ZM55.27 157.59c3.926 20.822 16.564 38.973 34.73 49.88v-68.4ZM101.41 62.21 66.74 46C56.083 46.646 47.428 54.85 46.214 65.457c-1.215 10.607 5.361 20.555 15.596 23.593 .86-1 1.75-2.06 2.67-3.07C74.525 74.994 87.25 66.804 101.41 62.21Z"),
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
        return _nyTimesLogo!!
    }

private var _nyTimesLogo: ImageVector? = null
