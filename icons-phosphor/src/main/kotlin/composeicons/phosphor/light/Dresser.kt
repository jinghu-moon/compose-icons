package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Dresser: ImageVector
    get() {
        if (_dresser != null) return _dresser!!
        _dresser = phosphorLightIcon(
            name = "Dresser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M142 192c0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6ZM120 70h16c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-16c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM136 122h-16c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h16c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM214 40v176c0 7.732-6.268 14-14 14h-144c-7.732 0-14-6.268-14-14v-176C42 32.268 48.268 26 56 26h144c7.732 0 14 6.268 14 14ZM54 154h148v-52h-148ZM54 40v50h148v-50c0-1.105-.895-2-2-2h-144c-1.105 0-2 .895-2 2ZM202 216v-50h-148v50c0 1.105 .895 2 2 2h144c1.105 0 2-.895 2-2Z"),
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
        return _dresser!!
    }

private var _dresser: ImageVector? = null
