package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) return _chartDonut!!
        _chartDonut = phosphorFillIcon(
            name = "ChartDonut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 120.000 161.940 L 120.000 227.280 C 120.008 228.426 119.524 229.519 118.671 230.284 C 117.818 231.049 116.678 231.412 115.540 231.280 C 77.894 226.656 45.726 201.957 31.540 166.780 C 31.119 165.718 31.172 164.526 31.686 163.506 C 32.200 162.486 33.126 161.734 34.230 161.440 L 97.320 144.500 C 98.976 144.065 100.725 144.733 101.670 146.160 C 105.490 151.686 110.940 155.881 117.260 158.160 C 118.890 158.701 119.993 160.222 120.000 161.940 ZM 128.060 24.000 C 125.928 23.984 123.878 24.820 122.364 26.322 C 120.851 27.824 120.000 29.868 120.000 32.000 L 120.000 88.000 C 119.967 92.381 123.489 95.962 127.870 96.000 C 143.470 95.933 156.845 107.124 159.530 122.492 C 162.216 137.859 153.428 152.923 138.730 158.150 C 137.100 158.696 136.001 160.221 136.000 161.940 L 136.000 227.280 C 135.993 228.424 136.475 229.516 137.326 230.280 C 138.176 231.045 139.314 231.409 140.450 231.280 C 195.164 224.809 235.337 176.791 232.049 121.794 C 228.762 66.798 183.155 23.907 128.060 24.000 ZM 96.060 125.490 C 96.432 120.765 97.850 116.181 100.210 112.070 L 100.210 112.000 C 101.831 109.200 101.606 105.699 99.640 103.130 C 98.967 102.266 98.132 101.542 97.180 101.000 L 48.850 73.060 C 47.011 72.000 44.826 71.714 42.776 72.265 C 40.726 72.816 38.979 74.160 37.920 76.000 C 26.281 96.158 21.732 119.634 25.000 142.680 C 25.156 143.818 25.794 144.834 26.750 145.469 C 27.707 146.104 28.891 146.298 30.000 146.000 L 93.220 129.000 C 94.825 128.556 95.978 127.151 96.100 125.490 Z"),
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
        return _chartDonut!!
    }

private var _chartDonut: ImageVector? = null
