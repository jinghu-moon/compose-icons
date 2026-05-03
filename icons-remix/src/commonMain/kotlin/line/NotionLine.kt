package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NotionLine: ImageVector
    get() {
        if (_notionLine != null) return _notionLine!!
        _notionLine = remixIcon(
            name = "NotionLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.285 2.955 C 15.928 2.717 15.501 2.608 15.074 2.645 L 4.015 3.606 C 3.504 3.651 3.111 4.079 3.111 4.592 L 3.111 16.167 C 3.111 16.575 3.244 16.973 3.489 17.300 L 6.256 20.989 C 6.459 21.260 6.786 21.408 7.123 21.382 L 19.976 20.393 C 20.491 20.354 20.889 19.924 20.889 19.407 L 20.889 6.527 C 20.889 6.213 20.732 5.920 20.471 5.746 L 16.285 2.955 ZM 15.228 4.416 C 15.253 4.414 15.278 4.420 15.299 4.434 L 18.045 6.265 L 7.839 7.081 L 5.978 5.220 L 15.228 4.416 ZM 19.111 18.677 L 8.389 19.502 L 8.389 8.821 L 19.111 7.963 L 19.111 18.677 ZM 4.889 6.646 L 6.611 8.368 L 6.611 18.500 L 4.911 16.233 C 4.897 16.214 4.889 16.191 4.889 16.167 L 4.889 6.646 ZM 11.979 10.123 L 10.002 10.253 L 10.002 17.815 L 11.998 17.685 L 11.998 13.348 L 15.510 17.517 L 17.486 17.387 L 17.486 9.825 L 15.490 9.956 L 15.490 14.292 L 11.979 10.123 Z"),
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
        return _notionLine!!
    }

private var _notionLine: ImageVector? = null
