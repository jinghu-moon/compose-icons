package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShoppingBagOpen: ImageVector
    get() {
        if (_shoppingBagOpen != null) return _shoppingBagOpen!!
        _shoppingBagOpen = phosphorFillIcon(
            name = "ShoppingBagOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 128.000 160.000 C 101.502 159.972 80.028 138.498 80.000 112.000 C 80.000 107.582 83.582 104.000 88.000 104.000 C 92.418 104.000 96.000 107.582 96.000 112.000 C 96.000 129.673 110.327 144.000 128.000 144.000 C 145.673 144.000 160.000 129.673 160.000 112.000 C 160.000 107.582 163.582 104.000 168.000 104.000 C 172.418 104.000 176.000 107.582 176.000 112.000 C 175.972 138.498 154.498 159.972 128.000 160.000 ZM 40.000 72.000 L 40.000 56.000 L 216.000 56.000 L 216.000 72.000 Z"),
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
