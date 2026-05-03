package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MoneyPoundBoxLine: ImageVector
    get() {
        if (_moneyPoundBoxLine != null) return _moneyPoundBoxLine!!
        _moneyPoundBoxLine = remixIcon(
            name = "MoneyPoundBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.005 3.003 L 21.005 3.003 C 21.557 3.003 22.005 3.450 22.005 4.003 L 22.005 20.003 C 22.005 20.555 21.557 21.003 21.005 21.003 L 3.005 21.003 C 2.453 21.003 2.005 20.555 2.005 20.003 L 2.005 4.003 C 2.005 3.450 2.453 3.003 3.005 3.003 ZM 4.005 5.003 L 4.005 19.003 L 20.005 19.003 L 20.005 5.003 L 4.005 5.003 ZM 9.005 13.003 L 8.005 13.003 L 8.005 11.003 L 9.005 11.003 L 9.005 10.003 C 9.005 8.070 10.572 6.503 12.505 6.503 C 13.974 6.503 15.232 7.408 15.751 8.691 L 13.764 9.188 C 13.497 8.776 13.033 8.503 12.505 8.503 C 11.677 8.503 11.005 9.174 11.005 10.003 L 11.005 11.003 L 14.005 11.003 L 14.005 13.003 L 11.005 13.003 L 11.005 15.003 L 16.005 15.003 L 16.005 17.003 L 8.005 17.003 L 8.005 15.003 L 9.005 15.003 L 9.005 13.003 Z"),
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
        return _moneyPoundBoxLine!!
    }

private var _moneyPoundBoxLine: ImageVector? = null
