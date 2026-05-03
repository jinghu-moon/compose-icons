package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GitPullRequest: ImageVector
    get() {
        if (_gitPullRequest != null) return _gitPullRequest!!
        _gitPullRequest = phosphorThinIcon(
            name = "GitPullRequest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 100.000 64.000 C 100.002 49.056 88.267 36.744 73.339 36.029 C 58.412 35.314 45.554 46.448 44.128 61.325 C 42.701 76.201 53.209 89.575 68.000 91.710 L 68.000 164.290 C 53.465 166.388 43.020 179.360 44.072 194.008 C 45.124 208.656 57.314 220.003 72.000 220.003 C 86.686 220.003 98.876 208.656 99.928 194.008 C 100.980 179.360 90.535 166.388 76.000 164.290 L 76.000 91.710 C 89.775 89.722 99.999 77.918 100.000 64.000 ZM 52.000 64.000 C 52.000 52.954 60.954 44.000 72.000 44.000 C 83.046 44.000 92.000 52.954 92.000 64.000 C 92.000 75.046 83.046 84.000 72.000 84.000 C 60.954 84.000 52.000 75.046 52.000 64.000 ZM 92.000 192.000 C 92.000 203.046 83.046 212.000 72.000 212.000 C 60.954 212.000 52.000 203.046 52.000 192.000 C 52.000 180.954 60.954 172.000 72.000 172.000 C 83.046 172.000 92.000 180.954 92.000 192.000 ZM 204.000 164.290 L 204.000 110.630 C 204.014 105.320 201.904 100.225 198.140 96.480 L 153.660 52.000 L 192.000 52.000 C 194.209 52.000 196.000 50.209 196.000 48.000 C 196.000 45.791 194.209 44.000 192.000 44.000 L 144.000 44.000 C 141.791 44.000 140.000 45.791 140.000 48.000 L 140.000 96.000 C 140.000 98.209 141.791 100.000 144.000 100.000 C 146.209 100.000 148.000 98.209 148.000 96.000 L 148.000 57.660 L 192.490 102.140 C 194.740 104.392 196.003 107.446 196.000 110.630 L 196.000 164.290 C 181.465 166.388 171.020 179.360 172.072 194.008 C 173.124 208.656 185.314 220.003 200.000 220.003 C 214.686 220.003 226.876 208.656 227.928 194.008 C 228.980 179.360 218.535 166.388 204.000 164.290 ZM 200.000 212.000 C 188.954 212.000 180.000 203.046 180.000 192.000 C 180.000 180.954 188.954 172.000 200.000 172.000 C 211.046 172.000 220.000 180.954 220.000 192.000 C 220.000 203.046 211.046 212.000 200.000 212.000 Z"),
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
