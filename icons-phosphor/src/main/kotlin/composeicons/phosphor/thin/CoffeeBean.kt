package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CoffeeBean: ImageVector
    get() {
        if (_coffeeBean != null) return _coffeeBean!!
        _coffeeBean = phosphorThinIcon(
            name = "CoffeeBean",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M209 47C176.64 14.65 114 24.67 69.3 69.34 24.6 114.01 14.63 176.66 47 209c12.82 12.81 30.38 19 49.71 19 29.46 0 63-14.34 90-41.32C231.35 142 241.37 79.34 209 47ZM75 75C100.47 49.54 132 35.91 159.26 35.91c14.51 0 27.83 3.87 38.43 11.84-25.76 7.05-63 26.4-73.6 79.49-10.5 52.52-49.25 69.26-72.91 74.58C23.77 172.12 34.16 115.81 75 75ZM181 181C142 220 88.83 231.23 58.29 208.25c25.75-7 63-26.39 73.62-79.48C142.41 76.24 181.16 59.51 204.82 54.18 232.23 83.88 221.84 140.19 181 181Z"),
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
