package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TagSimple: ImageVector
    get() {
        if (_tagSimple != null) return _tagSimple!!
        _tagSimple = phosphorThinIcon(
            name = "TagSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.33 125.78 197.7 57.34c-2.229-3.342-5.983-5.346-10-5.34h-147.7C33.373 52 28 57.373 28 64v128c0 6.627 5.373 12 12 12h147.72c4.017 .006 7.771-1.998 10-5.34l45.63-68.44c.891-1.348 .883-3.1-.02-4.44ZM191.05 194.22c-.742 1.113-1.992 1.781-3.33 1.78h-147.72c-2.209 0-4-1.791-4-4v-128c0-2.209 1.791-4 4-4h147.72c1.338-.001 2.588 .667 3.33 1.78L235.19 128Z"),
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
        return _tagSimple!!
    }

private var _tagSimple: ImageVector? = null
