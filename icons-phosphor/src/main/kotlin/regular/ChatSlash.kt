package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatSlash: ImageVector
    get() {
        if (_chatSlash != null) return _chatSlash!!
        _chatSlash = phosphorRegularIcon(
            name = "ChatSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 44.460 48.000 L 40.000 48.000 C 31.163 48.000 24.000 55.163 24.000 64.000 L 24.000 224.000 C 23.963 230.229 27.578 235.902 33.240 238.500 C 35.358 239.483 37.665 239.995 40.000 240.000 C 43.759 239.989 47.393 238.650 50.260 236.220 L 50.340 236.150 L 83.000 208.000 L 189.920 208.000 L 202.080 221.380 C 203.992 223.535 206.915 224.496 209.733 223.895 C 212.550 223.294 214.827 221.225 215.694 218.478 C 216.561 215.730 215.883 212.729 213.920 210.620 ZM 80.000 192.000 C 78.079 192.001 76.223 192.693 74.770 193.950 L 40.000 224.000 L 40.000 64.000 L 59.000 64.000 L 175.370 192.000 ZM 232.000 64.000 L 232.000 186.000 C 232.000 190.418 228.418 194.000 224.000 194.000 C 219.582 194.000 216.000 190.418 216.000 186.000 L 216.000 64.000 L 105.790 64.000 C 101.372 64.000 97.790 60.418 97.790 56.000 C 97.790 51.582 101.372 48.000 105.790 48.000 L 216.000 48.000 C 224.837 48.000 232.000 55.163 232.000 64.000 Z"),
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
