package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Link: ImageVector
    get() {
        if (_link != null) return _link!!
        _link = phosphorFillIcon(
            name = "Link",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 115.700 192.490 C 97.226 205.082 72.204 201.543 57.947 184.323 C 43.689 167.102 44.882 141.859 60.700 126.060 L 86.070 100.690 C 102.993 83.798 130.397 83.798 147.320 100.690 C 151.711 105.055 155.106 110.319 157.270 116.120 C 158.816 120.262 156.712 124.874 152.570 126.420 C 148.428 127.966 143.816 125.862 142.270 121.720 C 139.003 113.027 131.546 106.587 122.469 104.622 C 113.393 102.658 103.940 105.436 97.370 112.000 L 72.000 137.370 C 62.035 147.336 61.285 163.247 70.270 174.105 C 79.255 184.963 95.025 187.205 106.680 179.280 C 109.036 177.518 112.169 177.192 114.838 178.430 C 117.507 179.668 119.281 182.272 119.457 185.209 C 119.632 188.146 118.182 190.942 115.680 192.490 ZM 195.310 129.940 L 169.940 155.310 C 161.839 163.462 150.812 168.032 139.320 168.000 L 139.320 168.000 C 121.274 167.976 105.130 156.776 98.790 139.880 C 97.244 135.738 99.348 131.126 103.490 129.580 C 107.632 128.034 112.244 130.138 113.790 134.280 C 117.786 144.904 127.929 151.955 139.280 152.000 L 139.280 152.000 C 146.530 152.021 153.487 149.140 158.600 144.000 L 184.000 118.630 C 193.965 108.664 194.715 92.753 185.730 81.895 C 176.745 71.037 160.975 68.795 149.320 76.720 C 146.964 78.482 143.831 78.808 141.162 77.570 C 138.493 76.332 136.719 73.728 136.543 70.791 C 136.367 67.854 137.818 65.058 140.320 63.510 C 158.795 50.983 183.764 54.545 197.999 71.739 C 212.234 88.932 211.074 114.127 195.320 129.940 Z"),
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
        return _link!!
    }

private var _link: ImageVector? = null
