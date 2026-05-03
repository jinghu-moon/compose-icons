package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LineChartLine: ImageVector
    get() {
        if (_lineChartLine != null) return _lineChartLine!!
        _lineChartLine = remixIcon(
            name = "LineChartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 3.000 L 5.000 19.000 L 21.000 19.000 L 21.000 21.000 L 3.000 21.000 L 3.000 3.000 L 5.000 3.000 ZM 20.293 6.293 L 21.707 7.707 L 16.000 13.414 L 13.000 10.415 L 8.707 14.707 L 7.293 13.293 L 13.000 7.586 L 16.000 10.585 L 20.293 6.293 Z"),
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
        return _lineChartLine!!
    }

private var _lineChartLine: ImageVector? = null
