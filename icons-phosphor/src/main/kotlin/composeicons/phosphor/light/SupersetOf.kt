package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SupersetOf: ImageVector
    get() {
        if (_supersetOf != null) return _supersetOf!!
        _supersetOf = phosphorLightIcon(
            name = "SupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214 200c0 3.314-2.686 6-6 6h-152c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h152c3.314 0 6 2.686 6 6ZM152 154h-96c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h96c34.242 0 62-27.758 62-62C214 69.758 186.242 42 152 42h-96c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h96c27.614 0 50 22.386 50 50 0 27.614-22.386 50-50 50Z"),
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
        return _supersetOf!!
    }

private var _supersetOf: ImageVector? = null
