package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudX: ImageVector
    get() {
        if (_cloudX != null) return _cloudX!!
        _cloudX = phosphorLightIcon(
            name = "CloudX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 160.000 42.000 C 126.897 42.029 96.742 61.031 82.430 90.880 C 59.364 86.952 36.051 96.344 22.150 115.165 C 8.248 133.986 6.127 159.030 16.664 179.921 C 27.201 200.812 48.602 213.992 72.000 214.000 L 160.000 214.000 C 207.496 214.000 246.000 175.496 246.000 128.000 C 246.000 80.504 207.496 42.000 160.000 42.000 ZM 160.000 202.000 L 72.000 202.000 C 44.386 202.000 22.000 179.614 22.000 152.000 C 22.000 124.386 44.386 102.000 72.000 102.000 C 73.975 102.001 75.949 102.118 77.910 102.350 C 75.311 110.652 73.993 119.301 74.000 128.000 C 74.000 131.314 76.686 134.000 80.000 134.000 C 83.314 134.000 86.000 131.314 86.000 128.000 C 86.000 87.131 119.131 54.000 160.000 54.000 C 200.869 54.000 234.000 87.131 234.000 128.000 C 234.000 168.869 200.869 202.000 160.000 202.000 ZM 188.240 116.240 L 168.480 136.000 L 188.240 155.760 C 189.845 157.256 190.506 159.508 189.963 161.634 C 189.420 163.760 187.760 165.420 185.634 165.963 C 183.508 166.506 181.256 165.845 179.760 164.240 L 160.000 144.480 L 140.240 164.240 C 137.876 166.443 134.192 166.378 131.907 164.093 C 129.622 161.808 129.557 158.124 131.760 155.760 L 151.520 136.000 L 131.760 116.240 C 129.557 113.876 129.622 110.192 131.907 107.907 C 134.192 105.622 137.876 105.557 140.240 107.760 L 160.000 127.520 L 179.760 107.760 C 182.124 105.557 185.808 105.622 188.093 107.907 C 190.378 110.192 190.443 113.876 188.240 116.240 Z"),
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
        return _cloudX!!
    }

private var _cloudX: ImageVector? = null
