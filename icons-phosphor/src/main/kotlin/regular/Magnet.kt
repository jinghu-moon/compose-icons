package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Magnet: ImageVector
    get() {
        if (_magnet != null) return _magnet!!
        _magnet = phosphorRegularIcon(
            name = "Magnet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 207.000 50.250 C 190.567 33.478 168.080 24.019 144.600 24.000 L 144.270 24.000 C 120.899 23.940 98.476 33.234 82.000 49.810 L 20.610 112.000 C 14.423 118.257 14.450 128.336 20.670 134.560 L 49.330 163.220 C 52.326 166.231 56.402 167.920 60.650 167.910 L 60.740 167.910 C 65.019 167.887 69.110 166.151 72.100 163.090 L 133.000 100.690 C 139.183 94.569 149.113 94.476 155.410 100.480 C 158.434 103.418 160.140 107.454 160.140 111.670 C 160.181 116.155 158.436 120.473 155.290 123.670 L 93.000 183.880 C 89.927 186.864 88.179 190.956 88.147 195.239 C 88.115 199.523 89.802 203.640 92.830 206.670 L 121.490 235.330 C 127.706 241.508 137.728 241.562 144.010 235.450 L 205.810 175.000 C 240.260 140.500 240.790 84.560 207.000 50.250 ZM 60.650 151.890 L 32.000 123.240 L 55.800 99.120 L 84.320 127.640 ZM 132.790 224.000 L 104.110 195.350 L 128.490 171.780 L 157.000 200.320 ZM 194.550 163.560 L 168.440 189.100 L 140.000 160.680 L 166.440 135.110 L 166.540 135.020 C 172.734 128.775 176.179 120.316 176.110 111.520 C 176.074 103.019 172.596 94.895 166.470 89.000 C 153.837 76.982 133.933 77.204 121.570 89.500 L 95.490 116.180 L 67.000 87.740 L 93.350 61.090 C 106.824 47.539 125.161 39.944 144.270 40.000 L 144.540 40.000 C 163.750 40.017 182.147 47.757 195.590 61.480 C 223.250 89.550 222.750 135.380 194.550 163.580 Z"),
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
        return _magnet!!
    }

private var _magnet: ImageVector? = null
