package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Flame: ImageVector
    get() {
        if (_flame != null) return _flame!!
        _flame = phosphorRegularIcon(
            name = "Flame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 173.790 51.480 C 161.354 38.375 147.360 26.842 132.120 17.140 C 129.585 15.617 126.415 15.617 123.880 17.140 C 108.640 26.842 94.646 38.375 82.210 51.480 C 54.590 80.480 40.000 112.470 40.000 144.000 C 40.000 192.601 79.399 232.000 128.000 232.000 C 176.601 232.000 216.000 192.601 216.000 144.000 C 216.000 112.470 201.410 80.480 173.790 51.480 ZM 96.000 184.000 C 96.000 156.330 118.530 136.720 128.000 129.700 C 137.480 136.700 160.000 156.330 160.000 184.000 C 160.000 201.673 145.673 216.000 128.000 216.000 C 110.327 216.000 96.000 201.673 96.000 184.000 ZM 173.270 199.930 C 175.078 194.813 176.001 189.426 176.000 184.000 C 176.000 140.000 133.910 114.210 132.120 113.140 C 129.585 111.617 126.415 111.617 123.880 113.140 C 122.090 114.210 80.000 140.000 80.000 184.000 C 79.999 189.426 80.922 194.813 82.730 199.930 C 65.826 186.284 56.000 165.725 56.000 144.000 C 56.000 109.590 76.400 80.850 93.520 62.810 C 103.958 51.875 115.515 42.064 128.000 33.540 C 140.487 42.062 152.044 51.872 162.480 62.810 C 193.490 95.500 200.000 125.000 200.000 144.000 C 200.000 165.725 190.174 186.284 173.270 199.930 Z"),
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
        return _flame!!
    }

private var _flame: ImageVector? = null
