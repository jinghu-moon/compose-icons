package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MoneyDollarBoxLine: ImageVector
    get() {
        if (_moneyDollarBoxLine != null) return _moneyDollarBoxLine!!
        _moneyDollarBoxLine = remixIcon(
            name = "MoneyDollarBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.005 3.003h18c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18c-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1ZM4.005 5.003v14h16v-14h-16ZM8.505 14.003h5.5c.276 0 .5-.224 .5-.5 0-.276-.224-.5-.5-.5h-4c-1.381 0-2.5-1.119-2.5-2.5 0-1.381 1.119-2.5 2.5-2.5h1v-2h2v2h2.5v2h-5.5c-.276 0-.5 .224-.5 .5 0 .276 .224 .5 .5 .5h4c1.381 0 2.5 1.119 2.5 2.5 0 1.381-1.119 2.5-2.5 2.5h-1v2h-2v-2h-2.5v-2Z"),
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
        return _moneyDollarBoxLine!!
    }

private var _moneyDollarBoxLine: ImageVector? = null
