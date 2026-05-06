package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Volleyball: ImageVector
    get() {
        if (_volleyball != null) return _volleyball!!
        _volleyball = phosphorLightIcon(
            name = "Volleyball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM211.37 161.89c-29.137 20.259-67.459 21.504-97.85 3.18L131.46 134h86.34c-.633 9.581-2.804 18.999-6.43 27.89ZM88.3 47.24c8.608-4.244 17.843-7.077 27.35-8.39 32.117 15.101 52.362 47.666 51.69 83.15h-35.88ZM217.8 122h-38.46C179.878 89.267 164.691 58.26 138.5 38.62c43.041 5.116 76.348 40.137 79.3 83.38ZM77.92 53.26 97.13 86.53C68.517 102.435 49.26 131.089 45.34 163.59 28.181 123.768 41.881 77.373 77.92 53.26ZM57 183.19C54.052 147.852 72.13 114.077 103.17 96.93L121.07 128 77.92 202.74C69.954 197.374 62.893 190.774 57 183.19ZM128 218c-13.768 .015-27.354-3.147-39.7-9.24l19.22-33.29c28.063 16.821 62.486 19.178 92.58 6.34C183.131 204.584 156.4 218.001 128 218Z"),
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
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
