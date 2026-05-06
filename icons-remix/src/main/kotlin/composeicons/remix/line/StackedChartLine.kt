package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StackedChartLine: ImageVector
    get() {
        if (_stackedChartLine != null) return _stackedChartLine!!
        _stackedChartLine = remixIcon(
            name = "StackedChartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 8v12h-5v-12h5ZM14.5 4v16h-5v-16h5ZM21 9v11h-5v-11h5ZM18 18h1v-1h-1v1ZM11.5 18h1v-2h-1v2ZM5 18h1v-4h-1v4ZM18 15h1v-4h-1v4ZM11.5 14h1v-8h-1v8ZM5 12h1v-2h-1v2Z"),
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
        return _stackedChartLine!!
    }

private var _stackedChartLine: ImageVector? = null
