package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PieChart2Line: ImageVector
    get() {
        if (_pieChart2Line != null) return _pieChart2Line!!
        _pieChart2Line = remixIcon(
            name = "PieChart2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 0.500 C 18.351 0.500 23.500 5.649 23.500 12.000 C 23.500 12.337 23.486 12.670 23.457 13.000 L 21.951 13.000 C 21.449 18.053 17.185 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.815 5.947 2.551 11.000 2.049 L 11.000 0.543 C 11.330 0.514 11.663 0.500 12.000 0.500 ZM 11.000 4.062 C 7.054 4.554 4.000 7.920 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 16.080 20.000 19.446 16.946 19.938 13.000 L 11.000 13.000 L 11.000 4.062 ZM 13.000 2.552 L 13.000 11.000 L 21.448 11.000 C 20.983 6.552 17.448 3.017 13.000 2.552 Z"),
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
        return _pieChart2Line!!
    }

private var _pieChart2Line: ImageVector? = null
