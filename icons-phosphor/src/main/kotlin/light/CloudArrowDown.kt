package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudArrowDown: ImageVector
    get() {
        if (_cloudArrowDown != null) return _cloudArrowDown!!
        _cloudArrowDown = phosphorLightIcon(
            name = "CloudArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 246.000 128.000 C 246.053 146.616 240.012 164.739 228.800 179.600 C 226.812 182.251 223.051 182.788 220.400 180.800 C 217.749 178.812 217.212 175.051 219.200 172.400 C 238.518 146.643 238.965 111.350 220.304 85.112 C 201.644 58.874 168.160 47.713 137.489 57.507 C 106.818 67.301 86.000 95.803 86.000 128.000 C 86.000 131.314 83.314 134.000 80.000 134.000 C 76.686 134.000 74.000 131.314 74.000 128.000 C 73.993 119.304 75.311 110.658 77.910 102.360 C 75.949 102.125 73.975 102.005 72.000 102.000 C 44.386 102.000 22.000 124.386 22.000 152.000 C 22.000 179.614 44.386 202.000 72.000 202.000 L 96.000 202.000 C 99.314 202.000 102.000 204.686 102.000 208.000 C 102.000 211.314 99.314 214.000 96.000 214.000 L 72.000 214.000 C 48.602 213.992 27.201 200.812 16.664 179.921 C 6.127 159.030 8.248 133.986 22.150 115.165 C 36.051 96.344 59.364 86.952 82.430 90.880 C 99.770 54.658 139.870 35.258 179.033 44.146 C 218.195 53.033 245.994 87.841 246.000 128.000 ZM 179.760 171.760 L 158.000 193.510 L 158.000 128.000 C 158.000 124.686 155.314 122.000 152.000 122.000 C 148.686 122.000 146.000 124.686 146.000 128.000 L 146.000 193.510 L 124.240 171.760 C 121.876 169.557 118.192 169.622 115.907 171.907 C 113.622 174.192 113.557 177.876 115.760 180.240 L 147.760 212.240 C 150.103 214.580 153.897 214.580 156.240 212.240 L 188.240 180.240 C 190.443 177.876 190.378 174.192 188.093 171.907 C 185.808 169.622 182.124 169.557 179.760 171.760 Z"),
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
        return _cloudArrowDown!!
    }

private var _cloudArrowDown: ImageVector? = null
