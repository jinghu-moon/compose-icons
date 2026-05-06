package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberCircleOne: ImageVector
    get() {
        if (_numberCircleOne != null) return _numberCircleOne!!
        _numberCircleOne = phosphorRegularIcon(
            name = "NumberCircleOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 216C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88-.055 48.578-39.422 87.945-88 88ZM140 80v96c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-81l-11.56 7.71c-3.678 2.452-8.648 1.458-11.1-2.22-2.452-3.678-1.458-8.648 2.22-11.1l24-16c2.448-1.633 5.595-1.791 8.194-.41 2.599 1.381 4.23 4.077 4.246 7.02Z"),
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
        return _numberCircleOne!!
    }

private var _numberCircleOne: ImageVector? = null
