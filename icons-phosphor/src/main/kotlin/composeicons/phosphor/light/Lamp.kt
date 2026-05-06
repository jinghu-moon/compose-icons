package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lamp: ImageVector
    get() {
        if (_lamp != null) return _lamp!!
        _lamp = phosphorLightIcon(
            name = "Lamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245.51 149.64l-48-112C196.566 35.434 194.399 34.003 192 34h-128c-2.399 .003-4.566 1.434-5.51 3.64l-48 112c-.793 1.853-.602 3.979 .507 5.662 1.109 1.682 2.988 2.696 5.003 2.698h106v52h-26c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h64c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-26v-52h60v34c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-34h34c2.015-.002 3.894-1.016 5.003-2.698 1.109-1.682 1.299-3.809 .507-5.662ZM25.1 146 68 46h120l42.9 100Z"),
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
        return _lamp!!
    }

private var _lamp: ImageVector? = null
