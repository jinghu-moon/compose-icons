package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MessageChatbot: ImageVector
    get() {
        if (_messageChatbot != null) return _messageChatbot!!
        _messageChatbot = tablerFilledIcon(
            name = "MessageChatbot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 3c2.209 0 4 1.791 4 4v8c0 2.209-1.791 4-4 4h-4.724L8.514 21.857c-.291 .175-.652 .19-.957 .04-.305-.15-.513-.445-.551-.783L7 21v-2h-1C3.869 19 2.112 17.329 2.005 15.2L2 15v-8C2 4.791 3.791 3 6 3ZM15.2 12.286c-.394-.387-1.027-.38-1.414 .014-.47 .48-1.114 .751-1.786 .751-.672 0-1.316-.271-1.786-.751-.388-.385-1.014-.387-1.404-.004-.39 .383-.401 1.008-.024 1.404 .846 .864 2.005 1.35 3.214 1.35 1.209 0 2.368-.487 3.214-1.35 .387-.394 .38-1.027-.014-1.414M9.51 8h-.01c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h.01c.552 0 1-.448 1-1 0-.552-.448-1-1-1M14.51 8h-.01c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h.01c.552 0 1-.448 1-1 0-.552-.448-1-1-1"),
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
        return _messageChatbot!!
    }

private var _messageChatbot: ImageVector? = null
