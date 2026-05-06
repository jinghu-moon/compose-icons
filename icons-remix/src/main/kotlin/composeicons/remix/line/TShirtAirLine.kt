package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TShirtAirLine: ImageVector
    get() {
        if (_tShirtAirLine != null) return _tShirtAirLine!!
        _tShirtAirLine = remixIcon(
            name = "TShirtAirLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.705 17.793c.827 .827 1.587 1.207 2.293 1.207 .378 0 .68-.067 1.237-.276l.392-.153C17.678 18.151 18.206 18 18.998 18c1.214 0 2.379 .545 3.486 1.579l.221 .214-1.414 1.414C20.464 20.38 19.704 20 18.998 20c-.378 0-.68 .067-1.237 .276l-.392 .153C16.318 20.849 15.79 21 14.998 21c-1.214 0-2.379-.545-3.486-1.579l-.221-.214 1.414-1.414ZM8.998 3c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3h6c.552 0 1 .448 1 1v7c0 .552-.448 1-1 1h-4.002l.001-2 3.001-.001v-5h-3.417l-.017 .041c-.753 1.682-2.408 2.872-4.349 2.955L11.998 8C9.963 8 8.212 6.785 7.432 5.04L7.414 4.999h-3.416v5L6.997 9.998 6.997 19h3.001v2h-4c-.552 0-1-.448-1-1L4.997 11.999 2.998 12c-.552 0-1-.448-1-1v-7c0-.552 .448-1 1-1h6ZM12.705 13.793c.827 .827 1.587 1.207 2.293 1.207 .378 0 .68-.067 1.237-.276l.392-.153C17.678 14.151 18.206 14 18.998 14c1.214 0 2.379 .545 3.486 1.579l.221 .214-1.414 1.414C20.464 16.38 19.704 16 18.998 16c-.378 0-.68 .067-1.237 .276l-.392 .153C16.318 16.849 15.79 17 14.998 17c-1.214 0-2.379-.545-3.486-1.579l-.221-.214 1.414-1.414Z"),
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
        return _tShirtAirLine!!
    }

private var _tShirtAirLine: ImageVector? = null
