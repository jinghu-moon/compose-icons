package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GenderIntersex: ImageVector
    get() {
        if (_genderIntersex != null) return _genderIntersex!!
        _genderIntersex = phosphorLightIcon(
            name = "GenderIntersex",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 26h-40c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h25.52l-30 29.94C144.129 48.724 114.451 44.453 90.429 57.42 66.406 70.388 53.691 97.542 59.115 124.297c5.424 26.755 27.709 46.814 54.885 49.403v20.3h-26c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h26v26c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-26h26c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-26v-20.3c21.767-2.129 40.802-15.569 50.092-35.369 9.29-19.8 7.462-43.029-4.812-61.131L202 46.48v25.52c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-40c0-3.314-2.686-6-6-6ZM120 162C92.386 162 70 139.614 70 112 70 84.386 92.386 62 120 62c27.614 0 50 22.386 50 50-.033 27.601-22.399 49.967-50 50Z"),
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
        return _genderIntersex!!
    }

private var _genderIntersex: ImageVector? = null
