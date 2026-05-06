package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NetworkOffLine: ImageVector
    get() {
        if (_networkOffLine != null) return _networkOffLine!!
        _networkOffLine = remixIcon(
            name = "NetworkOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.606 20.192l-1.414 1.414-.725-.725C19.328 20.956 19.169 21 19 21h-4c-.552 0-1-.448-1-1v-4c0-.17 .043-.329 .117-.469L11.586 13h-3.586v2h1c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4C4.448 21 4 20.552 4 20v-4l.005-.102C4.056 15.393 4.482 15 5 15h1v-2h-3v-2h6.586L2.394 3.808 3.808 2.394 21.606 20.192ZM6 19h2v-2h-2v2ZM16 19h1.586L16 17.414v1.586ZM21 13h-3v.758L15.242 11h5.758v2ZM14 3c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-.758l-2-2h1.758v-2h-2v1.758l-2-2v-.758C9 3.448 9.448 3 10 3h4Z"),
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
        return _networkOffLine!!
    }

private var _networkOffLine: ImageVector? = null
