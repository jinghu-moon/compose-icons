package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.KeyboardBoxLine: ImageVector
    get() {
        if (_keyboardBoxLine != null) return _keyboardBoxLine!!
        _keyboardBoxLine = remixIcon(
            name = "KeyboardBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 5v14h16v-14h-16ZM3 3h18c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3ZM6 7h2v2h-2v-2ZM6 11h2v2h-2v-2ZM6 15h12v2h-12v-2ZM11 11h2v2h-2v-2ZM11 7h2v2h-2v-2ZM16 7h2v2h-2v-2ZM16 11h2v2h-2v-2Z"),
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
        return _keyboardBoxLine!!
    }

private var _keyboardBoxLine: ImageVector? = null
