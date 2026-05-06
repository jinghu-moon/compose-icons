package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FindReplaceLine: ImageVector
    get() {
        if (_findReplaceLine != null) return _findReplaceLine!!
        _findReplaceLine = remixIcon(
            name = "FindReplaceLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.033 16.618l4.281 4.281-1.414 1.414L16.618 18.033C15.079 19.264 13.126 20 11 20 7.465 20 4.407 17.964 2.935 15h3.065 3L7.696 17.173C8.68 17.701 9.805 18 11 18c1.896 0 3.615-.753 4.875-1.975l.15-.15C17.247 14.615 18 12.896 18 11c0-.695-.101-1.366-.29-2h2.067c.146 .643 .223 1.313 .223 2 0 2.126-.736 4.079-1.967 5.618ZM19.065 7h-6.065L14.304 4.827C13.32 4.299 12.195 4 11 4 7.133 4 4 7.133 4 11c0 .695 .101 1.366 .29 2h-2.067C2.077 12.357 2 11.687 2 11 2 6.028 6.028 2 11 2c3.535 0 6.593 2.036 8.065 5Z"),
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
        return _findReplaceLine!!
    }

private var _findReplaceLine: ImageVector? = null
