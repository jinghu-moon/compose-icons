package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MoneyPoundCircleFill: ImageVector
    get() {
        if (_moneyPoundCircleFill != null) return _moneyPoundCircleFill!!
        _moneyPoundCircleFill = remixIcon(
            name = "MoneyPoundCircleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.005 22.003 C 6.482 22.003 2.005 17.526 2.005 12.003 C 2.005 6.480 6.482 2.003 12.005 2.003 C 17.528 2.003 22.005 6.480 22.005 12.003 C 22.005 17.526 17.528 22.003 12.005 22.003 ZM 9.005 13.003 L 9.005 15.003 L 8.005 15.003 L 8.005 17.003 L 16.005 17.003 L 16.005 15.003 L 11.005 15.003 L 11.005 13.003 L 14.005 13.003 L 14.005 11.003 L 11.005 11.003 L 11.005 10.003 C 11.005 9.174 11.677 8.503 12.505 8.503 C 13.033 8.503 13.497 8.776 13.764 9.188 L 15.751 8.691 C 15.232 7.408 13.974 6.503 12.505 6.503 C 10.572 6.503 9.005 8.070 9.005 10.003 L 9.005 11.003 L 8.005 11.003 L 8.005 13.003 L 9.005 13.003 Z"),
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
        return _moneyPoundCircleFill!!
    }

private var _moneyPoundCircleFill: ImageVector? = null
