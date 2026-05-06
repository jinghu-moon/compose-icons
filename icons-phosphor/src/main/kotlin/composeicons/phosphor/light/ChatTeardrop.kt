package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatTeardrop: ImageVector
    get() {
        if (_chatTeardrop != null) return _chatTeardrop!!
        _chatTeardrop = phosphorLightIcon(
            name = "ChatTeardrop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M132 26C77.901 26.061 34.061 69.901 34 124v84c0 7.732 6.268 14 14 14h84c54.124 0 98-43.876 98-98C230 69.876 186.124 26 132 26ZM132 210h-84c-1.105 0-2-.895-2-2v-84C46 76.504 84.504 38 132 38c47.496 0 86 38.504 86 86 0 47.496-38.504 86-86 86Z"),
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
        return _chatTeardrop!!
    }

private var _chatTeardrop: ImageVector? = null
