package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Warning: ImageVector
    get() {
        if (_warning != null) return _warning!!
        _warning = phosphorLightIcon(
            name = "Warning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 235.070 189.090 L 147.610 37.220 L 147.610 37.220 C 143.523 30.270 136.062 26.003 128.000 26.003 C 119.938 26.003 112.477 30.270 108.390 37.220 L 20.930 189.090 C 17.010 195.800 17.010 204.100 20.930 210.810 C 24.965 217.813 32.468 222.092 40.550 222.000 L 215.450 222.000 C 223.525 222.085 231.018 217.807 235.050 210.810 C 238.976 204.104 238.983 195.803 235.070 189.090 ZM 224.660 204.800 C 222.757 208.072 219.235 210.061 215.450 210.000 L 40.550 210.000 C 36.765 210.061 33.243 208.072 31.340 204.800 C 29.559 201.805 29.559 198.075 31.340 195.080 L 118.790 43.210 C 120.735 39.980 124.229 38.004 128.000 38.004 C 131.771 38.004 135.265 39.980 137.210 43.210 L 224.670 195.080 C 226.448 198.077 226.444 201.807 224.660 204.800 ZM 122.000 144.000 L 122.000 104.000 C 122.000 100.686 124.686 98.000 128.000 98.000 C 131.314 98.000 134.000 100.686 134.000 104.000 L 134.000 144.000 C 134.000 147.314 131.314 150.000 128.000 150.000 C 124.686 150.000 122.000 147.314 122.000 144.000 ZM 138.000 180.000 C 138.000 185.523 133.523 190.000 128.000 190.000 C 122.477 190.000 118.000 185.523 118.000 180.000 C 118.000 174.477 122.477 170.000 128.000 170.000 C 133.523 170.000 138.000 174.477 138.000 180.000 Z"),
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
        return _warning!!
    }

private var _warning: ImageVector? = null
