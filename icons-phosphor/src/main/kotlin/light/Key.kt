package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Key: ImageVector
    get() {
        if (_key != null) return _key!!
        _key = phosphorLightIcon(
            name = "Key",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 215.150 40.850 C 189.485 15.164 149.489 10.585 118.683 29.807 C 87.876 49.029 74.409 86.966 86.200 121.310 L 30.100 177.410 C 27.469 180.032 25.993 183.596 26.000 187.310 L 26.000 216.000 C 26.000 223.732 32.268 230.000 40.000 230.000 L 72.000 230.000 C 75.314 230.000 78.000 227.314 78.000 224.000 L 78.000 206.000 L 96.000 206.000 C 99.314 206.000 102.000 203.314 102.000 200.000 L 102.000 182.000 L 120.000 182.000 C 121.591 181.999 123.116 181.366 124.240 180.240 L 134.690 169.800 C 142.835 172.595 151.389 174.014 160.000 174.000 L 160.100 174.000 C 191.627 173.956 220.028 154.937 232.074 125.802 C 244.119 96.667 237.441 63.145 215.150 40.850 ZM 226.000 98.160 C 224.880 133.320 195.330 161.960 160.120 162.000 C 151.727 162.018 143.408 160.433 135.610 157.330 C 133.348 156.345 130.714 156.845 128.970 158.590 L 117.510 170.000 L 96.000 170.000 C 92.686 170.000 90.000 172.686 90.000 176.000 L 90.000 194.000 L 72.000 194.000 C 68.686 194.000 66.000 196.686 66.000 200.000 L 66.000 218.000 L 40.000 218.000 C 38.895 218.000 38.000 217.105 38.000 216.000 L 38.000 187.310 C 38.000 186.782 38.208 186.275 38.580 185.900 L 97.410 127.070 C 99.155 125.326 99.655 122.692 98.670 120.430 C 95.560 112.634 93.975 104.314 94.000 95.920 C 94.000 60.710 122.680 31.160 157.830 30.000 C 176.088 29.389 193.783 36.374 206.702 49.291 C 219.621 62.208 226.608 79.901 226.000 98.160 ZM 190.000 76.000 C 190.000 81.523 185.523 86.000 180.000 86.000 C 174.477 86.000 170.000 81.523 170.000 76.000 C 170.000 70.477 174.477 66.000 180.000 66.000 C 185.523 66.000 190.000 70.477 190.000 76.000 Z"),
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
        return _key!!
    }

private var _key: ImageVector? = null
