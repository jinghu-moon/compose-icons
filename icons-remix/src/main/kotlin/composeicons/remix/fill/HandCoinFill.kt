package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HandCoinFill: ImageVector
    get() {
        if (_handCoinFill != null) return _handCoinFill!!
        _handCoinFill = remixIcon(
            name = "HandCoinFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.335 11.502l2.17 0c2.485 0 4.5 2.015 4.5 4.5h-7.001l.001 1 8-.001v-.999c0-1.082-.318-2.103-.886-3.001l2.886 .001c1.992 0 3.712 1.165 4.516 2.851-2.365 3.121-6.194 5.149-10.516 5.149-2.761 0-5.1-.591-7-1.625l.001-9.304c1.246 .178 2.385 .685 3.329 1.429ZM5.005 19.003c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-9c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v9ZM18.005 5.003c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3ZM11.005 2.003c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3C9.348 8.003 8.005 6.66 8.005 5.003c0-1.657 1.343-3 3-3Z"),
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
        return _handCoinFill!!
    }

private var _handCoinFill: ImageVector? = null
