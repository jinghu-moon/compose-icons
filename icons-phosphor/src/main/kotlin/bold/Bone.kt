package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bone: ImageVector
    get() {
        if (_bone != null) return _bone!!
        _bone = phosphorBoldIcon(
            name = "Bone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 234.740 58.310 C 228.792 51.161 220.532 46.315 211.390 44.610 C 208.412 29.252 196.753 17.039 181.549 13.352 C 166.345 9.665 150.388 15.179 140.704 27.467 C 131.021 39.755 129.390 56.560 136.530 70.480 L 70.530 136.530 C 56.610 129.390 39.805 131.021 27.517 140.704 C 15.229 150.388 9.715 166.345 13.402 181.549 C 17.089 196.753 29.302 208.412 44.660 211.390 C 47.633 226.752 59.290 238.971 74.496 242.662 C 89.701 246.353 105.663 240.839 115.348 228.550 C 125.033 216.260 126.663 199.452 119.520 185.530 L 185.570 119.470 C 202.497 128.370 223.357 124.043 235.347 109.144 C 247.338 94.245 247.104 72.943 234.790 58.310 ZM 216.100 94.510 C 210.919 100.418 202.214 101.690 195.560 97.510 C 187.654 92.506 177.335 93.653 170.720 100.270 L 100.320 170.670 C 93.706 177.288 92.564 187.606 97.570 195.510 C 101.307 201.534 100.635 209.298 95.918 214.590 C 91.202 219.882 83.566 221.440 77.154 218.418 C 70.741 215.397 67.081 208.516 68.160 201.510 C 68.688 198.052 67.680 194.536 65.401 191.882 C 63.122 189.228 59.798 187.701 56.300 187.700 C 55.681 187.697 55.062 187.744 54.450 187.840 C 47.441 188.925 40.555 185.266 37.531 178.852 C 34.506 172.437 36.065 164.796 41.361 160.080 C 46.658 155.363 54.427 154.696 60.450 158.440 C 68.354 163.438 78.667 162.292 85.280 155.680 L 155.680 85.280 C 162.297 78.665 163.444 68.346 158.440 60.440 C 154.696 54.417 155.363 46.648 160.080 41.352 C 164.796 36.055 172.437 34.496 178.852 37.521 C 185.266 40.545 188.925 47.431 187.840 54.440 C 187.248 58.227 188.500 62.069 191.211 64.779 C 193.921 67.490 197.763 68.742 201.550 68.150 C 208.212 67.083 214.828 70.309 218.089 76.217 C 221.349 82.124 220.554 89.442 216.100 94.510 Z"),
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
        return _bone!!
    }

private var _bone: ImageVector? = null
