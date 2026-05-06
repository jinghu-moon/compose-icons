package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MessageReport: ImageVector
    get() {
        if (_messageReport != null) return _messageReport!!
        _messageReport = tablerFilledIcon(
            name = "MessageReport",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 3c2.209 0 4 1.791 4 4v8c0 2.209-1.791 4-4 4h-4.724L8.514 21.857c-.291 .175-.652 .19-.957 .04-.305-.15-.513-.445-.551-.783L7 21v-2h-1C3.869 19 2.112 17.329 2.005 15.2L2 15v-8C2 4.791 3.791 3 6 3ZM12 13c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01c0-.552-.448-1-1-1M12 7c-.552 0-1 .448-1 1v3c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-3C13 7.448 12.552 7 12 7"),
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
        return _messageReport!!
    }

private var _messageReport: ImageVector? = null
