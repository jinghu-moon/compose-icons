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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 10.000 C 3.000 10.552 3.448 11.000 4.000 11.000 L 12.000 11.000 C 12.552 11.000 13.000 10.552 13.000 10.000 L 13.000 4.000 C 13.000 3.448 12.552 3.000 12.000 3.000 L 4.000 3.000 C 3.448 3.000 3.000 3.448 3.000 4.000 L 3.000 10.000 ZM 11.000 20.000 C 11.000 20.552 11.448 21.000 12.000 21.000 L 20.000 21.000 C 20.552 21.000 21.000 20.552 21.000 20.000 L 21.000 14.000 C 21.000 13.448 20.552 13.000 20.000 13.000 L 12.000 13.000 C 11.448 13.000 11.000 13.448 11.000 14.000 L 11.000 20.000 ZM 13.000 15.000 L 19.000 15.000 L 19.000 19.000 L 13.000 19.000 L 13.000 15.000 ZM 3.000 20.000 C 3.000 20.552 3.448 21.000 4.000 21.000 L 8.000 21.000 C 8.552 21.000 9.000 20.552 9.000 20.000 L 9.000 14.000 C 9.000 13.448 8.552 13.000 8.000 13.000 L 4.000 13.000 C 3.448 13.000 3.000 13.448 3.000 14.000 L 3.000 20.000 ZM 5.000 19.000 L 5.000 15.000 L 7.000 15.000 L 7.000 19.000 L 5.000 19.000 ZM 5.000 9.000 L 5.000 5.000 L 11.000 5.000 L 11.000 9.000 L 5.000 9.000 ZM 20.000 11.000 C 20.552 11.000 21.000 10.552 21.000 10.000 L 21.000 4.000 C 21.000 3.448 20.552 3.000 20.000 3.000 L 16.000 3.000 C 15.448 3.000 15.000 3.448 15.000 4.000 L 15.000 10.000 C 15.000 10.552 15.448 11.000 16.000 11.000 L 20.000 11.000 ZM 19.000 9.000 L 17.000 9.000 L 17.000 5.000 L 19.000 5.000 L 19.000 9.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _dashboardHorizontalLine!!
    }

private var _dashboardHorizontalLine: ImageVector? = null
