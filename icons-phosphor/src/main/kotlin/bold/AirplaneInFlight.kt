package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AirplaneInFlight: ImageVector
    get() {
        if (_airplaneInFlight != null) return _airplaneInFlight!!
        _airplaneInFlight = phosphorBoldIcon(
            name = "AirplaneInFlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 216.000 C 228.000 222.627 222.627 228.000 216.000 228.000 L 72.000 228.000 C 65.373 228.000 60.000 222.627 60.000 216.000 C 60.000 209.373 65.373 204.000 72.000 204.000 L 216.000 204.000 C 222.627 204.000 228.000 209.373 228.000 216.000 ZM 252.000 136.000 L 252.000 160.000 C 252.000 166.627 246.627 172.000 240.000 172.000 L 61.070 172.000 C 41.609 172.091 24.432 159.307 18.930 140.640 L 4.860 93.750 C 3.043 87.697 4.194 81.141 7.964 76.069 C 11.734 70.997 17.680 68.005 24.000 68.000 L 32.000 68.000 C 35.180 68.000 38.230 69.263 40.480 71.510 L 61.000 92.000 L 76.270 92.000 L 69.000 70.320 C 66.967 64.217 67.994 57.509 71.759 52.294 C 75.524 47.078 81.568 43.992 88.000 44.000 L 96.000 44.000 C 99.180 44.000 102.230 45.263 104.480 47.510 L 149.000 92.000 L 208.000 92.000 C 232.289 92.028 251.972 111.711 252.000 136.000 ZM 228.000 136.000 C 228.000 124.954 219.046 116.000 208.000 116.000 L 144.000 116.000 C 140.820 116.000 137.770 114.737 135.520 112.490 L 94.830 71.790 L 104.300 100.210 C 105.518 103.870 104.903 107.892 102.646 111.020 C 100.390 114.149 96.767 116.001 92.910 116.000 L 56.000 116.000 C 52.816 116.003 49.762 114.740 47.510 112.490 L 30.400 95.360 L 41.910 133.750 C 44.418 142.232 52.225 148.038 61.070 148.000 L 228.000 148.000 Z"),
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
        return _airplaneInFlight!!
    }

private var _airplaneInFlight: ImageVector? = null
