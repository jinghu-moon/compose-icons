package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pentagon: ImageVector
    get() {
        if (_pentagon != null) return _pentagon!!
        _pentagon = phosphorLightIcon(
            name = "Pentagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.350 89.150 L 136.410 20.820 L 136.280 20.720 C 131.352 17.105 124.648 17.105 119.720 20.720 L 119.590 20.820 L 31.650 89.150 C 26.862 92.709 24.855 98.911 26.650 104.600 L 58.650 212.160 C 58.650 212.210 58.650 212.250 58.650 212.290 C 60.515 218.085 65.912 222.010 72.000 222.000 L 184.000 222.000 C 190.080 222.002 195.467 218.078 197.330 212.290 C 197.330 212.290 197.330 212.210 197.330 212.160 L 229.330 104.600 C 231.130 98.915 229.131 92.714 224.350 89.150 ZM 217.900 101.000 C 217.900 101.000 217.900 101.080 217.900 101.120 L 185.900 208.660 C 185.618 209.467 184.855 210.005 184.000 210.000 L 72.000 210.000 C 71.149 210.001 70.391 209.463 70.110 208.660 L 38.110 101.120 C 38.110 101.120 38.110 101.040 38.110 101.000 C 37.844 100.179 38.134 99.280 38.830 98.770 L 38.960 98.670 L 126.870 30.370 C 127.556 29.894 128.464 29.894 129.150 30.370 L 217.060 98.670 L 217.190 98.770 C 217.882 99.283 218.168 100.181 217.900 101.000 Z"),
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
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
