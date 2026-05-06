package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RemoteControlLine: ImageVector
    get() {
        if (_remoteControlLine != null) return _remoteControlLine!!
        _remoteControlLine = remixIcon(
            name = "RemoteControlLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 12c.552 0 1 .448 1 1v9h-2v-8h-8v8h-2v-9c0-.552 .448-1 1-1h10ZM12 16v2h-2v-2h2ZM12 6c2.349 0 4.383 1.35 5.368 3.316l-1.789 .895C14.922 8.9 13.566 8 12 8 10.434 8 9.078 8.9 8.422 10.211L6.632 9.316C7.618 7.35 9.651 6 12 6ZM12 2c3.915 0 7.305 2.25 8.946 5.527l-1.789 .895C17.844 5.8 15.132 4 12 4 8.868 4 6.156 5.8 4.843 8.422L3.054 7.527C4.695 4.25 8.085 2 12 2Z"),
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
        return _remoteControlLine!!
    }

private var _remoteControlLine: ImageVector? = null
