package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Sneaker: ImageVector
    get() {
        if (_sneaker != null) return _sneaker!!
        _sneaker = phosphorRegularIcon(
            name = "Sneaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.650 129.110 L 167.920 108.870 C 161.535 106.737 156.339 102.020 153.600 95.870 L 130.390 41.600 C 130.390 41.600 130.390 41.530 130.390 41.500 C 126.960 33.807 118.154 30.091 110.250 33.000 L 34.530 60.490 C 28.216 62.803 24.013 68.806 24.000 75.530 L 24.000 192.000 C 24.000 200.837 31.163 208.000 40.000 208.000 L 240.000 208.000 C 248.837 208.000 256.000 200.837 256.000 192.000 L 256.000 167.060 C 256.001 149.842 244.984 134.555 228.650 129.110 ZM 115.720 48.000 L 122.830 64.630 L 101.270 72.480 C 97.619 73.805 95.448 77.561 96.120 81.386 C 96.793 85.211 100.116 88.000 104.000 88.000 C 104.932 87.999 105.856 87.833 106.730 87.510 L 129.130 79.370 L 133.870 90.440 L 117.270 96.440 C 113.557 97.724 111.326 101.514 112.004 105.383 C 112.683 109.253 116.072 112.057 120.000 112.000 C 120.932 111.999 121.856 111.833 122.730 111.510 L 140.330 105.110 C 142.349 108.826 144.940 112.201 148.010 115.110 L 133.270 120.470 C 129.604 121.785 127.418 125.549 128.092 129.385 C 128.767 133.221 132.105 136.014 136.000 136.000 C 136.931 135.997 137.854 135.835 138.730 135.520 L 166.730 125.340 L 223.600 144.290 C 230.946 146.746 236.654 152.596 238.930 160.000 L 40.000 160.000 L 40.000 75.530 ZM 40.000 192.000 L 40.000 192.000 L 40.000 176.000 L 240.000 176.000 L 240.000 192.000 Z"),
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
        return _sneaker!!
    }

private var _sneaker: ImageVector? = null
