package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Inbox2Fill: ImageVector
    get() {
        if (_inbox2Fill != null) return _inbox2Fill!!
        _inbox2Fill = remixIcon(
            name = "Inbox2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 3c-.469 0-.875 .326-.976 .783l-2 9C2.008 12.854 2 12.927 2 13v7c0 .552 .448 1 1 1h18c.552 0 1-.448 1-1v-7c0-.073-.008-.146-.024-.217l-2-9C19.875 3.326 19.469 3 19 3h-14ZM19.753 12h-4.753c0 1.657-1.343 3-3 3C10.343 15 9 13.657 9 12h-4.753L5.802 5h12.396l1.556 7Z"),
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
        return _inbox2Fill!!
    }

private var _inbox2Fill: ImageVector? = null
