package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MultiImageFill: ImageVector
    get() {
        if (_multiImageFill != null) return _multiImageFill!!
        _multiImageFill = remixIcon(
            name = "MultiImageFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 4C6 3.448 6.448 3 7 3h14c.552 0 1 .448 1 1v12c0 .552-.448 1-1 1h-3v3c0 .552-.448 1-1 1h-14C2.448 21 2 20.552 2 20v-12C2 7.448 2.448 7 3 7h3v-3ZM8 7h9c.552 0 1 .448 1 1v7h2v-10h-12v2ZM16 15.739v-6.739h-12v9.632l7.491-6.992L16 15.739ZM7 13.5c.828 0 1.5-.672 1.5-1.5C8.5 11.172 7.828 10.5 7 10.5c-.828 0-1.5 .672-1.5 1.5 0 .828 .672 1.5 1.5 1.5Z"),
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
        return _multiImageFill!!
    }

private var _multiImageFill: ImageVector? = null
