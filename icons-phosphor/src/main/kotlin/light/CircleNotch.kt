package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CircleNotch: ImageVector
    get() {
        if (_circleNotch != null) return _circleNotch!!
        _circleNotch = phosphorLightIcon(
            name = "CircleNotch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.000 128.000 C 230.000 184.333 184.333 230.000 128.000 230.000 C 71.667 230.000 26.000 184.333 26.000 128.000 C 26.000 87.820 49.350 51.140 85.500 34.550 C 88.482 33.311 91.909 34.654 93.256 37.589 C 94.602 40.524 93.384 43.998 90.500 45.450 C 58.610 60.090 38.000 92.490 38.000 128.000 C 38.000 177.706 78.294 218.000 128.000 218.000 C 177.706 218.000 218.000 177.706 218.000 128.000 C 218.000 92.490 197.390 60.090 165.500 45.450 C 162.616 43.998 161.398 40.524 162.744 37.589 C 164.091 34.654 167.518 33.311 170.500 34.550 C 206.650 51.140 230.000 87.820 230.000 128.000 Z"),
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
