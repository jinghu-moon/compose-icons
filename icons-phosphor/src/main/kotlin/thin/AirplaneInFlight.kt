package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AirplaneInFlight: ImageVector
    get() {
        if (_airplaneInFlight != null) return _airplaneInFlight!!
        _airplaneInFlight = phosphorThinIcon(
            name = "AirplaneInFlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.000 216.000 C 220.000 218.209 218.209 220.000 216.000 220.000 L 72.000 220.000 C 69.791 220.000 68.000 218.209 68.000 216.000 C 68.000 213.791 69.791 212.000 72.000 212.000 L 216.000 212.000 C 218.209 212.000 220.000 213.791 220.000 216.000 ZM 244.000 136.000 L 244.000 160.000 C 244.000 162.209 242.209 164.000 240.000 164.000 L 61.060 164.000 C 45.139 164.068 31.086 153.611 26.580 138.340 L 12.520 91.450 C 11.430 87.819 12.120 83.886 14.381 80.843 C 16.642 77.800 20.209 76.004 24.000 76.000 L 32.000 76.000 C 33.061 75.999 34.079 76.420 34.830 77.170 L 57.660 100.000 L 87.360 100.000 L 76.630 67.790 C 75.413 64.134 76.026 60.115 78.278 56.988 C 80.530 53.861 84.146 52.005 88.000 52.000 L 96.000 52.000 C 97.061 51.999 98.079 52.420 98.830 53.170 L 145.660 100.000 L 208.000 100.000 C 227.882 100.000 244.000 116.118 244.000 136.000 ZM 236.000 136.000 C 236.000 120.536 223.464 108.000 208.000 108.000 L 144.000 108.000 C 142.939 108.001 141.921 107.580 141.170 106.830 L 94.350 60.000 L 88.000 60.000 C 86.715 59.999 85.507 60.616 84.754 61.658 C 84.001 62.700 83.795 64.040 84.200 65.260 L 96.700 102.740 C 97.104 103.958 96.899 105.297 96.149 106.338 C 95.398 107.380 94.194 107.998 92.910 108.000 L 56.000 108.000 C 54.942 107.998 53.928 107.578 53.180 106.830 L 30.350 84.000 L 24.000 84.000 C 22.736 84.000 21.546 84.598 20.791 85.613 C 20.037 86.628 19.807 87.939 20.170 89.150 L 34.240 136.050 C 37.746 147.926 48.677 156.057 61.060 156.000 L 236.000 156.000 Z"),
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
        return _airplaneInFlight!!
    }

private var _airplaneInFlight: ImageVector? = null
