package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Power: ImageVector
    get() {
        if (_power != null) return _power!!
        _power = phosphorFillIcon(
            name = "Power",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 232.000 70.562 185.438 24.000 128.000 24.000 ZM 120.000 64.000 C 120.000 59.582 123.582 56.000 128.000 56.000 C 132.418 56.000 136.000 59.582 136.000 64.000 L 136.000 128.000 C 136.000 132.418 132.418 136.000 128.000 136.000 C 123.582 136.000 120.000 132.418 120.000 128.000 ZM 128.000 208.000 C 92.760 208.004 61.668 184.947 51.437 151.225 C 41.207 117.502 54.248 81.057 83.550 61.480 C 85.923 59.802 89.020 59.543 91.639 60.803 C 94.258 62.064 95.987 64.646 96.156 67.548 C 96.324 70.450 94.906 73.215 92.450 74.770 C 69.007 90.430 58.573 119.585 66.755 146.563 C 74.937 173.541 99.808 191.988 128.000 191.988 C 156.192 191.988 181.063 173.541 189.245 146.563 C 197.427 119.585 186.993 90.430 163.550 74.770 C 161.094 73.215 159.676 70.450 159.844 67.548 C 160.013 64.646 161.742 62.064 164.361 60.803 C 166.980 59.543 170.077 59.802 172.450 61.480 C 201.752 81.057 214.793 117.502 204.563 151.225 C 194.332 184.947 163.240 208.004 128.000 208.000 Z"),
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
        return _power!!
    }

private var _power: ImageVector? = null
