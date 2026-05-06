package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CommunityLine: ImageVector
    get() {
        if (_communityLine != null) return _communityLine!!
        _communityLine = remixIcon(
            name = "CommunityLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 21h-18C2.448 21 2 20.552 2 20v-7.513c0-.289 .125-.564 .343-.754L6 8.544v-4.544C6 3.448 6.448 3 7 3h14c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1ZM9 19h3v-6.058L8 9.454 4 12.942v6.058h3v-4h2v4ZM14 19h6v-14h-12v2.127c.234 0 .469 .082 .657 .246l5 4.359c.218 .19 .343 .465 .343 .754v6.513ZM16 11h2v2h-2v-2ZM16 15h2v2h-2v-2ZM16 7h2v2h-2v-2ZM12 7h2v2h-2v-2Z"),
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
        return _communityLine!!
    }

private var _communityLine: ImageVector? = null
