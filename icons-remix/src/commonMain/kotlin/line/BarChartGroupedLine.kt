package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BarChartGroupedLine: ImageVector
    get() {
        if (_barChartGroupedLine != null) return _barChartGroupedLine!!
        _barChartGroupedLine = remixIcon(
            name = "BarChartGroupedLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 12.000 L 4.000 12.000 L 4.000 21.000 L 2.000 21.000 L 2.000 12.000 ZM 5.000 14.000 L 7.000 14.000 L 7.000 21.000 L 5.000 21.000 L 5.000 14.000 ZM 16.000 8.000 L 18.000 8.000 L 18.000 21.000 L 16.000 21.000 L 16.000 8.000 ZM 19.000 10.000 L 21.000 10.000 L 21.000 21.000 L 19.000 21.000 L 19.000 10.000 ZM 9.000 2.000 L 11.000 2.000 L 11.000 21.000 L 9.000 21.000 L 9.000 2.000 ZM 12.000 4.000 L 14.000 4.000 L 14.000 21.000 L 12.000 21.000 L 12.000 4.000 Z"),
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
        return _barChartGroupedLine!!
    }

private var _barChartGroupedLine: ImageVector? = null
