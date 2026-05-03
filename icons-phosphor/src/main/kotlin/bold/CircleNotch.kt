package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CircleNotch: ImageVector
    get() {
        if (_circleNotch != null) return _circleNotch!!
        _circleNotch = phosphorBoldIcon(
            name = "CircleNotch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 128.000 C 236.000 187.647 187.647 236.000 128.000 236.000 C 68.353 236.000 20.000 187.647 20.000 128.000 C 20.000 85.480 44.730 46.660 83.000 29.100 C 86.915 27.192 91.556 27.554 95.127 30.046 C 98.698 32.539 100.638 36.771 100.197 41.104 C 99.755 45.436 97.001 49.189 93.000 50.910 C 63.240 64.570 44.000 94.830 44.000 128.000 C 44.000 174.392 81.608 212.000 128.000 212.000 C 174.392 212.000 212.000 174.392 212.000 128.000 C 212.000 94.830 192.760 64.570 163.000 50.910 C 158.999 49.189 156.245 45.436 155.803 41.104 C 155.362 36.771 157.302 32.539 160.873 30.046 C 164.444 27.554 169.085 27.192 173.000 29.100 C 211.270 46.660 236.000 85.480 236.000 128.000 Z"),
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
        return _circleNotch!!
    }

private var _circleNotch: ImageVector? = null
