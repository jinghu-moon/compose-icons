package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NetworkErrorLine: ImageVector
    get() {
        if (_networkErrorLine != null) return _networkErrorLine!!
        _networkErrorLine = remixIcon(
            name = "NetworkErrorLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.207 16.207 18.414 18l1.793 1.793-1.414 1.414L17 19.414l-1.793 1.793L13.793 19.793 15.586 18 13.793 16.207l1.414-1.414L17 16.586l1.793-1.793 1.414 1.414ZM14 3c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-1v2h8v2h-3v1.5h-2v-1.5h-8v2h1c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4C4.448 21 4 20.552 4 20v-4l.005-.102C4.056 15.393 4.482 15 5 15h1v-2h-3v-2h8v-2h-1C9.448 9 9 8.552 9 8v-4C9 3.448 9.448 3 10 3h4ZM6 19h2v-2h-2v2ZM11 7h2v-2h-2v2Z"),
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
        return _networkErrorLine!!
    }

private var _networkErrorLine: ImageVector? = null
