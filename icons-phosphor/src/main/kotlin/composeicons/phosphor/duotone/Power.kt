package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Power: ImageVector
    get() {
        if (_power != null) return _power!!
        _power = phosphorDuotoneIcon(
            name = "Power",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 128c0 48.601-39.399 88-88 88C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88Z"),
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
                pathData = parseSvgPathData("M120 128v-80c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v80c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM180.37 49.3c-3.697-2.337-8.585-1.271-10.975 2.392-2.389 3.663-1.394 8.566 2.235 11.008C194.74 77.77 208 101.57 208 128c0 44.183-35.817 80-80 80C83.817 208 48 172.183 48 128 48 101.57 61.26 77.77 84.37 62.7c3.629-2.442 4.624-7.345 2.235-11.008C84.215 48.029 79.327 46.963 75.63 49.3 47.9 67.38 32 96.06 32 128c0 53.019 42.981 96 96 96 53.019 0 96-42.981 96-96C224 96.06 208.1 67.38 180.37 49.3Z"),
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
        return _power!!
    }

private var _power: ImageVector? = null
