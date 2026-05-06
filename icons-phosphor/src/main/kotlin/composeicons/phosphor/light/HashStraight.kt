package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HashStraight: ImageVector
    get() {
        if (_hashStraight != null) return _hashStraight!!
        _hashStraight = phosphorLightIcon(
            name = "HashStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 154h-50v-52h50c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-50v-50c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v50h-52v-50c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v50h-50c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h50v52h-50c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h50v50c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-50h52v50c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-50h50c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM102 154v-52h52v52Z"),
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
        return _hashStraight!!
    }

private var _hashStraight: ImageVector? = null
