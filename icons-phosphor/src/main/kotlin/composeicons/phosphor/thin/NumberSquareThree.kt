package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSquareThree: ImageVector
    get() {
        if (_numberSquareThree != null) return _numberSquareThree!!
        _numberSquareThree = phosphorThinIcon(
            name = "NumberSquareThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-160C41.373 36 36 41.373 36 48v160c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM212 208c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4ZM156 148c.003 13.004-7.864 24.717-19.904 29.633-12.039 4.916-25.856 2.057-34.956-7.233-1.546-1.58-1.52-4.114 .06-5.66 1.58-1.546 4.114-1.52 5.66 .06 7.625 7.779 19.531 9.447 29 4.064 9.469-5.383 14.126-16.468 11.342-26.998C144.418 131.336 134.892 124 124 124c-1.491 0-2.858-.829-3.547-2.151-.689-1.322-.586-2.917 .267-4.139L144.32 84h-40.32c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h48c1.491-0 2.858 .829 3.547 2.151 .689 1.322 .586 2.917-.267 4.139l-24.16 34.51c14.544 3.342 24.859 16.277 24.88 31.2Z"),
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
        return _numberSquareThree!!
    }

private var _numberSquareThree: ImageVector? = null
