package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChatSlash: ImageVector
    get() {
        if (_chatSlash != null) return _chatSlash!!
        _chatSlash = phosphorFillIcon(
            name = "ChatSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 213.920 210.610 C 215.883 212.719 216.561 215.720 215.694 218.468 C 214.827 221.215 212.550 223.284 209.733 223.885 C 206.915 224.486 203.992 223.525 202.080 221.370 L 189.920 208.000 L 83.000 208.000 L 50.400 236.160 L 50.320 236.230 C 47.435 238.670 43.778 240.006 40.000 240.000 C 37.650 239.995 35.329 239.476 33.200 238.480 C 27.561 235.874 23.964 230.213 24.000 224.000 L 24.000 64.000 C 24.000 55.163 31.163 48.000 40.000 48.000 L 44.460 48.000 L 42.080 45.380 C 40.117 43.271 39.439 40.270 40.306 37.522 C 41.173 34.775 43.450 32.706 46.267 32.105 C 49.085 31.504 52.008 32.465 53.920 34.620 ZM 216.000 48.000 L 96.750 48.000 C 95.160 47.984 93.711 48.912 93.060 50.363 C 92.410 51.814 92.680 53.513 93.750 54.690 L 225.000 199.060 C 226.106 200.314 227.875 200.748 229.435 200.148 C 230.996 199.549 232.019 198.042 232.000 196.370 L 232.000 64.000 C 232.000 55.163 224.837 48.000 216.000 48.000 Z"),
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
        return _chatSlash!!
    }

private var _chatSlash: ImageVector? = null
