package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ImageBroken: ImageVector
    get() {
        if (_imageBroken != null) return _imageBroken!!
        _imageBroken = phosphorThinIcon(
            name = "ImageBroken",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 44.000 L 40.000 44.000 C 33.373 44.000 28.000 49.373 28.000 56.000 L 28.000 200.000 C 28.000 206.627 33.373 212.000 40.000 212.000 L 104.000 212.000 C 105.721 211.997 107.248 210.894 107.790 209.260 L 123.210 163.000 L 161.490 147.690 C 162.502 147.283 163.303 146.482 163.710 145.470 L 179.000 107.210 L 225.240 91.790 C 226.882 91.255 227.994 89.727 228.000 88.000 L 228.000 56.000 C 228.000 49.373 222.627 44.000 216.000 44.000 ZM 118.510 156.290 C 117.421 156.729 116.580 157.625 116.210 158.740 L 101.120 204.000 L 40.000 204.000 C 37.791 204.000 36.000 202.209 36.000 200.000 L 36.000 170.340 L 89.170 117.170 C 89.920 116.419 90.938 115.997 92.000 115.997 C 93.062 115.997 94.080 116.419 94.830 117.170 L 129.540 151.880 ZM 220.000 85.120 L 174.740 100.210 C 173.625 100.580 172.729 101.421 172.290 102.510 L 156.920 140.920 L 137.620 148.650 L 100.490 111.510 C 98.238 109.251 95.180 107.981 91.990 107.981 C 88.800 107.981 85.742 109.251 83.490 111.510 L 36.000 159.000 L 36.000 56.000 C 36.000 53.791 37.791 52.000 40.000 52.000 L 216.000 52.000 C 218.209 52.000 220.000 53.791 220.000 56.000 ZM 226.340 118.490 C 225.298 117.739 223.959 117.535 222.740 117.940 L 198.930 125.870 C 197.817 126.245 196.925 127.089 196.490 128.180 L 181.490 165.540 L 144.130 180.540 C 143.039 180.975 142.195 181.867 141.820 182.980 L 133.890 206.790 C 133.485 208.009 133.689 209.348 134.440 210.390 C 135.191 211.431 136.396 212.049 137.680 212.050 L 216.000 212.050 C 222.627 212.050 228.000 206.677 228.000 200.050 L 228.000 121.730 C 227.999 120.446 227.381 119.241 226.340 118.490 ZM 220.000 200.000 C 220.000 202.209 218.209 204.000 216.000 204.000 L 143.280 204.000 L 148.870 187.220 L 186.100 172.330 C 187.117 171.923 187.923 171.117 188.330 170.100 L 203.220 132.870 L 220.000 127.280 Z"),
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
        return _imageBroken!!
    }

private var _imageBroken: ImageVector? = null
