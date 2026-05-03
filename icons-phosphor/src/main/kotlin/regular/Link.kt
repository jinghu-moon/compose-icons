package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Link: ImageVector
    get() {
        if (_link != null) return _link!!
        _link = phosphorRegularIcon(
            name = "Link",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 88.230 C 239.599 102.157 233.872 115.399 224.000 125.230 L 189.250 160.000 C 179.027 170.279 165.117 176.040 150.620 176.000 L 150.570 176.000 C 135.823 175.990 121.706 170.017 111.429 159.441 C 101.151 148.864 95.587 134.582 96.000 119.840 C 96.124 115.422 99.807 111.941 104.225 112.065 C 108.643 112.189 112.124 115.872 112.000 120.290 C 111.706 130.713 115.639 140.813 122.905 148.292 C 130.171 155.770 140.153 159.993 150.580 160.000 L 150.580 160.000 C 160.828 160.026 170.661 155.954 177.890 148.690 L 212.640 113.940 C 227.565 98.827 227.489 74.500 212.470 59.480 C 197.450 44.461 173.123 44.385 158.010 59.310 L 147.010 70.310 C 143.865 73.298 138.911 73.235 135.843 70.167 C 132.775 67.099 132.712 62.145 135.700 59.000 L 146.700 48.000 C 156.949 37.747 170.853 31.987 185.350 31.987 C 199.847 31.987 213.751 37.747 224.000 48.000 C 234.623 58.649 240.407 73.194 240.000 88.230 ZM 109.000 185.660 L 98.000 196.660 C 90.753 203.955 80.883 208.040 70.600 208.000 L 70.600 208.000 C 54.983 207.987 40.909 198.573 34.937 184.142 C 28.965 169.712 32.269 153.105 43.310 142.060 L 78.000 107.310 C 89.181 96.070 106.094 92.803 120.656 99.069 C 135.219 105.336 144.475 119.863 144.000 135.710 C 143.876 140.128 147.357 143.811 151.775 143.935 C 156.193 144.059 159.876 140.578 160.000 136.160 C 160.388 121.148 154.605 106.632 144.000 96.000 C 122.660 74.669 88.070 74.669 66.730 96.000 L 32.000 130.750 C 16.381 146.362 11.701 169.844 20.140 190.252 C 28.578 210.660 48.476 223.978 70.560 224.000 L 70.560 224.000 C 85.060 224.042 98.974 218.280 109.200 208.000 L 120.200 197.000 C 122.884 193.839 122.707 189.151 119.793 186.201 C 116.879 183.251 112.194 183.016 109.000 185.660 Z"),
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
        return _link!!
    }

private var _link: ImageVector? = null
