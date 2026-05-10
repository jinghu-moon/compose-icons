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
                pathData = parseSvgPathData("M8 21h-5v-8h5v8ZM14.5 21h-5v-6h5v6ZM21 21h-5v-4h5v4ZM14.5 14h-5v-11h5v11ZM21 16h-5v-8h5v8ZM8 12h-5v-4h5v4Z"),
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
