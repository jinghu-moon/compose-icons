package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.StackedChartFill: ImageVector
    get() {
        if (_stackedChartFill != null) return _stackedChartFill!!
        _stackedChartFill = remixIcon(
            name = "StackedChartFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 21.000 L 3.000 21.000 L 3.000 13.000 L 8.000 13.000 L 8.000 21.000 ZM 14.500 21.000 L 9.500 21.000 L 9.500 15.000 L 14.500 15.000 L 14.500 21.000 ZM 21.000 21.000 L 16.000 21.000 L 16.000 17.000 L 21.000 17.000 L 21.000 21.000 ZM 14.500 14.000 L 9.500 14.000 L 9.500 3.000 L 14.500 3.000 L 14.500 14.000 ZM 21.000 16.000 L 16.000 16.000 L 16.000 8.000 L 21.000 8.000 L 21.000 16.000 ZM 8.000 12.000 L 3.000 12.000 L 3.000 8.000 L 8.000 8.000 L 8.000 12.000 Z"),
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
        return _stackedChartFill!!
    }

private var _stackedChartFill: ImageVector? = null
