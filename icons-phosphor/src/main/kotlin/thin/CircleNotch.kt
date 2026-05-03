package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CircleNotch: ImageVector
    get() {
        if (_circleNotch != null) return _circleNotch!!
        _circleNotch = phosphorThinIcon(
            name = "CircleNotch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 128.000 C 228.000 183.228 183.228 228.000 128.000 228.000 C 72.772 228.000 28.000 183.228 28.000 128.000 C 28.000 88.600 50.900 52.630 86.330 36.370 C 88.338 35.448 90.713 36.327 91.635 38.335 C 92.557 40.343 91.678 42.718 89.670 43.640 C 57.070 58.600 36.000 91.710 36.000 128.000 C 36.000 178.810 77.190 220.000 128.000 220.000 C 178.810 220.000 220.000 178.810 220.000 128.000 C 220.000 91.710 198.930 58.600 166.330 43.640 C 164.322 42.718 163.443 40.343 164.365 38.335 C 165.287 36.327 167.662 35.448 169.670 36.370 C 205.100 52.630 228.000 88.600 228.000 128.000 Z"),
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
