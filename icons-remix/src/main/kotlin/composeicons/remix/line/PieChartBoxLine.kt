package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PieChartBoxLine: ImageVector
    get() {
        if (_pieChartBoxLine != null) return _pieChartBoxLine!!
        _pieChartBoxLine = remixIcon(
            name = "PieChartBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 3h18c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3ZM4 5v14h16v-14h-16ZM16.9 13c-.463 2.282-2.481 4-4.9 4C9.239 17 7 14.761 7 12 7 9.581 8.718 7.563 11 7.1v5.9h5.9ZM16.9 11h-3.9v-3.9c1.959 .398 3.502 1.941 3.9 3.9Z"),
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
        return _pieChartBoxLine!!
    }

private var _pieChartBoxLine: ImageVector? = null
