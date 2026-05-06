package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ReceiptLine: ImageVector
    get() {
        if (_receiptLine != null) return _receiptLine!!
        _receiptLine = remixIcon(
            name = "ReceiptLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 4 6 2 3 4v15c0 1.657 1.343 3 3 3h14c1.657 0 3-1.343 3-3v-3h-2v-12L18 2 15 4 12 2 9 4ZM19 16h-12v3c0 .552-.448 1-1 1C5.448 20 5 19.552 5 19v-13.93L6 4.404l3 2 3-2 3 2 3-2 1 .667v10.93ZM20 20h-11.171C8.94 19.687 9 19.351 9 19v-1h12v1c0 .552-.448 1-1 1Z"),
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
        return _receiptLine!!
    }

private var _receiptLine: ImageVector? = null
