package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FlagBanner: ImageVector
    get() {
        if (_flagBanner != null) return _flagBanner!!
        _flagBanner = phosphorFillIcon(
            name = "FlagBanner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 239.220 59.440 L 193.590 155.260 C 193.543 155.376 193.489 155.490 193.430 155.600 L 159.220 227.440 C 158.035 230.092 155.506 231.893 152.612 232.146 C 149.718 232.398 146.915 231.063 145.288 228.656 C 143.662 226.250 143.467 223.151 144.780 220.560 L 173.620 160.000 L 40.000 160.000 C 36.762 160.003 33.842 158.053 32.603 155.062 C 31.364 152.071 32.049 148.628 34.340 146.340 L 76.690 104.000 L 34.340 61.660 C 32.049 59.372 31.364 55.929 32.603 52.938 C 33.842 49.947 36.762 47.997 40.000 48.000 L 232.000 48.000 C 234.745 48.001 237.298 49.409 238.763 51.730 C 240.228 54.052 240.400 56.962 239.220 59.440 Z"),
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
        return _flagBanner!!
    }

private var _flagBanner: ImageVector? = null
