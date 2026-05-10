package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PictureInPictureExitFill: ImageVector
    get() {
        if (_pictureInPictureExitFill != null) return _pictureInPictureExitFill!!
        _pictureInPictureExitFill = remixIcon(
            name = "PictureInPictureExitFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 3c.552 0 1 .448 1 1v7h-2v-6h-16v14h6v2h-7C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h18ZM21 13c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-8c-.552 0-1-.448-1-1v-6c0-.552 .448-1 1-1h8ZM11.5 7 9.457 9.043l2.25 2.25-1.414 1.414L8.043 10.457 6 12.5v-5.5h5.5Z"),
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
        return _pictureInPictureExitFill!!
    }

private var _pictureInPictureExitFill: ImageVector? = null
