package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MoneyRupeeCircleFill: ImageVector
    get() {
        if (_moneyRupeeCircleFill != null) return _moneyRupeeCircleFill!!
        _moneyRupeeCircleFill = remixIcon(
            name = "MoneyRupeeCircleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 C 22.000 6.477 17.523 2.000 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 C 2.000 17.523 6.477 22.000 12.000 22.000 ZM 13.500 8.000 C 13.828 8.436 14.062 8.946 14.175 9.500 L 16.000 9.500 L 16.000 11.000 L 14.175 11.000 C 13.828 12.712 12.314 14.000 10.500 14.000 L 10.311 14.000 L 14.030 17.720 L 12.970 18.780 L 8.000 13.811 L 8.000 12.500 L 10.500 12.500 C 11.480 12.500 12.313 11.874 12.622 11.000 L 8.000 11.000 L 8.000 9.500 L 12.622 9.500 C 12.313 8.626 11.480 8.000 10.500 8.000 L 8.000 8.000 L 8.000 6.500 L 16.000 6.500 L 16.000 8.000 L 13.500 8.000 Z"),
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
        return _moneyRupeeCircleFill!!
    }

private var _moneyRupeeCircleFill: ImageVector? = null
