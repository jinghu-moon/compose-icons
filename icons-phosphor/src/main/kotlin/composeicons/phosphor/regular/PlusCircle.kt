package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PlusCircle: ImageVector
    get() {
        if (_plusCircle != null) return _plusCircle!!
        _plusCircle = phosphorRegularIcon(
            name = "PlusCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 216C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88-.055 48.578-39.422 87.945-88 88ZM176 128c0 4.418-3.582 8-8 8h-32v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32v-32c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v32h32c4.418 0 8 3.582 8 8Z"),
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
        return _plusCircle!!
    }

private var _plusCircle: ImageVector? = null
