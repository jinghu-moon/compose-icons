package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ReceiptFill: ImageVector
    get() {
        if (_receiptFill != null) return _receiptFill!!
        _receiptFill = remixIcon(
            name = "ReceiptFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 4 6 2 3 4v12 3c0 1.657 1.343 3 3 3h14c1.657 0 3-1.343 3-3v-2h-16v2c0 .552-.448 1-1 1C5.448 20 5 19.552 5 19v-4h16v-11L18 2 15 4 12 2 9 4Z"),
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
        return _receiptFill!!
    }

private var _receiptFill: ImageVector? = null
