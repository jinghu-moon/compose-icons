package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShoppingBag: ImageVector
    get() {
        if (_shoppingBag != null) return _shoppingBag!!
        _shoppingBag = phosphorBoldIcon(
            name = "ShoppingBag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 36h-176C28.954 36 20 44.954 20 56v144c0 11.046 8.954 20 20 20h176c11.046 0 20-8.954 20-20v-144C236 44.954 227.046 36 216 36ZM212 196h-168v-136h168ZM76 88C76 81.373 81.373 76 88 76c6.627 0 12 5.373 12 12 0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 28.719-23.281 52-52 52C99.281 140 76 116.719 76 88Z"),
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
        return _shoppingBag!!
    }

private var _shoppingBag: ImageVector? = null
