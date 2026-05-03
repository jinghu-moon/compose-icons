package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Eyeglasses: ImageVector
    get() {
        if (_eyeglasses != null) return _eyeglasses!!
        _eyeglasses = phosphorLightIcon(
            name = "Eyeglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 42.000 C 196.686 42.000 194.000 44.686 194.000 48.000 C 194.000 51.314 196.686 54.000 200.000 54.000 C 209.941 54.000 218.000 62.059 218.000 72.000 L 218.000 134.650 C 207.339 123.764 191.617 119.505 176.919 123.523 C 162.221 127.541 150.851 139.204 147.210 154.000 L 108.790 154.000 C 105.149 139.204 93.779 127.541 79.081 123.523 C 64.383 119.505 48.661 123.764 38.000 134.650 L 38.000 72.000 C 38.000 62.059 46.059 54.000 56.000 54.000 C 59.314 54.000 62.000 51.314 62.000 48.000 C 62.000 44.686 59.314 42.000 56.000 42.000 C 39.431 42.000 26.000 55.431 26.000 72.000 L 26.000 164.000 C 25.448 187.196 43.804 206.448 67.000 207.000 C 90.196 207.552 109.448 189.196 110.000 166.000 L 146.100 166.000 C 147.593 188.451 166.514 205.737 189.008 205.200 C 211.502 204.664 229.578 186.497 230.000 164.000 L 230.000 72.000 C 230.000 55.431 216.569 42.000 200.000 42.000 ZM 68.000 194.000 C 51.431 194.000 38.000 180.569 38.000 164.000 C 38.000 147.431 51.431 134.000 68.000 134.000 C 84.569 134.000 98.000 147.431 98.000 164.000 C 98.000 180.569 84.569 194.000 68.000 194.000 ZM 188.000 194.000 C 171.431 194.000 158.000 180.569 158.000 164.000 C 158.000 147.431 171.431 134.000 188.000 134.000 C 204.569 134.000 218.000 147.431 218.000 164.000 C 218.000 180.569 204.569 194.000 188.000 194.000 Z"),
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
        return _eyeglasses!!
    }

private var _eyeglasses: ImageVector? = null
