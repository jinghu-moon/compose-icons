package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Book: ImageVector
    get() {
        if (_book != null) return _book!!
        _book = phosphorLightIcon(
            name = "Book",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 26h-136C55.431 26 42 39.431 42 56v168c0 3.314 2.686 6 6 6h144c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-138v-2c0-9.941 8.059-18 18-18h136c3.314 0 6-2.686 6-6v-160c0-3.314-2.686-6-6-6ZM202 186h-130c-6.493-.009-12.812 2.097-18 6v-136C54 46.059 62.059 38 72 38h130Z"),
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
        return _book!!
    }

private var _book: ImageVector? = null
