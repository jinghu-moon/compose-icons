package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Trademark: ImageVector
    get() {
        if (_trademark != null) return _trademark!!
        _trademark = phosphorDuotoneIcon(
            name = "Trademark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c0 53.019-42.981 96-96 96C74.981 224 32 181.019 32 128 32 74.981 74.981 32 128 32c53.019 0 96 42.981 96 96Z"),
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
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 216C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88-.055 48.578-39.422 87.945-88 88ZM112 104c0 4.418-3.582 8-8 8h-8v40c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-40h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8ZM192 104v48c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-26.71l-14 16c-1.519 1.722-3.704 2.709-6 2.709-2.296 0-4.481-.986-6-2.709L136 125.29v26.71c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-48c.009-3.323 2.071-6.295 5.182-7.466 3.11-1.171 6.62-.297 8.818 2.196l22 25.12L178 98.73c2.198-2.492 5.708-3.366 8.818-2.196 3.11 1.171 5.173 4.142 5.182 7.466Z"),
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
        return _trademark!!
    }

private var _trademark: ImageVector? = null
