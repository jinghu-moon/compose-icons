package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Dashboard2Fill: ImageVector
    get() {
        if (_dashboard2Fill != null) return _dashboard2Fill!!
        _dashboard2Fill = remixIcon(
            name = "Dashboard2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12 5C8.134 5 5 8.134 5 12c0 1.852 .72 3.537 1.894 4.789l.156 .161L8.464 15.535C7.56 14.631 7 13.381 7 12 7 9.239 9.239 7 12 7c.448 0 .882 .059 1.295 .169L14.858 5.608C13.985 5.217 13.018 5 12 5ZM18.392 9.143l-1.562 1.561c.11 .413 .169 .847 .169 1.295 0 1.381-.56 2.631-1.465 3.535l1.414 1.414C18.216 15.683 19 13.933 19 12c0-1.018-.217-1.984-.608-2.857ZM16.243 6.343l-3.726 3.724C12.352 10.024 12.179 10 12 10c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-.179-.024-.352-.068-.517L17.657 7.757 16.243 6.343Z"),
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
        return _dashboard2Fill!!
    }

private var _dashboard2Fill: ImageVector? = null
