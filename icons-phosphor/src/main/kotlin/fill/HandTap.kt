package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandTap: ImageVector
    get() {
        if (_handTap != null) return _handTap!!
        _handTap = phosphorFillIcon(
            name = "HandTap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 64.000 64.000 C 64.000 37.490 85.490 16.000 112.000 16.000 C 138.510 16.000 160.000 37.490 160.000 64.000 C 160.000 68.418 156.418 72.000 152.000 72.000 C 147.582 72.000 144.000 68.418 144.000 64.000 C 144.000 46.327 129.673 32.000 112.000 32.000 C 94.327 32.000 80.000 46.327 80.000 64.000 C 80.000 68.418 76.418 72.000 72.000 72.000 C 67.582 72.000 64.000 68.418 64.000 64.000 ZM 207.230 120.000 C 198.620 120.400 192.000 127.820 192.000 136.430 L 192.000 143.710 C 192.058 147.993 188.798 151.593 184.530 151.960 C 182.318 152.107 180.144 151.329 178.527 149.813 C 176.910 148.296 175.995 146.177 176.000 143.960 L 176.000 120.450 C 176.000 111.840 169.380 104.450 160.770 104.020 C 156.398 103.809 152.131 105.399 148.962 108.418 C 145.794 111.438 144.000 115.623 144.000 120.000 L 144.000 135.730 C 144.058 140.013 140.798 143.613 136.530 143.980 C 134.318 144.127 132.144 143.349 130.527 141.833 C 128.910 140.316 127.995 138.197 128.000 135.980 L 128.000 64.450 C 128.000 55.840 121.380 48.450 112.770 48.020 C 108.398 47.809 104.131 49.399 100.962 52.418 C 97.794 55.438 96.000 59.623 96.000 64.000 L 96.000 183.740 C 96.050 187.735 93.210 191.183 89.280 191.900 L 89.160 191.900 C 86.720 192.174 84.354 190.955 83.160 188.810 L 62.160 152.370 C 57.860 144.910 48.420 141.800 40.760 145.750 C 36.848 147.739 33.925 151.248 32.676 155.455 C 31.426 159.662 31.959 164.198 34.150 168.000 L 65.100 228.050 C 66.537 230.497 69.162 232.000 72.000 232.000 L 208.000 232.000 C 211.031 232.002 213.803 230.291 215.160 227.580 C 215.520 226.860 224.000 212.520 224.000 186.930 L 224.000 136.000 C 224.005 131.620 222.214 127.429 219.045 124.405 C 215.876 121.381 211.605 119.789 207.230 120.000 Z"),
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
        return _handTap!!
    }

private var _handTap: ImageVector? = null
