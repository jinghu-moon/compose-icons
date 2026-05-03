package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.At: ImageVector
    get() {
        if (_at != null) return _at!!
        _at = phosphorLightIcon(
            name = "At",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 149.130 230.000 171.310 223.650 187.320 213.000 C 190.081 211.164 190.831 207.436 188.995 204.675 C 187.159 201.914 183.431 201.164 180.670 203.000 C 166.770 212.250 146.580 218.000 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 218.000 157.580 204.220 162.000 196.000 162.000 C 187.780 162.000 174.000 157.580 174.000 128.000 L 174.000 88.000 C 174.000 84.686 171.314 82.000 168.000 82.000 C 164.686 82.000 162.000 84.686 162.000 88.000 L 162.000 97.000 C 148.779 82.462 127.782 77.928 109.740 85.716 C 91.698 93.503 80.595 111.891 82.105 131.484 C 83.615 151.077 97.404 167.547 116.426 172.478 C 135.448 177.409 155.502 169.712 166.340 153.320 C 171.760 166.600 182.000 174.000 196.000 174.000 C 217.290 174.000 230.000 156.800 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 162.000 C 109.222 162.000 94.000 146.778 94.000 128.000 C 94.000 109.222 109.222 94.000 128.000 94.000 C 146.778 94.000 162.000 109.222 162.000 128.000 C 162.000 146.778 146.778 162.000 128.000 162.000 Z"),
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
        return _at!!
    }

private var _at: ImageVector? = null
