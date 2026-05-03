package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Footprints: ImageVector
    get() {
        if (_footprints != null) return _footprints!!
        _footprints = phosphorBoldIcon(
            name = "Footprints",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 180.000 L 156.000 180.000 C 149.373 180.000 144.000 185.373 144.000 192.000 L 144.000 204.000 C 144.000 226.091 161.909 244.000 184.000 244.000 C 206.091 244.000 224.000 226.091 224.000 204.000 L 224.000 192.000 C 224.000 185.373 218.627 180.000 212.000 180.000 ZM 184.000 220.000 C 175.163 220.000 168.000 212.837 168.000 204.000 L 200.000 204.000 C 200.000 212.837 192.837 220.000 184.000 220.000 ZM 100.000 156.000 L 44.000 156.000 C 37.373 156.000 32.000 161.373 32.000 168.000 L 32.000 180.000 C 32.000 202.091 49.909 220.000 72.000 220.000 C 94.091 220.000 112.000 202.091 112.000 180.000 L 112.000 168.000 C 112.000 161.373 106.627 156.000 100.000 156.000 ZM 72.000 196.000 C 63.163 196.000 56.000 188.837 56.000 180.000 L 88.000 180.000 C 88.000 188.837 80.837 196.000 72.000 196.000 ZM 72.000 12.000 C 57.940 12.000 44.300 24.330 34.590 45.830 C 22.140 73.400 17.810 113.350 37.730 135.940 C 40.008 138.522 43.286 140.001 46.730 140.000 L 97.250 140.000 C 100.694 140.001 103.972 138.522 106.250 135.940 C 126.170 113.350 121.840 73.400 109.390 45.830 C 99.680 24.330 86.000 12.000 72.000 12.000 ZM 91.070 116.000 L 52.900 116.000 C 46.190 103.870 45.230 80.550 56.460 55.700 C 63.160 40.850 70.280 36.000 72.000 36.000 C 73.720 36.000 80.820 40.850 87.530 55.700 C 98.730 80.550 97.770 103.870 91.070 116.000 ZM 158.750 164.000 L 209.290 164.000 C 212.734 164.001 216.012 162.522 218.290 159.940 C 238.210 137.350 233.880 97.400 221.430 69.830 C 211.720 48.330 198.080 36.000 184.000 36.000 C 169.920 36.000 156.300 48.330 146.590 69.830 C 134.140 97.400 129.810 137.350 149.730 159.940 C 152.013 162.527 155.299 164.006 158.750 164.000 ZM 168.490 79.700 C 175.200 64.850 182.320 60.000 184.000 60.000 C 185.680 60.000 192.820 64.850 199.520 79.700 C 210.750 104.550 209.790 127.870 203.080 140.000 L 164.930 140.000 C 158.230 127.870 157.270 104.550 168.490 79.700 Z"),
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
        return _footprints!!
    }

private var _footprints: ImageVector? = null
