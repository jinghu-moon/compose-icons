package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DiscordFill: ImageVector
    get() {
        if (_discordFill != null) return _discordFill!!
        _discordFill = remixIcon(
            name = "DiscordFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.303 5.337 C 17.934 4.711 16.480 4.255 14.963 4.000 C 14.772 4.329 14.560 4.775 14.411 5.125 C 12.797 4.891 11.194 4.891 9.603 5.125 C 9.454 4.775 9.231 4.329 9.051 4.000 C 7.523 4.255 6.069 4.711 4.709 5.337 C 1.961 9.391 1.218 13.349 1.589 17.255 C 3.414 18.581 5.176 19.388 6.907 19.919 C 7.332 19.346 7.714 18.730 8.043 18.083 C 7.416 17.849 6.822 17.563 6.249 17.223 C 6.398 17.117 6.546 17.000 6.684 16.883 C 10.144 18.465 13.891 18.465 17.308 16.883 C 17.457 17.000 17.595 17.117 17.743 17.223 C 17.170 17.563 16.576 17.849 15.950 18.083 C 16.279 18.730 16.661 19.346 17.085 19.919 C 18.815 19.388 20.587 18.581 22.403 17.255 C 22.860 12.734 21.681 8.807 19.303 5.337 ZM 8.520 14.846 C 7.480 14.846 6.631 13.901 6.631 12.745 C 6.631 11.588 7.459 10.643 8.520 10.643 C 9.571 10.643 10.430 11.588 10.409 12.745 C 10.409 13.901 9.571 14.846 8.520 14.846 ZM 15.494 14.846 C 14.453 14.846 13.603 13.901 13.603 12.745 C 13.603 11.588 14.432 10.643 15.494 10.643 C 16.544 10.643 17.404 11.588 17.382 12.745 C 17.382 13.901 16.555 14.846 15.494 14.846 Z"),
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
        return _discordFill!!
    }

private var _discordFill: ImageVector? = null
