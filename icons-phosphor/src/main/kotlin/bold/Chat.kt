package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Chat: ImageVector
    get() {
        if (_chat != null) return _chat!!
        _chat = phosphorBoldIcon(
            name = "Chat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 44.000 L 40.000 44.000 C 28.954 44.000 20.000 52.954 20.000 64.000 L 20.000 224.000 C 19.967 231.779 24.489 238.858 31.560 242.100 C 34.218 243.344 37.115 243.993 40.050 244.000 C 44.746 243.988 49.287 242.316 52.870 239.280 L 52.990 239.170 L 84.470 212.000 L 216.000 212.000 C 227.046 212.000 236.000 203.046 236.000 192.000 L 236.000 64.000 C 236.000 52.954 227.046 44.000 216.000 44.000 ZM 212.000 188.000 L 80.000 188.000 C 77.120 187.995 74.335 189.032 72.160 190.920 L 44.000 215.230 L 44.000 68.000 L 212.000 68.000 Z"),
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
        return _chat!!
    }

private var _chat: ImageVector? = null
