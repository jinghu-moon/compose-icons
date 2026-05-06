package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Scissors: ImageVector
    get() {
        if (_scissors != null) return _scissors!!
        _scissors = phosphorLightIcon(
            name = "Scissors",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M159.38 112c-.898-1.314-1.237-2.931-.943-4.495 .294-1.564 1.198-2.947 2.513-3.845L228.61 57.35c2.737-1.872 6.473-1.172 8.345 1.565 1.872 2.737 1.172 6.473-1.565 8.345l-67.67 46.3c-2.734 1.872-6.468 1.174-8.34-1.56ZM237 197.09c-1.872 2.734-5.606 3.432-8.34 1.56L136 135.27 91 166.06c7.278 16.009 1.147 34.926-14.137 43.623-15.285 8.697-34.679 4.303-44.723-10.132C22.096 185.116 24.717 165.404 38.183 154.095 51.65 142.785 71.519 143.612 84 156c.058 .071 .122 .138 .19 .2L125.37 128 84.23 99.84 84 100c-12.462 12.403-32.325 13.259-45.808 1.973C24.71 90.688 22.055 70.985 32.071 56.534 42.086 42.083 61.468 37.652 76.768 46.315 92.068 54.978 98.239 73.877 91 89.9l144.38 98.8c1.337 .89 2.261 2.279 2.565 3.856 .304 1.577-.036 3.21-.945 4.534ZM75.56 91.55c8.589-8.593 8.586-22.52-.005-31.11-8.591-8.59-22.519-8.59-31.11 0-8.591 8.59-8.593 22.518-.005 31.11 4.11 4.158 9.714 6.498 15.56 6.498 5.846 0 11.45-2.34 15.56-6.498ZM82 180C81.997 169.505 74.58 160.473 64.285 158.429c-10.294-2.044-20.599 3.468-24.613 13.165-4.014 9.698-.618 20.88 8.11 26.709 8.728 5.829 20.358 4.68 27.778-2.743h0C79.697 191.44 82.015 185.838 82 180Z"),
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
        return _scissors!!
    }

private var _scissors: ImageVector? = null
