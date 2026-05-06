package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ReceiptX: ImageVector
    get() {
        if (_receiptX != null) return _receiptX!!
        _receiptX = phosphorBoldIcon(
            name = "ReceiptX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 36h-176C28.954 36 20 44.954 20 56v152c0 4.159 2.155 8.022 5.693 10.208 3.539 2.186 7.957 2.384 11.677 .522L64 205.42l26.63 13.31c3.38 1.691 7.36 1.691 10.74 0L128 205.42l26.63 13.31c3.38 1.691 7.36 1.691 10.74 0L192 205.42l26.63 13.31c3.72 1.861 8.138 1.664 11.677-.522 3.539-2.186 5.693-6.048 5.693-10.208v-152C236 44.954 227.046 36 216 36ZM212 188.58l-14.63-7.31c-3.38-1.691-7.36-1.691-10.74 0L160 194.58 133.37 181.27c-3.38-1.691-7.36-1.691-10.74 0L96 194.58 69.37 181.27c-3.38-1.691-7.36-1.691-10.74 0L44 188.58v-128.58h168ZM95.51 135.51 111 120 95.51 104.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L128 103 143.51 87.48c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L145 120l15.52 15.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L128 137l-15.51 15.52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17Z"),
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
