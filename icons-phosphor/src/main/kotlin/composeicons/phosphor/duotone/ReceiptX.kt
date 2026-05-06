package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ReceiptX: ImageVector
    get() {
        if (_receiptX != null) return _receiptX!!
        _receiptX = phosphorDuotoneIcon(
            name = "ReceiptX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 56v152L192 192l-32 16L128 192 96 208 64 192 32 208v-152c0-4.418 3.582-8 8-8h176c4.418 0 8 3.582 8 8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v152c.001 2.772 1.438 5.346 3.797 6.803 2.359 1.456 5.304 1.588 7.783 .347L64 200.94l28.42 14.21c2.253 1.128 4.907 1.128 7.16 0L128 200.94l28.42 14.21c2.253 1.128 4.907 1.128 7.16 0L192 200.94l28.42 14.21c2.479 1.241 5.424 1.109 7.783-.347 2.359-1.456 3.796-4.03 3.797-6.803v-152c0-8.837-7.163-16-16-16ZM216 195.06 195.58 184.84c-2.253-1.128-4.907-1.128-7.16 0L160 199.06 131.58 184.84c-2.253-1.128-4.907-1.128-7.16 0L96 199.06 67.58 184.84c-2.253-1.128-4.907-1.128-7.16 0L40 195.06v-139.06h176ZM98.34 138.34 116.69 120 98.34 101.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L128 108.69 146.34 90.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L139.31 120l18.35 18.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L128 131.31l-18.34 18.35c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32Z"),
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
