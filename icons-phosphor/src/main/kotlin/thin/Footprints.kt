package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Footprints: ImageVector
    get() {
        if (_footprints != null) return _footprints!!
        _footprints = phosphorThinIcon(
            name = "Footprints",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 188.000 L 152.000 188.000 C 149.791 188.000 148.000 189.791 148.000 192.000 L 148.000 204.000 C 148.000 221.673 162.327 236.000 180.000 236.000 C 197.673 236.000 212.000 221.673 212.000 204.000 L 212.000 192.000 C 212.000 189.791 210.209 188.000 208.000 188.000 ZM 204.000 204.000 C 204.000 217.255 193.255 228.000 180.000 228.000 C 166.745 228.000 156.000 217.255 156.000 204.000 L 156.000 196.000 L 204.000 196.000 ZM 104.000 164.000 L 48.000 164.000 C 45.791 164.000 44.000 165.791 44.000 168.000 L 44.000 180.000 C 44.000 197.673 58.327 212.000 76.000 212.000 C 93.673 212.000 108.000 197.673 108.000 180.000 L 108.000 168.000 C 108.000 165.791 106.209 164.000 104.000 164.000 ZM 100.000 180.000 C 100.000 193.255 89.255 204.000 76.000 204.000 C 62.745 204.000 52.000 193.255 52.000 180.000 L 52.000 172.000 L 100.000 172.000 ZM 76.000 20.000 C 66.180 20.000 55.930 29.750 47.880 46.750 C 34.490 75.020 29.880 116.800 47.650 138.530 C 48.410 139.461 49.548 140.001 50.750 140.000 L 101.260 140.000 C 102.462 140.001 103.600 139.461 104.360 138.530 C 122.150 116.800 117.520 75.020 104.130 46.750 C 96.080 29.750 85.830 20.000 76.000 20.000 ZM 99.300 132.000 L 52.710 132.000 C 38.910 113.000 42.920 75.920 55.110 50.180 C 61.590 36.500 69.590 28.000 76.000 28.000 C 82.410 28.000 90.420 36.500 96.900 50.180 C 109.090 75.920 113.100 113.000 99.300 132.000 ZM 154.740 164.000 L 205.250 164.000 C 206.452 164.001 207.590 163.461 208.350 162.530 C 226.140 140.800 221.510 99.020 208.120 70.750 C 200.070 53.750 189.820 44.000 180.000 44.000 C 170.180 44.000 159.920 53.750 151.870 70.750 C 138.480 99.020 133.870 140.800 151.640 162.530 C 152.400 163.461 153.538 164.001 154.740 164.000 ZM 159.100 74.180 C 165.580 60.500 173.580 52.000 180.000 52.000 C 186.420 52.000 194.410 60.500 200.890 74.180 C 213.080 99.920 217.090 137.000 203.290 156.000 L 156.700 156.000 C 142.900 137.000 146.910 99.920 159.100 74.180 Z"),
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
