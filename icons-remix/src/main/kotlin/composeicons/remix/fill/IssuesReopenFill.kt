package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.IssuesReopenFill: ImageVector
    get() {
        if (_issuesReopenFill != null) return _issuesReopenFill!!
        _issuesReopenFill = remixIcon(
            name = "IssuesReopenFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 12c0 5.523-4.477 10-10 10C8.856 22 6.051 20.548 4.219 18.281L2 20.5v-6h6L5.643 16.857C7.106 18.77 9.41 20 12 20c4.418 0 8-3.582 8-8h2ZM12 10c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2ZM12 2c3.144 0 5.949 1.452 7.781 3.719L22 3.5v6h-6L18.357 7.143C16.894 5.23 14.59 4 12 4 7.582 4 4 7.582 4 12h-2C2 6.477 6.477 2 12 2Z"),
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
        return _issuesReopenFill!!
    }

private var _issuesReopenFill: ImageVector? = null
