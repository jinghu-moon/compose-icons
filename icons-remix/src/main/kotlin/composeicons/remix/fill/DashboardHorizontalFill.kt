package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DashboardHorizontalFill: ImageVector
    get() {
        if (_dashboardHorizontalFill != null) return _dashboardHorizontalFill!!
        _dashboardHorizontalFill = remixIcon(
            name = "DashboardHorizontalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-8C3.448 11 3 10.552 3 10v-6C3 3.448 3.448 3 4 3h8ZM20 3c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-4c-.552 0-1-.448-1-1v-6c0-.552 .448-1 1-1h4ZM20 13c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-8c-.552 0-1-.448-1-1v-6c0-.552 .448-1 1-1h8ZM3 14c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-4C3.448 21 3 20.552 3 20v-6Z"),
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
        return _dashboardHorizontalFill!!
    }

private var _dashboardHorizontalFill: ImageVector? = null
