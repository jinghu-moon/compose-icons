package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PaypalFill: ImageVector
    get() {
        if (_paypalFill != null) return _paypalFill!!
        _paypalFill = remixIcon(
            name = "PaypalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.067 8.478c.492 .881 .556 2.015 .3 3.328-.741 3.805-3.276 5.12-6.514 5.12h-.5c-.395 0-.732 .289-.794 .679l-.041 .221-.629 3.993-.033 .17c-.062 .391-.399 .679-.794 .679h-3.343c-.297 0-.523-.265-.477-.557L7.418 21h1.519l.949-6.021h1.386c4.678 0 7.749-2.202 8.796-6.502ZM17.107 3.388c.763 .869 .984 1.811 .753 3.285-.019 .123-.04 .241-.062 .359-.735 3.773-3.089 5.447-6.956 5.447h-1.885c-.631 0-1.173 .414-1.353 1.002l-.015-.002-.929 5.895h-3.538c-.032 0-.056-.028-.051-.06L5.669 2.802C5.742 2.34 6.14 2 6.608 2h5.976c2.183 0 3.717 .469 4.524 1.388Z"),
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
        return _paypalFill!!
    }

private var _paypalFill: ImageVector? = null
