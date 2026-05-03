package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberThree: ImageVector
    get() {
        if (_numberThree != null) return _numberThree!!
        _numberThree = phosphorLightIcon(
            name = "NumberThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 174.000 160.000 C 174.000 181.295 161.485 200.602 142.046 209.296 C 122.606 217.989 99.872 214.447 84.000 200.250 C 82.345 198.836 81.585 196.637 82.015 194.504 C 82.445 192.370 83.996 190.636 86.069 189.973 C 88.142 189.310 90.412 189.822 92.000 191.310 C 105.954 203.786 126.481 205.523 142.332 195.567 C 158.184 185.612 165.534 166.368 160.355 148.380 C 155.176 130.392 138.719 118.003 120.000 118.000 C 117.727 118.000 115.650 116.716 114.633 114.683 C 113.617 112.651 113.836 110.218 115.200 108.400 L 156.000 54.000 L 88.000 54.000 C 84.686 54.000 82.000 51.314 82.000 48.000 C 82.000 44.686 84.686 42.000 88.000 42.000 L 168.000 42.000 C 170.273 42.000 172.350 43.284 173.367 45.317 C 174.383 47.349 174.164 49.782 172.800 51.600 L 131.130 107.150 C 156.098 112.448 173.966 134.476 174.000 160.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _numberThree!!
    }

private var _numberThree: ImageVector? = null
