package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SneakerMove: ImageVector
    get() {
        if (_sneakerMove != null) return _sneakerMove!!
        _sneakerMove = phosphorFillIcon(
            name = "SneakerMove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 70.800 184.000 L 32.000 184.000 C 27.582 184.000 24.000 180.418 24.000 176.000 C 24.000 171.582 27.582 168.000 32.000 168.000 L 70.800 168.000 C 75.218 168.000 78.800 171.582 78.800 176.000 C 78.800 180.418 75.218 184.000 70.800 184.000 ZM 102.800 200.000 L 48.000 200.000 C 43.582 200.000 40.000 203.582 40.000 208.000 C 40.000 212.418 43.582 216.000 48.000 216.000 L 102.800 216.000 C 107.218 216.000 110.800 212.418 110.800 208.000 C 110.800 203.582 107.218 200.000 102.800 200.000 ZM 231.160 166.630 L 202.530 152.320 C 186.228 144.236 175.939 127.587 176.000 109.390 L 176.000 80.000 C 176.000 75.609 172.461 72.038 168.070 72.000 C 141.572 72.011 120.066 50.568 120.000 24.070 C 120.024 21.022 118.313 18.225 115.589 16.857 C 112.865 15.490 109.600 15.789 107.170 17.630 L 45.110 64.680 C 44.194 65.379 43.624 66.438 43.546 67.587 C 43.467 68.736 43.888 69.863 44.700 70.680 L 96.140 122.120 C 99.199 125.096 99.460 129.922 96.740 133.210 C 95.287 134.892 93.200 135.894 90.979 135.976 C 88.757 136.058 86.602 135.211 85.030 133.640 L 32.030 80.640 C 31.114 79.720 29.808 79.302 28.528 79.518 C 27.248 79.735 26.152 80.560 25.590 81.730 C 22.662 87.851 23.912 95.153 28.710 99.950 L 142.400 213.660 C 143.902 215.160 145.938 216.002 148.060 216.000 L 224.000 216.000 C 232.837 216.000 240.000 208.837 240.000 200.000 L 240.000 180.940 C 240.019 174.876 236.592 169.327 231.160 166.630 Z"),
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
        return _sneakerMove!!
    }

private var _sneakerMove: ImageVector? = null
