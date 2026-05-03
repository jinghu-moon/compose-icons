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
                pathData = parseSvgPathData("M 17.000 12.000 C 17.552 12.000 18.000 12.448 18.000 13.000 L 18.000 22.000 L 16.000 22.000 L 16.000 14.000 L 8.000 14.000 L 8.000 22.000 L 6.000 22.000 L 6.000 13.000 C 6.000 12.448 6.448 12.000 7.000 12.000 L 17.000 12.000 ZM 12.000 16.000 L 12.000 18.000 L 10.000 18.000 L 10.000 16.000 L 12.000 16.000 ZM 12.000 6.000 C 14.349 6.000 16.383 7.350 17.368 9.316 L 15.579 10.211 C 14.922 8.900 13.566 8.000 12.000 8.000 C 10.434 8.000 9.078 8.900 8.422 10.211 L 6.632 9.316 C 7.618 7.350 9.651 6.000 12.000 6.000 ZM 12.000 2.000 C 15.915 2.000 19.305 4.250 20.947 7.527 L 19.158 8.422 C 17.844 5.800 15.132 4.000 12.000 4.000 C 8.868 4.000 6.156 5.800 4.843 8.422 L 3.054 7.527 C 4.695 4.250 8.085 2.000 12.000 2.000 Z"),
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
