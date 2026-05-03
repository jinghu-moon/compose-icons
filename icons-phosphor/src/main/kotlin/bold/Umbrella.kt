package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Umbrella: ImageVector
    get() {
        if (_umbrella != null) return _umbrella!!
        _umbrella = phosphorBoldIcon(
            name = "Umbrella",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 243.930 126.300 C 240.080 82.058 211.397 43.859 169.985 27.822 C 128.573 11.784 81.644 20.701 49.000 50.810 C 27.617 70.429 14.408 97.381 12.000 126.300 C 11.523 131.892 13.417 137.427 17.221 141.554 C 21.025 145.681 26.388 148.020 32.000 148.000 L 116.000 148.000 L 116.000 200.000 C 116.000 219.882 132.118 236.000 152.000 236.000 C 171.882 236.000 188.000 219.882 188.000 200.000 C 188.000 193.373 182.627 188.000 176.000 188.000 C 169.373 188.000 164.000 193.373 164.000 200.000 C 164.000 206.627 158.627 212.000 152.000 212.000 C 145.373 212.000 140.000 206.627 140.000 200.000 L 140.000 148.000 L 224.000 148.000 C 229.612 148.020 234.975 145.681 238.779 141.554 C 242.583 137.427 244.477 131.892 244.000 126.300 ZM 100.410 124.000 C 103.080 84.670 118.490 60.490 128.000 49.130 C 137.520 60.520 152.920 84.690 155.590 124.000 ZM 65.310 68.460 C 74.992 59.520 86.481 52.764 99.000 48.650 C 88.800 65.250 78.390 90.080 76.360 124.000 L 36.440 124.000 C 39.240 102.670 49.461 83.007 65.310 68.460 ZM 179.640 124.000 C 177.640 90.080 167.200 65.250 156.990 48.650 C 190.567 59.695 214.873 88.965 219.560 124.000 Z"),
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
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
