package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Pants: ImageVector
    get() {
        if (_pants != null) return _pants!!
        _pants = phosphorFillIcon(
            name = "Pants",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 53.440 43.500 L 54.120 38.000 C 55.128 29.998 61.935 23.997 70.000 24.000 L 186.000 24.000 C 194.065 23.997 200.872 29.998 201.880 38.000 L 202.560 43.490 C 202.704 44.634 202.347 45.785 201.581 46.648 C 200.815 47.510 199.713 47.999 198.560 47.990 L 57.410 47.990 C 56.264 47.990 55.173 47.498 54.413 46.640 C 53.654 45.781 53.300 44.638 53.440 43.500 ZM 169.000 64.000 C 172.668 78.122 185.409 87.986 200.000 88.000 L 203.590 88.000 C 204.743 88.009 205.845 87.520 206.611 86.658 C 207.377 85.795 207.734 84.644 207.590 83.500 L 205.590 67.500 C 205.337 65.488 203.618 63.984 201.590 64.000 ZM 52.410 88.000 L 56.000 88.000 C 70.591 87.986 83.332 78.122 87.000 64.000 L 54.410 64.000 C 52.382 63.984 50.663 65.488 50.410 67.500 L 48.410 83.500 C 48.266 84.644 48.623 85.795 49.389 86.658 C 50.155 87.520 51.257 88.009 52.410 88.000 ZM 223.880 214.000 L 210.560 107.500 C 210.307 105.488 208.588 103.984 206.560 104.000 L 200.000 104.000 C 176.591 103.967 156.610 87.077 152.680 64.000 L 136.000 64.000 L 136.000 103.730 C 136.053 108.011 132.795 111.609 128.530 111.980 C 126.318 112.127 124.144 111.349 122.527 109.833 C 120.910 108.316 119.995 106.197 120.000 103.980 L 120.000 64.000 L 103.320 64.000 C 99.390 87.077 79.409 103.967 56.000 104.000 L 49.410 104.000 C 47.382 103.984 45.663 105.488 45.410 107.500 L 32.120 214.000 C 31.387 219.885 33.970 225.692 38.830 229.090 C 41.641 231.021 44.980 232.038 48.390 232.000 L 88.690 232.000 C 96.010 232.001 102.397 227.035 104.200 219.940 L 128.000 127.940 L 151.790 219.880 C 153.570 227.002 159.969 231.999 167.310 232.000 L 207.610 232.000 C 211.018 232.045 214.357 231.035 217.170 229.110 C 222.037 225.709 224.620 219.892 223.880 214.000 Z"),
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
        return _pants!!
    }

private var _pants: ImageVector? = null
