package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextAUnderline: ImageVector
    get() {
        if (_textAUnderline != null) return _textAUnderline!!
        _textAUnderline = phosphorLightIcon(
            name = "TextAUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M61.45 173.43c1.442 .682 3.097 .762 4.598 .222 1.501-.54 2.725-1.657 3.402-3.102L86.63 134h82.74l17.2 36.55c.988 2.105 3.104 3.45 5.43 3.45 .882 .002 1.753-.192 2.55-.57 1.445-.676 2.561-1.901 3.102-3.402 .54-1.501 .461-3.156-.222-4.598l-64-136c-.989-2.104-3.105-3.448-5.43-3.448-2.325 0-4.441 1.343-5.43 3.448l-64 136c-.682 1.442-.762 3.097-.222 4.598 .54 1.501 1.657 2.725 3.102 3.402ZM128 46.09 163.72 122h-71.44ZM222 216c0 3.314-2.686 6-6 6h-176c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h176c3.314 0 6 2.686 6 6Z"),
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
