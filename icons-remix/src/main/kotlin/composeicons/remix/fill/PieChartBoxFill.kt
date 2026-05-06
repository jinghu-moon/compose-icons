package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PieChartBoxFill: ImageVector
    get() {
        if (_pieChartBoxFill != null) return _pieChartBoxFill!!
        _pieChartBoxFill = remixIcon(
            name = "PieChartBoxFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 3h18c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3ZM16.9 13h-5.9v-5.9C8.718 7.563 7 9.581 7 12c0 2.761 2.239 5 5 5 2.419 0 4.437-1.718 4.9-4ZM16.9 11C16.502 9.041 14.959 7.498 13 7.1v3.9h3.9Z"),
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
        return _pieChartBoxFill!!
    }

private var _pieChartBoxFill: ImageVector? = null
