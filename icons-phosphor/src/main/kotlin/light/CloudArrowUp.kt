package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudArrowUp: ImageVector
    get() {
        if (_cloudArrowUp != null) return _cloudArrowUp!!
        _cloudArrowUp = phosphorLightIcon(
            name = "CloudArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 188.240 164.240 C 185.897 166.580 182.103 166.580 179.760 164.240 L 158.000 142.490 L 158.000 208.000 C 158.000 211.314 155.314 214.000 152.000 214.000 C 148.686 214.000 146.000 211.314 146.000 208.000 L 146.000 142.490 L 124.240 164.240 C 121.876 166.443 118.192 166.378 115.907 164.093 C 113.622 161.808 113.557 158.124 115.760 155.760 L 147.760 123.760 C 150.103 121.420 153.897 121.420 156.240 123.760 L 188.240 155.760 C 190.580 158.103 190.580 161.897 188.240 164.240 ZM 160.000 42.000 C 126.897 42.027 96.740 61.030 82.430 90.880 C 59.364 86.952 36.051 96.344 22.150 115.165 C 8.248 133.986 6.127 159.030 16.664 179.921 C 27.201 200.812 48.602 213.992 72.000 214.000 L 112.000 214.000 C 115.314 214.000 118.000 211.314 118.000 208.000 C 118.000 204.686 115.314 202.000 112.000 202.000 L 72.000 202.000 C 44.386 202.000 22.000 179.614 22.000 152.000 C 22.000 124.386 44.386 102.000 72.000 102.000 C 73.975 102.005 75.949 102.125 77.910 102.360 C 75.311 110.658 73.993 119.304 74.000 128.000 C 74.000 131.314 76.686 134.000 80.000 134.000 C 83.314 134.000 86.000 131.314 86.000 128.000 C 86.014 91.045 113.290 59.765 149.899 54.720 C 186.509 49.676 221.228 72.414 231.235 107.989 C 241.242 143.564 223.470 181.068 189.600 195.850 C 186.562 197.175 185.175 200.712 186.500 203.750 C 187.825 206.788 191.362 208.175 194.400 206.850 C 231.763 190.582 252.579 150.324 244.255 110.432 C 235.930 70.541 200.751 41.968 160.000 42.000 Z"),
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
        return _cloudArrowUp!!
    }

private var _cloudArrowUp: ImageVector? = null
