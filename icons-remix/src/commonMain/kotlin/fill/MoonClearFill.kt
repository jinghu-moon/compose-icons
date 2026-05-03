package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MoonClearFill: ImageVector
    get() {
        if (_moonClearFill != null) return _moonClearFill!!
        _moonClearFill = remixIcon(
            name = "MoonClearFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.822 2.238 C 9.294 3.383 9.000 4.657 9.000 6.000 C 9.000 10.971 13.029 15.000 18.000 15.000 C 19.343 15.000 20.617 14.706 21.762 14.178 C 20.768 18.654 16.775 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 7.225 5.346 3.232 9.822 2.238 ZM 18.164 2.291 L 19.000 2.500 L 19.000 3.500 L 18.164 3.709 C 17.448 3.888 16.888 4.448 16.709 5.164 L 16.500 6.000 L 15.500 6.000 L 15.291 5.164 C 15.112 4.448 14.552 3.888 13.836 3.709 L 13.000 3.500 L 13.000 2.500 L 13.836 2.291 C 14.552 2.112 15.112 1.552 15.291 0.836 L 15.500 0.000 L 16.500 0.000 L 16.709 0.836 C 16.888 1.552 17.448 2.112 18.164 2.291 ZM 23.164 7.291 L 24.000 7.500 L 24.000 8.500 L 23.164 8.709 C 22.448 8.888 21.888 9.448 21.709 10.164 L 21.500 11.000 L 20.500 11.000 L 20.291 10.164 C 20.112 9.448 19.552 8.888 18.836 8.709 L 18.000 8.500 L 18.000 7.500 L 18.836 7.291 C 19.552 7.112 20.112 6.552 20.291 5.836 L 20.500 5.000 L 21.500 5.000 L 21.709 5.836 C 21.888 6.552 22.448 7.112 23.164 7.291 Z"),
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
        return _moonClearFill!!
    }

private var _moonClearFill: ImageVector? = null
