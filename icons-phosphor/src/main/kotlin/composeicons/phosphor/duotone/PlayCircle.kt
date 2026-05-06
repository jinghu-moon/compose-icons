package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PlayCircle: ImageVector
    get() {
        if (_playCircle != null) return _playCircle!!
        _playCircle = phosphorDuotoneIcon(
            name = "PlayCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 32C74.981 32 32 74.981 32 128c0 53.019 42.981 96 96 96 53.019 0 96-42.981 96-96C224 74.981 181.019 32 128 32ZM108 168v-80l64 40Z"),
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
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 216C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88-.055 48.578-39.422 87.945-88 88ZM176.24 121.22l-64-40c-2.466-1.541-5.573-1.623-8.116-.214C101.58 82.415 100.001 85.093 100 88v80c.001 2.907 1.58 5.585 4.124 6.994 2.543 1.409 5.651 1.327 8.116-.214l64-40c2.335-1.463 3.754-4.024 3.754-6.78 0-2.756-1.418-5.317-3.754-6.78ZM116 153.57v-51.14L156.91 128Z"),
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
        return _playCircle!!
    }

private var _playCircle: ImageVector? = null
