package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SubtractSquare: ImageVector
    get() {
        if (_subtractSquare != null) return _subtractSquare!!
        _subtractSquare = phosphorLightIcon(
            name = "SubtractSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 90h-50v-50c0-3.314-2.686-6-6-6h-120c-3.314 0-6 2.686-6 6v120c0 3.314 2.686 6 6 6h50v50c0 3.314 2.686 6 6 6h120c3.314 0 6-2.686 6-6v-120c0-3.314-2.686-6-6-6ZM162.48 210 118.48 166h39l44 44ZM166 157.52v-39l44 44v39ZM210 145.52 166.48 102h43.52ZM46 46h108v108h-108ZM102 166.48 145.52 210h-43.52Z"),
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
        return _subtractSquare!!
    }

private var _subtractSquare: ImageVector? = null
