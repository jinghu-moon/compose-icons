package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Crop: ImageVector
    get() {
        if (_crop != null) return _crop!!
        _crop = phosphorLightIcon(
            name = "Crop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238 192c0 3.314-2.686 6-6 6h-34v34c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-34h-122c-3.314 0-6-2.686-6-6v-122h-34c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h34v-34c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v162h162c3.314 0 6 2.686 6 6ZM96 70h90v90c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-96c0-3.314-2.686-6-6-6h-96c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6Z"),
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
        return _crop!!
    }

private var _crop: ImageVector? = null
