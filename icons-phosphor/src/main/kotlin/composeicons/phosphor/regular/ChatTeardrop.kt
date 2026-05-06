package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatTeardrop: ImageVector
    get() {
        if (_chatTeardrop != null) return _chatTeardrop!!
        _chatTeardrop = phosphorRegularIcon(
            name = "ChatTeardrop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M132 24C76.797 24.061 32.061 68.797 32 124v84c0 8.837 7.163 16 16 16h84c55.228 0 100-44.772 100-100C232 68.772 187.228 24 132 24ZM132 208h-84v-84C48 77.608 85.608 40 132 40c46.392 0 84 37.608 84 84 0 46.392-37.608 84-84 84Z"),
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
