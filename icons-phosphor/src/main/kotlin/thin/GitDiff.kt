package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GitDiff: ImageVector
    get() {
        if (_gitDiff != null) return _gitDiff!!
        _gitDiff = phosphorThinIcon(
            name = "GitDiff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 112.000 156.000 C 109.791 156.000 108.000 157.791 108.000 160.000 L 108.000 198.340 L 63.510 153.860 C 61.260 151.608 59.997 148.554 60.000 145.370 L 60.000 91.710 C 74.535 89.612 84.980 76.640 83.928 61.992 C 82.876 47.344 70.686 35.997 56.000 35.997 C 41.314 35.997 29.124 47.344 28.072 61.992 C 27.020 76.640 37.465 89.612 52.000 91.710 L 52.000 145.370 C 51.985 150.677 54.095 155.770 57.860 159.510 L 102.340 204.000 L 64.000 204.000 C 61.791 204.000 60.000 205.791 60.000 208.000 C 60.000 210.209 61.791 212.000 64.000 212.000 L 112.000 212.000 C 114.209 212.000 116.000 210.209 116.000 208.000 L 116.000 160.000 C 116.000 157.791 114.209 156.000 112.000 156.000 ZM 36.000 64.000 C 36.000 52.954 44.954 44.000 56.000 44.000 C 67.046 44.000 76.000 52.954 76.000 64.000 C 76.000 75.046 67.046 84.000 56.000 84.000 C 44.954 84.000 36.000 75.046 36.000 64.000 ZM 204.000 164.290 L 204.000 110.630 C 204.015 105.323 201.905 100.230 198.140 96.490 L 153.660 52.000 L 192.000 52.000 C 194.209 52.000 196.000 50.209 196.000 48.000 C 196.000 45.791 194.209 44.000 192.000 44.000 L 144.000 44.000 C 141.791 44.000 140.000 45.791 140.000 48.000 L 140.000 96.000 C 140.000 98.209 141.791 100.000 144.000 100.000 C 146.209 100.000 148.000 98.209 148.000 96.000 L 148.000 57.660 L 192.490 102.140 C 194.740 104.392 196.003 107.446 196.000 110.630 L 196.000 164.290 C 181.465 166.388 171.020 179.360 172.072 194.008 C 173.124 208.656 185.314 220.003 200.000 220.003 C 214.686 220.003 226.876 208.656 227.928 194.008 C 228.980 179.360 218.535 166.388 204.000 164.290 ZM 200.000 212.000 C 188.954 212.000 180.000 203.046 180.000 192.000 C 180.000 180.954 188.954 172.000 200.000 172.000 C 211.046 172.000 220.000 180.954 220.000 192.000 C 220.000 203.046 211.046 212.000 200.000 212.000 Z"),
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
        return _gitDiff!!
    }

private var _gitDiff: ImageVector? = null
