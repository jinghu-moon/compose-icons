package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GenderMale: ImageVector
    get() {
        if (_genderMale != null) return _genderMale!!
        _genderMale = phosphorLightIcon(
            name = "GenderMale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 34.000 L 168.000 34.000 C 164.686 34.000 162.000 36.686 162.000 40.000 C 162.000 43.314 164.686 46.000 168.000 46.000 L 201.520 46.000 L 154.720 92.790 C 122.594 65.279 74.395 68.386 46.066 99.793 C 17.737 131.200 19.602 179.463 50.269 208.591 C 80.937 237.719 129.232 237.098 159.140 207.190 L 159.140 207.190 C 187.905 178.348 189.677 132.244 163.210 101.280 L 210.000 54.490 L 210.000 88.000 C 210.000 91.314 212.686 94.000 216.000 94.000 C 219.314 94.000 222.000 91.314 222.000 88.000 L 222.000 40.000 C 222.000 36.686 219.314 34.000 216.000 34.000 ZM 150.660 198.700 C 124.882 224.466 83.099 224.459 57.329 198.685 C 31.559 172.912 31.559 131.128 57.329 105.355 C 83.099 79.581 124.882 79.574 150.660 105.340 C 176.394 131.140 176.394 172.900 150.660 198.700 Z"),
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
        return _genderMale!!
    }

private var _genderMale: ImageVector? = null
