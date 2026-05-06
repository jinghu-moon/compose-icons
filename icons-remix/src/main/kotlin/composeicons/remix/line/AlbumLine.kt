package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AlbumLine: ImageVector
    get() {
        if (_albumLine != null) return _albumLine!!
        _albumLine = remixIcon(
            name = "AlbumLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 20c4.418 0 8-3.582 8-8C20 7.582 16.418 4 12 4 7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8ZM12 22C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM12 14c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM12 16C9.791 16 8 14.209 8 12 8 9.791 9.791 8 12 8c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4Z"),
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
        return _albumLine!!
    }

private var _albumLine: ImageVector? = null
