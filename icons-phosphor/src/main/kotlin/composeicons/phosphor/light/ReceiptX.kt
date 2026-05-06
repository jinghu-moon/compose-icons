package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ReceiptX: ImageVector
    get() {
        if (_receiptX != null) return _receiptX!!
        _receiptX = phosphorLightIcon(
            name = "ReceiptX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 42h-176C32.268 42 26 48.268 26 56v152c-.001 2.079 1.075 4.01 2.843 5.104 1.768 1.094 3.977 1.194 5.837 .266L64 198.71l29.32 14.66c1.687 .842 3.673 .842 5.36 0L128 198.71l29.32 14.66c1.687 .842 3.673 .842 5.36 0L192 198.71l29.32 14.66c.832 .415 1.75 .631 2.68 .63 1.114 .002 2.205-.31 3.15-.9 1.769-1.091 2.848-3.021 2.85-5.1v-152c0-7.732-6.268-14-14-14ZM218 198.29 194.68 186.63c-1.687-.842-3.673-.842-5.36 0L160 201.29 130.68 186.63c-1.687-.842-3.673-.842-5.36 0L96 201.29 66.68 186.63c-1.687-.842-3.673-.842-5.36 0L38 198.29v-142.29c0-1.105 .895-2 2-2h176c1.105 0 2 .895 2 2ZM156.24 100.29 136.48 120l19.76 19.76c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L128 128.48l-19.76 19.76c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L119.52 120 99.76 100.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L128 111.52 147.76 91.76c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333Z"),
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
