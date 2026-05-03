package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Link: ImageVector
    get() {
        if (_link != null) return _link!!
        _link = phosphorThinIcon(
            name = "Link",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 88.120 C 235.638 101.031 230.337 113.311 221.190 122.430 L 186.440 157.170 C 176.959 166.698 164.061 172.038 150.620 172.000 L 150.570 172.000 C 136.912 171.989 123.837 166.460 114.315 156.668 C 104.793 146.877 99.630 133.653 100.000 120.000 C 100.060 117.834 101.833 116.109 104.000 116.110 L 104.110 116.110 C 105.171 116.139 106.177 116.588 106.907 117.359 C 107.636 118.130 108.030 119.159 108.000 120.220 C 107.693 131.715 112.041 142.846 120.058 151.089 C 128.075 159.332 139.081 163.988 150.580 164.000 L 150.580 164.000 C 161.892 164.032 172.746 159.534 180.720 151.510 L 215.470 116.770 C 226.415 106.036 230.755 90.252 226.834 75.431 C 222.914 60.611 211.338 49.037 196.517 45.119 C 181.695 41.201 165.912 45.543 155.180 56.490 L 144.180 67.490 C 142.609 68.986 140.132 68.956 138.596 67.423 C 137.061 65.891 137.027 63.414 138.520 61.840 L 149.520 50.840 C 164.187 36.128 186.352 31.866 205.430 40.090 C 224.507 48.313 236.627 67.355 236.000 88.120 ZM 111.780 188.490 L 100.780 199.490 C 92.799 207.531 81.929 212.037 70.600 212.000 L 70.600 212.000 C 53.366 211.985 37.836 201.594 31.247 185.669 C 24.657 169.744 28.305 151.418 40.490 139.230 L 75.240 104.490 C 87.585 92.143 106.210 88.572 122.246 95.477 C 138.282 102.382 148.487 118.367 148.000 135.820 C 147.936 138.029 149.676 139.871 151.885 139.935 C 154.094 139.999 155.936 138.259 156.000 136.050 C 156.588 115.309 144.464 96.308 125.406 88.103 C 106.348 79.898 84.213 84.149 69.550 98.830 L 34.800 133.570 C 20.326 148.045 15.992 169.811 23.818 188.727 C 31.644 207.642 50.090 219.983 70.560 220.000 L 70.560 220.000 C 83.998 220.035 96.892 214.696 106.370 205.170 L 117.370 194.170 C 118.425 193.170 118.854 191.676 118.491 190.269 C 118.128 188.861 117.030 187.762 115.623 187.396 C 114.216 187.031 112.722 187.457 111.720 188.510 Z"),
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
