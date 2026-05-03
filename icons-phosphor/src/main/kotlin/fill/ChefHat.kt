package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChefHat: ImageVector
    get() {
        if (_chefHat != null) return _chefHat!!
        _chefHat = phosphorFillIcon(
            name = "ChefHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 112.000 C 239.967 81.086 214.914 56.033 184.000 56.000 C 182.230 56.000 180.460 56.100 178.710 56.260 C 169.492 36.586 149.726 24.019 128.000 24.019 C 106.274 24.019 86.508 36.586 77.290 56.260 C 75.540 56.100 73.770 56.000 72.000 56.000 C 45.817 56.006 23.133 74.155 17.381 99.699 C 11.630 125.243 24.346 151.362 48.000 162.590 L 48.000 208.000 C 48.000 216.837 55.163 224.000 64.000 224.000 L 192.000 224.000 C 200.837 224.000 208.000 216.837 208.000 208.000 L 208.000 162.590 C 227.526 153.304 239.976 133.621 240.000 112.000 ZM 152.240 142.060 L 160.240 110.060 C 161.371 105.844 165.673 103.313 169.907 104.372 C 174.142 105.431 176.746 109.688 175.760 113.940 L 167.760 145.940 C 166.870 149.501 163.671 151.999 160.000 152.000 C 159.343 151.999 158.688 151.919 158.050 151.760 C 153.769 150.684 151.169 146.343 152.240 142.060 ZM 120.000 112.000 C 120.000 107.582 123.582 104.000 128.000 104.000 C 132.418 104.000 136.000 107.582 136.000 112.000 L 136.000 144.000 C 136.000 148.418 132.418 152.000 128.000 152.000 C 123.582 152.000 120.000 148.418 120.000 144.000 ZM 86.060 104.240 C 90.346 103.169 94.688 105.775 95.760 110.060 L 103.760 142.060 C 104.831 146.346 102.225 150.688 97.940 151.760 C 97.286 151.923 96.614 152.003 95.940 152.000 C 92.273 151.995 89.079 149.497 88.190 145.940 L 80.190 113.940 C 79.677 111.875 80.008 109.691 81.110 107.871 C 82.212 106.050 83.993 104.744 86.060 104.240 ZM 192.000 208.000 L 64.000 208.000 L 64.000 167.420 C 66.649 167.806 69.323 168.000 72.000 168.000 L 184.000 168.000 C 186.677 168.000 189.351 167.806 192.000 167.420 Z"),
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
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
