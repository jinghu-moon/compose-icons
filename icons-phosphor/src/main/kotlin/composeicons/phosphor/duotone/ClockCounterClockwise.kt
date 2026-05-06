package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ClockCounterClockwise: ImageVector
    get() {
        if (_clockCounterClockwise != null) return _clockCounterClockwise!!
        _clockCounterClockwise = phosphorDuotoneIcon(
            name = "ClockCounterClockwise",
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
                pathData = parseSvgPathData("M136 80v43.47l36.12 21.67c3.789 2.275 5.015 7.191 2.74 10.98-2.275 3.789-7.191 5.015-10.98 2.74l-40-24C121.472 133.413 119.999 130.809 120 128v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM128 32C102.509 31.937 78.052 42.073 60.08 60.15 52.81 67.51 46.35 74.59 40 82v-18c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v40c0 4.418 3.582 8 8 8h40c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-23C56.15 87.58 63.27 79.65 71.39 71.43c31.029-31.029 81.262-31.271 112.589-.543 31.327 30.728 32.053 80.957 1.629 112.578-30.425 31.622-80.644 32.833-112.557 2.714-3.214-3.038-8.282-2.894-11.32 .32-3.038 3.214-2.894 8.282 .32 11.32 31.345 29.579 78.561 34.645 115.466 12.387 36.906-22.258 54.455-66.383 42.917-107.907C208.895 60.774 171.098 32.028 128 32Z"),
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
        return _clockCounterClockwise!!
    }

private var _clockCounterClockwise: ImageVector? = null
