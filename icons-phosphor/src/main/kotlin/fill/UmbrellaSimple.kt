package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UmbrellaSimple: ImageVector
    get() {
        if (_umbrellaSimple != null) return _umbrellaSimple!!
        _umbrellaSimple = phosphorFillIcon(
            name = "UmbrellaSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 235.760 138.830 C 232.734 142.120 228.470 143.995 224.000 144.000 L 136.000 144.000 L 136.000 200.000 C 136.000 208.837 143.163 216.000 152.000 216.000 C 160.837 216.000 168.000 208.837 168.000 200.000 C 168.000 195.582 171.582 192.000 176.000 192.000 C 180.418 192.000 184.000 195.582 184.000 200.000 C 184.000 217.673 169.673 232.000 152.000 232.000 C 134.327 232.000 120.000 217.673 120.000 200.000 L 120.000 144.000 L 32.000 144.000 C 27.508 144.016 23.216 142.144 20.173 138.840 C 17.130 135.536 15.615 131.105 16.000 126.630 C 19.741 83.929 47.435 47.069 87.407 31.590 C 127.380 16.110 172.676 24.705 204.200 53.750 C 224.864 72.684 237.645 98.702 240.000 126.630 C 240.351 131.110 238.814 135.533 235.760 138.830 Z"),
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
        return _umbrellaSimple!!
    }

private var _umbrellaSimple: ImageVector? = null
