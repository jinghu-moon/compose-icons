package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Parachute: ImageVector
    get() {
        if (_parachute != null) return _parachute!!
        _parachute = phosphorLightIcon(
            name = "Parachute",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.000 120.000 C 230.000 63.667 184.333 18.000 128.000 18.000 C 71.667 18.000 26.000 63.667 26.000 120.000 C 26.003 121.827 26.839 123.554 28.270 124.690 L 28.400 124.800 L 122.000 195.000 L 122.000 218.000 L 112.000 218.000 C 108.686 218.000 106.000 220.686 106.000 224.000 C 106.000 227.314 108.686 230.000 112.000 230.000 L 144.000 230.000 C 147.314 230.000 150.000 227.314 150.000 224.000 C 150.000 220.686 147.314 218.000 144.000 218.000 L 134.000 218.000 L 134.000 195.000 L 227.600 124.800 L 227.600 124.800 C 229.111 123.667 230.000 121.889 230.000 120.000 ZM 217.800 114.000 L 173.900 114.000 C 172.600 71.080 157.400 45.380 145.470 31.700 C 185.389 39.670 215.023 73.389 217.800 114.000 ZM 128.000 31.430 C 134.003 36.469 139.202 42.394 143.420 49.000 C 157.260 70.080 161.240 95.000 161.890 114.000 L 94.110 114.000 C 95.170 82.120 104.600 61.140 112.580 49.000 C 116.792 42.390 121.992 36.464 128.000 31.430 ZM 157.800 126.000 L 128.000 179.650 L 98.200 126.000 ZM 84.470 126.000 L 109.090 170.320 L 50.000 126.000 ZM 171.530 126.000 L 206.000 126.000 L 146.910 170.320 ZM 110.530 31.700 C 98.600 45.380 83.400 71.080 82.100 114.000 L 38.200 114.000 C 40.977 73.389 70.611 39.670 110.530 31.700 Z"),
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
        return _parachute!!
    }

private var _parachute: ImageVector? = null
