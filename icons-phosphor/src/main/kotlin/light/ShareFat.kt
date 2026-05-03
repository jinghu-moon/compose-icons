package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShareFat: ImageVector
    get() {
        if (_shareFat != null) return _shareFat!!
        _shareFat = phosphorLightIcon(
            name = "ShareFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.240 107.760 L 156.240 27.760 C 154.524 26.046 151.945 25.534 149.705 26.462 C 147.464 27.389 146.002 29.575 146.000 32.000 L 146.000 74.200 C 91.520 77.790 25.610 129.200 18.070 194.860 C 17.568 199.148 19.875 203.275 23.791 205.093 C 27.707 206.912 32.348 206.011 35.300 202.860 L 35.300 202.860 C 46.560 190.850 87.000 152.600 146.000 150.130 L 146.000 192.000 C 146.002 194.425 147.464 196.611 149.705 197.538 C 151.945 198.466 154.524 197.954 156.240 196.240 L 236.240 116.240 C 238.580 113.897 238.580 110.103 236.240 107.760 ZM 158.000 177.520 L 158.000 144.000 C 158.000 140.686 155.314 138.000 152.000 138.000 C 124.270 138.000 97.240 145.250 71.680 159.550 C 56.782 167.919 43.059 178.225 30.870 190.200 C 35.570 163.640 51.030 138.200 74.870 117.930 C 98.470 97.940 127.290 86.000 152.000 86.000 C 155.314 86.000 158.000 83.314 158.000 80.000 L 158.000 46.490 L 223.510 112.000 Z"),
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
        return _shareFat!!
    }

private var _shareFat: ImageVector? = null
