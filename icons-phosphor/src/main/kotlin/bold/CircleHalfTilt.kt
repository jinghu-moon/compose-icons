package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CircleHalfTilt: ImageVector
    get() {
        if (_circleHalfTilt != null) return _circleHalfTilt!!
        _circleHalfTilt = phosphorBoldIcon(
            name = "CircleHalfTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.370 51.600 C 167.920 15.125 110.780 9.480 67.897 38.117 C 25.015 66.755 8.335 121.697 28.060 169.341 C 47.785 216.985 98.419 244.059 148.995 234.004 C 199.571 223.949 235.999 179.565 236.000 128.000 C 235.999 99.348 224.623 71.868 204.370 51.600 ZM 176.000 197.000 C 171.002 200.493 165.637 203.427 160.000 205.750 L 160.000 113.000 L 176.000 97.000 ZM 68.600 68.580 C 98.141 39.086 144.847 35.731 178.300 60.700 L 60.720 178.330 C 35.721 144.868 39.077 98.128 68.600 68.580 ZM 96.000 177.000 L 96.000 205.690 C 89.487 203.011 83.338 199.520 77.700 195.300 ZM 120.000 211.620 L 120.000 153.000 L 136.000 137.000 L 136.000 211.640 C 130.678 212.138 125.321 212.132 120.000 211.620 ZM 200.000 171.350 L 200.000 84.650 C 216.014 111.332 216.014 144.668 200.000 171.350 Z"),
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
        return _circleHalfTilt!!
    }

private var _circleHalfTilt: ImageVector? = null
