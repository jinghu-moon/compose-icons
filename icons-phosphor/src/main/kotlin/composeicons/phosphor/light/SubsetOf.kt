package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SubsetOf: ImageVector
    get() {
        if (_subsetOf != null) return _subsetOf!!
        _subsetOf = phosphorLightIcon(
            name = "SubsetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M206 208c0 3.314-2.686 6-6 6h-152c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h152c3.314 0 6 2.686 6 6ZM200 162h-96C76.386 162 54 139.614 54 112 54 84.386 76.386 62 104 62h96c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-96C69.758 50 42 77.758 42 112c0 34.242 27.758 62 62 62h96c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _subsetOf!!
    }

private var _subsetOf: ImageVector? = null
