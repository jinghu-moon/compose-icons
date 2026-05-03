package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MoneyDollarBoxFill: ImageVector
    get() {
        if (_moneyDollarBoxFill != null) return _moneyDollarBoxFill!!
        _moneyDollarBoxFill = remixIcon(
            name = "MoneyDollarBoxFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.005 3.003 L 21.005 3.003 C 21.557 3.003 22.005 3.450 22.005 4.003 L 22.005 20.003 C 22.005 20.555 21.557 21.003 21.005 21.003 L 3.005 21.003 C 2.453 21.003 2.005 20.555 2.005 20.003 L 2.005 4.003 C 2.005 3.450 2.453 3.003 3.005 3.003 ZM 8.505 14.003 L 8.505 16.003 L 11.005 16.003 L 11.005 18.003 L 13.005 18.003 L 13.005 16.003 L 14.005 16.003 C 15.386 16.003 16.505 14.884 16.505 13.503 C 16.505 12.122 15.386 11.003 14.005 11.003 L 10.005 11.003 C 9.729 11.003 9.505 10.779 9.505 10.503 C 9.505 10.227 9.729 10.003 10.005 10.003 L 15.505 10.003 L 15.505 8.003 L 13.005 8.003 L 13.005 6.003 L 11.005 6.003 L 11.005 8.003 L 10.005 8.003 C 8.624 8.003 7.505 9.122 7.505 10.503 C 7.505 11.884 8.624 13.003 10.005 13.003 L 14.005 13.003 C 14.281 13.003 14.505 13.227 14.505 13.503 C 14.505 13.779 14.281 14.003 14.005 14.003 L 8.505 14.003 Z"),
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
        return _moneyDollarBoxFill!!
    }

private var _moneyDollarBoxFill: ImageVector? = null
