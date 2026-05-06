package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) return _tagChevron!!
        _tagChevron = phosphorThinIcon(
            name = "TagChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.33 125.78 197.7 57.34c-2.229-3.342-5.983-5.346-10-5.34h-155.7c-1.476-.001-2.832 .811-3.529 2.112-.697 1.301-.62 2.88 .199 4.108L75.19 128 28.67 197.78c-.819 1.228-.896 2.807-.199 4.108 .697 1.301 2.053 2.113 3.529 2.112h155.72c4.017 .006 7.771-1.998 10-5.34l45.63-68.44c.891-1.348 .883-3.1-.02-4.44ZM191.05 194.22c-.742 1.113-1.992 1.781-3.33 1.78h-148.25L83.33 130.22c.897-1.344 .897-3.096 0-4.44L39.47 60h148.25c1.338-.001 2.588 .667 3.33 1.78L235.19 128Z"),
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
        return _tagChevron!!
    }

private var _tagChevron: ImageVector? = null
