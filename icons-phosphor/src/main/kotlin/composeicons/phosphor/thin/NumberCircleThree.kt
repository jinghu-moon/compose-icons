package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberCircleThree: ImageVector
    get() {
        if (_numberCircleThree != null) return _numberCircleThree!!
        _numberCircleThree = phosphorThinIcon(
            name = "NumberCircleThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92-.055 50.787-41.213 91.945-92 92ZM156 152c.003 13.004-7.864 24.717-19.904 29.633-12.039 4.916-25.856 2.057-34.956-7.233-1.546-1.58-1.52-4.114 .06-5.66 1.58-1.546 4.114-1.52 5.66 .06 7.625 7.779 19.531 9.447 29 4.064 9.469-5.383 14.126-16.468 11.342-26.998C144.418 135.336 134.892 128 124 128c-1.491 0-2.858-.829-3.547-2.151-.689-1.322-.586-2.917 .267-4.139L144.32 88h-40.32c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h48c1.491-0 2.858 .829 3.547 2.151 .689 1.322 .586 2.917-.267 4.139l-24.16 34.51c14.544 3.342 24.859 16.277 24.88 31.2Z"),
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
