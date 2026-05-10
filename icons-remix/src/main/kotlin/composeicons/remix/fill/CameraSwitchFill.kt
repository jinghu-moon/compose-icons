package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CameraSwitchFill: ImageVector
    get() {
        if (_cameraSwitchFill != null) return _cameraSwitchFill!!
        _cameraSwitchFill = remixIcon(
            name = "CameraSwitchFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 3h6l2 2h4c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-14C2 5.448 2.448 5 3 5h4L9 3ZM14.684 18.368l-.895-1.789C13.251 16.848 12.643 17 12 17 9.791 17 8 15.209 8 13h2L7.839 8.677C6.705 9.769 6 11.302 6 13c0 3.314 2.686 6 6 6 .965 0 1.876-.228 2.684-.632ZM9.316 7.632l.895 1.789C10.749 9.152 11.357 9 12 9c2.209 0 4 1.791 4 4h-2l2.161 4.323C17.295 16.231 18 14.698 18 13 18 9.686 15.314 7 12 7c-.965 0-1.876 .228-2.684 .632Z"),
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
        return _cameraSwitchFill!!
    }

private var _cameraSwitchFill: ImageVector? = null
