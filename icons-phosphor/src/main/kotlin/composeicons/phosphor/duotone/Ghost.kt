package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Ghost: ImageVector
    get() {
        if (_ghost != null) return _ghost!!
        _ghost = phosphorDuotoneIcon(
            name = "Ghost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 120v96L186.67 192l-29.34 24L128 192 98.67 216 69.33 192 40 216v-96C40 71.399 79.399 32 128 32c48.601 0 88 39.399 88 88Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M112 116c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM156 104c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM224 120v96c.001 3.092-1.781 5.908-4.576 7.232-2.795 1.324-6.102 .918-8.494-1.042L186.67 202.34l-24.27 19.85c-2.947 2.41-7.183 2.41-10.13 0L128 202.34l-24.27 19.85c-2.947 2.41-7.183 2.41-10.13 0L69.33 202.34 45.07 222.19c-2.392 1.96-5.699 2.365-8.494 1.042C33.781 221.908 31.999 219.092 32 216v-96C32 66.981 74.981 24 128 24c53.019 0 96 42.981 96 96ZM208 120C208 75.817 172.183 40 128 40 83.817 40 48 75.817 48 120v79.12L64.27 185.81c2.947-2.41 7.183-2.41 10.13 0l24.27 19.85 24.26-19.85c2.948-2.416 7.192-2.416 10.14 0l24.26 19.85 24.27-19.85c2.947-2.41 7.183-2.41 10.13 0L208 199.12Z"),
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
        return _ghost!!
    }

private var _ghost: ImageVector? = null
