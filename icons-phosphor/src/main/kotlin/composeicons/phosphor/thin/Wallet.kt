package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Wallet: ImageVector
    get() {
        if (_wallet != null) return _wallet!!
        _wallet = phosphorThinIcon(
            name = "Wallet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 68h-160C49.373 68 44 62.627 44 56 44 49.373 49.373 44 56 44h136c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-136C44.954 36 36 44.954 36 56v128c0 11.046 8.954 20 20 20h160c6.627 0 12-5.373 12-12v-112c0-6.627-5.373-12-12-12ZM220 192c0 2.209-1.791 4-4 4h-160c-6.627 0-12-5.373-12-12v-112c3.457 2.606 7.671 4.01 12 4h160c2.209 0 4 1.791 4 4ZM188 132c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _wallet!!
    }

private var _wallet: ImageVector? = null
