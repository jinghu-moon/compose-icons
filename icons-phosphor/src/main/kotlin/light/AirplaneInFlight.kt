package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AirplaneInFlight: ImageVector
    get() {
        if (_airplaneInFlight != null) return _airplaneInFlight!!
        _airplaneInFlight = phosphorLightIcon(
            name = "AirplaneInFlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 222.000 216.000 C 222.000 219.314 219.314 222.000 216.000 222.000 L 72.000 222.000 C 68.686 222.000 66.000 219.314 66.000 216.000 C 66.000 212.686 68.686 210.000 72.000 210.000 L 216.000 210.000 C 219.314 210.000 222.000 212.686 222.000 216.000 ZM 246.000 136.000 L 246.000 160.000 C 246.000 163.314 243.314 166.000 240.000 166.000 L 61.070 166.000 C 44.263 166.078 29.427 155.040 24.670 138.920 L 10.600 92.000 C 9.338 87.766 10.148 83.184 12.787 79.640 C 15.425 76.096 19.582 74.005 24.000 74.000 L 32.000 74.000 C 33.591 74.001 35.116 74.634 36.240 75.760 L 58.490 98.000 L 84.590 98.000 L 74.730 68.430 C 73.306 64.162 74.021 59.471 76.649 55.820 C 79.278 52.169 83.501 50.003 88.000 50.000 L 96.000 50.000 C 97.594 49.999 99.123 50.632 100.250 51.760 L 146.490 98.000 L 208.000 98.000 C 228.987 98.000 246.000 115.013 246.000 136.000 ZM 234.000 136.000 C 234.000 121.641 222.359 110.000 208.000 110.000 L 144.000 110.000 C 142.409 109.999 140.884 109.366 139.760 108.240 L 93.520 62.000 L 88.000 62.000 C 87.357 61.999 86.753 62.308 86.377 62.829 C 86.001 63.350 85.898 64.020 86.100 64.630 L 98.600 102.100 C 99.211 103.930 98.905 105.941 97.777 107.507 C 96.650 109.072 94.839 110.000 92.910 110.000 L 56.000 110.000 C 54.409 109.999 52.884 109.366 51.760 108.240 L 29.520 86.000 L 24.000 86.000 C 23.366 85.991 22.768 86.294 22.400 86.810 C 22.012 87.309 21.896 87.968 22.090 88.570 L 36.150 135.470 C 39.411 146.502 49.566 154.054 61.070 154.000 L 234.000 154.000 Z"),
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
