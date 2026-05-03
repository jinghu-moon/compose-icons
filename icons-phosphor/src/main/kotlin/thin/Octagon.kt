package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Octagon: ImageVector
    get() {
        if (_octagon != null) return _octagon!!
        _octagon = phosphorThinIcon(
            name = "Octagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.490 83.060 L 172.940 31.510 C 170.688 29.260 167.634 27.997 164.450 28.000 L 91.550 28.000 C 88.366 27.997 85.312 29.260 83.060 31.510 L 31.510 83.060 C 29.260 85.312 27.997 88.366 28.000 91.550 L 28.000 164.450 C 27.997 167.634 29.260 170.688 31.510 172.940 L 83.060 224.490 C 85.312 226.740 88.366 228.003 91.550 228.000 L 164.450 228.000 C 167.634 228.003 170.688 226.740 172.940 224.490 L 224.490 172.940 C 226.740 170.688 228.003 167.634 228.000 164.450 L 228.000 91.550 C 228.003 88.366 226.740 85.312 224.490 83.060 ZM 220.000 164.450 C 220.001 165.511 219.580 166.529 218.830 167.280 L 167.280 218.830 C 166.529 219.580 165.511 220.001 164.450 220.000 L 91.550 220.000 C 90.489 220.001 89.471 219.580 88.720 218.830 L 37.170 167.280 C 36.420 166.529 35.999 165.511 36.000 164.450 L 36.000 91.550 C 35.999 90.489 36.420 89.471 37.170 88.720 L 88.720 37.170 C 89.471 36.420 90.489 35.999 91.550 36.000 L 164.450 36.000 C 165.511 35.999 166.529 36.420 167.280 37.170 L 218.830 88.720 C 219.580 89.471 220.001 90.489 220.000 91.550 Z"),
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
        return _octagon!!
    }

private var _octagon: ImageVector? = null
