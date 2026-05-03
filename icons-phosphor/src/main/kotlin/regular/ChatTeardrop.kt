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
                pathData = parseSvgPathData("M 132.000 24.000 C 76.797 24.061 32.061 68.797 32.000 124.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 132.000 224.000 C 187.228 224.000 232.000 179.228 232.000 124.000 C 232.000 68.772 187.228 24.000 132.000 24.000 ZM 132.000 208.000 L 48.000 208.000 L 48.000 124.000 C 48.000 77.608 85.608 40.000 132.000 40.000 C 178.392 40.000 216.000 77.608 216.000 124.000 C 216.000 170.392 178.392 208.000 132.000 208.000 Z"),
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
