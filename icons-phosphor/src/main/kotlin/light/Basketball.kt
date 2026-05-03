package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Basketball: ImageVector
    get() {
        if (_basketball != null) return _basketball!!
        _basketball = phosphorLightIcon(
            name = "Basketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 60.000 69.090 C 72.871 83.858 80.525 102.451 81.780 122.000 L 38.200 122.000 C 39.492 102.455 47.148 83.872 60.000 69.090 ZM 38.200 134.000 L 81.780 134.000 C 80.525 153.549 72.871 172.142 60.000 186.910 C 47.148 172.128 39.492 153.545 38.200 134.000 ZM 122.000 217.800 C 102.185 216.484 83.367 208.626 68.500 195.460 C 83.621 178.409 92.542 156.754 93.820 134.000 L 122.000 134.000 ZM 122.000 122.000 L 93.820 122.000 C 92.542 99.246 83.621 77.591 68.500 60.540 C 83.367 47.374 102.185 39.516 122.000 38.200 ZM 217.800 122.000 L 174.220 122.000 C 175.475 102.451 183.129 83.858 196.000 69.090 C 208.852 83.872 216.508 102.455 217.800 122.000 ZM 134.000 38.200 C 153.815 39.516 172.633 47.374 187.500 60.540 C 172.379 77.591 163.458 99.246 162.180 122.000 L 134.000 122.000 ZM 134.000 217.800 L 134.000 134.000 L 162.180 134.000 C 163.458 156.754 172.379 178.409 187.500 195.460 C 172.633 208.626 153.815 216.484 134.000 217.800 ZM 196.000 186.910 C 183.129 172.142 175.475 153.549 174.220 134.000 L 217.800 134.000 C 216.508 153.545 208.852 172.128 196.000 186.910 Z"),
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
        return _basketball!!
    }

private var _basketball: ImageVector? = null
