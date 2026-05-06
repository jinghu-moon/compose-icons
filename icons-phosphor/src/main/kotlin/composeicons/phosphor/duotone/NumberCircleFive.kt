package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberCircleFive: ImageVector
    get() {
        if (_numberCircleFive != null) return _numberCircleFive!!
        _numberCircleFive = phosphorDuotoneIcon(
            name = "NumberCircleFive",
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
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 216C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88-.055 48.578-39.422 87.945-88 88ZM118.78 88l-4.19 25.14c3.078-.763 6.239-1.146 9.41-1.14 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36-9.625 .158-18.902-3.595-25.71-10.4-2.081-2.024-2.903-5.017-2.146-7.82 .757-2.803 2.972-4.976 5.79-5.678 2.817-.702 5.794 .178 7.777 2.298 3.812 3.719 8.966 5.738 14.29 5.6 11.046 0 20-8.954 20-20 0-11.046-8.954-20-20-20-5.324-.138-10.478 1.881-14.29 5.6-2.446 2.492-6.225 3.109-9.337 1.526-3.112-1.583-4.837-5.002-4.263-8.446l8-48c.645-3.855 3.981-6.68 7.89-6.68h40c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _numberCircleFive!!
    }

private var _numberCircleFive: ImageVector? = null
