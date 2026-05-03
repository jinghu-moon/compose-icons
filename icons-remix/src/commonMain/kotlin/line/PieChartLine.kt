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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 2.458 L 9.000 4.582 C 6.068 5.768 4.000 8.643 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 15.357 20.000 18.232 17.932 19.419 15.000 L 21.542 15.000 C 20.268 19.057 16.478 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 7.522 4.943 3.732 9.000 2.458 ZM 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 12.337 21.983 12.671 21.951 13.000 L 11.000 13.000 L 11.000 2.049 C 11.329 2.017 11.663 2.000 12.000 2.000 ZM 13.000 4.062 L 13.000 11.000 L 19.938 11.000 C 19.487 7.381 16.619 4.513 13.000 4.062 Z"),
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
        return _pieChartLine!!
    }

private var _pieChartLine: ImageVector? = null
