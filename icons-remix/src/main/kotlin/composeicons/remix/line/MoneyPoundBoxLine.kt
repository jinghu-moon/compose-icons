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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.005 3.003h18c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18c-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1ZM4.005 5.003v14h16v-14h-16ZM9.005 13.003h-1v-2h1v-1c0-1.933 1.567-3.5 3.5-3.5 1.469 0 2.727 .905 3.246 2.188l-1.987 .497c-.267-.412-.731-.685-1.259-.685-.828 0-1.5 .672-1.5 1.5v1h3v2h-3v2h5v2h-8v-2h1v-2Z"),
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
        return _moneyPoundBoxLine!!
    }

private var _moneyPoundBoxLine: ImageVector? = null
