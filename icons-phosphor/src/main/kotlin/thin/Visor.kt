package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Visor: ImageVector
    get() {
        if (_visor != null) return _visor!!
        _visor = phosphorThinIcon(
            name = "Visor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 183.050 60.000 L 72.000 60.000 C 53.407 59.998 35.625 67.610 22.791 81.063 C 9.958 94.517 3.192 112.638 4.070 131.210 C 5.670 165.870 34.070 194.290 68.720 195.920 C 83.490 196.640 98.720 190.280 115.350 176.540 C 122.707 170.462 133.343 170.462 140.700 176.540 C 150.790 184.920 166.250 196.000 184.000 196.000 C 202.192 196.002 219.626 188.714 232.404 175.766 C 245.183 162.818 252.241 145.290 252.000 127.100 C 251.510 90.100 220.580 60.000 183.050 60.000 ZM 226.700 170.150 C 215.454 181.612 200.057 188.048 184.000 188.000 C 168.830 188.000 154.930 178.000 145.800 170.420 C 135.487 161.885 120.563 161.885 110.250 170.420 C 95.250 182.830 81.800 188.560 69.100 187.970 C 38.307 186.292 13.730 161.675 12.100 130.880 C 11.312 114.491 17.271 98.495 28.587 86.616 C 39.904 74.736 55.593 68.008 72.000 68.000 L 183.050 68.000 C 216.230 68.000 243.570 94.560 243.990 127.200 C 244.251 143.262 238.017 158.749 226.700 170.150 ZM 180.000 96.000 C 180.000 98.209 178.209 100.000 176.000 100.000 L 80.000 100.000 C 77.791 100.000 76.000 98.209 76.000 96.000 C 76.000 93.791 77.791 92.000 80.000 92.000 L 176.000 92.000 C 178.209 92.000 180.000 93.791 180.000 96.000 Z"),
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
        return _visor!!
    }

private var _visor: ImageVector? = null
