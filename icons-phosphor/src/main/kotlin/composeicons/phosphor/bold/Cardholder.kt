package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cardholder: ImageVector
    get() {
        if (_cardholder != null) return _cardholder!!
        _cardholder = phosphorBoldIcon(
            name = "Cardholder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 44h-160C32.536 44 20 56.536 20 72v112c0 15.464 12.536 28 28 28h160c15.464 0 28-12.536 28-28v-112C236 56.536 223.464 44 208 44ZM48 68h160c2.209 0 4 1.791 4 4v16h-52c-6.627 0-12 5.373-12 12 0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20C108 93.373 102.627 88 96 88h-52v-16c0-2.209 1.791-4 4-4ZM208 188h-160c-2.209 0-4-1.791-4-4v-72h41.66c5.357 18.947 22.65 32.028 42.34 32.028 19.69 0 36.983-13.081 42.34-32.028h41.66v72c0 2.209-1.791 4-4 4Z"),
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
        return _cardholder!!
    }

private var _cardholder: ImageVector? = null
