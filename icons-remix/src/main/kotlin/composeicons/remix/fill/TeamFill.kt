package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TeamFill: ImageVector
    get() {
        if (_teamFill != null) return _teamFill!!
        _teamFill = remixIcon(
            name = "TeamFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 10c2.209 0 4-1.791 4-4C16 3.791 14.209 2 12 2 9.791 2 8 3.791 8 6c0 2.209 1.791 4 4 4ZM5.5 13C6.881 13 8 11.881 8 10.5 8 9.119 6.881 8 5.5 8 4.119 8 3 9.119 3 10.5 3 11.881 4.119 13 5.5 13ZM21 10.5C21 11.881 19.881 13 18.5 13 17.119 13 16 11.881 16 10.5 16 9.119 17.119 8 18.5 8 19.881 8 21 9.119 21 10.5ZM12 11c2.761 0 5 2.239 5 5v6h-10v-6c0-2.761 2.239-5 5-5ZM5 16c0-.693 .101-1.362 .288-1.994l-.17 .015C3.365 14.21 2 15.696 2 17.5v4.5h3v-6ZM22 22v-4.5c0-1.862-1.454-3.385-3.288-3.494 .188 .632 .288 1.301 .288 1.994v6h3Z"),
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
        return _teamFill!!
    }

private var _teamFill: ImageVector? = null
