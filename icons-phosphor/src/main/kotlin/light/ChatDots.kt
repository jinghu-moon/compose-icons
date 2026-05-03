package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatDots: ImageVector
    get() {
        if (_chatDots != null) return _chatDots!!
        _chatDots = phosphorLightIcon(
            name = "ChatDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 138.000 128.000 C 138.000 133.523 133.523 138.000 128.000 138.000 C 122.477 138.000 118.000 133.523 118.000 128.000 C 118.000 122.477 122.477 118.000 128.000 118.000 C 133.523 118.000 138.000 122.477 138.000 128.000 ZM 84.000 118.000 C 78.477 118.000 74.000 122.477 74.000 128.000 C 74.000 133.523 78.477 138.000 84.000 138.000 C 89.523 138.000 94.000 133.523 94.000 128.000 C 94.000 122.477 89.523 118.000 84.000 118.000 ZM 172.000 118.000 C 166.477 118.000 162.000 122.477 162.000 128.000 C 162.000 133.523 166.477 138.000 172.000 138.000 C 177.523 138.000 182.000 133.523 182.000 128.000 C 182.000 122.477 177.523 118.000 172.000 118.000 ZM 230.000 64.000 L 230.000 192.000 C 230.000 199.732 223.732 206.000 216.000 206.000 L 82.230 206.000 L 49.070 234.640 L 49.010 234.690 C 46.496 236.831 43.302 238.004 40.000 238.000 C 37.943 237.996 35.913 237.542 34.050 236.670 C 29.117 234.387 25.971 229.435 26.000 224.000 L 26.000 64.000 C 26.000 56.268 32.268 50.000 40.000 50.000 L 216.000 50.000 C 223.732 50.000 230.000 56.268 230.000 64.000 ZM 218.000 64.000 C 218.000 62.895 217.105 62.000 216.000 62.000 L 40.000 62.000 C 38.895 62.000 38.000 62.895 38.000 64.000 L 38.000 224.000 C 38.001 224.771 38.445 225.472 39.141 225.803 C 39.837 226.134 40.661 226.036 41.260 225.550 L 76.080 195.470 C 77.168 194.525 78.559 194.003 80.000 194.000 L 216.000 194.000 C 217.105 194.000 218.000 193.105 218.000 192.000 Z"),
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
        return _chatDots!!
    }

private var _chatDots: ImageVector? = null
