package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Peace: ImageVector
    get() {
        if (_peace != null) return _peace!!
        _peace = phosphorFillIcon(
            name = "Peace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 143.37l46 32.2c-11.809 13.449-28.213 22.008-46 24ZM56 128c-.012 12.052 3.019 23.911 8.81 34.48L120 123.84v-67.38C83.582 60.568 56.044 91.351 56 128ZM120 199.54v-56.17L74 175.57c11.814 13.438 28.217 21.986 46 23.97ZM136 56.46v67.38l55.19 38.64c11.48-21.054 11.725-46.443 .652-67.714C180.768 73.495 159.832 59.132 136 56.46ZM232 128c0 57.438-46.562 104-104 104C70.562 232 24 185.438 24 128 24 70.562 70.562 24 128 24c57.412 .061 103.939 46.588 104 104ZM216 128C216 79.399 176.601 40 128 40 79.399 40 40 79.399 40 128c0 48.601 39.399 88 88 88 48.578-.055 87.945-39.422 88-88Z"),
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
        return _peace!!
    }

private var _peace: ImageVector? = null
