package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GenderNonbinary: ImageVector
    get() {
        if (_genderNonbinary != null) return _genderNonbinary!!
        _genderNonbinary = phosphorLightIcon(
            name = "GenderNonbinary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M134 98.27v-39.67l30.91 18.54c1.839 1.182 4.176 1.27 6.099 .23 1.923-1.04 3.128-3.045 3.145-5.231 .017-2.186-1.157-4.209-3.064-5.279L139.66 48 171.09 29.15c2.842-1.707 3.762-5.393 2.055-8.235-1.707-2.842-5.393-3.762-8.235-2.055L128 41 91.09 18.86c-2.841-1.707-6.528-.787-8.235 2.055-1.707 2.842-.787 6.528 2.055 8.235L116.34 48 84.91 66.86c-1.907 1.07-3.081 3.092-3.064 5.279 .017 2.186 1.222 4.191 3.145 5.231 1.923 1.04 4.26 .952 6.099-.23L122 58.6v39.67c-37.354 3.214-65.544 35.288-63.936 72.745 1.608 37.458 32.444 66.997 69.936 66.997 37.492 0 68.327-29.54 69.936-66.997C199.544 133.558 171.354 101.484 134 98.27ZM128 226C95.967 226 70 200.033 70 168c0-32.033 25.967-58 58-58 32.033 0 58 25.967 58 58-.039 32.017-25.983 57.961-58 58Z"),
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
        return _genderNonbinary!!
    }

private var _genderNonbinary: ImageVector? = null
