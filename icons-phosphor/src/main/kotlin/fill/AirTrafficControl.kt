package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AirTrafficControl: ImageVector
    get() {
        if (_airTrafficControl != null) return _airTrafficControl!!
        _airTrafficControl = phosphorFillIcon(
            name = "AirTrafficControl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 229.110 70.820 C 226.114 66.544 221.221 63.998 216.000 64.000 L 136.000 64.000 L 136.000 32.000 L 152.000 32.000 C 156.418 32.000 160.000 28.418 160.000 24.000 C 160.000 19.582 156.418 16.000 152.000 16.000 L 104.000 16.000 C 99.582 16.000 96.000 19.582 96.000 24.000 C 96.000 28.418 99.582 32.000 104.000 32.000 L 120.000 32.000 L 120.000 64.000 L 40.000 64.000 C 34.787 64.012 29.906 66.563 26.920 70.836 C 23.934 75.110 23.218 80.571 25.000 85.470 L 51.190 157.470 C 53.485 163.780 59.476 167.985 66.190 168.000 L 189.820 168.000 C 196.534 167.985 202.525 163.780 204.820 157.470 L 231.010 85.470 C 232.804 80.569 232.095 75.101 229.110 70.820 ZM 102.520 151.870 C 102.045 151.957 101.563 152.001 101.080 152.000 C 97.218 151.995 93.910 149.230 93.220 145.430 L 83.000 89.430 C 82.210 85.081 85.096 80.915 89.445 80.125 C 93.794 79.335 97.960 82.221 98.750 86.570 L 108.930 142.570 C 109.720 146.907 106.854 151.065 102.520 151.870 ZM 173.000 89.430 L 162.810 145.430 C 162.120 149.230 158.812 151.995 154.950 152.000 C 154.467 152.001 153.985 151.957 153.510 151.870 C 149.164 151.080 146.281 146.916 147.070 142.570 L 157.250 86.570 C 158.040 82.221 162.206 79.335 166.555 80.125 C 170.904 80.915 173.790 85.081 173.000 89.430 ZM 160.000 188.000 L 160.000 232.000 C 160.000 236.418 156.418 240.000 152.000 240.000 L 104.000 240.000 C 99.582 240.000 96.000 236.418 96.000 232.000 L 96.000 188.000 C 96.000 185.791 97.791 184.000 100.000 184.000 L 156.000 184.000 C 158.209 184.000 160.000 185.791 160.000 188.000 Z"),
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
        return _airTrafficControl!!
    }

private var _airTrafficControl: ImageVector? = null
