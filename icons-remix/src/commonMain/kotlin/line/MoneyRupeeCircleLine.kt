package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MoneyRupeeCircleLine: ImageVector
    get() {
        if (_moneyRupeeCircleLine != null) return _moneyRupeeCircleLine!!
        _moneyRupeeCircleLine = remixIcon(
            name = "MoneyRupeeCircleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 ZM 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 ZM 13.500 8.000 C 13.828 8.436 14.062 8.946 14.175 9.500 L 16.000 9.500 L 16.000 11.000 L 14.175 11.000 C 13.828 12.712 12.314 14.000 10.500 14.000 L 10.311 14.000 L 14.030 17.720 L 12.970 18.780 L 8.000 13.811 L 8.000 12.500 L 10.500 12.500 C 11.480 12.500 12.313 11.874 12.622 11.000 L 8.000 11.000 L 8.000 9.500 L 12.622 9.500 C 12.313 8.626 11.480 8.000 10.500 8.000 L 8.000 8.000 L 8.000 6.500 L 16.000 6.500 L 16.000 8.000 L 13.500 8.000 Z"),
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
        return _moneyRupeeCircleLine!!
    }

private var _moneyRupeeCircleLine: ImageVector? = null
