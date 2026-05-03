package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FlagBanner: ImageVector
    get() {
        if (_flagBanner != null) return _flagBanner!!
        _flagBanner = phosphorDuotoneIcon(
            name = "FlagBanner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 232.000 56.000 L 186.290 152.000 L 40.000 152.000 L 88.000 104.000 L 40.000 56.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 238.760 51.730 C 237.295 49.410 234.744 48.002 232.000 48.000 L 40.000 48.000 C 36.762 47.997 33.842 49.947 32.603 52.938 C 31.364 55.929 32.049 59.372 34.340 61.660 L 76.690 104.000 L 34.340 146.340 C 32.049 148.628 31.364 152.071 32.603 155.062 C 33.842 158.053 36.762 160.003 40.000 160.000 L 173.620 160.000 L 144.780 220.560 C 143.467 223.151 143.662 226.250 145.288 228.656 C 146.915 231.063 149.718 232.398 152.612 232.146 C 155.506 231.893 158.035 230.092 159.220 227.440 L 239.220 59.440 C 240.400 56.961 240.226 54.051 238.760 51.730 ZM 181.230 144.000 L 59.310 144.000 L 93.660 109.660 C 95.162 108.159 96.006 106.123 96.006 104.000 C 96.006 101.877 95.162 99.841 93.660 98.340 L 59.310 64.000 L 219.310 64.000 Z"),
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
