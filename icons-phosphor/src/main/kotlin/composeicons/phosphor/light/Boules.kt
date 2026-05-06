package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Boules: ImageVector
    get() {
        if (_boules != null) return _boules!!
        _boules = phosphorLightIcon(
            name = "Boules",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM187.22 60.29 60.29 187.22C55.364 181.6 51.155 175.389 47.76 168.73L168.76 47.73c6.65 3.406 12.851 7.625 18.46 12.56ZM195.71 68.78c4.926 5.62 9.135 11.831 12.53 18.49L87.24 208.27C80.581 204.875 74.37 200.666 68.75 195.74ZM128 38c9.79-.009 19.515 1.586 28.79 4.72L42.72 156.79C33.446 129.321 37.972 99.065 54.88 75.513 71.788 51.961 99.007 37.997 128 38ZM128 218c-9.79 .009-19.515-1.586-28.79-4.72L213.28 99.21c9.274 27.469 4.748 57.725-12.16 81.277C184.212 204.039 156.993 218.003 128 218Z"),
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
        return _boules!!
    }

private var _boules: ImageVector? = null
