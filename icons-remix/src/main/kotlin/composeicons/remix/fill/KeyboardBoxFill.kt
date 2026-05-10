package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.KeyboardBoxFill: ImageVector
    get() {
        if (_keyboardBoxFill != null) return _keyboardBoxFill!!
        _keyboardBoxFill = remixIcon(
            name = "KeyboardBoxFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 3h18c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3ZM5 7v2h2v-2h-2ZM5 11v2h2v-2h-2ZM5 15v2h14v-2h-14ZM9 11v2h2v-2h-2ZM9 7v2h2v-2h-2ZM13 7v2h2v-2h-2ZM17 7v2h2v-2h-2ZM13 11v2h2v-2h-2ZM17 11v2h2v-2h-2Z"),
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
        return _keyboardBoxFill!!
    }

private var _keyboardBoxFill: ImageVector? = null
