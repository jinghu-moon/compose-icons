package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GenderTransgender: ImageVector
    get() {
        if (_genderTransgender != null) return _genderTransgender!!
        _genderTransgender = phosphorRegularIcon(
            name = "GenderTransgender",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 32h-48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h28.69L168 76.69 149.66 58.35c-3.123-3.126-8.189-3.128-11.315-.005-3.126 3.123-3.128 8.189-.005 11.315L156.69 88l-15.76 15.76C111.091 79.949 67.85 83.591 42.414 112.058c-25.436 28.466-24.208 71.844 2.798 98.825 27.006 26.982 70.384 28.171 98.828 2.711 28.444-25.461 32.048-68.706 8.21-98.523L168 99.33l18.34 18.34c3.123 3.126 8.189 3.128 11.315 .005 3.126-3.123 3.128-8.189 .005-11.315L179.31 88 208 59.32v28.68c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8ZM135.6 199.63c-18.888 18.89-48.489 21.809-70.703 6.972C42.683 191.765 34.041 163.304 44.256 138.621 54.47 113.938 80.697 99.906 106.899 105.105c26.202 5.199 45.084 28.182 45.101 54.895 0 14.861-5.898 29.115-16.4 39.63Z"),
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
        return _genderTransgender!!
    }

private var _genderTransgender: ImageVector? = null
