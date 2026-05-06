package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CircleHalf: ImageVector
    get() {
        if (_circleHalf != null) return _circleHalf!!
        _circleHalf = phosphorRegularIcon(
            name = "CircleHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM136 40.37c5.416 .494 10.773 1.499 16 3v169.3c-5.227 1.501-10.584 2.506-16 3ZM168 49.63c5.702 2.919 11.067 6.454 16 10.54v135.66c-4.933 4.086-10.298 7.621-16 10.54ZM40 128C40.055 82.521 74.714 44.556 120 40.37v175.26C74.714 211.444 40.055 173.479 40 128ZM200 178.54v-101.08c21.334 30.316 21.334 70.764 0 101.08Z"),
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
        return _circleHalf!!
    }

private var _circleHalf: ImageVector? = null
