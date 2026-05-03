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
                pathData = parseSvgPathData("M 16.000 16.000 C 17.657 16.000 19.000 17.343 19.000 19.000 C 19.000 20.657 17.657 22.000 16.000 22.000 C 14.343 22.000 13.000 20.657 13.000 19.000 C 13.000 17.343 14.343 16.000 16.000 16.000 ZM 6.000 12.000 C 8.209 12.000 10.000 13.791 10.000 16.000 C 10.000 18.209 8.209 20.000 6.000 20.000 C 3.791 20.000 2.000 18.209 2.000 16.000 C 2.000 13.791 3.791 12.000 6.000 12.000 ZM 14.500 2.000 C 17.538 2.000 20.000 4.462 20.000 7.500 C 20.000 10.538 17.538 13.000 14.500 13.000 C 11.462 13.000 9.000 10.538 9.000 7.500 C 9.000 4.462 11.462 2.000 14.500 2.000 Z"),
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
