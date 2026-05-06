package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShoppingBag: ImageVector
    get() {
        if (_shoppingBag != null) return _shoppingBag!!
        _shoppingBag = phosphorLightIcon(
            name = "ShoppingBag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 42h-176C32.268 42 26 48.268 26 56v144c0 7.732 6.268 14 14 14h176c7.732 0 14-6.268 14-14v-144c0-7.732-6.268-14-14-14ZM218 200c0 1.105-.895 2-2 2h-176c-1.105 0-2-.895-2-2v-144c0-1.105 .895-2 2-2h176c1.105 0 2 .895 2 2ZM174 88c0 25.405-20.595 46-46 46C102.595 134 82 113.405 82 88c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6 0 18.778 15.222 34 34 34 18.778 0 34-15.222 34-34 0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z"),
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
