package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GitMerge: ImageVector
    get() {
        if (_gitMerge != null) return _gitMerge!!
        _gitMerge = phosphorBoldIcon(
            name = "GitMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 108.000 C 193.322 108.017 180.121 116.932 174.620 130.540 L 135.620 124.970 C 134.660 124.834 133.783 124.354 133.150 123.620 L 100.550 85.530 C 114.194 76.026 119.555 58.414 113.518 42.920 C 107.481 27.426 91.618 18.083 75.141 20.316 C 58.663 22.548 45.858 35.775 44.162 52.317 C 42.465 68.858 52.319 84.409 68.000 89.940 L 68.000 166.060 C 51.469 171.904 41.554 188.808 44.518 206.089 C 47.483 223.370 62.467 236.001 80.000 236.001 C 97.533 236.001 112.517 223.370 115.482 206.089 C 118.446 188.808 108.531 171.904 92.000 166.060 L 92.000 112.440 L 115.000 139.240 C 119.424 144.398 125.573 147.771 132.300 148.730 L 173.640 154.640 C 179.106 172.308 197.071 182.960 215.195 179.280 C 233.320 175.600 245.707 158.785 243.850 140.385 C 241.992 121.984 226.494 107.984 208.000 108.000 ZM 80.000 44.000 C 86.627 44.000 92.000 49.373 92.000 56.000 C 92.000 62.627 86.627 68.000 80.000 68.000 C 73.373 68.000 68.000 62.627 68.000 56.000 C 68.000 49.373 73.373 44.000 80.000 44.000 ZM 80.000 212.000 C 73.373 212.000 68.000 206.627 68.000 200.000 C 68.000 193.373 73.373 188.000 80.000 188.000 C 86.627 188.000 92.000 193.373 92.000 200.000 C 92.000 206.627 86.627 212.000 80.000 212.000 ZM 208.000 156.000 C 201.373 156.000 196.000 150.627 196.000 144.000 C 196.000 137.373 201.373 132.000 208.000 132.000 C 214.627 132.000 220.000 137.373 220.000 144.000 C 220.000 150.627 214.627 156.000 208.000 156.000 Z"),
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
        return _gitMerge!!
    }

private var _gitMerge: ImageVector? = null
