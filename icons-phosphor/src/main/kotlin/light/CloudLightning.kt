package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudLightning: ImageVector
    get() {
        if (_cloudLightning != null) return _cloudLightning!!
        _cloudLightning = phosphorLightIcon(
            name = "CloudLightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 156.000 18.000 C 124.624 18.006 96.642 37.744 86.110 67.300 C 85.536 66.999 84.919 66.789 84.280 66.680 C 81.543 66.228 78.774 66.000 76.000 66.000 C 48.386 66.000 26.000 88.386 26.000 116.000 C 26.000 143.614 48.386 166.000 76.000 166.000 L 117.400 166.000 L 98.850 196.910 C 97.736 198.765 97.706 201.075 98.773 202.958 C 99.839 204.840 101.837 206.002 104.000 206.000 L 133.400 206.000 L 114.850 236.910 C 113.143 239.754 114.066 243.443 116.910 245.150 C 119.754 246.857 123.443 245.934 125.150 243.090 L 149.150 203.090 C 150.264 201.235 150.294 198.925 149.227 197.042 C 148.161 195.160 146.163 193.998 144.000 194.000 L 114.600 194.000 L 131.400 166.000 L 156.000 166.000 C 196.869 166.000 230.000 132.869 230.000 92.000 C 230.000 51.131 196.869 18.000 156.000 18.000 ZM 156.000 154.000 L 76.000 154.000 C 61.677 153.983 48.580 145.914 42.124 133.128 C 35.668 120.343 36.950 105.013 45.439 93.477 C 53.928 81.941 68.183 76.159 82.310 78.520 C 82.572 78.562 82.835 78.589 83.100 78.600 C 82.545 81.591 82.177 84.613 82.000 87.650 C 81.807 90.964 84.336 93.807 87.650 94.000 C 90.964 94.193 93.807 91.664 94.000 88.350 C 95.955 54.604 124.558 28.630 158.336 29.926 C 192.113 31.222 218.641 59.312 218.005 93.108 C 217.369 126.904 189.802 153.976 156.000 154.000 Z"),
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
        return _cloudLightning!!
    }

private var _cloudLightning: ImageVector? = null
