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
                pathData = parseSvgPathData("M 18.000 3.000 C 20.209 3.000 22.000 4.791 22.000 7.000 L 22.000 15.000 C 22.000 17.209 20.209 19.000 18.000 19.000 L 13.276 19.000 L 8.514 21.857 C 8.223 22.032 7.862 22.047 7.557 21.897 C 7.253 21.746 7.045 21.452 7.006 21.114 L 7.000 21.000 L 7.000 19.000 L 6.000 19.000 C 3.869 19.000 2.112 17.329 2.005 15.200 L 2.000 15.000 L 2.000 7.000 C 2.000 4.791 3.791 3.000 6.000 3.000 ZM 12.000 13.000 C 11.448 13.000 11.000 13.448 11.000 14.000 L 11.000 14.010 C 11.000 14.562 11.448 15.010 12.000 15.010 C 12.552 15.010 13.000 14.562 13.000 14.010 L 13.000 14.000 C 13.000 13.448 12.552 13.000 12.000 13.000M 12.000 7.000 C 11.448 7.000 11.000 7.448 11.000 8.000 L 11.000 11.000 C 11.000 11.552 11.448 12.000 12.000 12.000 C 12.552 12.000 13.000 11.552 13.000 11.000 L 13.000 8.000 C 13.000 7.448 12.552 7.000 12.000 7.000"),
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
