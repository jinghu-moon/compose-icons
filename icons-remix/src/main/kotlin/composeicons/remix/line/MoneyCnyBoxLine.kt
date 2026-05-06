package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MoneyCnyBoxLine: ImageVector
    get() {
        if (_moneyCnyBoxLine != null) return _moneyCnyBoxLine!!
        _moneyCnyBoxLine = remixIcon(
            name = "MoneyCnyBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.005 3.003h18c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18c-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1ZM4.005 5.003v14h16v-14h-16ZM13.005 13.003h3v2h-3v2h-2v-2h-3v-2h3v-1h-3v-2h2.586L8.469 7.881 9.884 6.467l2.121 2.121L14.126 6.467l1.414 1.414-2.121 2.121h2.586v2h-3v1Z"),
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
        return _moneyCnyBoxLine!!
    }

private var _moneyCnyBoxLine: ImageVector? = null
