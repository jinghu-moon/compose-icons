package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GameController: ImageVector
    get() {
        if (_gameController != null) return _gameController!!
        _gameController = phosphorFillIcon(
            name = "GameController",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 247.440 173.750 C 247.445 173.703 247.445 173.657 247.440 173.610 L 231.050 89.440 C 231.050 89.380 231.050 89.320 231.050 89.260 C 225.829 60.744 200.990 40.023 172.000 40.000 L 83.890 40.000 C 54.807 39.989 29.922 60.876 24.890 89.520 L 8.580 173.610 C 8.575 173.657 8.575 173.703 8.580 173.750 C 5.856 189.220 13.476 204.670 27.408 211.925 C 41.341 219.179 58.368 216.563 69.480 205.460 L 69.830 205.090 L 109.520 160.000 L 146.520 160.000 L 186.230 205.090 C 186.340 205.220 186.460 205.340 186.580 205.460 C 193.328 212.194 202.467 215.983 212.000 216.000 C 222.637 215.993 232.726 211.282 239.561 203.132 C 246.396 194.981 249.277 184.225 247.430 173.750 ZM 104.000 112.000 L 96.000 112.000 L 96.000 120.000 C 96.000 124.418 92.418 128.000 88.000 128.000 C 83.582 128.000 80.000 124.418 80.000 120.000 L 80.000 112.000 L 72.000 112.000 C 67.582 112.000 64.000 108.418 64.000 104.000 C 64.000 99.582 67.582 96.000 72.000 96.000 L 80.000 96.000 L 80.000 88.000 C 80.000 83.582 83.582 80.000 88.000 80.000 C 92.418 80.000 96.000 83.582 96.000 88.000 L 96.000 96.000 L 104.000 96.000 C 108.418 96.000 112.000 99.582 112.000 104.000 C 112.000 108.418 108.418 112.000 104.000 112.000 ZM 144.000 104.000 C 144.000 99.582 147.582 96.000 152.000 96.000 L 176.000 96.000 C 180.418 96.000 184.000 99.582 184.000 104.000 C 184.000 108.418 180.418 112.000 176.000 112.000 L 152.000 112.000 C 147.582 112.000 144.000 108.418 144.000 104.000 ZM 228.370 191.470 C 225.343 195.828 220.697 198.792 215.470 199.700 C 209.119 200.811 202.621 198.806 198.000 194.310 L 167.800 160.000 L 172.000 160.000 C 192.766 160.003 212.056 149.268 223.000 131.620 L 231.740 176.620 C 232.639 181.821 231.426 187.166 228.370 191.470 Z"),
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
        return _gameController!!
    }

private var _gameController: ImageVector? = null
