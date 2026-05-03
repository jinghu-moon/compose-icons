package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShoppingBagOpen: ImageVector
    get() {
        if (_shoppingBagOpen != null) return _shoppingBagOpen!!
        _shoppingBagOpen = phosphorThinIcon(
            name = "ShoppingBagOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 44.000 L 40.000 44.000 C 33.373 44.000 28.000 49.373 28.000 56.000 L 28.000 200.000 C 28.000 206.627 33.373 212.000 40.000 212.000 L 216.000 212.000 C 222.627 212.000 228.000 206.627 228.000 200.000 L 228.000 56.000 C 228.000 49.373 222.627 44.000 216.000 44.000 ZM 40.000 52.000 L 216.000 52.000 C 218.209 52.000 220.000 53.791 220.000 56.000 L 220.000 76.000 L 36.000 76.000 L 36.000 56.000 C 36.000 53.791 37.791 52.000 40.000 52.000 ZM 216.000 204.000 L 40.000 204.000 C 37.791 204.000 36.000 202.209 36.000 200.000 L 36.000 84.000 L 220.000 84.000 L 220.000 200.000 C 220.000 202.209 218.209 204.000 216.000 204.000 ZM 172.000 112.000 C 172.000 136.301 152.301 156.000 128.000 156.000 C 103.699 156.000 84.000 136.301 84.000 112.000 C 84.000 109.791 85.791 108.000 88.000 108.000 C 90.209 108.000 92.000 109.791 92.000 112.000 C 92.000 131.882 108.118 148.000 128.000 148.000 C 147.882 148.000 164.000 131.882 164.000 112.000 C 164.000 109.791 165.791 108.000 168.000 108.000 C 170.209 108.000 172.000 109.791 172.000 112.000 Z"),
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
        return _shoppingBagOpen!!
    }

private var _shoppingBagOpen: ImageVector? = null
