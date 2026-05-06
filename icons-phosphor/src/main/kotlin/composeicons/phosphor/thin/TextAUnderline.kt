package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextAUnderline: ImageVector
    get() {
        if (_textAUnderline != null) return _textAUnderline!!
        _textAUnderline = phosphorThinIcon(
            name = "TextAUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M62.3 171.62c1.999 .938 4.381 .079 5.32-1.92L85.36 132h85.28l17.74 37.7c.59 1.321 1.848 2.22 3.289 2.351 1.441 .131 2.84-.526 3.66-1.719 .819-1.193 .931-2.735 .291-4.033l-64-136c-.659-1.403-2.07-2.298-3.62-2.298-1.55 0-2.961 .896-3.62 2.298L60.38 166.3c-.938 1.999-.079 4.381 1.92 5.32ZM128 41.39 166.87 124h-77.74ZM220 216c0 2.209-1.791 4-4 4h-176c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4Z"),
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
        return _textAUnderline!!
    }

private var _textAUnderline: ImageVector? = null
