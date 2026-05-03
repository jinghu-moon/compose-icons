package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Moon: ImageVector
    get() {
        if (_moon != null) return _moon!!
        _moon = phosphorFillIcon(
            name = "Moon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 235.540 150.210 C 229.080 171.300 216.132 189.815 198.540 203.120 C 167.037 226.830 124.835 230.687 89.557 213.079 C 54.278 195.472 31.990 159.428 32.000 120.000 C 31.930 97.437 39.266 75.473 52.880 57.480 C 66.185 39.888 84.700 26.940 105.790 20.480 C 108.623 19.608 111.705 20.373 113.801 22.469 C 115.897 24.565 116.662 27.647 115.790 30.480 C 106.394 61.561 114.860 95.291 137.819 118.251 C 160.779 141.210 194.509 149.676 225.590 140.280 C 228.423 139.408 231.505 140.173 233.601 142.269 C 235.697 144.365 236.462 147.447 235.590 150.280 Z"),
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
        return _moon!!
    }

private var _moon: ImageVector? = null
