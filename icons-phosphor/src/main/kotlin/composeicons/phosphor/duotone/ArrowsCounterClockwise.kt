package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) return _arrowsCounterClockwise!!
        _arrowsCounterClockwise = phosphorDuotoneIcon(
            name = "ArrowsCounterClockwise",
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
                pathData = parseSvgPathData("M88 104h-48c-4.418 0-8-3.582-8-8v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v28.69L62.63 62.06C80.472 44.128 104.704 34.014 130 33.94h.53c25.081-.065 49.177 9.754 67.07 27.33 3.039 3.109 3.039 8.075 .001 11.184-3.038 3.109-8.003 3.223-11.181 .256C171.506 58.071 151.428 49.891 130.53 49.94h-.45c-21.078 .065-41.269 8.492-56.14 23.43L59.31 88h28.69c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM216 152h-48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h28.69l-14.63 14.63c-14.868 14.936-35.055 23.362-56.13 23.43h-.45c-20.898 .049-40.976-8.131-55.89-22.77-2.028-2.075-5.021-2.889-7.821-2.127-2.8 .762-4.968 2.98-5.665 5.797-.697 2.817 .185 5.79 2.306 7.77 17.893 17.576 41.989 27.395 67.07 27.33h.52c25.293-.076 49.52-10.191 67.36-28.12L208 179.31v28.69c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8Z"),
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
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
