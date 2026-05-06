package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberCircleTwo: ImageVector
    get() {
        if (_numberCircleTwo != null) return _numberCircleTwo!!
        _numberCircleTwo = phosphorRegularIcon(
            name = "NumberCircleTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 216C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88-.055 48.578-39.422 87.945-88 88ZM153.56 123.26 120 168h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-48c-3.03 0-5.8-1.712-7.155-4.422-1.355-2.71-1.063-5.954 .755-8.378l43.17-57.56c3.776-5.032 4.253-11.81 1.218-17.321-3.035-5.511-9.017-8.732-15.289-8.231-6.271 .501-11.667 4.63-13.789 10.552-1.475 4.167-6.048 6.35-10.215 4.875C98.528 102.04 96.345 97.467 97.82 93.3c4.216-11.868 15.002-20.16 27.555-21.183 12.553-1.023 24.539 5.413 30.621 16.442 6.082 11.029 5.128 24.6-2.436 34.671Z"),
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
        return _numberCircleTwo!!
    }

private var _numberCircleTwo: ImageVector? = null
