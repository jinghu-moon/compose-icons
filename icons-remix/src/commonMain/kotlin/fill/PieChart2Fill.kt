package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PieChart2Fill: ImageVector
    get() {
        if (_pieChart2Fill != null) return _pieChart2Fill!!
        _pieChart2Fill = remixIcon(
            name = "PieChart2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 2.049 L 11.000 13.000 L 21.951 13.000 C 21.449 18.053 17.185 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.815 5.947 2.551 11.000 2.049 ZM 13.000 0.543 C 18.553 1.021 22.979 5.446 23.457 11.000 L 13.000 11.000 L 13.000 0.543 Z"),
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
        return _pieChart2Fill!!
    }

private var _pieChart2Fill: ImageVector? = null
