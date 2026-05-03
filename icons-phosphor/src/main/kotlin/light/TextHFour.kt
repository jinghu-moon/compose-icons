package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextHFour: ImageVector
    get() {
        if (_textHFour != null) return _textHFour!!
        _textHFour = phosphorLightIcon(
            name = "TextHFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 150.000 56.000 L 150.000 176.000 C 150.000 179.314 147.314 182.000 144.000 182.000 C 140.686 182.000 138.000 179.314 138.000 176.000 L 138.000 122.000 L 46.000 122.000 L 46.000 176.000 C 46.000 179.314 43.314 182.000 40.000 182.000 C 36.686 182.000 34.000 179.314 34.000 176.000 L 34.000 56.000 C 34.000 52.686 36.686 50.000 40.000 50.000 C 43.314 50.000 46.000 52.686 46.000 56.000 L 46.000 110.000 L 138.000 110.000 L 138.000 56.000 C 138.000 52.686 140.686 50.000 144.000 50.000 C 147.314 50.000 150.000 52.686 150.000 56.000 ZM 254.000 184.000 C 254.000 187.314 251.314 190.000 248.000 190.000 L 238.000 190.000 L 238.000 208.000 C 238.000 211.314 235.314 214.000 232.000 214.000 C 228.686 214.000 226.000 211.314 226.000 208.000 L 226.000 190.000 L 176.000 190.000 C 173.709 190.000 171.618 188.696 170.610 186.639 C 169.603 184.581 169.855 182.129 171.260 180.320 L 227.260 108.320 C 228.832 106.294 231.519 105.491 233.945 106.323 C 236.371 107.154 238.001 109.435 238.000 112.000 L 238.000 178.000 L 248.000 178.000 C 251.314 178.000 254.000 180.686 254.000 184.000 ZM 226.000 129.490 L 188.270 178.000 L 226.000 178.000 Z"),
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
        return _textHFour!!
    }

private var _textHFour: ImageVector? = null
