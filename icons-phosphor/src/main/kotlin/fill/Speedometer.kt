package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Speedometer: ImageVector
    get() {
        if (_speedometer != null) return _speedometer!!
        _speedometer = phosphorFillIcon(
            name = "Speedometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 221.870 90.860 C 221.207 89.857 220.129 89.205 218.932 89.085 C 217.736 88.964 216.549 89.389 215.700 90.240 L 140.280 165.660 C 137.111 168.476 132.295 168.332 129.301 165.330 C 126.307 162.328 126.175 157.511 129.000 154.350 L 221.700 61.660 C 224.826 58.534 224.826 53.466 221.700 50.340 C 218.574 47.214 213.506 47.214 210.380 50.340 L 197.000 63.730 C 157.778 33.098 103.053 32.006 62.640 61.048 C 22.227 90.091 5.813 142.308 22.340 189.250 C 24.599 195.671 30.654 199.975 37.460 200.000 L 218.530 200.000 C 225.331 200.004 231.391 195.709 233.640 189.290 C 245.197 156.431 240.849 120.068 221.870 90.860 ZM 57.440 166.410 C 58.318 170.740 55.520 174.962 51.190 175.840 C 50.664 175.948 50.127 176.001 49.590 176.000 C 45.789 175.995 42.516 173.316 41.760 169.590 C 35.952 140.997 44.683 111.383 65.074 90.515 C 85.466 69.647 114.870 60.234 143.590 65.380 C 147.939 66.159 150.834 70.316 150.055 74.665 C 149.276 79.014 145.119 81.909 140.770 81.130 C 117.268 76.923 93.208 84.627 76.522 101.704 C 59.836 118.780 52.690 143.012 57.440 166.410 Z"),
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
        return _speedometer!!
    }

private var _speedometer: ImageVector? = null
