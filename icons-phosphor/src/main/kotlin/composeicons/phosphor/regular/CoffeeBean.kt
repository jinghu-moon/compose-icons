package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CoffeeBean: ImageVector
    get() {
        if (_coffeeBean != null) return _coffeeBean!!
        _coffeeBean = phosphorRegularIcon(
            name = "CoffeeBean",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211.75 44.25C195 27.47 170.37 20.79 142.46 25.44 115.55 29.93 88.59 44.53 66.56 66.56c-22.03 22.03-36.63 49-41.12 75.9-4.65 27.91 2 52.51 18.81 69.29C57.54 225.05 75.75 232 96.62 232c5.67-.016 11.329-.498 16.92-1.44 26.91-4.49 53.87-19.09 75.9-41.12 22.03-22.03 36.63-49 41.12-75.9C235.21 85.63 228.53 61 211.75 44.25ZM77.87 77.87C102.56 53.19 133 39.93 159.15 39.93c10.064-.153 20.015 2.135 29 6.67-11.207 3.91-21.696 9.633-31.05 16.94-19.2 15.16-31.63 36.32-36.94 62.89-9.72 48.58-44.7 65.18-67.48 70.84C28.71 168.76 39.4 116.35 77.87 77.87ZM178.13 178.13C143.44 212.81 97.42 224.91 67.81 209.4c11.219-3.91 21.722-9.632 31.09-16.94 19.2-15.16 31.63-36.32 36.94-62.89 9.72-48.58 44.7-65.18 67.48-70.84 23.97 28.51 13.28 80.92-25.19 119.4Z"),
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
