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
                pathData = parseSvgPathData("M 16.000 2.000 L 21.000 7.000 L 21.000 20.993 C 21.000 21.549 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.545 3.000 21.008 L 3.000 2.992 C 3.000 2.444 3.447 2.000 3.999 2.000 L 16.000 2.000 ZM 13.000 10.000 L 12.000 10.000 L 12.000 15.000 L 13.000 15.000 L 13.000 10.000 ZM 11.000 10.000 L 9.000 10.000 C 7.895 10.000 7.000 10.895 7.000 12.000 L 7.000 13.000 C 7.000 14.105 7.895 15.000 9.000 15.000 L 10.000 15.000 C 10.552 15.000 11.000 14.552 11.000 14.000 L 11.000 12.000 L 9.000 12.000 L 9.000 13.000 L 10.000 13.000 L 10.000 14.000 L 9.000 14.000 C 8.448 14.000 8.000 13.552 8.000 13.000 L 8.000 12.000 C 8.000 11.448 8.448 11.000 9.000 11.000 L 11.000 11.000 L 11.000 10.000 ZM 17.000 10.000 L 14.000 10.000 L 14.000 15.000 L 15.000 15.000 L 15.000 13.000 L 17.000 13.000 L 17.000 12.000 L 15.000 12.000 L 15.000 11.000 L 17.000 11.000 L 17.000 10.000 Z"),
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
