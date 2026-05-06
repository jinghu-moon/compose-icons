package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RegisteredFill: ImageVector
    get() {
        if (_registeredFill != null) return _registeredFill!!
        _registeredFill = remixIcon(
            name = "RegisteredFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12.5 7h-4.5v10h2v-3h2.217l2.18 3h2.472L14.319 13.491C15.327 12.876 16 11.767 16 10.5 16 8.631 14.536 7.105 12.692 7.005L12.5 7ZM12.5 9c.78 0 1.42 .595 1.493 1.356l.007 .144-.007 .144c-.068 .713-.635 1.281-1.349 1.349L12.5 12h-2.5v-3h2.5Z"),
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
        return _registeredFill!!
    }

private var _registeredFill: ImageVector? = null
