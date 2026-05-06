package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DonutChartLine: ImageVector
    get() {
        if (_donutChartLine != null) return _donutChartLine!!
        _donutChartLine = remixIcon(
            name = "DonutChartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 2.049 11 4.062C7.054 4.554 4 7.92 4 12c0 4.418 3.582 8 8 8 1.849 0 3.551-.627 4.906-1.68l1.423 1.423C16.605 21.154 14.401 22 12 22 6.477 22 2 17.523 2 12 2 6.815 5.947 2.551 11 2.049ZM21.951 13c-.2 2.011-.995 3.847-2.207 5.328L18.32 16.906c.86-1.107 1.436-2.445 1.618-3.906l2.012 0ZM13.001 2.049c4.724 .47 8.48 4.226 8.95 8.95L19.938 11C19.487 7.382 16.619 4.514 13.001 4.062l0-2.013Z"),
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
        return _donutChartLine!!
    }

private var _donutChartLine: ImageVector? = null
