package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Shuffle: ImageVector
    get() {
        if (_shuffle != null) return _shuffle!!
        _shuffle = phosphorFillIcon(
            name = "Shuffle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 237.660 178.340 C 239.162 179.841 240.006 181.877 240.006 184.000 C 240.006 186.123 239.162 188.159 237.660 189.660 L 213.660 213.660 C 211.372 215.951 207.929 216.636 204.938 215.397 C 201.947 214.158 199.997 211.238 200.000 208.000 L 200.000 192.000 C 177.087 191.678 155.690 180.491 142.350 161.860 L 100.630 103.460 C 90.109 88.753 73.143 80.018 55.060 80.000 L 32.000 80.000 C 27.582 80.000 24.000 76.418 24.000 72.000 C 24.000 67.582 27.582 64.000 32.000 64.000 L 55.060 64.000 C 78.308 64.019 100.121 75.244 113.650 94.150 L 155.370 152.550 C 165.696 166.990 182.250 175.688 200.000 176.000 L 200.000 160.000 C 199.997 156.762 201.947 153.842 204.938 152.603 C 207.929 151.364 211.372 152.049 213.660 154.340 ZM 143.000 107.000 C 144.727 108.233 146.872 108.730 148.965 108.381 C 151.058 108.033 152.927 106.867 154.160 105.140 L 155.360 103.470 C 165.684 89.020 182.243 80.314 200.000 80.000 L 200.000 96.000 C 199.997 99.238 201.947 102.158 204.938 103.397 C 207.929 104.636 211.372 103.951 213.660 101.660 L 237.660 77.660 C 239.162 76.159 240.006 74.123 240.006 72.000 C 240.006 69.877 239.162 67.841 237.660 66.340 L 213.660 42.340 C 211.372 40.049 207.929 39.364 204.938 40.603 C 201.947 41.842 199.997 44.762 200.000 48.000 L 200.000 64.000 C 177.087 64.322 155.690 75.509 142.350 94.140 L 141.150 95.810 C 139.906 97.537 139.402 99.689 139.749 101.789 C 140.096 103.890 141.266 105.765 143.000 107.000 ZM 113.000 149.000 C 111.273 147.767 109.128 147.270 107.035 147.619 C 104.942 147.967 103.073 149.133 101.840 150.860 L 100.640 152.530 C 90.119 167.244 73.149 175.982 55.060 176.000 L 32.000 176.000 C 27.582 176.000 24.000 179.582 24.000 184.000 C 24.000 188.418 27.582 192.000 32.000 192.000 L 55.060 192.000 C 78.308 191.981 100.121 180.756 113.650 161.850 L 114.850 160.180 C 116.091 158.453 116.593 156.304 116.246 154.206 C 115.899 152.108 114.731 150.235 113.000 149.000 Z"),
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
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
