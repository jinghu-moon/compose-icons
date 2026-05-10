package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CommunityFill: ImageVector
    get() {
        if (_communityFill != null) return _communityFill!!
        _communityFill = remixIcon(
            name = "CommunityFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 19h3v-6.058L8 9.454 4 12.942v6.058h3v-4h2v4ZM21 21h-18C2.448 21 2 20.552 2 20v-7.513c0-.289 .125-.564 .343-.754L6 8.544v-4.544C6 3.448 6.448 3 7 3h14c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1ZM16 11v2h2v-2h-2ZM16 15v2h2v-2h-2ZM16 7v2h2v-2h-2ZM12 7v2h2v-2h-2Z"),
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
        return _communityFill!!
    }

private var _communityFill: ImageVector? = null
