package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberCircleThree: ImageVector
    get() {
        if (_numberCircleThree != null) return _numberCircleThree!!
        _numberCircleThree = phosphorDuotoneIcon(
            name = "NumberCircleThree",
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
                pathData = parseSvgPathData("M160 152c-.004 14.625-8.855 27.794-22.395 33.321-13.54 5.527-29.078 2.314-39.315-8.131-2.129-2.014-2.986-5.031-2.235-7.863 .751-2.832 2.992-5.027 5.839-5.721 2.847-.694 5.846 .225 7.816 2.394 6.353 6.482 16.274 7.873 24.165 3.388 7.891-4.485 11.772-13.72 9.455-22.495C141.012 138.118 133.076 132.003 124 132c-2.983-.001-5.718-1.661-7.095-4.308-1.377-2.646-1.167-5.839 .545-8.282L136.63 92h-32.63c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h48c2.983 .001 5.718 1.661 7.095 4.308 1.377 2.646 1.167 5.839-.545 8.282l-21 30c13.579 5.537 22.454 18.745 22.45 33.41ZM232 128c0 57.438-46.562 104-104 104C70.562 232 24 185.438 24 128 24 70.562 70.562 24 128 24c57.412 .061 103.939 46.588 104 104ZM216 128C216 79.399 176.601 40 128 40 79.399 40 40 79.399 40 128c0 48.601 39.399 88 88 88 48.578-.055 87.945-39.422 88-88Z"),
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
        return _numberCircleThree!!
    }

private var _numberCircleThree: ImageVector? = null
