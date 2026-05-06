package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareTwo: ImageVector
    get() {
        if (_numberSquareTwo != null) return _numberSquareTwo!!
        _numberSquareTwo = phosphorBoldIcon(
            name = "NumberSquareTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-160C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-160C228 36.954 219.046 28 208 28ZM204 204h-152v-152h152ZM137.57 111.24c1.921-2.541 2.753-5.742 2.312-8.897-.441-3.155-2.118-6.005-4.662-7.923-5.291-3.985-12.811-2.929-16.8 2.36-.745 .975-1.333 2.062-1.74 3.22-2.209 6.249-9.066 9.524-15.315 7.315C95.116 105.106 91.841 98.249 94.05 92c1.235-3.467 2.988-6.728 5.2-9.67 11.968-15.878 34.542-19.048 50.42-7.08 15.878 11.968 19.048 34.542 7.08 50.42L128 164h24c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-48c-4.545 0-8.7-2.568-10.733-6.633-2.033-4.065-1.594-8.93 1.133-12.567Z"),
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
        return _numberSquareTwo!!
    }

private var _numberSquareTwo: ImageVector? = null
