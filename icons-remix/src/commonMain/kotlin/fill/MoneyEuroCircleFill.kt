package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MoneyEuroCircleFill: ImageVector
    get() {
        if (_moneyEuroCircleFill != null) return _moneyEuroCircleFill!!
        _moneyEuroCircleFill = remixIcon(
            name = "MoneyEuroCircleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.005 22.003 C 6.482 22.003 2.005 17.526 2.005 12.003 C 2.005 6.480 6.482 2.003 12.005 2.003 C 17.528 2.003 22.005 6.480 22.005 12.003 C 22.005 17.526 17.528 22.003 12.005 22.003 ZM 10.055 11.003 C 10.286 9.862 11.295 9.003 12.505 9.003 C 13.120 9.003 13.683 9.225 14.119 9.594 L 15.820 8.460 C 14.997 7.564 13.817 7.003 12.505 7.003 C 10.189 7.003 8.281 8.753 8.032 11.003 L 7.005 11.003 L 7.005 13.003 L 8.032 13.003 C 8.281 15.253 10.189 17.003 12.505 17.003 C 13.817 17.003 14.997 16.441 15.820 15.546 L 14.119 14.412 C 13.683 14.781 13.120 15.003 12.505 15.003 C 11.295 15.003 10.286 14.144 10.055 13.003 L 15.005 13.003 L 15.005 11.003 L 10.055 11.003 Z"),
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
        return _moneyEuroCircleFill!!
    }

private var _moneyEuroCircleFill: ImageVector? = null
