package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BellSimpleSlash: ImageVector
    get() {
        if (_bellSimpleSlash != null) return _bellSimpleSlash!!
        _bellSimpleSlash = phosphorLightIcon(
            name = "BellSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 52.440 36.000 C 50.163 33.887 46.650 33.861 44.342 35.940 C 42.034 38.019 41.695 41.516 43.560 44.000 L 61.310 63.560 C 53.888 75.741 49.974 89.736 50.000 104.000 C 50.000 139.740 41.580 167.200 35.920 176.940 C 33.392 181.268 33.372 186.618 35.865 190.966 C 38.359 195.314 42.988 197.997 48.000 198.000 L 183.530 198.000 L 203.530 220.000 C 205.761 222.452 209.558 222.631 212.010 220.400 C 214.462 218.169 214.641 214.372 212.410 211.920 ZM 48.000 186.000 C 47.291 186.010 46.636 185.624 46.300 185.000 C 45.943 184.381 45.943 183.619 46.300 183.000 C 53.860 170.000 62.000 139.690 62.000 104.000 C 61.979 93.143 64.652 82.450 69.780 72.880 L 172.620 186.000 ZM 166.000 224.000 C 166.000 227.314 163.314 230.000 160.000 230.000 L 96.000 230.000 C 92.686 230.000 90.000 227.314 90.000 224.000 C 90.000 220.686 92.686 218.000 96.000 218.000 L 160.000 218.000 C 163.314 218.000 166.000 220.686 166.000 224.000 ZM 213.270 177.380 C 212.570 177.660 211.823 177.802 211.070 177.800 C 208.604 177.798 206.390 176.286 205.490 173.990 C 198.290 155.680 194.000 129.510 194.000 103.990 C 194.002 80.502 181.521 58.783 161.226 46.959 C 140.932 35.134 115.883 34.986 95.450 46.570 C 93.584 47.678 91.265 47.691 89.386 46.605 C 87.506 45.519 86.360 43.503 86.388 41.333 C 86.416 39.163 87.614 37.177 89.520 36.140 C 113.668 22.444 143.277 22.616 167.265 36.591 C 191.252 50.566 206.004 76.238 206.000 104.000 C 206.000 139.700 214.160 163.240 216.660 169.610 C 217.866 172.692 216.349 176.168 213.270 177.380 Z"),
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
        return _bellSimpleSlash!!
    }

private var _bellSimpleSlash: ImageVector? = null
