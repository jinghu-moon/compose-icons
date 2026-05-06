package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.NetworkFill: ImageVector
    get() {
        if (_networkFill != null) return _networkFill!!
        _networkFill = remixIcon(
            name = "NetworkFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 3c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-1v2h8v2h-3v2h1c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4c-.552 0-1-.448-1-1v-4c0-.552 .448-1 1-1h1v-2h-8v2h1c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4C4.448 21 4 20.552 4 20v-4l.005-.102C4.056 15.393 4.482 15 5 15h1v-2h-3v-2h8v-2h-1C9.448 9 9 8.552 9 8v-4C9 3.448 9.448 3 10 3h4Z"),
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
        return _networkFill!!
    }

private var _networkFill: ImageVector? = null
