package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.RewindCircle: ImageVector
    get() {
        if (_rewindCircle != null) return _rewindCircle!!
        _rewindCircle = phosphorDuotoneIcon(
            name = "RewindCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 32C74.981 32 32 74.981 32 128c0 53.019 42.981 96 96 96 53.019 0 96-42.981 96-96C224 74.981 181.019 32 128 32ZM112 164 64 128 112 92ZM176 164 128 128 176 92Z"),
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
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 216C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88-.055 48.578-39.422 87.945-88 88ZM115.58 84.84c-2.712-1.355-5.956-1.061-8.38 .76l-48 36C57.186 123.111 56 125.482 56 128c0 2.518 1.186 4.889 3.2 6.4l48 36c1.385 1.039 3.069 1.6 4.8 1.6 4.418 0 8-3.582 8-8v-72c.002-3.031-1.709-5.803-4.42-7.16ZM104 148 77.33 128 104 108ZM179.58 84.84c-2.712-1.355-5.956-1.061-8.38 .76l-48 36C121.186 123.111 120 125.482 120 128c0 2.518 1.186 4.889 3.2 6.4l48 36c1.385 1.039 3.069 1.6 4.8 1.6 4.418 0 8-3.582 8-8v-72c.002-3.031-1.709-5.803-4.42-7.16ZM168 148 141.33 128 168 108Z"),
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
        return _rewindCircle!!
    }

private var _rewindCircle: ImageVector? = null
