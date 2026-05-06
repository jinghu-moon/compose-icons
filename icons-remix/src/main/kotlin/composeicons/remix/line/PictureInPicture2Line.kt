package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PictureInPicture2Line: ImageVector
    get() {
        if (_pictureInPicture2Line != null) return _pictureInPicture2Line!!
        _pictureInPicture2Line = remixIcon(
            name = "PictureInPicture2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 3c.552 0 1 .448 1 1v7h-2v-6h-16v14h6v2h-7C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h18ZM21 13c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-8c-.552 0-1-.448-1-1v-6c0-.552 .448-1 1-1h8ZM20 15h-6v4h6v-4ZM6.707 6.293 8.957 8.543 11 6.5v5.5h-5.5L7.543 9.957 5.293 7.707 6.707 6.293Z"),
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
        return _pictureInPicture2Line!!
    }

private var _pictureInPicture2Line: ImageVector? = null
