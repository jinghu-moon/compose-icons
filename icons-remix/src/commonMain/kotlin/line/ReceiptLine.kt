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
                pathData = parseSvgPathData("M 9.000 4.000 L 6.000 2.000 L 3.000 4.000 L 3.000 19.000 C 3.000 20.657 4.343 22.000 6.000 22.000 L 20.000 22.000 C 21.657 22.000 23.000 20.657 23.000 19.000 L 23.000 16.000 L 21.000 16.000 L 21.000 4.000 L 18.000 2.000 L 15.000 4.000 L 12.000 2.000 L 9.000 4.000 ZM 19.000 16.000 L 7.000 16.000 L 7.000 19.000 C 7.000 19.552 6.552 20.000 6.000 20.000 C 5.448 20.000 5.000 19.552 5.000 19.000 L 5.000 5.070 L 6.000 4.404 L 9.000 6.404 L 12.000 4.404 L 15.000 6.404 L 18.000 4.404 L 19.000 5.070 L 19.000 16.000 ZM 20.000 20.000 L 8.829 20.000 C 8.940 19.687 9.000 19.351 9.000 19.000 L 9.000 18.000 L 21.000 18.000 L 21.000 19.000 C 21.000 19.552 20.552 20.000 20.000 20.000 Z"),
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
