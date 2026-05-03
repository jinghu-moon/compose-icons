package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ContactlessPayment: ImageVector
    get() {
        if (_contactlessPayment != null) return _contactlessPayment!!
        _contactlessPayment = phosphorLightIcon(
            name = "ContactlessPayment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 95.310 101.200 C 104.169 117.968 104.169 138.032 95.310 154.800 C 93.764 157.733 90.133 158.856 87.200 157.310 C 84.267 155.764 83.144 152.133 84.690 149.200 C 91.810 135.963 91.810 120.037 84.690 106.800 C 83.144 103.867 84.267 100.236 87.200 98.690 C 90.133 97.144 93.764 98.267 95.310 101.200 ZM 143.170 66.710 C 140.249 68.273 139.147 71.908 140.710 74.830 C 158.490 108.047 158.490 147.953 140.710 181.170 C 139.663 183.063 139.716 185.374 140.850 187.217 C 141.983 189.060 144.021 190.150 146.183 190.070 C 148.345 189.990 150.296 188.752 151.290 186.830 C 170.965 150.077 170.965 105.923 151.290 69.170 C 149.727 66.249 146.092 65.147 143.170 66.710 ZM 115.170 82.710 C 113.764 83.457 112.712 84.733 112.247 86.256 C 111.782 87.779 111.941 89.425 112.690 90.830 C 125.085 114.067 125.085 141.953 112.690 165.190 C 111.133 168.117 112.243 171.753 115.170 173.310 C 118.097 174.867 121.733 173.757 123.290 170.830 C 137.562 144.067 137.562 111.953 123.290 85.190 C 121.738 82.263 118.107 81.149 115.180 82.700 ZM 230.000 128.000 C 230.000 184.333 184.333 230.000 128.000 230.000 C 71.667 230.000 26.000 184.333 26.000 128.000 C 26.000 71.667 71.667 26.000 128.000 26.000 C 184.306 26.066 229.934 71.694 230.000 128.000 ZM 218.000 128.000 C 218.000 78.294 177.706 38.000 128.000 38.000 C 78.294 38.000 38.000 78.294 38.000 128.000 C 38.000 177.706 78.294 218.000 128.000 218.000 C 177.683 217.945 217.945 177.683 218.000 128.000 Z"),
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
        return _contactlessPayment!!
    }

private var _contactlessPayment: ImageVector? = null
