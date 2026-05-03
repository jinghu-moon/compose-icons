package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tree: ImageVector
    get() {
        if (_tree != null) return _tree!!
        _tree = phosphorBoldIcon(
            name = "Tree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 201.170 59.620 C 188.364 30.651 159.673 11.964 128.000 11.964 C 96.327 11.964 67.636 30.651 54.830 59.620 C 18.281 77.584 2.388 121.164 18.792 158.439 C 35.195 195.714 78.065 213.434 116.000 198.620 L 116.000 232.000 C 116.000 238.627 121.373 244.000 128.000 244.000 C 134.627 244.000 140.000 238.627 140.000 232.000 L 140.000 198.640 C 148.913 202.171 158.413 203.989 168.000 204.000 L 169.920 204.000 C 204.987 203.136 234.908 178.385 242.329 144.100 C 249.749 109.816 232.742 74.907 201.170 59.620 ZM 169.350 180.000 C 158.966 180.256 148.744 177.397 140.000 171.790 L 140.000 135.420 L 181.370 114.730 C 185.269 112.849 187.852 109.014 188.131 104.695 C 188.409 100.375 186.340 96.240 182.715 93.874 C 179.090 91.508 174.472 91.277 170.630 93.270 L 140.000 108.580 L 140.000 88.000 C 140.000 81.373 134.627 76.000 128.000 76.000 C 121.373 76.000 116.000 81.373 116.000 88.000 L 116.000 132.580 L 85.370 117.270 C 79.462 114.420 72.360 116.841 69.424 122.707 C 66.489 128.573 68.807 135.710 74.630 138.730 L 116.000 159.420 L 116.000 171.790 C 107.250 177.383 97.032 180.241 86.650 180.000 C 59.120 179.310 35.930 155.440 36.000 127.870 C 36.009 106.676 48.925 87.624 68.610 79.770 C 71.758 78.501 74.222 75.957 75.390 72.770 C 83.452 50.666 104.471 35.958 128.000 35.958 C 151.529 35.958 172.548 50.666 180.610 72.770 C 181.778 75.957 184.242 78.501 187.390 79.770 C 207.068 87.621 219.983 106.663 220.000 127.850 C 220.080 155.410 196.880 179.290 169.350 180.000 Z"),
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
        return _tree!!
    }

private var _tree: ImageVector? = null
