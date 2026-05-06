package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserPlus: ImageVector
    get() {
        if (_userPlus != null) return _userPlus!!
        _userPlus = phosphorLightIcon(
            name = "UserPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M254 136c0 3.314-2.686 6-6 6h-18v18c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-18c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h18v-18c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v18h18c3.314 0 6 2.686 6 6ZM196.59 196.14c1.457 1.63 1.911 3.924 1.186 5.987-.725 2.063-2.515 3.568-4.671 3.928-2.157 .361-4.338-.481-5.695-2.195C166.9 179.45 138.69 166 108 166c-30.69 0-58.89 13.45-79.41 37.86-2.161 2.419-5.853 2.682-8.336 .595-2.483-2.088-2.856-5.771-.844-8.315C35.14 177.41 55 164.48 77 158.25 50.252 144.019 36.629 113.405 43.963 84.008 51.296 54.612 77.702 33.983 108 33.983c30.298 0 56.704 20.628 64.037 50.025 7.333 29.397-6.29 60.011-33.037 74.242 22 6.23 41.86 19.16 57.59 37.89ZM108 154c29.823 0 54-24.177 54-54C162 70.177 137.823 46 108 46 78.177 46 54 70.177 54 100c.033 29.81 24.19 53.967 54 54Z"),
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
        return _userPlus!!
    }

private var _userPlus: ImageVector? = null
