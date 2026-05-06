package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PieChartLine: ImageVector
    get() {
        if (_pieChartLine != null) return _pieChartLine!!
        _pieChartLine = remixIcon(
            name = "PieChartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 2.458v2.124C6.068 5.768 4 8.643 4 12c0 4.418 3.582 8 8 8 3.357 0 6.232-2.068 7.419-5h2.124C20.268 19.057 16.478 22 12 22 6.477 22 2 17.523 2 12 2 7.522 4.943 3.732 9 2.458ZM12 2c5.523 0 10 4.477 10 10 0 .337-.017 .671-.049 1h-10.951v-10.951C11.329 2.017 11.663 2 12 2ZM13 4.062v6.938h6.938C19.487 7.381 16.619 4.513 13 4.062Z"),
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
        return _pieChartLine!!
    }

private var _pieChartLine: ImageVector? = null
