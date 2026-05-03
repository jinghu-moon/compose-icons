package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AirplaneTaxiing: ImageVector
    get() {
        if (_airplaneTaxiing != null) return _airplaneTaxiing!!
        _airplaneTaxiing = phosphorLightIcon(
            name = "AirplaneTaxiing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 98.000 L 146.490 98.000 L 100.250 51.760 C 99.123 50.632 97.594 49.999 96.000 50.000 L 88.000 50.000 C 83.501 50.003 79.278 52.169 76.649 55.820 C 74.021 59.471 73.306 64.162 74.730 68.430 L 84.590 98.000 L 58.490 98.000 L 36.250 75.760 C 35.123 74.632 33.594 73.999 32.000 74.000 L 24.000 74.000 C 19.582 74.005 15.425 76.096 12.787 79.640 C 10.148 83.184 9.338 87.766 10.600 92.000 L 24.670 138.900 C 29.419 155.028 44.257 166.075 61.070 166.000 L 240.000 166.000 C 243.314 166.000 246.000 163.314 246.000 160.000 L 246.000 136.000 C 246.000 115.013 228.987 98.000 208.000 98.000 ZM 234.000 154.000 L 61.070 154.000 C 49.570 154.049 39.420 146.498 36.160 135.470 L 22.100 88.570 C 21.906 87.968 22.022 87.309 22.410 86.810 C 22.776 86.296 23.370 85.994 24.000 86.000 L 29.510 86.000 L 51.750 108.240 C 52.877 109.368 54.406 110.001 56.000 110.000 L 92.910 110.000 C 94.839 110.000 96.650 109.072 97.777 107.507 C 98.905 105.941 99.211 103.930 98.600 102.100 L 86.110 64.630 C 85.908 64.022 86.010 63.353 86.384 62.833 C 86.758 62.312 87.359 62.003 88.000 62.000 L 93.510 62.000 L 139.750 108.240 C 140.877 109.368 142.406 110.001 144.000 110.000 L 208.000 110.000 C 222.359 110.000 234.000 121.641 234.000 136.000 ZM 222.000 200.000 C 222.000 207.732 215.732 214.000 208.000 214.000 C 200.268 214.000 194.000 207.732 194.000 200.000 C 194.000 192.268 200.268 186.000 208.000 186.000 C 215.732 186.000 222.000 192.268 222.000 200.000 ZM 126.000 200.000 C 126.000 207.732 119.732 214.000 112.000 214.000 C 104.268 214.000 98.000 207.732 98.000 200.000 C 98.000 192.268 104.268 186.000 112.000 186.000 C 119.732 186.000 126.000 192.268 126.000 200.000 Z"),
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
