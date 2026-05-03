package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyJpy: ImageVector
    get() {
        if (_currencyJpy != null) return _currencyJpy!!
        _currencyJpy = phosphorLightIcon(
            name = "CurrencyJpy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.640 51.800 L 140.640 130.000 L 176.000 130.000 C 179.314 130.000 182.000 132.686 182.000 136.000 C 182.000 139.314 179.314 142.000 176.000 142.000 L 134.000 142.000 L 134.000 162.000 L 176.000 162.000 C 179.314 162.000 182.000 164.686 182.000 168.000 C 182.000 171.314 179.314 174.000 176.000 174.000 L 134.000 174.000 L 134.000 216.000 C 134.000 219.314 131.314 222.000 128.000 222.000 C 124.686 222.000 122.000 219.314 122.000 216.000 L 122.000 174.000 L 80.000 174.000 C 76.686 174.000 74.000 171.314 74.000 168.000 C 74.000 164.686 76.686 162.000 80.000 162.000 L 122.000 162.000 L 122.000 142.000 L 80.000 142.000 C 76.686 142.000 74.000 139.314 74.000 136.000 C 74.000 132.686 76.686 130.000 80.000 130.000 L 115.340 130.000 L 51.340 51.800 C 49.907 50.150 49.484 47.852 50.236 45.800 C 50.988 43.749 52.796 42.268 54.956 41.935 C 57.115 41.602 59.285 42.470 60.620 44.200 L 128.000 126.530 L 195.360 44.200 C 197.489 41.750 201.180 41.436 203.691 43.493 C 206.202 45.549 206.623 49.230 204.640 51.800 Z"),
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
        return _currencyJpy!!
    }

private var _currencyJpy: ImageVector? = null
