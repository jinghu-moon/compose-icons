package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AirplaneTaxiing: ImageVector
    get() {
        if (_airplaneTaxiing != null) return _airplaneTaxiing!!
        _airplaneTaxiing = phosphorThinIcon(
            name = "AirplaneTaxiing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 100.000 L 145.660 100.000 L 98.830 53.170 C 98.079 52.420 97.061 51.999 96.000 52.000 L 88.000 52.000 C 84.146 52.005 80.530 53.861 78.278 56.988 C 76.026 60.115 75.413 64.134 76.630 67.790 L 87.360 100.000 L 57.660 100.000 L 34.830 77.170 C 34.079 76.420 33.061 75.999 32.000 76.000 L 24.000 76.000 C 20.209 76.004 16.642 77.800 14.381 80.843 C 12.120 83.886 11.430 87.819 12.520 91.450 L 26.580 138.340 C 31.086 153.611 45.139 164.068 61.060 164.000 L 240.000 164.000 C 242.209 164.000 244.000 162.209 244.000 160.000 L 244.000 136.000 C 244.000 116.118 227.882 100.000 208.000 100.000 ZM 236.000 156.000 L 61.060 156.000 C 48.681 156.053 37.755 147.923 34.250 136.050 L 20.180 89.150 C 19.817 87.941 20.046 86.631 20.798 85.617 C 21.551 84.603 22.737 84.004 24.000 84.000 L 30.340 84.000 L 53.170 106.830 C 53.921 107.580 54.939 108.001 56.000 108.000 L 92.910 108.000 C 94.194 107.998 95.398 107.380 96.149 106.338 C 96.899 105.297 97.104 103.958 96.700 102.740 L 84.210 65.260 C 83.806 64.042 84.011 62.703 84.761 61.662 C 85.512 60.620 86.716 60.002 88.000 60.000 L 94.340 60.000 L 141.160 106.830 C 141.913 107.582 142.935 108.003 144.000 108.000 L 208.000 108.000 C 223.464 108.000 236.000 120.536 236.000 136.000 ZM 220.000 200.000 C 220.000 206.627 214.627 212.000 208.000 212.000 C 201.373 212.000 196.000 206.627 196.000 200.000 C 196.000 193.373 201.373 188.000 208.000 188.000 C 214.627 188.000 220.000 193.373 220.000 200.000 ZM 124.000 200.000 C 124.000 206.627 118.627 212.000 112.000 212.000 C 105.373 212.000 100.000 206.627 100.000 200.000 C 100.000 193.373 105.373 188.000 112.000 188.000 C 118.627 188.000 124.000 193.373 124.000 200.000 Z"),
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
