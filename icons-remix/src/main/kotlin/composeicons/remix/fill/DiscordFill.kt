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
                pathData = parseSvgPathData("M19.303 5.337C17.934 4.711 16.48 4.255 14.963 4c-.191 .329-.403 .775-.552 1.125-1.614-.233-3.217-.233-4.808 0C9.454 4.775 9.231 4.329 9.051 4 7.523 4.255 6.069 4.711 4.709 5.337 1.961 9.391 1.218 13.349 1.589 17.255c1.825 1.327 3.587 2.133 5.318 2.664 .424-.573 .807-1.189 1.136-1.836-.626-.234-1.22-.52-1.794-.86 .149-.106 .297-.223 .435-.34 3.46 1.581 7.207 1.581 10.624 0 .149 .117 .287 .234 .435 .34-.573 .34-1.167 .626-1.794 .86 .329 .647 .711 1.263 1.135 1.836 1.73-.531 3.502-1.337 5.318-2.664C22.86 12.734 21.681 8.807 19.303 5.337ZM8.52 14.846c-1.04 0-1.889-.944-1.889-2.101 0-1.157 .828-2.101 1.889-2.101 1.051 0 1.91 .944 1.889 2.101 0 1.157-.838 2.101-1.889 2.101ZM15.494 14.846c-1.04 0-1.89-.944-1.89-2.101 0-1.157 .829-2.101 1.89-2.101 1.051 0 1.91 .944 1.889 2.101 0 1.157-.828 2.101-1.889 2.101Z"),
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
