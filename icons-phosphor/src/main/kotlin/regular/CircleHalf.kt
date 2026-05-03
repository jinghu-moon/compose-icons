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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 136.000 40.370 C 141.416 40.864 146.773 41.869 152.000 43.370 L 152.000 212.670 C 146.773 214.171 141.416 215.176 136.000 215.670 ZM 168.000 49.630 C 173.702 52.549 179.067 56.084 184.000 60.170 L 184.000 195.830 C 179.067 199.916 173.702 203.451 168.000 206.370 ZM 40.000 128.000 C 40.055 82.521 74.714 44.556 120.000 40.370 L 120.000 215.630 C 74.714 211.444 40.055 173.479 40.000 128.000 ZM 200.000 178.540 L 200.000 77.460 C 221.334 107.776 221.334 148.224 200.000 178.540 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _circleHalf!!
    }

private var _circleHalf: ImageVector? = null
