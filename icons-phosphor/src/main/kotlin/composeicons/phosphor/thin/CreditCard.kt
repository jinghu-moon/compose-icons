package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CreditCard: ImageVector
    get() {
        if (_creditCard != null) return _creditCard!!
        _creditCard = phosphorThinIcon(
            name = "CreditCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 52h-192C25.373 52 20 57.373 20 64v128c0 6.627 5.373 12 12 12h192c6.627 0 12-5.373 12-12v-128c0-6.627-5.373-12-12-12ZM32 60h192c2.209 0 4 1.791 4 4v28h-200v-28c0-2.209 1.791-4 4-4ZM224 196h-192c-2.209 0-4-1.791-4-4v-92h200v92c0 2.209-1.791 4-4 4ZM204 168c0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4ZM140 168c0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4Z"),
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
        return _creditCard!!
    }

private var _creditCard: ImageVector? = null
