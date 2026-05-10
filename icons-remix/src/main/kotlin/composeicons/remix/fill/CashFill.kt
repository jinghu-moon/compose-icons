package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CashFill: ImageVector
    get() {
        if (_cashFill != null) return _cashFill!!
        _cashFill = remixIcon(
            name = "CashFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.005 4.003h18c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-18c-.552 0-1-.448-1-1v-14c0-.552 .448-1 1-1ZM6.5 6h-2.5v2.5C5.381 8.5 6.5 7.381 6.5 6ZM17.5 6c0 1.381 1.119 2.5 2.5 2.5v-2.5h-2.5ZM4 15.5v2.5h2.5c0-1.381-1.119-2.5-2.5-2.5ZM17.5 18h2.5v-2.5c-1.381 0-2.5 1.119-2.5 2.5ZM12 16c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4C9.791 8 8 9.791 8 12c0 2.209 1.791 4 4 4Z"),
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
        return _cashFill!!
    }

private var _cashFill: ImageVector? = null
