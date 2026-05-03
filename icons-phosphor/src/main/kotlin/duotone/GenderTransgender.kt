package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GenderTransgender: ImageVector
    get() {
        if (_genderTransgender != null) return _genderTransgender!!
        _genderTransgender = phosphorDuotoneIcon(
            name = "GenderTransgender",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 141.250 205.250 C 122.947 223.557 95.419 229.035 71.502 219.130 C 47.585 209.224 31.990 185.887 31.990 160.000 C 31.990 134.113 47.585 110.776 71.502 100.870 C 95.419 90.965 122.947 96.443 141.250 114.750 C 166.237 139.742 166.237 180.258 141.250 205.250 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 216.000 32.000 L 168.000 32.000 C 163.582 32.000 160.000 35.582 160.000 40.000 C 160.000 44.418 163.582 48.000 168.000 48.000 L 196.690 48.000 L 168.000 76.690 L 149.660 58.350 C 146.537 55.224 141.471 55.222 138.345 58.345 C 135.219 61.468 135.217 66.534 138.340 69.660 L 156.690 88.000 L 140.930 103.760 C 111.091 79.949 67.850 83.591 42.414 112.058 C 16.978 140.524 18.206 183.901 45.212 210.883 C 72.217 237.864 115.596 239.054 144.040 213.593 C 172.483 188.132 176.087 144.888 152.250 115.070 L 168.000 99.330 L 186.340 117.670 C 189.463 120.796 194.529 120.798 197.655 117.675 C 200.781 114.552 200.783 109.486 197.660 106.360 L 179.310 88.000 L 208.000 59.320 L 208.000 88.000 C 208.000 92.418 211.582 96.000 216.000 96.000 C 220.418 96.000 224.000 92.418 224.000 88.000 L 224.000 40.000 C 224.000 35.582 220.418 32.000 216.000 32.000 ZM 135.600 199.630 C 116.712 218.520 87.111 221.439 64.897 206.602 C 42.683 191.765 34.041 163.304 44.256 138.621 C 54.470 113.938 80.697 99.906 106.899 105.105 C 133.102 110.304 151.984 133.287 152.000 160.000 C 152.000 174.861 146.102 189.115 135.600 199.630 Z"),
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
        return _genderTransgender!!
    }

private var _genderTransgender: ImageVector? = null
