package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Link: ImageVector
    get() {
        if (_link != null) return _link!!
        _link = phosphorDuotoneIcon(
            name = "Link",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 218.340 119.600 L 183.600 154.340 C 172.016 165.939 155.188 170.595 139.290 166.600 C 138.980 166.940 138.670 167.270 138.340 167.600 L 103.600 202.340 C 91.869 214.357 74.583 219.137 58.345 214.856 C 42.107 210.575 29.425 197.893 25.144 181.655 C 20.863 165.417 25.643 148.131 37.660 136.400 L 72.400 101.660 C 83.986 90.065 100.812 85.409 116.710 89.400 C 117.020 89.060 117.330 88.730 117.710 88.400 L 152.400 53.660 C 170.671 35.823 199.890 35.999 217.945 54.055 C 236.001 72.110 236.177 101.329 218.340 119.600 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 240.000 88.230 C 239.599 102.157 233.872 115.399 224.000 125.230 L 189.250 160.000 C 179.027 170.279 165.117 176.040 150.620 176.000 L 150.570 176.000 C 135.823 175.990 121.706 170.017 111.429 159.441 C 101.151 148.864 95.587 134.582 96.000 119.840 C 96.124 115.422 99.807 111.941 104.225 112.065 C 108.643 112.189 112.124 115.872 112.000 120.290 C 111.706 130.713 115.639 140.813 122.905 148.292 C 130.171 155.770 140.153 159.993 150.580 160.000 L 150.580 160.000 C 160.828 160.026 170.661 155.954 177.890 148.690 L 212.640 113.940 C 227.565 98.827 227.489 74.500 212.470 59.480 C 197.450 44.461 173.123 44.385 158.010 59.310 L 147.010 70.310 C 143.865 73.298 138.911 73.235 135.843 70.167 C 132.775 67.099 132.712 62.145 135.700 59.000 L 146.700 48.000 C 156.949 37.747 170.853 31.987 185.350 31.987 C 199.847 31.987 213.751 37.747 224.000 48.000 C 234.623 58.649 240.407 73.194 240.000 88.230 ZM 109.000 185.660 L 98.000 196.660 C 90.753 203.955 80.883 208.040 70.600 208.000 L 70.600 208.000 C 54.983 207.987 40.909 198.573 34.937 184.142 C 28.965 169.712 32.269 153.105 43.310 142.060 L 78.000 107.310 C 89.181 96.070 106.094 92.803 120.656 99.069 C 135.219 105.336 144.475 119.863 144.000 135.710 C 143.941 137.832 144.727 139.890 146.187 141.432 C 147.646 142.974 149.658 143.872 151.780 143.930 L 152.000 143.930 C 156.334 143.932 159.881 140.482 160.000 136.150 C 160.385 121.141 154.603 106.630 144.000 96.000 C 122.660 74.669 88.070 74.669 66.730 96.000 L 32.000 130.750 C 16.381 146.362 11.701 169.844 20.140 190.252 C 28.578 210.660 48.476 223.978 70.560 224.000 L 70.560 224.000 C 85.060 224.042 98.974 218.280 109.200 208.000 L 120.200 197.000 C 122.884 193.839 122.707 189.151 119.793 186.201 C 116.879 183.251 112.194 183.016 109.000 185.660 Z"),
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
