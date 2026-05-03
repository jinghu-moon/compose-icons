package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Chat: ImageVector
    get() {
        if (_chat != null) return _chat!!
        _chat = phosphorFillIcon(
            name = "Chat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 64.000 L 232.000 192.000 C 232.000 200.837 224.837 208.000 216.000 208.000 L 83.000 208.000 L 50.400 236.160 L 50.310 236.230 C 47.430 238.672 43.775 240.008 40.000 240.000 C 37.653 239.996 35.335 239.477 33.210 238.480 C 27.565 235.878 23.963 230.216 24.000 224.000 L 24.000 64.000 C 24.000 55.163 31.163 48.000 40.000 48.000 L 216.000 48.000 C 224.837 48.000 232.000 55.163 232.000 64.000 Z"),
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
        return _chat!!
    }

private var _chat: ImageVector? = null
