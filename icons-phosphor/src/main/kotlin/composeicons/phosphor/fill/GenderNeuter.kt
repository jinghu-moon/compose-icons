package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GenderNeuter: ImageVector
    get() {
        if (_genderNeuter != null) return _genderNeuter!!
        _genderNeuter = phosphorFillIcon(
            name = "GenderNeuter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M167.84 108.35c1.534 16.775-7.605 32.713-22.857 39.863-15.253 7.149-33.349 3.977-45.261-7.935C87.811 128.367 84.638 110.27 91.787 95.017 98.937 79.765 114.875 70.626 131.65 72.16c19.212 1.757 34.433 16.978 36.19 36.19ZM216 40v176c0 8.837-7.163 16-16 16h-144c-8.837 0-16-7.163-16-16v-176C40 31.163 47.163 24 56 24h144c8.837 0 16 7.163 16 16ZM184 112C184.003 82.111 160.533 57.488 130.679 56.058 100.824 54.629 75.109 76.897 72.256 106.649c-2.853 29.752 18.162 56.501 47.744 60.771v32.31c-.053 4.281 3.205 7.879 7.47 8.25 2.212 .147 4.386-.631 6.003-2.147 1.617-1.517 2.532-3.636 2.527-5.853v-32.56c27.53-4.013 47.959-27.599 48-55.42Z"),
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
        return _genderNeuter!!
    }

private var _genderNeuter: ImageVector? = null
