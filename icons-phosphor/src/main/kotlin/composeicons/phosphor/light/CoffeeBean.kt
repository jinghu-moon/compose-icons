package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CoffeeBean: ImageVector
    get() {
        if (_coffeeBean != null) return _coffeeBean!!
        _coffeeBean = phosphorLightIcon(
            name = "CoffeeBean",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M210.34 45.66C194 29.35 170 22.87 142.79 27.42 116.28 31.83 89.71 46.24 68 68 46.29 89.76 31.86 116.3 27.44 142.81 22.87 170 29.35 194 45.66 210.34 58.57 223.25 76.29 230 96.64 230c5.553-.016 11.094-.488 16.57-1.41 26.51-4.42 53.08-18.83 74.82-40.56 21.74-21.73 36.14-48.31 40.56-74.82C233.13 86 226.65 62 210.34 45.66ZM76.46 76.46C101.52 51.4 132.46 38 159.18 38c12.58 0 24.22 3 33.87 9.12-12.569 3.838-24.332 9.938-34.71 18-18.82 14.86-31 35.62-36.22 61.71C112 177.35 75.18 194 52 199.5 26.3 170.42 36.83 116.09 76.46 76.46ZM179.54 179.54C142.68 216.4 93.1 228.1 63 208.91c12.569-3.838 24.332-9.938 34.71-18 18.82-14.86 31-35.62 36.22-61.71C144 78.65 180.82 62 204.05 56.5c25.65 29.09 15.12 83.41-24.51 123.04Z"),
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
        return _coffeeBean!!
    }

private var _coffeeBean: ImageVector? = null
