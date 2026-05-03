package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GlobeHemisphereWest: ImageVector
    get() {
        if (_globeHemisphereWest != null) return _globeHemisphereWest!!
        _globeHemisphereWest = phosphorBoldIcon(
            name = "GlobeHemisphereWest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 212.000 128.000 C 212.003 137.184 210.492 146.306 207.530 155.000 L 167.000 130.000 C 164.627 128.530 161.968 127.582 159.200 127.220 L 136.380 124.140 C 129.199 123.216 122.075 126.217 117.720 132.000 L 113.650 132.000 L 110.940 126.400 C 108.270 120.842 103.172 116.838 97.140 115.560 L 94.460 115.000 L 98.460 108.000 L 112.850 108.000 C 116.229 107.999 119.552 107.143 122.510 105.510 L 134.760 98.750 C 136.103 97.999 137.357 97.100 138.500 96.070 L 165.420 71.740 C 169.720 67.851 172.121 62.287 172.000 56.490 C 196.843 71.767 211.985 98.836 212.000 128.000 ZM 140.760 45.000 L 146.960 56.100 L 122.750 78.000 L 111.820 84.000 L 96.140 84.000 C 88.971 84.009 82.352 87.844 78.780 94.060 L 74.290 101.910 L 67.680 84.280 L 77.590 60.860 C 95.652 47.284 118.427 41.566 140.760 45.000 ZM 44.000 128.000 C 43.998 118.897 45.484 109.854 48.400 101.230 L 56.140 121.880 C 58.514 128.268 63.993 132.997 70.660 134.410 L 90.190 138.610 L 93.190 144.710 C 95.852 150.160 100.830 154.117 106.740 155.480 L 101.740 166.600 C 98.488 173.902 99.895 182.439 105.320 188.310 L 105.530 188.530 L 123.690 207.230 L 122.800 211.820 C 78.540 209.030 44.055 172.348 44.000 128.000 ZM 147.650 209.660 C 148.803 203.428 146.950 197.017 142.650 192.360 L 142.440 192.140 L 124.720 173.890 L 136.090 148.370 L 155.090 150.930 L 196.520 176.410 C 184.783 193.035 167.423 204.847 147.650 209.660 Z"),
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
        return _globeHemisphereWest!!
    }

private var _globeHemisphereWest: ImageVector? = null
