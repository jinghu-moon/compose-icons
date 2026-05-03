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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 3.000 C 20.209 3.000 22.000 4.791 22.000 7.000 L 22.000 15.000 C 22.000 17.209 20.209 19.000 18.000 19.000 L 13.276 19.000 L 8.514 21.857 C 8.223 22.032 7.862 22.047 7.557 21.897 C 7.253 21.746 7.045 21.452 7.006 21.114 L 7.000 21.000 L 7.000 19.000 L 6.000 19.000 C 3.869 19.000 2.112 17.329 2.005 15.200 L 2.000 15.000 L 2.000 7.000 C 2.000 4.791 3.791 3.000 6.000 3.000 ZM 15.200 12.286 C 14.806 11.899 14.173 11.906 13.786 12.300 C 13.316 12.780 12.672 13.051 12.000 13.051 C 11.328 13.051 10.684 12.780 10.214 12.300 C 9.826 11.915 9.200 11.913 8.810 12.296 C 8.420 12.679 8.409 13.304 8.786 13.700 C 9.632 14.564 10.791 15.050 12.000 15.050 C 13.209 15.050 14.368 14.564 15.214 13.700 C 15.601 13.306 15.594 12.673 15.200 12.286M 9.510 8.000 L 9.500 8.000 C 8.948 8.000 8.500 8.448 8.500 9.000 C 8.500 9.552 8.948 10.000 9.500 10.000 L 9.510 10.000 C 10.062 10.000 10.510 9.552 10.510 9.000 C 10.510 8.448 10.062 8.000 9.510 8.000M 14.510 8.000 L 14.500 8.000 C 13.948 8.000 13.500 8.448 13.500 9.000 C 13.500 9.552 13.948 10.000 14.500 10.000 L 14.510 10.000 C 15.062 10.000 15.510 9.552 15.510 9.000 C 15.510 8.448 15.062 8.000 14.510 8.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _messageChatbot!!
    }

private var _messageChatbot: ImageVector? = null
