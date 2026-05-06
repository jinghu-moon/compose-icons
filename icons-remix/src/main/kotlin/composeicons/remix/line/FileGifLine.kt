package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileGifLine: ImageVector
    get() {
        if (_fileGifLine != null) return _fileGifLine!!
        _fileGifLine = remixIcon(
            name = "FileGifLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 2l5 5L21 20.993c0 .556-.445 1.007-.993 1.007h-16.013C3.445 22 3 21.545 3 21.008v-18.016C3 2.444 3.447 2 3.999 2h12.001ZM15 4h-10v16h14v-12h-4v-4ZM13 10v5h-1v-5h1ZM11 10v1h-2c-.552 0-1 .448-1 1v1c0 .552 .448 1 1 1h1v-1h-1v-1h2v2c0 .552-.448 1-1 1h-1C7.895 15 7 14.105 7 13v-1c0-1.105 .895-2 2-2h2ZM17 10v1h-2v1h2v1h-2v2h-1v-5h3Z"),
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
        return _fileGifLine!!
    }

private var _fileGifLine: ImageVector? = null
