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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 12h2v9h-2v-9ZM5 14h2v7h-2v-7ZM16 8h2v13h-2v-13ZM19 10h2v11h-2v-11ZM9 2h2v19h-2v-19ZM12 4h2v17h-2v-17Z"),
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
        return _barChartGroupedLine!!
    }

private var _barChartGroupedLine: ImageVector? = null
