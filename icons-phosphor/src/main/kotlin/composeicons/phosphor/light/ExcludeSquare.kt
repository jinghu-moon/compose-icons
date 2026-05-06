package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ExcludeSquare: ImageVector
    get() {
        if (_excludeSquare != null) return _excludeSquare!!
        _excludeSquare = phosphorLightIcon(
            name = "ExcludeSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 90h-50v-50c0-3.314-2.686-6-6-6h-120c-3.314 0-6 2.686-6 6v120c0 3.314 2.686 6 6 6h50v50c0 3.314 2.686 6 6 6h120c3.314 0 6-2.686 6-6v-120c0-3.314-2.686-6-6-6ZM162.48 210 118.48 166h39l44 44ZM46 54.48 90 98.48v39L46 93.48ZM93.52 46l44 44h-39L54.52 46ZM102 154v-52h52v52ZM166 157.52v-39l44 44v39ZM210 145.52 166.48 102h43.52ZM154 89.52 110.48 46h43.52ZM46 110.52 89.52 154h-43.52ZM102 166.52 145.52 210h-43.52Z"),
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
        return _excludeSquare!!
    }

private var _excludeSquare: ImageVector? = null
