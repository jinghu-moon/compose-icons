package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatCenteredSlash: ImageVector
    get() {
        if (_chatCenteredSlash != null) return _chatCenteredSlash!!
        _chatCenteredSlash = phosphorThinIcon(
            name = "ChatCenteredSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M51 37.31C49.514 35.653 46.967 35.514 45.31 37c-1.657 1.486-1.796 4.033-.31 5.69L46.23 44h-6.23C33.373 44 28 49.373 28 56v128c0 6.627 5.373 12 12 12h62.75l14.83 26c2.136 3.74 6.113 6.048 10.42 6.048 4.307 0 8.284-2.308 10.42-6.048l14.83-26h31.16L205 218.69c.956 1.078 2.417 1.558 3.826 1.258 1.409-.3 2.547-1.335 2.981-2.709 .433-1.374 .095-2.874-.887-3.929ZM150.93 188c-1.431-.002-2.754 .761-3.47 2l-16 28c-.713 1.243-2.037 2.01-3.47 2.01-1.433 0-2.757-.767-3.47-2.01l-16-28c-.716-1.239-2.039-2.002-3.47-2h-65.05c-2.209 0-4-1.791-4-4v-128c0-2.209 1.791-4 4-4h13.5L177.14 188ZM228 56v130c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-130c0-2.209-1.791-4-4-4h-117.48c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h117.48c6.627 0 12 5.373 12 12Z"),
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
        return _chatCenteredSlash!!
    }

private var _chatCenteredSlash: ImageVector? = null
