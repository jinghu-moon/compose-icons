package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChatSearchLine: ImageVector
    get() {
        if (_chatSearchLine != null) return _chatSearchLine!!
        _chatSearchLine = remixIcon(
            name = "ChatSearchLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.763 17h7.32c-.055 .325-.083 .659-.083 1 0 .341 .028 .675 .083 1h-6.628L2 22.5v-18.5C2 3.448 2.448 3 3 3h18c.552 0 1 .448 1 1v8.803c-.607-.351-1.282-.599-2-.72v-7.083h-16v13.385L5.763 17ZM23.95 21.535 22.446 20.032C22.798 19.437 23 18.742 23 18c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 .742 0 1.437-.202 2.032-.554l1.503 1.503 1.414-1.414ZM21 18c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z"),
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
        return _chatSearchLine!!
    }

private var _chatSearchLine: ImageVector? = null
