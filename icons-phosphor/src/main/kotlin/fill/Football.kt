package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Football: ImageVector
    get() {
        if (_football != null) return _football!!
        _football = phosphorFillIcon(
            name = "Football",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 229.060 53.890 C 226.719 40.091 215.909 29.281 202.110 26.940 C 169.730 21.450 108.720 18.940 63.840 63.840 C 18.960 108.740 21.450 169.740 26.940 202.110 C 29.287 215.924 40.122 226.738 53.940 229.060 C 65.281 230.994 76.765 231.978 88.270 232.000 C 120.360 232.000 160.320 224.000 192.160 192.160 C 237.050 147.280 234.550 86.260 229.060 53.890 ZM 56.560 213.300 C 49.465 212.093 43.907 206.535 42.700 199.440 C 39.955 183.965 39.246 168.198 40.590 152.540 L 103.460 215.410 C 87.802 216.754 72.035 216.045 56.560 213.300 ZM 165.640 101.670 L 151.300 116.000 L 157.640 122.340 C 159.793 124.332 160.683 127.342 159.960 130.185 C 159.236 133.027 157.016 135.246 154.173 135.967 C 151.330 136.687 148.320 135.795 146.330 133.640 L 140.000 127.310 L 127.310 140.000 L 133.650 146.340 C 135.805 148.330 136.697 151.340 135.977 154.183 C 135.256 157.026 133.037 159.246 130.195 159.970 C 127.352 160.693 124.342 159.803 122.350 157.650 L 116.000 151.300 L 101.660 165.640 C 99.658 167.747 96.670 168.603 93.856 167.875 C 91.041 167.146 88.844 164.949 88.115 162.134 C 87.387 159.320 88.243 156.332 90.350 154.330 L 104.700 140.000 L 98.360 133.660 C 95.445 130.504 95.543 125.609 98.582 122.573 C 101.622 119.536 106.517 119.442 109.670 122.360 L 116.010 128.700 L 128.690 116.000 L 122.350 109.660 C 119.432 106.507 119.526 101.612 122.563 98.572 C 125.599 95.533 130.494 95.435 133.650 98.350 L 140.000 104.700 L 154.340 90.360 C 156.342 88.253 159.330 87.397 162.144 88.125 C 164.959 88.854 167.156 91.051 167.885 93.866 C 168.613 96.680 167.757 99.668 165.650 101.670 ZM 215.410 103.460 L 152.540 40.590 C 157.300 40.150 162.260 39.900 167.450 39.900 C 178.176 39.938 188.880 40.874 199.450 42.700 C 206.541 43.911 212.095 49.468 213.300 56.560 C 216.045 72.035 216.754 87.802 215.410 103.460 Z"),
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
        return _football!!
    }

private var _football: ImageVector? = null
