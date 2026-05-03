package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GitDiff: ImageVector
    get() {
        if (_gitDiff != null) return _gitDiff!!
        _gitDiff = phosphorBoldIcon(
            name = "GitDiff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 112.000 148.000 C 105.373 148.000 100.000 153.373 100.000 160.000 L 100.000 179.000 L 69.170 148.200 C 68.420 147.449 67.999 146.431 68.000 145.370 L 68.000 97.940 C 84.531 92.096 94.446 75.192 91.482 57.911 C 88.517 40.630 73.533 27.999 56.000 27.999 C 38.467 27.999 23.483 40.630 20.518 57.911 C 17.554 75.192 27.469 92.096 44.000 97.940 L 44.000 145.370 C 43.978 152.800 46.931 159.930 52.200 165.170 L 83.000 196.000 L 64.000 196.000 C 57.373 196.000 52.000 201.373 52.000 208.000 C 52.000 214.627 57.373 220.000 64.000 220.000 L 112.000 220.000 C 118.627 220.000 124.000 214.627 124.000 208.000 L 124.000 160.000 C 124.000 153.373 118.627 148.000 112.000 148.000 ZM 56.000 52.000 C 62.627 52.000 68.000 57.373 68.000 64.000 C 68.000 70.627 62.627 76.000 56.000 76.000 C 49.373 76.000 44.000 70.627 44.000 64.000 C 44.000 57.373 49.373 52.000 56.000 52.000 ZM 212.000 158.060 L 212.000 110.630 C 212.022 103.200 209.069 96.070 203.800 90.830 L 173.000 60.000 L 192.000 60.000 C 198.627 60.000 204.000 54.627 204.000 48.000 C 204.000 41.373 198.627 36.000 192.000 36.000 L 144.000 36.000 C 137.373 36.000 132.000 41.373 132.000 48.000 L 132.000 96.000 C 132.000 102.627 137.373 108.000 144.000 108.000 C 150.627 108.000 156.000 102.627 156.000 96.000 L 156.000 77.000 L 186.830 107.830 C 187.580 108.581 188.001 109.599 188.000 110.660 L 188.000 158.090 C 171.469 163.934 161.554 180.838 164.518 198.119 C 167.483 215.400 182.467 228.031 200.000 228.031 C 217.533 228.031 232.517 215.400 235.482 198.119 C 238.446 180.838 228.531 163.934 212.000 158.090 ZM 200.000 204.000 C 193.373 204.000 188.000 198.627 188.000 192.000 C 188.000 185.373 193.373 180.000 200.000 180.000 C 206.627 180.000 212.000 185.373 212.000 192.000 C 212.000 198.627 206.627 204.000 200.000 204.000 Z"),
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
        return _gitDiff!!
    }

private var _gitDiff: ImageVector? = null
