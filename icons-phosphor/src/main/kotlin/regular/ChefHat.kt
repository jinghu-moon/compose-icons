package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChefHat: ImageVector
    get() {
        if (_chefHat != null) return _chefHat!!
        _chefHat = phosphorRegularIcon(
            name = "ChefHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 112.000 C 239.967 81.086 214.914 56.033 184.000 56.000 C 182.230 56.000 180.460 56.100 178.710 56.260 C 169.492 36.586 149.726 24.019 128.000 24.019 C 106.274 24.019 86.508 36.586 77.290 56.260 C 75.540 56.100 73.770 56.000 72.000 56.000 C 45.817 56.006 23.133 74.155 17.381 99.699 C 11.630 125.243 24.346 151.362 48.000 162.590 L 48.000 208.000 C 48.000 216.837 55.163 224.000 64.000 224.000 L 192.000 224.000 C 200.837 224.000 208.000 216.837 208.000 208.000 L 208.000 162.590 C 227.526 153.304 239.976 133.621 240.000 112.000 ZM 192.000 208.000 L 64.000 208.000 L 64.000 167.420 C 66.649 167.806 69.323 168.000 72.000 168.000 L 184.000 168.000 C 186.677 168.000 189.351 167.806 192.000 167.420 ZM 184.000 152.000 L 170.250 152.000 L 175.760 129.940 C 176.746 125.688 174.142 121.431 169.907 120.372 C 165.673 119.313 161.371 121.844 160.240 126.060 L 153.750 152.000 L 136.000 152.000 L 136.000 128.000 C 136.000 123.582 132.418 120.000 128.000 120.000 C 123.582 120.000 120.000 123.582 120.000 128.000 L 120.000 152.000 L 102.250 152.000 L 95.760 126.060 C 95.107 123.244 92.986 120.999 90.211 120.188 C 87.436 119.377 84.440 120.126 82.373 122.148 C 80.306 124.169 79.491 127.148 80.240 129.940 L 85.750 152.000 L 72.000 152.000 C 49.909 152.000 32.000 134.091 32.000 112.000 C 32.000 89.909 49.909 72.000 72.000 72.000 L 72.580 72.000 C 72.193 74.649 71.999 77.323 72.000 80.000 C 72.000 84.418 75.582 88.000 80.000 88.000 C 84.418 88.000 88.000 84.418 88.000 80.000 C 88.000 57.909 105.909 40.000 128.000 40.000 C 150.091 40.000 168.000 57.909 168.000 80.000 C 168.000 84.418 171.582 88.000 176.000 88.000 C 180.418 88.000 184.000 84.418 184.000 80.000 C 184.001 77.323 183.807 74.649 183.420 72.000 L 184.000 72.000 C 206.091 72.000 224.000 89.909 224.000 112.000 C 224.000 134.091 206.091 152.000 184.000 152.000 Z"),
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
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
