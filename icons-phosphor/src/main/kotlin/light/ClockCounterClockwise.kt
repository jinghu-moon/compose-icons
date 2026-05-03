package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ClockCounterClockwise: ImageVector
    get() {
        if (_clockCounterClockwise != null) return _clockCounterClockwise!!
        _clockCounterClockwise = phosphorLightIcon(
            name = "ClockCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 134.000 80.000 L 134.000 124.600 L 171.090 146.850 C 173.934 148.557 174.857 152.246 173.150 155.090 C 171.443 157.934 167.754 158.857 164.910 157.150 L 124.910 133.150 C 123.102 132.064 121.998 130.109 122.000 128.000 L 122.000 80.000 C 122.000 76.686 124.686 74.000 128.000 74.000 C 131.314 74.000 134.000 76.686 134.000 80.000 ZM 128.000 34.000 C 103.045 33.935 79.102 43.860 61.510 61.560 C 52.930 70.240 45.510 78.560 38.000 87.360 L 38.000 64.000 C 38.000 60.686 35.314 58.000 32.000 58.000 C 28.686 58.000 26.000 60.686 26.000 64.000 L 26.000 104.000 C 26.000 107.314 28.686 110.000 32.000 110.000 L 72.000 110.000 C 75.314 110.000 78.000 107.314 78.000 104.000 C 78.000 100.686 75.314 98.000 72.000 98.000 L 44.730 98.000 C 52.860 88.290 60.790 79.350 70.000 70.000 C 101.805 38.196 153.294 37.949 185.403 69.446 C 217.512 100.943 218.257 152.427 187.071 184.839 C 155.885 217.250 104.411 218.491 71.700 187.620 C 70.152 186.094 67.899 185.525 65.812 186.132 C 63.725 186.739 62.129 188.428 61.641 190.546 C 61.153 192.664 61.849 194.881 63.460 196.340 C 94.149 225.324 140.396 230.295 176.545 208.496 C 212.693 186.697 229.876 143.474 218.563 102.806 C 207.249 62.138 170.213 33.999 128.000 34.000 Z"),
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
        return _clockCounterClockwise!!
    }

private var _clockCounterClockwise: ImageVector? = null
