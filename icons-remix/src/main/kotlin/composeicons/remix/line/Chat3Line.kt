package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Chat3Line: ImageVector
    get() {
        if (_chat3Line != null) return _chat3Line!!
        _chat3Line = remixIcon(
            name = "Chat3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.291 20.824 2 22 3.176 16.709C2.425 15.306 2 13.703 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C10.297 22 8.694 21.575 7.291 20.824ZM7.581 18.711l.654 .349C9.382 19.674 10.665 20 12 20c4.418 0 8-3.582 8-8C20 7.582 16.418 4 12 4 7.582 4 4 7.582 4 12c0 1.335 .325 2.618 .939 3.766l.349 .654-.655 2.947 2.947-.655Z"),
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
        return _chat3Line!!
    }

private var _chat3Line: ImageVector? = null
