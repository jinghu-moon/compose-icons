package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Wine: ImageVector
    get() {
        if (_wine != null) return _wine!!
        _wine = phosphorBoldIcon(
            name = "Wine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 209.170 102.540 L 187.390 28.610 C 185.888 23.509 181.208 20.005 175.890 20.000 L 80.110 20.000 C 74.792 20.005 70.112 23.509 68.610 28.610 L 46.830 102.540 C 39.435 127.107 46.617 153.742 65.360 171.260 C 79.315 184.348 97.029 192.722 116.000 195.200 L 116.000 228.000 L 88.000 228.000 C 81.373 228.000 76.000 233.373 76.000 240.000 C 76.000 246.627 81.373 252.000 88.000 252.000 L 168.000 252.000 C 174.627 252.000 180.000 246.627 180.000 240.000 C 180.000 233.373 174.627 228.000 168.000 228.000 L 140.000 228.000 L 140.000 195.200 C 158.975 192.724 176.692 184.350 190.650 171.260 C 209.390 153.739 216.568 127.105 209.170 102.540 ZM 89.080 44.000 L 166.920 44.000 L 185.300 106.410 C 174.420 109.210 157.250 109.410 133.420 97.290 C 110.680 85.780 91.920 83.000 77.240 84.220 ZM 128.000 172.000 C 110.817 172.020 94.272 165.486 81.740 153.730 C 69.808 142.519 65.172 125.563 69.740 109.840 C 88.180 104.510 108.380 111.500 122.610 118.710 C 134.160 124.560 152.790 131.990 172.870 131.990 C 177.666 132.003 182.452 131.551 187.160 130.640 C 185.388 139.492 180.887 147.567 174.290 153.730 C 161.750 165.493 145.194 172.028 128.000 172.000 Z"),
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
        return _wine!!
    }

private var _wine: ImageVector? = null
