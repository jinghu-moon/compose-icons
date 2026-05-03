package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GitBranch: ImageVector
    get() {
        if (_gitBranch != null) return _gitBranch!!
        _gitBranch = phosphorBoldIcon(
            name = "GitBranch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.000 64.000 C 236.001 45.692 222.261 30.300 204.070 28.230 C 185.880 26.160 169.033 38.072 164.920 55.912 C 160.807 73.752 170.739 91.837 188.000 97.940 L 188.000 112.000 C 188.000 114.209 186.209 116.000 184.000 116.000 L 96.000 116.000 C 94.661 116.000 93.325 116.097 92.000 116.290 L 92.000 97.940 C 108.531 92.096 118.446 75.192 115.482 57.911 C 112.517 40.630 97.533 27.999 80.000 27.999 C 62.467 27.999 47.483 40.630 44.518 57.911 C 41.554 75.192 51.469 92.096 68.000 97.940 L 68.000 158.060 C 51.469 163.904 41.554 180.808 44.518 198.089 C 47.483 215.370 62.467 228.001 80.000 228.001 C 97.533 228.001 112.517 215.370 115.482 198.089 C 118.446 180.808 108.531 163.904 92.000 158.060 L 92.000 144.000 C 92.000 141.791 93.791 140.000 96.000 140.000 L 184.000 140.000 C 199.464 140.000 212.000 127.464 212.000 112.000 L 212.000 97.940 C 226.370 92.837 235.979 79.249 236.000 64.000 ZM 80.000 52.000 C 86.627 52.000 92.000 57.373 92.000 64.000 C 92.000 70.627 86.627 76.000 80.000 76.000 C 73.373 76.000 68.000 70.627 68.000 64.000 C 68.000 57.373 73.373 52.000 80.000 52.000 ZM 80.000 204.000 C 73.373 204.000 68.000 198.627 68.000 192.000 C 68.000 185.373 73.373 180.000 80.000 180.000 C 86.627 180.000 92.000 185.373 92.000 192.000 C 92.000 198.627 86.627 204.000 80.000 204.000 ZM 200.000 76.000 C 193.373 76.000 188.000 70.627 188.000 64.000 C 188.000 57.373 193.373 52.000 200.000 52.000 C 206.627 52.000 212.000 57.373 212.000 64.000 C 212.000 70.627 206.627 76.000 200.000 76.000 Z"),
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
        return _gitBranch!!
    }

private var _gitBranch: ImageVector? = null
