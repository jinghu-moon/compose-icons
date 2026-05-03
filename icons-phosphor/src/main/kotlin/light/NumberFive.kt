package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberFive: ImageVector
    get() {
        if (_numberFive != null) return _numberFive!!
        _numberFive = phosphorLightIcon(
            name = "NumberFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 174.000 160.000 C 174.000 181.295 161.485 200.602 142.046 209.296 C 122.606 217.989 99.872 214.447 84.000 200.250 C 82.345 198.836 81.585 196.637 82.015 194.504 C 82.445 192.370 83.996 190.636 86.069 189.973 C 88.142 189.310 90.412 189.822 92.000 191.310 C 108.735 206.277 134.283 205.436 149.997 189.399 C 165.711 173.363 166.034 147.804 150.730 131.376 C 135.426 114.947 109.908 113.460 92.800 128.000 C 90.856 129.680 88.057 129.936 85.840 128.635 C 83.624 127.335 82.482 124.767 83.000 122.250 L 98.120 46.820 C 98.682 44.018 101.142 42.001 104.000 42.000 L 168.000 42.000 C 171.314 42.000 174.000 44.686 174.000 48.000 C 174.000 51.314 171.314 54.000 168.000 54.000 L 108.920 54.000 L 97.540 110.890 C 114.257 103.244 133.716 104.628 149.183 114.562 C 164.650 124.497 174.001 141.617 174.000 160.000 Z"),
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
        return _numberFive!!
    }

private var _numberFive: ImageVector? = null
