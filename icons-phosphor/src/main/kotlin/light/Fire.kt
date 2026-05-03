package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Fire: ImageVector
    get() {
        if (_fire != null) return _fire!!
        _fire = phosphorLightIcon(
            name = "Fire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 181.920 153.000 C 177.822 175.898 159.898 193.822 137.000 197.920 C 136.669 197.971 136.335 197.997 136.000 198.000 C 132.872 198.012 130.259 195.619 129.997 192.502 C 129.736 189.384 131.913 186.589 135.000 186.080 C 152.380 183.160 167.130 168.400 170.080 151.000 C 170.632 147.730 173.730 145.528 177.000 146.080 C 180.270 146.632 182.472 149.730 181.920 153.000 ZM 214.000 144.000 C 214.000 191.496 175.496 230.000 128.000 230.000 C 80.504 230.000 42.000 191.496 42.000 144.000 C 42.000 116.530 52.850 88.390 74.250 60.360 C 75.290 58.979 76.874 58.113 78.598 57.985 C 80.322 57.857 82.017 58.478 83.250 59.690 L 109.590 85.250 L 132.680 21.940 C 133.349 20.107 134.867 18.713 136.751 18.204 C 138.635 17.695 140.649 18.133 142.150 19.380 C 163.720 37.330 214.000 85.400 214.000 144.000 ZM 202.000 144.000 C 202.000 95.600 163.350 54.160 140.930 34.200 L 117.640 98.060 C 116.944 99.972 115.326 101.401 113.342 101.856 C 111.358 102.311 109.279 101.728 107.820 100.310 L 79.820 73.090 C 62.670 97.130 54.000 121.000 54.000 144.000 C 54.000 184.869 87.131 218.000 128.000 218.000 C 168.869 218.000 202.000 184.869 202.000 144.000 Z"),
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
        return _fire!!
    }

private var _fire: ImageVector? = null
