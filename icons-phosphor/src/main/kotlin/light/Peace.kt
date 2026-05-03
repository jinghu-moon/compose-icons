package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Peace: ImageVector
    get() {
        if (_peace != null) return _peace!!
        _peace = phosphorLightIcon(
            name = "Peace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 218.000 128.000 C 218.026 144.426 213.528 160.542 205.000 174.580 L 134.000 124.880 L 134.000 38.200 C 181.244 41.416 217.941 80.647 218.000 128.000 ZM 122.000 38.200 L 122.000 124.880 L 51.000 174.580 C 34.744 147.705 33.674 114.299 48.178 86.440 C 62.682 58.580 90.661 40.297 122.000 38.200 ZM 57.920 184.400 L 122.000 139.530 L 122.000 217.800 C 96.910 216.116 73.671 204.003 57.920 184.400 ZM 134.000 217.800 L 134.000 139.530 L 198.080 184.400 C 182.329 204.003 159.090 216.116 134.000 217.800 Z"),
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
        return _peace!!
    }

private var _peace: ImageVector? = null
