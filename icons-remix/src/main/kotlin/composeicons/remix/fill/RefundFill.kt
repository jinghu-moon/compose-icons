package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RefundFill: ImageVector
    get() {
        if (_refundFill != null) return _refundFill!!
        _refundFill = remixIcon(
            name = "RefundFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22.005 7h-20v-3c0-.552 .448-1 1-1h18c.552 0 1 .448 1 1v3ZM22.005 9v11c0 .552-.448 1-1 1h-18c-.552 0-1-.448-1-1v-11h20ZM11.005 14v-2.5L6.505 16h10.5v-2h-6Z"),
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
        return _refundFill!!
    }

private var _refundFill: ImageVector? = null
