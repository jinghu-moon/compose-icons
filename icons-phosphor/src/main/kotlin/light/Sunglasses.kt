package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) return _sunglasses!!
        _sunglasses = phosphorLightIcon(
            name = "Sunglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 42.000 C 196.686 42.000 194.000 44.686 194.000 48.000 C 194.000 51.314 196.686 54.000 200.000 54.000 C 209.941 54.000 218.000 62.059 218.000 72.000 L 218.000 130.000 L 38.000 130.000 L 38.000 72.000 C 38.000 62.059 46.059 54.000 56.000 54.000 C 59.314 54.000 62.000 51.314 62.000 48.000 C 62.000 44.686 59.314 42.000 56.000 42.000 C 39.431 42.000 26.000 55.431 26.000 72.000 L 26.000 164.000 C 26.000 187.196 44.804 206.000 68.000 206.000 C 91.196 206.000 110.000 187.196 110.000 164.000 L 110.000 142.000 L 146.000 142.000 L 146.000 164.000 C 146.000 187.196 164.804 206.000 188.000 206.000 C 211.196 206.000 230.000 187.196 230.000 164.000 L 230.000 72.000 C 230.000 55.431 216.569 42.000 200.000 42.000 ZM 38.000 164.000 L 38.000 142.480 L 84.530 189.000 C 75.322 195.080 63.521 195.614 53.801 190.392 C 44.081 185.170 38.013 175.034 38.000 164.000 ZM 98.000 164.000 C 98.000 169.882 96.260 175.634 93.000 180.530 L 54.480 142.000 L 98.000 142.000 ZM 158.000 164.000 L 158.000 142.480 L 204.530 189.000 C 195.322 195.080 183.521 195.614 173.801 190.392 C 164.081 185.170 158.013 175.034 158.000 164.000 ZM 213.000 180.530 L 174.480 142.000 L 218.000 142.000 L 218.000 164.000 C 218.000 169.882 216.260 175.634 213.000 180.530 Z"),
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
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
