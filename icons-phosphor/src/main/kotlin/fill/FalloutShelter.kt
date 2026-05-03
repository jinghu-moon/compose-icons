package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FalloutShelter: ImageVector
    get() {
        if (_falloutShelter != null) return _falloutShelter!!
        _falloutShelter = phosphorFillIcon(
            name = "FalloutShelter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 231.940 124.550 C 230.170 70.060 185.940 25.830 131.450 24.060 C 102.694 23.133 74.837 34.149 54.493 54.493 C 34.149 74.837 23.133 102.694 24.060 131.450 C 25.830 185.940 70.060 230.170 124.550 231.940 C 153.306 232.867 181.163 221.851 201.507 201.507 C 221.851 181.163 232.867 153.306 231.940 124.550 ZM 198.380 141.470 L 174.930 174.300 C 173.330 176.537 170.750 177.864 168.000 177.864 C 165.250 177.864 162.670 176.537 161.070 174.300 L 128.000 128.000 L 94.930 174.300 C 93.330 176.537 90.750 177.864 88.000 177.864 C 85.250 177.864 82.670 176.537 81.070 174.300 L 57.620 141.470 C 55.767 138.873 55.519 135.459 56.978 132.622 C 58.438 129.785 61.360 128.002 64.550 128.000 L 128.000 128.000 L 97.620 85.470 C 95.767 82.873 95.519 79.459 96.978 76.622 C 98.438 73.785 101.360 72.002 104.550 72.000 L 151.450 72.000 C 154.640 72.002 157.562 73.785 159.022 76.622 C 160.481 79.459 160.233 82.873 158.380 85.470 L 128.000 128.000 L 191.450 128.000 C 194.640 128.002 197.562 129.785 199.022 132.622 C 200.481 135.459 200.233 138.873 198.380 141.470 Z"),
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
        return _falloutShelter!!
    }

private var _falloutShelter: ImageVector? = null
