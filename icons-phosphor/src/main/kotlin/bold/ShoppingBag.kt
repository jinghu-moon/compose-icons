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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 36.000 L 40.000 36.000 C 28.954 36.000 20.000 44.954 20.000 56.000 L 20.000 200.000 C 20.000 211.046 28.954 220.000 40.000 220.000 L 216.000 220.000 C 227.046 220.000 236.000 211.046 236.000 200.000 L 236.000 56.000 C 236.000 44.954 227.046 36.000 216.000 36.000 ZM 212.000 196.000 L 44.000 196.000 L 44.000 60.000 L 212.000 60.000 ZM 76.000 88.000 C 76.000 81.373 81.373 76.000 88.000 76.000 C 94.627 76.000 100.000 81.373 100.000 88.000 C 100.000 103.464 112.536 116.000 128.000 116.000 C 143.464 116.000 156.000 103.464 156.000 88.000 C 156.000 81.373 161.373 76.000 168.000 76.000 C 174.627 76.000 180.000 81.373 180.000 88.000 C 180.000 116.719 156.719 140.000 128.000 140.000 C 99.281 140.000 76.000 116.719 76.000 88.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _shoppingBag!!
    }

private var _shoppingBag: ImageVector? = null
