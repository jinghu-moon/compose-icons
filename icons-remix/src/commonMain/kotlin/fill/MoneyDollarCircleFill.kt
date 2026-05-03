package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MoneyDollarCircleFill: ImageVector
    get() {
        if (_moneyDollarCircleFill != null) return _moneyDollarCircleFill!!
        _moneyDollarCircleFill = remixIcon(
            name = "MoneyDollarCircleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.005 22.003 C 6.482 22.003 2.005 17.526 2.005 12.003 C 2.005 6.480 6.482 2.003 12.005 2.003 C 17.528 2.003 22.005 6.480 22.005 12.003 C 22.005 17.526 17.528 22.003 12.005 22.003 ZM 8.505 14.003 L 8.505 16.003 L 11.005 16.003 L 11.005 18.003 L 13.005 18.003 L 13.005 16.003 L 14.005 16.003 C 15.386 16.003 16.505 14.884 16.505 13.503 C 16.505 12.122 15.386 11.003 14.005 11.003 L 10.005 11.003 C 9.729 11.003 9.505 10.779 9.505 10.503 C 9.505 10.227 9.729 10.003 10.005 10.003 L 15.505 10.003 L 15.505 8.003 L 13.005 8.003 L 13.005 6.003 L 11.005 6.003 L 11.005 8.003 L 10.005 8.003 C 8.624 8.003 7.505 9.122 7.505 10.503 C 7.505 11.884 8.624 13.003 10.005 13.003 L 14.005 13.003 C 14.281 13.003 14.505 13.227 14.505 13.503 C 14.505 13.779 14.281 14.003 14.005 14.003 L 8.505 14.003 Z"),
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
        return _moneyDollarCircleFill!!
    }

private var _moneyDollarCircleFill: ImageVector? = null
