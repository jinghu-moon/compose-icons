package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Club: ImageVector
    get() {
        if (_club != null) return _club!!
        _club = phosphorRegularIcon(
            name = "Club",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 88.000 C 183.220 88.000 182.440 88.000 181.670 88.000 C 188.498 65.074 180.010 40.341 160.542 26.440 C 141.074 12.539 114.926 12.539 95.458 26.440 C 75.990 40.341 67.502 65.074 74.330 88.000 C 73.550 88.000 72.780 88.000 72.000 88.000 C 48.943 88.011 28.249 102.154 19.863 123.632 C 11.476 145.110 17.112 169.533 34.061 185.165 C 51.011 200.797 75.809 204.443 96.540 194.350 L 88.340 221.700 C 87.613 224.122 88.074 226.745 89.583 228.774 C 91.092 230.803 93.471 231.999 96.000 232.000 L 160.000 232.000 C 162.529 231.999 164.908 230.803 166.417 228.774 C 167.926 226.745 168.387 224.122 167.660 221.700 L 159.460 194.350 C 180.191 204.443 204.989 200.797 221.939 185.165 C 238.888 169.533 244.524 145.110 236.137 123.632 C 227.751 102.154 207.057 88.011 184.000 88.000 ZM 184.000 184.000 C 170.548 183.998 157.998 177.234 150.600 166.000 C 148.407 162.702 144.132 161.505 140.545 163.184 C 136.959 164.863 135.141 168.914 136.270 172.710 L 149.270 215.970 L 106.770 215.970 L 119.770 172.710 C 120.971 168.885 119.155 164.761 115.522 163.065 C 111.889 161.369 107.562 162.624 105.400 166.000 C 93.913 183.399 70.988 189.056 52.725 179.000 C 34.462 168.943 26.986 146.545 35.547 127.535 C 44.108 108.525 65.835 99.279 85.470 106.290 C 88.724 107.453 92.358 106.396 94.479 103.667 C 96.600 100.939 96.730 97.157 94.800 94.290 C 83.589 77.607 86.499 55.195 101.600 41.929 C 116.700 28.663 139.300 28.663 154.400 41.929 C 169.501 55.195 172.411 77.607 161.200 94.290 C 159.270 97.157 159.400 100.939 161.521 103.667 C 163.642 106.396 167.276 107.453 170.530 106.290 C 185.527 100.985 202.241 105.071 213.100 116.695 C 223.959 128.320 226.898 145.274 220.585 159.874 C 214.272 174.475 199.907 183.948 184.000 184.000 Z"),
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
        return _club!!
    }

private var _club: ImageVector? = null
