package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PictureInPictureLine: ImageVector
    get() {
        if (_pictureInPictureLine != null) return _pictureInPictureLine!!
        _pictureInPictureLine = remixIcon(
            name = "PictureInPictureLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 3c.552 0 1 .448 1 1v7h-2v-6h-16v14h6v2h-7C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h18ZM21 13c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-8c-.552 0-1-.448-1-1v-6c0-.552 .448-1 1-1h8ZM20 15h-6v4h6v-4Z"),
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
        return _pictureInPictureLine!!
    }

private var _pictureInPictureLine: ImageVector? = null
