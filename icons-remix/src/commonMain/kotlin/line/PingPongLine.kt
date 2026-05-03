package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PingPongLine: ImageVector
    get() {
        if (_pingPongLine != null) return _pingPongLine!!
        _pingPongLine = remixIcon(
            name = "PingPongLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.500 2.000 C 16.747 2.000 21.000 6.253 21.000 11.500 C 21.000 13.029 20.639 14.474 19.997 15.754 L 22.460 18.218 C 22.851 18.608 22.851 19.241 22.460 19.632 L 19.632 22.460 C 19.241 22.851 18.608 22.851 18.218 22.460 L 15.754 19.997 C 14.474 20.639 13.029 21.000 11.500 21.000 C 6.253 21.000 2.000 16.747 2.000 11.500 C 2.000 6.253 6.253 2.000 11.500 2.000 ZM 16.803 15.388 L 15.389 16.802 L 18.925 20.337 L 20.339 18.923 L 16.803 15.388 ZM 18.667 9.283 L 9.283 18.667 C 9.984 18.883 10.728 19.000 11.500 19.000 C 12.467 19.000 13.391 18.817 14.240 18.484 L 13.268 17.510 C 12.877 17.120 12.877 16.487 13.268 16.096 L 16.096 13.268 C 16.487 12.877 17.120 12.877 17.510 13.268 L 18.484 14.240 C 18.817 13.391 19.000 12.467 19.000 11.500 C 19.000 10.728 18.883 9.984 18.667 9.283 ZM 11.500 4.000 C 7.358 4.000 4.000 7.358 4.000 11.500 C 4.000 14.113 5.337 16.415 7.364 17.757 L 17.757 7.364 C 16.415 5.337 14.113 4.000 11.500 4.000 Z"),
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
        return _pingPongLine!!
    }

private var _pingPongLine: ImageVector? = null
