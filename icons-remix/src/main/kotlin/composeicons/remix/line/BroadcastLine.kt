package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BroadcastLine: ImageVector
    get() {
        if (_broadcastLine != null) return _broadcastLine!!
        _broadcastLine = remixIcon(
            name = "BroadcastLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.929 2.929 6.343 4.343C4.895 5.791 4 7.791 4 10c0 2.209 .895 4.209 2.343 5.657L4.929 17.071C3.119 15.261 2 12.761 2 10 2 7.239 3.119 4.739 4.929 2.929ZM19.071 2.929C20.881 4.739 22 7.239 22 10c0 2.761-1.119 5.261-2.929 7.071L17.657 15.657C19.105 14.209 20 12.209 20 10 20 7.791 19.105 5.791 17.657 4.343L19.071 2.929ZM7.757 5.757 9.172 7.172C8.448 7.895 8 8.895 8 10c0 1.105 .448 2.105 1.172 2.828L7.757 14.243C6.672 13.157 6 11.657 6 10 6 8.343 6.672 6.843 7.757 5.757ZM16.243 5.757C17.328 6.843 18 8.343 18 10c0 1.657-.672 3.157-1.757 4.243L14.828 12.828C15.552 12.105 16 11.105 16 10 16 8.895 15.552 7.895 14.828 7.172L16.243 5.757ZM12 12c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2ZM11 14h2v8h-2v-8Z"),
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
        return _broadcastLine!!
    }

private var _broadcastLine: ImageVector? = null
