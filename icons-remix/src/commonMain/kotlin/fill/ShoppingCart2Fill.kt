package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShoppingCart2Fill: ImageVector
    get() {
        if (_shoppingCart2Fill != null) return _shoppingCart2Fill!!
        _shoppingCart2Fill = remixIcon(
            name = "ShoppingCart2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.004 6.417 L 0.762 3.174 L 2.176 1.760 L 5.419 5.003 L 20.660 5.003 C 21.213 5.003 21.660 5.450 21.660 6.003 C 21.660 6.100 21.646 6.197 21.618 6.290 L 19.218 14.290 C 19.091 14.713 18.702 15.003 18.260 15.003 L 6.004 15.003 L 6.004 17.003 L 17.004 17.003 L 17.004 19.003 L 5.004 19.003 C 4.452 19.003 4.004 18.555 4.004 18.003 L 4.004 6.417 ZM 5.504 23.003 C 4.676 23.003 4.004 22.331 4.004 21.503 C 4.004 20.674 4.676 20.003 5.504 20.003 C 6.333 20.003 7.004 20.674 7.004 21.503 C 7.004 22.331 6.333 23.003 5.504 23.003 ZM 17.504 23.003 C 16.676 23.003 16.004 22.331 16.004 21.503 C 16.004 20.674 16.676 20.003 17.504 20.003 C 18.333 20.003 19.004 20.674 19.004 21.503 C 19.004 22.331 18.333 23.003 17.504 23.003 Z"),
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
        return _shoppingCart2Fill!!
    }

private var _shoppingCart2Fill: ImageVector? = null
