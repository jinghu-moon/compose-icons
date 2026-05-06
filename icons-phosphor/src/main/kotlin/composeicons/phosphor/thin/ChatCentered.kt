package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatCentered: ImageVector
    get() {
        if (_chatCentered != null) return _chatCentered!!
        _chatCentered = phosphorThinIcon(
            name = "ChatCentered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 44h-176C33.373 44 28 49.373 28 56v128c0 6.627 5.373 12 12 12h62.75l14.83 26c2.136 3.74 6.113 6.048 10.42 6.048 4.307 0 8.284-2.308 10.42-6.048l14.83-26h62.75c6.627 0 12-5.373 12-12v-128c0-6.627-5.373-12-12-12ZM220 184c0 2.209-1.791 4-4 4h-65.07c-1.431-.002-2.754 .761-3.47 2l-16 28c-.713 1.243-2.037 2.01-3.47 2.01-1.433 0-2.757-.767-3.47-2.01l-16-28c-.716-1.239-2.039-2.002-3.47-2h-65.05c-2.209 0-4-1.791-4-4v-128c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4Z"),
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
        return _chatCentered!!
    }

private var _chatCentered: ImageVector? = null
