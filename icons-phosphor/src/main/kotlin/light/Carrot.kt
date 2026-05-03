package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Carrot: ImageVector
    get() {
        if (_carrot != null) return _carrot!!
        _carrot = phosphorLightIcon(
            name = "Carrot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 66.000 L 198.480 66.000 L 228.240 36.240 C 229.845 34.744 230.506 32.492 229.963 30.366 C 229.420 28.240 227.760 26.580 225.634 26.037 C 223.508 25.494 221.256 26.155 219.760 27.760 L 190.000 57.520 L 190.000 24.000 C 190.000 20.686 187.314 18.000 184.000 18.000 C 180.686 18.000 178.000 20.686 178.000 24.000 L 178.000 60.150 C 153.443 44.060 120.968 47.400 100.200 68.150 L 100.200 68.150 L 100.200 68.150 C 60.170 107.400 30.050 201.450 27.380 210.000 C 24.819 215.355 25.914 221.742 30.111 225.939 C 34.308 230.136 40.695 231.231 46.050 228.670 C 54.550 226.000 148.670 195.860 187.840 155.900 C 208.611 135.125 211.952 102.625 195.840 78.060 L 232.000 78.060 C 235.314 78.060 238.000 75.374 238.000 72.060 C 238.000 68.746 235.314 66.060 232.000 66.060 ZM 179.310 147.410 C 170.000 157.000 157.000 166.000 142.690 174.240 L 116.230 147.770 C 113.886 145.426 110.084 145.426 107.740 147.770 C 105.396 150.114 105.396 153.916 107.740 156.260 L 131.740 180.260 C 90.050 202.260 42.740 217.080 42.010 217.260 C 41.645 217.375 41.290 217.523 40.950 217.700 C 40.175 218.106 39.226 217.962 38.607 217.343 C 37.988 216.724 37.844 215.775 38.250 215.000 C 38.428 214.680 38.578 214.345 38.700 214.000 C 39.000 213.000 67.550 121.720 104.480 81.000 L 139.750 116.260 C 141.246 117.865 143.498 118.526 145.624 117.983 C 147.750 117.440 149.410 115.780 149.953 113.654 C 150.496 111.528 149.835 109.276 148.230 107.780 L 113.130 72.680 C 133.946 56.314 163.913 59.015 181.467 78.840 C 199.021 98.665 198.075 128.738 179.310 147.420 Z"),
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
        return _carrot!!
    }

private var _carrot: ImageVector? = null
