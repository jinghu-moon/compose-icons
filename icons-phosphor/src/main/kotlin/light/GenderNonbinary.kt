package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GenderNonbinary: ImageVector
    get() {
        if (_genderNonbinary != null) return _genderNonbinary!!
        _genderNonbinary = phosphorLightIcon(
            name = "GenderNonbinary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 134.000 98.270 L 134.000 58.600 L 164.910 77.140 C 166.749 78.322 169.086 78.410 171.009 77.370 C 172.932 76.329 174.137 74.325 174.154 72.139 C 174.171 69.952 172.997 67.930 171.090 66.860 L 139.660 48.000 L 171.090 29.150 C 173.932 27.443 174.852 23.757 173.145 20.915 C 171.438 18.073 167.752 17.153 164.910 18.860 L 128.000 41.000 L 91.090 18.860 C 88.248 17.153 84.562 18.073 82.855 20.915 C 81.148 23.757 82.068 27.443 84.910 29.150 L 116.340 48.000 L 84.910 66.860 C 83.003 67.930 81.829 69.952 81.846 72.139 C 81.863 74.325 83.068 76.329 84.991 77.370 C 86.914 78.410 89.251 78.322 91.090 77.140 L 122.000 58.600 L 122.000 98.270 C 84.646 101.484 56.456 133.558 58.064 171.015 C 59.673 208.473 90.508 238.012 128.000 238.012 C 165.492 238.012 196.327 208.473 197.936 171.015 C 199.544 133.558 171.354 101.484 134.000 98.270 ZM 128.000 226.000 C 95.967 226.000 70.000 200.033 70.000 168.000 C 70.000 135.967 95.967 110.000 128.000 110.000 C 160.033 110.000 186.000 135.967 186.000 168.000 C 185.961 200.017 160.017 225.961 128.000 226.000 Z"),
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
        return _genderNonbinary!!
    }

private var _genderNonbinary: ImageVector? = null
