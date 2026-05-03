package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UmbrellaSimple: ImageVector
    get() {
        if (_umbrellaSimple != null) return _umbrellaSimple!!
        _umbrellaSimple = phosphorRegularIcon(
            name = "UmbrellaSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 126.630 C 236.274 83.908 208.571 47.026 168.580 31.543 C 128.588 16.061 83.272 24.674 51.750 53.750 C 31.123 72.700 18.379 98.716 16.050 126.630 C 15.666 131.097 17.174 135.520 20.206 138.822 C 23.238 142.124 27.517 144.002 32.000 144.000 L 120.000 144.000 L 120.000 200.000 C 120.000 217.673 134.327 232.000 152.000 232.000 C 169.673 232.000 184.000 217.673 184.000 200.000 C 184.000 195.582 180.418 192.000 176.000 192.000 C 171.582 192.000 168.000 195.582 168.000 200.000 C 168.000 208.837 160.837 216.000 152.000 216.000 C 143.163 216.000 136.000 208.837 136.000 200.000 L 136.000 144.000 L 224.000 144.000 C 228.492 144.016 232.784 142.144 235.827 138.840 C 238.870 135.536 240.385 131.105 240.000 126.630 ZM 32.000 128.000 L 32.000 128.000 C 35.217 91.384 58.970 59.781 93.248 46.511 C 127.526 33.242 166.367 40.614 193.400 65.520 C 211.107 81.748 222.036 104.062 224.000 128.000 Z"),
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
        return _umbrellaSimple!!
    }

private var _umbrellaSimple: ImageVector? = null
