package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tree: ImageVector
    get() {
        if (_tree != null) return _tree!!
        _tree = phosphorThinIcon(
            name = "Tree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 195.000 65.590 C 184.166 38.056 157.589 19.953 128.000 19.953 C 98.411 19.953 71.834 38.056 61.000 65.590 C 36.126 76.271 20.002 100.739 20.000 127.810 C 19.900 163.810 50.240 195.070 86.250 195.980 C 99.571 196.299 112.694 192.712 124.000 185.660 L 124.000 232.000 C 124.000 234.209 125.791 236.000 128.000 236.000 C 130.209 236.000 132.000 234.209 132.000 232.000 L 132.000 185.670 C 142.798 192.411 155.270 195.990 168.000 196.000 L 169.720 196.000 C 205.720 195.090 236.060 163.870 235.960 127.830 C 235.970 100.763 219.863 76.288 195.000 65.590 ZM 169.550 188.000 C 156.041 188.332 142.813 184.104 132.000 176.000 L 132.000 130.500 L 177.790 107.610 C 179.767 106.621 180.569 104.217 179.580 102.240 C 178.591 100.263 176.187 99.461 174.210 100.450 L 132.000 121.530 L 132.000 88.000 C 132.000 85.791 130.209 84.000 128.000 84.000 C 125.791 84.000 124.000 85.791 124.000 88.000 L 124.000 145.530 L 81.790 124.420 C 79.813 123.431 77.409 124.233 76.420 126.210 C 75.431 128.187 76.233 130.591 78.210 131.580 L 124.000 154.470 L 124.000 176.000 C 113.192 184.115 99.961 188.343 86.450 188.000 C 54.680 187.200 27.910 159.650 28.000 127.850 C 28.006 103.396 42.907 81.412 65.620 72.350 C 66.673 71.923 67.495 71.069 67.880 70.000 C 77.098 44.746 101.116 27.945 128.000 27.945 C 154.884 27.945 178.902 44.746 188.120 70.000 C 188.510 71.061 189.331 71.908 190.380 72.330 C 213.089 81.397 227.989 103.378 228.000 127.830 C 228.090 159.630 201.320 187.180 169.550 188.000 Z"),
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
        return _tree!!
    }

private var _tree: ImageVector? = null
