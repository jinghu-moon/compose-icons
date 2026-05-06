package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShoppingBagOpen: ImageVector
    get() {
        if (_shoppingBagOpen != null) return _shoppingBagOpen!!
        _shoppingBagOpen = phosphorRegularIcon(
            name = "ShoppingBagOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM216 56v16h-176v-16ZM216 200h-176v-112h176v112ZM176 112c0 26.51-21.49 48-48 48C101.49 160 80 138.51 80 112c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
