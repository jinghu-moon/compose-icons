package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HandCoinLine: ImageVector
    get() {
        if (_handCoinLine != null) return _handCoinLine!!
        _handCoinLine = remixIcon(
            name = "HandCoinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.005 9.003c.552 0 1 .448 1 1 1.635 0 3.139 .56 4.33 1.5l2.17 0c1.333 0 2.53 .579 3.354 1.5l3.146 0c1.992 0 3.712 1.165 4.516 2.851-2.365 3.121-6.194 5.149-10.516 5.149-2.791 0-5.15-.603-7.061-1.658-.138 .383-.507 .658-.939 .658h-3c-.552 0-1-.448-1-1v-9c0-.552 .448-1 1-1h3ZM6.006 12.003l-.001 5.022 .045 .033c1.794 1.26 4.133 1.945 6.955 1.945 3.004 0 5.799-1.156 7.835-3.129l.133-.134-.119-.1c-.464-.363-1.033-.588-1.644-.63l-.205-.007h-2.111c.073 .322 .111 .656 .111 1v1h-9v-2l6.79-.001-.034-.078c-.38-.794-1.167-1.355-2.091-1.415l-.164-.005L9.575 13.503C8.668 12.577 7.404 12.003 6.006 12.003ZM4.005 11.003h-1v7h1v-7ZM18.005 5.003c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3ZM18.005 7.003c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1ZM11.005 2.003c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3C9.348 8.003 8.005 6.66 8.005 5.003c0-1.657 1.343-3 3-3ZM11.005 4.003c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1Z"),
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
        return _handCoinLine!!
    }

private var _handCoinLine: ImageVector? = null
