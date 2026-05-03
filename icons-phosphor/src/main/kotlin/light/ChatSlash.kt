package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatSlash: ImageVector
    get() {
        if (_chatSlash != null) return _chatSlash!!
        _chatSlash = phosphorLightIcon(
            name = "ChatSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 52.440 36.000 C 50.163 33.887 46.650 33.861 44.342 35.940 C 42.034 38.019 41.695 41.516 43.560 44.000 L 49.000 50.000 L 40.000 50.000 C 32.268 50.000 26.000 56.268 26.000 64.000 L 26.000 224.000 C 25.965 229.453 29.132 234.420 34.090 236.690 C 39.046 239.045 44.924 238.261 49.090 234.690 L 82.230 206.000 L 190.800 206.000 L 203.560 220.000 C 204.994 221.616 207.186 222.337 209.299 221.886 C 211.413 221.436 213.120 219.884 213.770 217.823 C 214.420 215.763 213.912 213.512 212.440 211.930 ZM 80.000 194.000 C 78.561 194.001 77.169 194.519 76.080 195.460 L 41.290 225.460 C 40.705 225.955 39.888 226.072 39.188 225.761 C 38.487 225.450 38.026 224.766 38.000 224.000 L 38.000 64.000 C 38.000 62.895 38.895 62.000 40.000 62.000 L 59.890 62.000 L 179.890 194.000 ZM 230.000 64.000 L 230.000 186.000 C 230.000 189.314 227.314 192.000 224.000 192.000 C 220.686 192.000 218.000 189.314 218.000 186.000 L 218.000 64.000 C 218.000 62.895 217.105 62.000 216.000 62.000 L 105.790 62.000 C 102.476 62.000 99.790 59.314 99.790 56.000 C 99.790 52.686 102.476 50.000 105.790 50.000 L 216.000 50.000 C 223.732 50.000 230.000 56.268 230.000 64.000 Z"),
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
        return _chatSlash!!
    }

private var _chatSlash: ImageVector? = null
