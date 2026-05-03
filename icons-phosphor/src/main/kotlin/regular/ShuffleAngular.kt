package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShuffleAngular: ImageVector
    get() {
        if (_shuffleAngular != null) return _shuffleAngular!!
        _shuffleAngular = phosphorRegularIcon(
            name = "ShuffleAngular",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 237.660 178.340 C 239.162 179.841 240.006 181.877 240.006 184.000 C 240.006 186.123 239.162 188.159 237.660 189.660 L 213.660 213.660 C 210.534 216.786 205.466 216.786 202.340 213.660 C 199.214 210.534 199.214 205.466 202.340 202.340 L 212.690 192.000 L 168.000 192.000 C 165.416 192.000 162.992 190.752 161.490 188.650 L 83.880 80.000 L 32.000 80.000 C 27.582 80.000 24.000 76.418 24.000 72.000 C 24.000 67.582 27.582 64.000 32.000 64.000 L 88.000 64.000 C 90.584 64.000 93.008 65.248 94.510 67.350 L 172.120 176.000 L 212.690 176.000 L 202.340 165.660 C 199.214 162.534 199.214 157.466 202.340 154.340 C 205.466 151.214 210.534 151.214 213.660 154.340 ZM 143.000 107.000 C 144.727 108.233 146.872 108.730 148.965 108.381 C 151.058 108.033 152.927 106.867 154.160 105.140 L 172.160 80.020 L 212.730 80.020 L 202.340 90.340 C 199.214 93.466 199.214 98.534 202.340 101.660 C 205.466 104.786 210.534 104.786 213.660 101.660 L 237.660 77.660 C 239.162 76.159 240.006 74.123 240.006 72.000 C 240.006 69.877 239.162 67.841 237.660 66.340 L 213.660 42.340 C 210.534 39.214 205.466 39.214 202.340 42.340 C 199.214 45.466 199.214 50.534 202.340 53.660 L 212.690 64.000 L 168.000 64.000 C 165.416 64.000 162.992 65.248 161.490 67.350 L 141.150 95.820 C 139.909 97.547 139.407 99.696 139.754 101.794 C 140.101 103.892 141.269 105.765 143.000 107.000 ZM 113.000 149.000 C 111.273 147.767 109.128 147.270 107.035 147.619 C 104.942 147.967 103.073 149.133 101.840 150.860 L 83.880 176.000 L 32.000 176.000 C 27.582 176.000 24.000 179.582 24.000 184.000 C 24.000 188.418 27.582 192.000 32.000 192.000 L 88.000 192.000 C 90.584 192.000 93.008 190.752 94.510 188.650 L 114.850 160.180 C 116.091 158.453 116.593 156.304 116.246 154.206 C 115.899 152.108 114.731 150.235 113.000 149.000 Z"),
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
        return _shuffleAngular!!
    }

private var _shuffleAngular: ImageVector? = null
