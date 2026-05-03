package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.RainbowCloud: ImageVector
    get() {
        if (_rainbowCloud != null) return _rainbowCloud!!
        _rainbowCloud = phosphorBoldIcon(
            name = "RainbowCloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.000 108.000 C 183.723 108.055 165.311 119.840 156.770 138.230 L 156.000 138.230 C 136.150 138.230 120.000 154.780 120.000 175.120 C 120.000 195.460 136.150 212.000 156.000 212.000 L 204.000 212.000 C 232.719 212.000 256.000 188.719 256.000 160.000 C 256.000 131.281 232.719 108.000 204.000 108.000 ZM 204.000 188.000 L 156.000 188.000 C 149.380 188.000 144.000 182.220 144.000 175.110 C 144.000 168.000 149.380 162.220 156.000 162.220 C 157.462 162.214 158.910 162.500 160.260 163.060 C 163.569 164.416 167.310 164.226 170.464 162.542 C 173.618 160.857 175.857 157.854 176.570 154.350 C 179.542 139.925 193.180 130.268 207.773 132.256 C 222.366 134.244 232.925 147.197 231.930 161.891 C 230.936 176.585 218.728 187.997 204.000 188.000 ZM 109.220 136.840 C 113.279 142.074 112.330 149.606 107.100 153.670 C 105.143 155.187 103.998 157.524 104.000 160.000 L 104.000 176.000 C 104.000 182.627 98.627 188.000 92.000 188.000 C 85.373 188.000 80.000 182.627 80.000 176.000 L 80.000 160.000 C 79.969 150.106 84.545 140.762 92.380 134.720 C 94.894 132.768 98.081 131.894 101.239 132.292 C 104.397 132.689 107.268 134.325 109.220 136.840 ZM 136.660 118.840 C 121.833 109.961 103.378 109.739 88.341 118.257 C 73.305 126.775 64.008 142.718 64.000 160.000 L 64.000 176.000 C 64.000 182.627 58.627 188.000 52.000 188.000 C 45.373 188.000 40.000 182.627 40.000 176.000 L 40.000 160.000 C 39.998 134.069 53.941 110.140 76.502 97.355 C 99.062 84.570 126.755 84.904 149.000 98.230 C 154.683 101.640 156.525 109.012 153.115 114.695 C 149.705 120.378 142.333 122.220 136.650 118.810 ZM 24.000 160.000 L 24.000 176.000 C 24.000 182.627 18.627 188.000 12.000 188.000 C 5.373 188.000 0.000 182.627 0.000 176.000 L 0.000 160.000 C -0.002 116.121 25.620 76.282 65.547 58.083 C 105.474 39.883 152.351 46.676 185.470 75.460 C 190.471 79.809 190.999 87.389 186.650 92.390 C 182.301 97.391 174.721 97.919 169.720 93.570 C 143.697 70.958 106.866 65.623 75.497 79.924 C 44.128 94.224 23.998 125.525 24.000 160.000 Z"),
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
        return _rainbowCloud!!
    }

private var _rainbowCloud: ImageVector? = null
