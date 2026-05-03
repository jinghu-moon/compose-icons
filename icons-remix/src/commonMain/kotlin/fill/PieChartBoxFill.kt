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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 ZM 16.900 13.000 L 11.000 13.000 L 11.000 7.100 C 8.718 7.563 7.000 9.581 7.000 12.000 C 7.000 14.761 9.239 17.000 12.000 17.000 C 14.419 17.000 16.437 15.282 16.900 13.000 ZM 16.900 11.000 C 16.502 9.041 14.959 7.498 13.000 7.100 L 13.000 11.000 L 16.900 11.000 Z"),
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
        return _pieChartBoxFill!!
    }

private var _pieChartBoxFill: ImageVector? = null
