package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DashboardHorizontalLine: ImageVector
    get() {
        if (_dashboardHorizontalLine != null) return _dashboardHorizontalLine!!
        _dashboardHorizontalLine = remixIcon(
            name = "DashboardHorizontalLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 10c0 .552 .448 1 1 1h8c.552 0 1-.448 1-1v-6C13 3.448 12.552 3 12 3h-8C3.448 3 3 3.448 3 4v6ZM11 20c0 .552 .448 1 1 1h8c.552 0 1-.448 1-1v-6c0-.552-.448-1-1-1h-8c-.552 0-1 .448-1 1v6ZM13 15h6v4h-6v-4ZM3 20c0 .552 .448 1 1 1h4c.552 0 1-.448 1-1v-6C9 13.448 8.552 13 8 13h-4c-.552 0-1 .448-1 1v6ZM5 19v-4h2v4h-2ZM5 9v-4h6v4h-6ZM20 11c.552 0 1-.448 1-1v-6C21 3.448 20.552 3 20 3h-4c-.552 0-1 .448-1 1v6c0 .552 .448 1 1 1h4ZM19 9h-2v-4h2v4Z"),
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
        return _dashboardHorizontalLine!!
    }

private var _dashboardHorizontalLine: ImageVector? = null
