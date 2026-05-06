package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Disc: ImageVector
    get() {
        if (_disc != null) return _disc!!
        _disc = phosphorRegularIcon(
            name = "Disc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM167.2 120c-1.03-4.998-3.013-9.751-5.84-14L195.59 71.76c11.427 13.682 18.404 30.526 20 48.28ZM152 128c0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24ZM128 216C89.149 216.027 54.877 190.573 43.676 153.371 32.475 116.169 46.995 76.024 79.403 54.596c32.407-21.429 75.032-19.07 104.877 5.804L150 94.64c-14.682-9.67-33.957-8.62-47.501 2.588C88.954 108.435 84.315 127.173 91.065 143.405c6.75 16.232 23.308 26.155 40.806 24.453 17.498-1.702 31.833-14.629 35.329-31.858h48.43c-4.186 45.286-42.151 79.945-87.63 80Z"),
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
        return _disc!!
    }

private var _disc: ImageVector? = null
