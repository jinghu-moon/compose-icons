package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MoneyEuroBoxLine: ImageVector
    get() {
        if (_moneyEuroBoxLine != null) return _moneyEuroBoxLine!!
        _moneyEuroBoxLine = remixIcon(
            name = "MoneyEuroBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.005 3.003 L 21.005 3.003 C 21.557 3.003 22.005 3.450 22.005 4.003 L 22.005 20.003 C 22.005 20.555 21.557 21.003 21.005 21.003 L 3.005 21.003 C 2.453 21.003 2.005 20.555 2.005 20.003 L 2.005 4.003 C 2.005 3.450 2.453 3.003 3.005 3.003 ZM 4.005 5.003 L 4.005 19.003 L 20.005 19.003 L 20.005 5.003 L 4.005 5.003 ZM 10.055 11.003 L 15.005 11.003 L 15.005 13.003 L 10.055 13.003 C 10.286 14.144 11.295 15.003 12.505 15.003 C 13.120 15.003 13.683 14.781 14.119 14.412 L 15.820 15.546 C 14.997 16.441 13.817 17.003 12.505 17.003 C 10.189 17.003 8.281 15.253 8.032 13.003 L 7.005 13.003 L 7.005 11.003 L 8.032 11.003 C 8.281 8.753 10.189 7.003 12.505 7.003 C 13.817 7.003 14.997 7.564 15.820 8.460 L 14.119 9.594 C 13.683 9.225 13.120 9.003 12.505 9.003 C 11.295 9.003 10.286 9.862 10.055 11.003 Z"),
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
        return _moneyEuroBoxLine!!
    }

private var _moneyEuroBoxLine: ImageVector? = null
