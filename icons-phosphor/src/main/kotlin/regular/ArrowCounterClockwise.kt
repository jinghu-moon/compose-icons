package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowCounterClockwise: ImageVector
    get() {
        if (_arrowCounterClockwise != null) return _arrowCounterClockwise!!
        _arrowCounterClockwise = phosphorRegularIcon(
            name = "ArrowCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 128.000 C 224.005 180.520 181.805 223.294 129.290 224.000 L 128.000 224.000 C 103.482 224.061 79.883 214.679 62.100 197.800 C 58.888 194.762 58.747 189.697 61.785 186.485 C 64.823 183.273 69.888 183.132 73.100 186.170 C 105.020 216.273 155.231 215.049 185.646 183.426 C 216.062 151.803 215.331 101.583 184.009 70.858 C 152.686 40.134 102.461 40.371 71.430 71.390 C 71.348 71.478 71.261 71.562 71.170 71.640 L 44.590 96.000 L 72.000 96.000 C 76.418 96.000 80.000 99.582 80.000 104.000 C 80.000 108.418 76.418 112.000 72.000 112.000 L 24.000 112.000 C 19.582 112.000 16.000 108.418 16.000 104.000 L 16.000 56.000 C 16.000 51.582 19.582 48.000 24.000 48.000 C 28.418 48.000 32.000 51.582 32.000 56.000 L 32.000 85.800 L 60.250 60.000 C 87.733 32.624 128.992 24.478 164.817 39.355 C 200.643 54.232 223.994 89.208 224.000 128.000 Z"),
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
        return _arrowCounterClockwise!!
    }

private var _arrowCounterClockwise: ImageVector? = null
