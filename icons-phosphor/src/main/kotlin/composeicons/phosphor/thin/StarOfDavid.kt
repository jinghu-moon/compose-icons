package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.StarOfDavid: ImageVector
    get() {
        if (_starOfDavid != null) return _starOfDavid!!
        _starOfDavid = phosphorThinIcon(
            name = "StarOfDavid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196.61 128 227.47 74c.715-1.239 .714-2.765-.001-4.003C226.753 68.759 225.43 67.998 224 68h-61.67L131.47 14c-.713-1.243-2.037-2.01-3.47-2.01-1.433 0-2.757 .767-3.47 2.01L93.66 68h-61.66c-1.43-.002-2.753 .759-3.469 1.997-.716 1.238-.717 2.764-.001 4.003l30.85 54L28.53 182c-.715 1.239-.715 2.765 .001 4.003 .716 1.238 2.038 2 3.469 1.997h61.66l30.87 54c.713 1.243 2.037 2.01 3.47 2.01 1.433 0 2.757-.767 3.47-2.01l30.86-54h61.67c1.43 .002 2.753-.759 3.469-1.997 .716-1.238 .717-2.764 .001-4.003ZM217.11 76 192 119.94 166.9 76ZM187.39 128l-29.7 52h-59.39L68.59 128 98.3 76h59.39ZM128 24.06l25.12 44h-50.25ZM38.89 76h50.19L64 119.94ZM38.89 179.92 64 136.06 89.08 180ZM128 231.92l-25.13-44h50.25ZM166.9 180 192 136.06 217.11 180Z"),
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
        return _starOfDavid!!
    }

private var _starOfDavid: ImageVector? = null
