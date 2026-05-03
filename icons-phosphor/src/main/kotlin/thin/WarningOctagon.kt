package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WarningOctagon: ImageVector
    get() {
        if (_warningOctagon != null) return _warningOctagon!!
        _warningOctagon = phosphorThinIcon(
            name = "WarningOctagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 124.000 136.000 L 124.000 80.000 C 124.000 77.791 125.791 76.000 128.000 76.000 C 130.209 76.000 132.000 77.791 132.000 80.000 L 132.000 136.000 C 132.000 138.209 130.209 140.000 128.000 140.000 C 125.791 140.000 124.000 138.209 124.000 136.000 ZM 228.000 91.550 L 228.000 164.450 C 228.003 167.634 226.740 170.688 224.490 172.940 L 172.940 224.490 C 170.688 226.740 167.634 228.003 164.450 228.000 L 91.550 228.000 C 88.366 228.003 85.312 226.740 83.060 224.490 L 31.510 172.940 C 29.260 170.688 27.997 167.634 28.000 164.450 L 28.000 91.550 C 27.997 88.366 29.260 85.312 31.510 83.060 L 83.060 31.510 C 85.312 29.260 88.366 27.997 91.550 28.000 L 164.450 28.000 C 167.634 27.997 170.688 29.260 172.940 31.510 L 224.490 83.060 C 226.740 85.312 228.003 88.366 228.000 91.550 ZM 220.000 91.550 C 220.001 90.489 219.580 89.471 218.830 88.720 L 167.280 37.170 C 166.526 36.426 165.510 36.006 164.450 36.000 L 91.550 36.000 C 90.490 36.006 89.474 36.426 88.720 37.170 L 37.170 88.720 C 36.420 89.471 35.999 90.489 36.000 91.550 L 36.000 164.450 C 35.999 165.511 36.420 166.529 37.170 167.280 L 88.720 218.830 C 89.474 219.574 90.490 219.994 91.550 220.000 L 164.450 220.000 C 165.510 219.994 166.526 219.574 167.280 218.830 L 218.830 167.280 C 219.580 166.529 220.001 165.511 220.000 164.450 ZM 128.000 164.000 C 123.582 164.000 120.000 167.582 120.000 172.000 C 120.000 176.418 123.582 180.000 128.000 180.000 C 132.418 180.000 136.000 176.418 136.000 172.000 C 136.000 167.582 132.418 164.000 128.000 164.000 Z"),
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
        return _warningOctagon!!
    }

private var _warningOctagon: ImageVector? = null
