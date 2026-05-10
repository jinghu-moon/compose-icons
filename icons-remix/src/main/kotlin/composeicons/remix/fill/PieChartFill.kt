package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PieChartFill: ImageVector
    get() {
        if (_pieChartFill != null) return _pieChartFill!!
        _pieChartFill = remixIcon(
            name = "PieChartFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 2.049v10.951h10.951c-.502 5.053-4.765 9-9.951 9C6.477 22 2 17.523 2 12 2 6.815 5.947 2.551 11 2.049ZM13 2.049c4.724 .469 8.482 4.226 8.951 8.951h-8.951v-8.951Z"),
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
        return _pieChartFill!!
    }

private var _pieChartFill: ImageVector? = null
