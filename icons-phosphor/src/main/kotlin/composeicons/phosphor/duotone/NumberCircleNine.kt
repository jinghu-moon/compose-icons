package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberCircleNine: ImageVector
    get() {
        if (_numberCircleNine != null) return _numberCircleNine!!
        _numberCircleNine = phosphorDuotoneIcon(
            name = "NumberCircleNine",
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
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 216C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88-.055 48.578-39.422 87.945-88 88ZM146 76.82c-13.1-7.561-29.53-6.126-41.121 3.591C93.287 90.128 89.005 106.054 94.162 120.274c5.157 14.219 18.652 23.699 33.778 23.726q.94 0 1.89-.06l-16.7 28c-1.097 1.825-1.422 4.011-.902 6.076 .52 2.065 1.841 3.837 3.672 4.924 1.825 1.097 4.011 1.422 6.076 .902 2.065-.52 3.837-1.841 4.924-3.672L159.18 126C169.093 108.776 163.198 86.778 146 76.82ZM145.33 118h0c-5.52 9.567-17.751 12.848-27.318 7.328-9.567-5.52-12.849-17.75-7.329-27.317C116.202 88.443 128.432 85.161 138 90.68c9.562 5.526 12.834 17.757 7.31 27.32Z"),
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
        return _numberCircleNine!!
    }

private var _numberCircleNine: ImageVector? = null
