package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatCircleDots: ImageVector
    get() {
        if (_chatCircleDots != null) return _chatCircleDots!!
        _chatCircleDots = phosphorLightIcon(
            name = "ChatCircleDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 138.000 128.000 C 138.000 133.523 133.523 138.000 128.000 138.000 C 122.477 138.000 118.000 133.523 118.000 128.000 C 118.000 122.477 122.477 118.000 128.000 118.000 C 133.523 118.000 138.000 122.477 138.000 128.000 ZM 84.000 118.000 C 78.477 118.000 74.000 122.477 74.000 128.000 C 74.000 133.523 78.477 138.000 84.000 138.000 C 89.523 138.000 94.000 133.523 94.000 128.000 C 94.000 122.477 89.523 118.000 84.000 118.000 ZM 172.000 118.000 C 166.477 118.000 162.000 122.477 162.000 128.000 C 162.000 133.523 166.477 138.000 172.000 138.000 C 177.523 138.000 182.000 133.523 182.000 128.000 C 182.000 122.477 177.523 118.000 172.000 118.000 ZM 230.000 128.000 C 230.008 163.972 211.066 197.289 180.151 215.681 C 149.236 234.073 110.919 234.822 79.310 217.650 L 44.440 229.270 C 39.409 230.948 33.862 229.639 30.111 225.889 C 26.361 222.138 25.052 216.591 26.730 211.560 L 38.350 176.690 C 18.056 139.294 23.107 93.230 51.021 61.120 C 78.935 29.010 123.848 17.599 163.704 32.492 C 203.559 47.385 229.984 85.453 230.000 128.000 ZM 218.000 128.000 C 217.991 90.161 194.315 56.369 158.754 43.439 C 123.194 30.509 83.343 41.203 59.032 70.199 C 34.722 99.195 31.144 140.300 50.080 173.060 C 50.943 174.549 51.125 176.337 50.580 177.970 L 38.120 215.350 C 37.880 216.069 38.067 216.861 38.603 217.397 C 39.139 217.933 39.931 218.120 40.650 217.880 L 78.000 205.420 C 78.613 205.218 79.254 205.114 79.900 205.110 C 80.953 205.116 81.987 205.395 82.900 205.920 C 110.749 222.046 145.089 222.076 172.965 205.998 C 200.842 189.920 218.013 160.181 218.000 128.000 Z"),
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
        return _chatCircleDots!!
    }

private var _chatCircleDots: ImageVector? = null
