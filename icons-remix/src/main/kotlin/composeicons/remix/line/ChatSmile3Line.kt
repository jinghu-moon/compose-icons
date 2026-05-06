package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChatSmile3Line: ImageVector
    get() {
        if (_chatSmile3Line != null) return _chatSmile3Line!!
        _chatSmile3Line = remixIcon(
            name = "ChatSmile3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 12C2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10h-10L4.929 19.071C3.119 17.261 2 14.761 2 12ZM6.828 20h5.172c4.418 0 8-3.582 8-8C20 7.582 16.418 4 12 4 7.582 4 4 7.582 4 12c0 2.152 .851 4.165 2.343 5.657l1.414 1.414L6.828 20ZM8 13h8c0 2.209-1.791 4-4 4C9.791 17 8 15.209 8 13Z"),
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
        return _chatSmile3Line!!
    }

private var _chatSmile3Line: ImageVector? = null
