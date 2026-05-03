package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AmazonLogo: ImageVector
    get() {
        if (_amazonLogo != null) return _amazonLogo!!
        _amazonLogo = phosphorLightIcon(
            name = "AmazonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 246.000 168.000 L 246.000 200.000 C 246.000 203.314 243.314 206.000 240.000 206.000 C 236.686 206.000 234.000 203.314 234.000 200.000 L 234.000 182.480 L 228.340 188.140 C 225.600 191.150 188.860 230.000 128.000 230.000 C 66.000 230.000 29.080 189.730 27.540 188.000 C 25.968 186.430 25.392 184.119 26.044 181.994 C 26.696 179.870 28.469 178.280 30.652 177.862 C 32.834 177.444 35.069 178.267 36.460 180.000 C 36.800 180.370 71.550 218.000 128.000 218.000 C 184.450 218.000 219.200 180.360 219.550 180.000 L 219.760 179.780 L 225.520 174.020 L 208.000 174.020 C 204.686 174.020 202.000 171.334 202.000 168.020 C 202.000 164.706 204.686 162.020 208.000 162.020 L 240.000 162.020 C 243.306 162.020 245.989 164.694 246.000 168.000 ZM 162.000 99.560 L 162.000 84.000 C 162.010 66.426 149.968 51.137 132.880 47.030 C 115.792 42.924 98.117 51.070 90.140 66.730 C 89.203 68.705 87.266 70.014 85.084 70.147 C 82.902 70.280 80.821 69.216 79.651 67.369 C 78.481 65.523 78.408 63.186 79.460 61.270 C 89.964 40.679 113.213 29.971 135.688 35.375 C 158.163 40.779 174.005 60.884 174.000 84.000 L 174.000 176.000 C 174.000 179.314 171.314 182.000 168.000 182.000 C 164.686 182.000 162.000 179.314 162.000 176.000 L 162.000 164.440 C 148.409 180.380 126.322 186.159 106.666 178.917 C 87.010 171.675 73.952 152.948 73.952 132.000 C 73.952 111.052 87.010 92.325 106.666 85.083 C 126.322 77.841 148.409 83.620 162.000 99.560 ZM 162.000 132.000 C 162.000 111.013 144.987 94.000 124.000 94.000 C 103.013 94.000 86.000 111.013 86.000 132.000 C 86.000 152.987 103.013 170.000 124.000 170.000 C 144.987 170.000 162.000 152.987 162.000 132.000 Z"),
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
        return _amazonLogo!!
    }

private var _amazonLogo: ImageVector? = null
