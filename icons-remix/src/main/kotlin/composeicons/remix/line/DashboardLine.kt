package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DashboardLine: ImageVector
    get() {
        if (_dashboardLine != null) return _dashboardLine!!
        _dashboardLine = remixIcon(
            name = "DashboardLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 21c-.552 0-1-.448-1-1v-8c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v8c0 .552-.448 1-1 1h-6ZM4 13C3.448 13 3 12.552 3 12v-8C3 3.448 3.448 3 4 3h6c.552 0 1 .448 1 1v8c0 .552-.448 1-1 1h-6ZM9 11v-6h-4v6h4ZM4 21C3.448 21 3 20.552 3 20v-4c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-6ZM5 19h4v-2h-4v2ZM15 19h4v-6h-4v6ZM13 4c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-6C13.448 9 13 8.552 13 8v-4ZM15 5v2h4v-2h-4Z"),
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
        return _dashboardLine!!
    }

private var _dashboardLine: ImageVector? = null
