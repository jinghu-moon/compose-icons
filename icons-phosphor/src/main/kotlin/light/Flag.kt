package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Flag: ImageVector
    get() {
        if (_flag != null) return _flag!!
        _flag = phosphorLightIcon(
            name = "Flag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 44.080 51.370 C 42.763 52.507 42.004 54.160 42.000 55.900 L 42.000 224.000 C 42.000 227.314 44.686 230.000 48.000 230.000 C 51.314 230.000 54.000 227.314 54.000 224.000 L 54.000 178.780 C 82.080 155.990 105.880 167.780 133.340 181.350 C 149.460 189.350 166.830 197.930 185.340 197.930 C 198.910 197.930 213.100 193.330 227.900 180.510 C 229.220 179.381 229.986 177.736 230.000 176.000 L 230.000 55.900 C 230.002 53.550 228.632 51.414 226.495 50.437 C 224.357 49.460 221.846 49.821 220.070 51.360 C 191.070 76.480 166.790 64.450 138.660 50.520 C 110.770 36.710 79.000 21.160 44.080 51.370 ZM 218.000 173.170 C 189.920 195.970 166.120 184.170 138.660 170.590 C 113.400 158.080 85.090 144.070 54.000 164.000 L 54.000 58.720 C 82.080 35.920 105.880 47.720 133.340 61.280 C 158.600 73.790 186.910 87.800 218.000 67.910 Z"),
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
        return _flag!!
    }

private var _flag: ImageVector? = null
