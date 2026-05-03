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
                pathData = parseSvgPathData("M 16.000 16.000 C 17.657 16.000 19.000 17.343 19.000 19.000 C 19.000 20.657 17.657 22.000 16.000 22.000 C 14.343 22.000 13.000 20.657 13.000 19.000 C 13.000 17.343 14.343 16.000 16.000 16.000 ZM 6.000 12.000 C 8.209 12.000 10.000 13.791 10.000 16.000 C 10.000 18.209 8.209 20.000 6.000 20.000 C 3.791 20.000 2.000 18.209 2.000 16.000 C 2.000 13.791 3.791 12.000 6.000 12.000 ZM 16.000 18.000 C 15.448 18.000 15.000 18.448 15.000 19.000 C 15.000 19.552 15.448 20.000 16.000 20.000 C 16.552 20.000 17.000 19.552 17.000 19.000 C 17.000 18.448 16.552 18.000 16.000 18.000 ZM 6.000 14.000 C 4.895 14.000 4.000 14.895 4.000 16.000 C 4.000 17.105 4.895 18.000 6.000 18.000 C 7.105 18.000 8.000 17.105 8.000 16.000 C 8.000 14.895 7.105 14.000 6.000 14.000 ZM 14.500 2.000 C 17.538 2.000 20.000 4.462 20.000 7.500 C 20.000 10.538 17.538 13.000 14.500 13.000 C 11.462 13.000 9.000 10.538 9.000 7.500 C 9.000 4.462 11.462 2.000 14.500 2.000 ZM 14.500 4.000 C 12.567 4.000 11.000 5.567 11.000 7.500 C 11.000 9.433 12.567 11.000 14.500 11.000 C 16.433 11.000 18.000 9.433 18.000 7.500 C 18.000 5.567 16.433 4.000 14.500 4.000 Z"),
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
