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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 2.049 L 11.000 4.062 C 7.054 4.554 4.000 7.920 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 13.849 20.000 15.551 19.373 16.906 18.320 L 18.329 19.743 C 16.605 21.154 14.401 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.815 5.947 2.551 11.000 2.049 ZM 21.951 13.000 C 21.751 15.011 20.955 16.847 19.743 18.328 L 18.320 16.906 C 19.180 15.799 19.756 14.461 19.938 13.000 L 21.951 13.000 ZM 13.001 2.049 C 17.725 2.519 21.482 6.276 21.951 11.000 L 19.938 11.000 C 19.487 7.382 16.619 4.514 13.001 4.062 L 13.001 2.049 Z"),
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
        return _donutChartLine!!
    }

private var _donutChartLine: ImageVector? = null
