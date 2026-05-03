package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GitPullRequest: ImageVector
    get() {
        if (_gitPullRequest != null) return _gitPullRequest!!
        _gitPullRequest = phosphorBoldIcon(
            name = "GitPullRequest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 108.000 64.000 C 108.001 45.692 94.261 30.300 76.070 28.230 C 57.880 26.160 41.033 38.072 36.920 55.912 C 32.807 73.752 42.739 91.837 60.000 97.940 L 60.000 158.060 C 43.469 163.904 33.554 180.808 36.518 198.089 C 39.483 215.370 54.467 228.001 72.000 228.001 C 89.533 228.001 104.517 215.370 107.482 198.089 C 110.446 180.808 100.531 163.904 84.000 158.060 L 84.000 97.940 C 98.370 92.837 107.979 79.249 108.000 64.000 ZM 72.000 52.000 C 78.627 52.000 84.000 57.373 84.000 64.000 C 84.000 70.627 78.627 76.000 72.000 76.000 C 65.373 76.000 60.000 70.627 60.000 64.000 C 60.000 57.373 65.373 52.000 72.000 52.000 ZM 72.000 204.000 C 65.373 204.000 60.000 198.627 60.000 192.000 C 60.000 185.373 65.373 180.000 72.000 180.000 C 78.627 180.000 84.000 185.373 84.000 192.000 C 84.000 198.627 78.627 204.000 72.000 204.000 ZM 212.000 158.060 L 212.000 110.630 C 212.022 103.200 209.069 96.070 203.800 90.830 L 173.000 60.000 L 192.000 60.000 C 198.627 60.000 204.000 54.627 204.000 48.000 C 204.000 41.373 198.627 36.000 192.000 36.000 L 144.000 36.000 C 137.373 36.000 132.000 41.373 132.000 48.000 L 132.000 96.000 C 132.000 102.627 137.373 108.000 144.000 108.000 C 150.627 108.000 156.000 102.627 156.000 96.000 L 156.000 77.000 L 186.830 107.830 C 187.580 108.581 188.001 109.599 188.000 110.660 L 188.000 158.090 C 171.469 163.934 161.554 180.838 164.518 198.119 C 167.483 215.400 182.467 228.031 200.000 228.031 C 217.533 228.031 232.517 215.400 235.482 198.119 C 238.446 180.838 228.531 163.934 212.000 158.090 ZM 200.000 204.000 C 193.373 204.000 188.000 198.627 188.000 192.000 C 188.000 185.373 193.373 180.000 200.000 180.000 C 206.627 180.000 212.000 185.373 212.000 192.000 C 212.000 198.627 206.627 204.000 200.000 204.000 Z"),
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
        return _gitPullRequest!!
    }

private var _gitPullRequest: ImageVector? = null
