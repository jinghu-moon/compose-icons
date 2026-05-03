package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AirplaneTaxiing: ImageVector
    get() {
        if (_airplaneTaxiing != null) return _airplaneTaxiing!!
        _airplaneTaxiing = phosphorBoldIcon(
            name = "AirplaneTaxiing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 88.000 L 149.000 88.000 L 104.490 43.510 C 102.238 41.260 99.184 39.997 96.000 40.000 L 88.000 40.000 C 81.565 39.991 75.519 43.079 71.754 48.297 C 67.988 53.515 66.963 60.226 69.000 66.330 L 76.270 88.000 L 61.000 88.000 L 40.490 67.510 C 38.238 65.260 35.184 63.997 32.000 64.000 L 24.000 64.000 C 17.680 64.005 11.734 66.997 7.964 72.069 C 4.194 77.141 3.043 83.697 4.860 89.750 L 18.930 136.640 C 24.432 155.307 41.609 168.091 61.070 168.000 L 240.000 168.000 C 246.627 168.000 252.000 162.627 252.000 156.000 L 252.000 132.000 C 251.972 107.711 232.289 88.028 208.000 88.000 ZM 228.000 144.000 L 61.070 144.000 C 52.225 144.038 44.418 138.232 41.910 129.750 L 30.400 91.360 L 47.520 108.490 C 49.770 110.737 52.820 112.000 56.000 112.000 L 92.900 112.000 C 96.759 112.005 100.385 110.153 102.644 107.024 C 104.902 103.896 105.519 99.871 104.300 96.210 L 94.830 67.790 L 135.520 108.490 C 137.770 110.737 140.820 112.000 144.000 112.000 L 208.000 112.000 C 219.046 112.000 228.000 120.954 228.000 132.000 ZM 228.000 204.000 C 228.000 215.046 219.046 224.000 208.000 224.000 C 196.954 224.000 188.000 215.046 188.000 204.000 C 188.000 192.954 196.954 184.000 208.000 184.000 C 219.046 184.000 228.000 192.954 228.000 204.000 ZM 132.000 204.000 C 132.000 215.046 123.046 224.000 112.000 224.000 C 100.954 224.000 92.000 215.046 92.000 204.000 C 92.000 192.954 100.954 184.000 112.000 184.000 C 123.046 184.000 132.000 192.954 132.000 204.000 Z"),
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
        return _airplaneTaxiing!!
    }

private var _airplaneTaxiing: ImageVector? = null
