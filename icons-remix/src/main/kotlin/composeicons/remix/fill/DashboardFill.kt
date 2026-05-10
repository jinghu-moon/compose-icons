package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DashboardFill: ImageVector
    get() {
        if (_dashboardFill != null) return _dashboardFill!!
        _dashboardFill = remixIcon(
            name = "DashboardFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 12c0 .552 .448 1 1 1h6c.552 0 1-.448 1-1v-8C11 3.448 10.552 3 10 3h-6C3.448 3 3 3.448 3 4v8ZM3 20c0 .552 .448 1 1 1h6c.552 0 1-.448 1-1v-4c0-.552-.448-1-1-1h-6c-.552 0-1 .448-1 1v4ZM13 20c0 .552 .448 1 1 1h6c.552 0 1-.448 1-1v-8c0-.552-.448-1-1-1h-6c-.552 0-1 .448-1 1v8ZM14 3c-.552 0-1 .448-1 1v4c0 .552 .448 1 1 1h6c.552 0 1-.448 1-1v-4C21 3.448 20.552 3 20 3h-6Z"),
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
        return _dashboardFill!!
    }

private var _dashboardFill: ImageVector? = null
