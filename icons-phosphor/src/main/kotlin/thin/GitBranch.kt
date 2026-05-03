package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GitBranch: ImageVector
    get() {
        if (_gitBranch != null) return _gitBranch!!
        _gitBranch = phosphorThinIcon(
            name = "GitBranch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 64.000 C 228.001 49.056 216.267 36.744 201.339 36.029 C 186.412 35.314 173.554 46.448 172.128 61.325 C 170.701 76.201 181.209 89.575 196.000 91.710 L 196.000 112.000 C 196.000 118.627 190.627 124.000 184.000 124.000 L 96.000 124.000 C 91.672 123.993 87.459 125.398 84.000 128.000 L 84.000 91.710 C 98.535 89.612 108.980 76.640 107.928 61.992 C 106.876 47.344 94.686 35.997 80.000 35.997 C 65.314 35.997 53.124 47.344 52.072 61.992 C 51.020 76.640 61.465 89.612 76.000 91.710 L 76.000 164.290 C 61.465 166.388 51.020 179.360 52.072 194.008 C 53.124 208.656 65.314 220.003 80.000 220.003 C 94.686 220.003 106.876 208.656 107.928 194.008 C 108.980 179.360 98.535 166.388 84.000 164.290 L 84.000 144.000 C 84.000 137.373 89.373 132.000 96.000 132.000 L 184.000 132.000 C 195.046 132.000 204.000 123.046 204.000 112.000 L 204.000 91.710 C 217.775 89.722 227.999 77.918 228.000 64.000 ZM 60.000 64.000 C 60.000 52.954 68.954 44.000 80.000 44.000 C 91.046 44.000 100.000 52.954 100.000 64.000 C 100.000 75.046 91.046 84.000 80.000 84.000 C 68.954 84.000 60.000 75.046 60.000 64.000 ZM 100.000 192.000 C 100.000 203.046 91.046 212.000 80.000 212.000 C 68.954 212.000 60.000 203.046 60.000 192.000 C 60.000 180.954 68.954 172.000 80.000 172.000 C 91.046 172.000 100.000 180.954 100.000 192.000 ZM 200.000 84.000 C 188.954 84.000 180.000 75.046 180.000 64.000 C 180.000 52.954 188.954 44.000 200.000 44.000 C 211.046 44.000 220.000 52.954 220.000 64.000 C 220.000 75.046 211.046 84.000 200.000 84.000 Z"),
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
