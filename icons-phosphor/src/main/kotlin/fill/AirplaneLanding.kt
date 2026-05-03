package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AirplaneLanding: ImageVector
    get() {
        if (_airplaneLanding != null) return _airplaneLanding!!
        _airplaneLanding = phosphorFillIcon(
            name = "AirplaneLanding",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 256.000 216.000 C 256.000 220.418 252.418 224.000 248.000 224.000 L 104.000 224.000 C 99.582 224.000 96.000 220.418 96.000 216.000 C 96.000 211.582 99.582 208.000 104.000 208.000 L 248.000 208.000 C 252.418 208.000 256.000 211.582 256.000 216.000 ZM 232.000 192.000 C 236.418 192.000 240.000 188.418 240.000 184.000 L 240.000 148.320 C 239.957 130.371 228.001 114.633 210.720 109.780 L 149.880 92.780 L 127.380 39.150 C 126.488 37.020 124.720 35.380 122.530 34.650 L 117.060 32.830 C 112.182 31.204 106.820 32.021 102.648 35.026 C 98.476 38.031 96.003 42.858 96.000 48.000 L 96.000 77.390 L 66.130 68.880 L 55.520 39.510 C 54.687 37.207 52.844 35.412 50.520 34.640 L 45.050 32.820 C 40.172 31.197 34.811 32.018 30.641 35.025 C 26.472 38.032 24.001 42.859 24.000 48.000 L 24.000 103.720 C 24.039 121.643 35.962 137.366 53.210 142.240 L 229.840 191.700 C 230.543 191.898 231.270 191.999 232.000 192.000 Z"),
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
        return _airplaneLanding!!
    }

private var _airplaneLanding: ImageVector? = null
