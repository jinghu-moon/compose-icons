package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FundsBoxLine: ImageVector
    get() {
        if (_fundsBoxLine != null) return _fundsBoxLine!!
        _fundsBoxLine = remixIcon(
            name = "FundsBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.005 5.003v14h16v-14h-16ZM3.005 3.003h18c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18c-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1ZM14.798 9.796 13.005 8.003h5v5L16.212 11.21l-3.864 3.864L10.227 12.953 7.398 15.781 5.984 14.367l4.243-4.243 2.121 2.121L14.798 9.796Z"),
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
        return _fundsBoxLine!!
    }

private var _fundsBoxLine: ImageVector? = null
