package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BubbleChartFill: ImageVector
    get() {
        if (_bubbleChartFill != null) return _bubbleChartFill!!
        _bubbleChartFill = remixIcon(
            name = "BubbleChartFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 16c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3ZM6 12c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4C3.791 20 2 18.209 2 16 2 13.791 3.791 12 6 12ZM14.5 2C17.538 2 20 4.462 20 7.5 20 10.538 17.538 13 14.5 13 11.462 13 9 10.538 9 7.5 9 4.462 11.462 2 14.5 2Z"),
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
        return _bubbleChartFill!!
    }

private var _bubbleChartFill: ImageVector? = null
