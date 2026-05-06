package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileGifFill: ImageVector
    get() {
        if (_fileGifFill != null) return _fileGifFill!!
        _fileGifFill = remixIcon(
            name = "FileGifFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 2l5 5L21 20.993c0 .556-.445 1.007-.993 1.007h-16.013C3.445 22 3 21.545 3 21.008v-18.016C3 2.444 3.447 2 3.999 2h12.001ZM13 10h-1v5h1v-5ZM11 10h-2c-1.105 0-2 .895-2 2v1c0 1.105 .895 2 2 2h1c.552 0 1-.448 1-1v-2h-2v1h1v1h-1C8.448 14 8 13.552 8 13v-1c0-.552 .448-1 1-1h2v-1ZM17 10h-3v5h1v-2h2v-1h-2v-1h2v-1Z"),
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
        return _fileGifFill!!
    }

private var _fileGifFill: ImageVector? = null
