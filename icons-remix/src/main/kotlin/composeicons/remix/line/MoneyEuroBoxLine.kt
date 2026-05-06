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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.005 3.003h18c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18c-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1ZM4.005 5.003v14h16v-14h-16ZM10.055 11.003h4.95v2h-4.95c.232 1.141 1.24 2 2.45 2 .615 0 1.178-.222 1.614-.591l1.701 1.134c-.823 .896-2.003 1.457-3.315 1.457-2.316 0-4.224-1.75-4.473-4h-1.027v-2h1.027C8.281 8.753 10.189 7.003 12.505 7.003c1.312 0 2.492 .561 3.315 1.457L14.119 9.594c-.436-.369-.999-.591-1.614-.591-1.21 0-2.218 .859-2.45 2Z"),
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
        return _moneyEuroBoxLine!!
    }

private var _moneyEuroBoxLine: ImageVector? = null
