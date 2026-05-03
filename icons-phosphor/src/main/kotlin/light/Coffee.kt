package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Coffee: ImageVector
    get() {
        if (_coffee != null) return _coffee!!
        _coffee = phosphorLightIcon(
            name = "Coffee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 82.000 56.000 L 82.000 24.000 C 82.000 20.686 84.686 18.000 88.000 18.000 C 91.314 18.000 94.000 20.686 94.000 24.000 L 94.000 56.000 C 94.000 59.314 91.314 62.000 88.000 62.000 C 84.686 62.000 82.000 59.314 82.000 56.000 ZM 120.000 62.000 C 123.314 62.000 126.000 59.314 126.000 56.000 L 126.000 24.000 C 126.000 20.686 123.314 18.000 120.000 18.000 C 116.686 18.000 114.000 20.686 114.000 24.000 L 114.000 56.000 C 114.000 59.314 116.686 62.000 120.000 62.000 ZM 152.000 62.000 C 155.314 62.000 158.000 59.314 158.000 56.000 L 158.000 24.000 C 158.000 20.686 155.314 18.000 152.000 18.000 C 148.686 18.000 146.000 20.686 146.000 24.000 L 146.000 56.000 C 146.000 59.314 148.686 62.000 152.000 62.000 ZM 246.000 120.000 L 246.000 128.000 C 246.008 148.580 229.632 165.426 209.060 166.000 C 203.172 183.376 192.356 198.664 177.930 210.000 L 208.000 210.000 C 211.314 210.000 214.000 212.686 214.000 216.000 C 214.000 219.314 211.314 222.000 208.000 222.000 L 32.000 222.000 C 28.686 222.000 26.000 219.314 26.000 216.000 C 26.000 212.686 28.686 210.000 32.000 210.000 L 62.070 210.000 C 39.351 192.157 26.059 164.888 26.000 136.000 L 26.000 88.000 C 26.000 84.686 28.686 82.000 32.000 82.000 L 208.000 82.000 C 228.987 82.000 246.000 99.013 246.000 120.000 ZM 202.000 136.000 L 202.000 94.000 L 38.000 94.000 L 38.000 136.000 C 38.065 167.579 56.200 196.335 84.670 210.000 L 155.330 210.000 C 183.800 196.335 201.935 167.579 202.000 136.000 ZM 234.000 120.000 C 233.996 107.955 225.720 97.490 214.000 94.710 L 214.000 136.000 C 213.998 141.920 213.432 147.827 212.310 153.640 C 224.830 151.535 234.000 140.696 234.000 128.000 Z"),
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
        return _coffee!!
    }

private var _coffee: ImageVector? = null
