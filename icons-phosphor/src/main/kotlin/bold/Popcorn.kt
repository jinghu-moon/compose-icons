package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Popcorn: ImageVector
    get() {
        if (_popcorn != null) return _popcorn!!
        _popcorn = phosphorBoldIcon(
            name = "Popcorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.280 71.320 C 230.368 69.495 227.908 68.353 225.280 68.070 C 217.269 45.352 193.659 32.090 170.090 37.070 C 161.673 21.669 145.521 12.090 127.970 12.090 C 110.419 12.090 94.267 21.669 85.850 37.070 C 62.281 32.090 38.671 45.352 30.660 68.070 C 27.249 68.453 24.165 70.279 22.189 73.085 C 20.212 75.891 19.532 79.409 20.320 82.750 L 50.870 212.580 C 52.969 221.632 61.048 228.030 70.340 228.000 L 185.660 228.000 C 194.952 228.030 203.031 221.632 205.130 212.580 L 235.680 82.750 C 236.654 78.607 235.360 74.257 232.280 71.320 ZM 76.000 60.000 C 79.916 59.987 83.775 60.946 87.230 62.790 C 90.541 64.550 94.484 64.662 97.889 63.092 C 101.294 61.522 103.769 58.451 104.580 54.790 C 107.035 43.827 116.766 36.034 128.000 36.034 C 139.234 36.034 148.965 43.827 151.420 54.790 C 152.231 58.451 154.706 61.522 158.111 63.092 C 161.516 64.662 165.459 64.550 168.770 62.790 C 172.225 60.946 176.084 59.987 180.000 60.000 C 189.340 59.991 197.838 65.402 201.780 73.870 L 168.650 83.330 L 135.430 70.050 C 130.663 68.130 125.337 68.130 120.570 70.050 L 87.350 83.330 L 54.220 73.870 C 58.162 65.402 66.660 59.991 76.000 60.000 ZM 101.130 103.670 L 128.000 92.920 L 154.870 103.670 L 141.490 204.000 L 114.490 204.000 ZM 48.360 97.160 L 77.140 105.380 L 90.290 204.000 L 73.500 204.000 ZM 182.500 204.000 L 165.710 204.000 L 178.860 105.380 L 207.640 97.160 Z"),
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
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
