package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareThree: ImageVector
    get() {
        if (_numberSquareThree != null) return _numberSquareThree!!
        _numberSquareThree = phosphorBoldIcon(
            name = "NumberSquareThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-160C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-160C228 36.954 219.046 28 208 28ZM204 204h-152v-152h152ZM92 80c0-6.627 5.373-12 12-12h48c4.474 .001 8.576 2.49 10.642 6.458 2.066 3.968 1.753 8.756-.812 12.422l-18.34 26.2c13.686 7.63 21.657 22.548 20.393 38.166-1.264 15.618-11.531 29.06-26.267 34.388-14.735 5.329-31.225 1.563-42.186-9.634-3.119-3.038-4.348-7.528-3.21-11.731 1.137-4.203 4.462-7.46 8.688-8.511 4.226-1.051 8.689 .27 11.662 3.451 5.085 5.179 13.019 6.286 19.328 2.697 6.309-3.589 9.411-10.975 7.558-17.992C137.603 136.897 131.258 132.006 124 132c-4.474-.001-8.576-2.49-10.642-6.458-2.066-3.968-1.753-8.756 .812-12.422L129 92h-25C97.373 92 92 86.627 92 80Z"),
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
