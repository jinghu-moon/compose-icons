package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AirplaneInFlight: ImageVector
    get() {
        if (_airplaneInFlight != null) return _airplaneInFlight!!
        _airplaneInFlight = phosphorFillIcon(
            name = "AirplaneInFlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 216.000 C 224.000 220.418 220.418 224.000 216.000 224.000 L 72.000 224.000 C 67.582 224.000 64.000 220.418 64.000 216.000 C 64.000 211.582 67.582 208.000 72.000 208.000 L 216.000 208.000 C 220.418 208.000 224.000 211.582 224.000 216.000 ZM 208.000 96.000 L 147.320 96.000 L 101.660 50.340 C 100.158 48.840 98.122 47.998 96.000 48.000 L 88.000 48.000 C 82.858 48.003 78.031 50.476 75.026 54.648 C 72.021 58.820 71.204 64.182 72.830 69.060 L 81.830 96.000 L 59.320 96.000 L 37.660 74.340 C 36.158 72.840 34.122 71.998 32.000 72.000 L 24.000 72.000 C 18.944 72.005 14.188 74.398 11.173 78.456 C 8.157 82.514 7.237 87.758 8.690 92.600 L 22.760 139.490 C 27.762 156.460 43.378 168.081 61.070 168.000 L 240.000 168.000 C 244.418 168.000 248.000 164.418 248.000 160.000 L 248.000 136.000 C 248.000 113.909 230.091 96.000 208.000 96.000 Z"),
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
