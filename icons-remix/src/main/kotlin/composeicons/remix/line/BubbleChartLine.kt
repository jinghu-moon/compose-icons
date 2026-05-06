package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BubbleChartLine: ImageVector
    get() {
        if (_bubbleChartLine != null) return _bubbleChartLine!!
        _bubbleChartLine = remixIcon(
            name = "BubbleChartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 16c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3ZM6 12c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4C3.791 20 2 18.209 2 16 2 13.791 3.791 12 6 12ZM16 18c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1ZM6 14c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 14.895 7.105 14 6 14ZM14.5 2C17.538 2 20 4.462 20 7.5 20 10.538 17.538 13 14.5 13 11.462 13 9 10.538 9 7.5 9 4.462 11.462 2 14.5 2ZM14.5 4C12.567 4 11 5.567 11 7.5 11 9.433 12.567 11 14.5 11 16.433 11 18 9.433 18 7.5 18 5.567 16.433 4 14.5 4Z"),
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
        return _bubbleChartLine!!
    }

private var _bubbleChartLine: ImageVector? = null
