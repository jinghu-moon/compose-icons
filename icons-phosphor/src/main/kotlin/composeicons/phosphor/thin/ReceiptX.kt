package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ReceiptX: ImageVector
    get() {
        if (_receiptX != null) return _receiptX!!
        _receiptX = phosphorThinIcon(
            name = "ReceiptX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 44h-176C33.373 44 28 49.373 28 56v152c-.001 1.387 .717 2.676 1.896 3.405 1.18 .729 2.653 .796 3.894 .175L64 196.47l30.21 15.11c1.127 .564 2.453 .564 3.58 0L128 196.47l30.21 15.11c1.127 .564 2.453 .564 3.58 0L192 196.47l30.21 15.11c.557 .275 1.169 .419 1.79 .42 2.209 0 4-1.791 4-4v-152c0-6.627-5.373-12-12-12ZM220 201.53 193.79 188.42c-1.127-.564-2.453-.564-3.58 0L160 203.53 129.79 188.42c-1.127-.564-2.453-.564-3.58 0L96 203.53 65.79 188.42c-1.127-.564-2.453-.564-3.58 0L36 201.53v-145.53c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4ZM154.83 98.83 133.66 120l21.17 21.17c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L128 125.66l-21.17 21.17c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L122.34 120 101.17 98.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L128 114.34 149.17 93.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66Z"),
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
        return _receiptX!!
    }

private var _receiptX: ImageVector? = null
