package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PencilSimple: ImageVector
    get() {
        if (_pencilSimple != null) return _pencilSimple!!
        _pencilSimple = phosphorDuotoneIcon(
            name = "PencilSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.66 90.34 192 120 136 64 165.66 34.34c3.124-3.122 8.186-3.122 11.31 0L221.66 79c1.508 1.501 2.356 3.542 2.356 5.67 0 2.128-.848 4.169-2.356 5.67Z"),
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
                pathData = parseSvgPathData("M227.31 73.37 182.63 28.68c-3.001-3.001-7.071-4.688-11.315-4.688-4.244 0-8.314 1.686-11.315 4.688L36.69 152c-3.014 2.99-4.704 7.064-4.69 11.31v44.69c0 8.837 7.163 16 16 16h44.69c4.246 .014 8.32-1.676 11.31-4.69L227.31 96c3.001-3.001 4.688-7.071 4.688-11.315 0-4.244-1.686-8.314-4.688-11.315ZM92.69 208h-44.69v-44.69l88-88L180.69 120ZM192 108.68 147.31 64l24-24L216 84.68Z"),
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
        return _pencilSimple!!
    }

private var _pencilSimple: ImageVector? = null
