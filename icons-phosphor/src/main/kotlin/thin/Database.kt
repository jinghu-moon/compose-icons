package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Database: ImageVector
    get() {
        if (_database != null) return _database!!
        _database = phosphorThinIcon(
            name = "Database",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.140 42.550 C 174.940 33.170 152.160 28.000 128.000 28.000 C 103.840 28.000 81.060 33.170 63.860 42.550 C 45.890 52.350 36.000 65.650 36.000 80.000 L 36.000 176.000 C 36.000 190.350 45.890 203.650 63.860 213.450 C 81.060 222.830 103.860 228.000 128.000 228.000 C 152.140 228.000 174.940 222.830 192.140 213.450 C 210.140 203.650 220.000 190.350 220.000 176.000 L 220.000 80.000 C 220.000 65.650 210.110 52.350 192.140 42.550 ZM 212.000 176.000 C 212.000 187.290 203.590 198.100 188.310 206.430 C 172.270 215.180 150.850 220.000 128.000 220.000 C 105.150 220.000 83.730 215.180 67.690 206.430 C 52.410 198.100 44.000 187.290 44.000 176.000 L 44.000 149.480 C 48.690 155.410 55.370 160.820 63.860 165.480 C 81.060 174.860 103.860 180.030 128.000 180.030 C 152.140 180.030 174.940 174.860 192.140 165.480 C 200.630 160.850 207.310 155.480 212.000 149.480 ZM 212.000 128.000 C 212.000 139.290 203.590 150.100 188.310 158.430 C 172.270 167.180 150.850 172.000 128.000 172.000 C 105.150 172.000 83.730 167.180 67.690 158.430 C 52.410 150.100 44.000 139.290 44.000 128.000 L 44.000 101.480 C 48.690 107.410 55.370 112.820 63.860 117.480 C 81.060 126.860 103.860 132.030 128.000 132.030 C 152.140 132.030 174.940 126.860 192.140 117.480 C 200.630 112.850 207.310 107.480 212.000 101.480 ZM 188.310 110.430 C 172.270 119.180 150.850 124.000 128.000 124.000 C 105.150 124.000 83.730 119.180 67.690 110.430 C 52.410 102.100 44.000 91.290 44.000 80.000 C 44.000 68.710 52.410 57.900 67.690 49.570 C 83.730 40.820 105.150 36.000 128.000 36.000 C 150.850 36.000 172.270 40.820 188.310 49.570 C 203.590 57.900 212.000 68.710 212.000 80.000 C 212.000 91.290 203.590 102.100 188.310 110.430 Z"),
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
        return _database!!
    }

private var _database: ImageVector? = null
