package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UmbrellaSimple: ImageVector
    get() {
        if (_umbrellaSimple != null) return _umbrellaSimple!!
        _umbrellaSimple = phosphorBoldIcon(
            name = "UmbrellaSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 243.930 126.300 C 240.080 82.058 211.397 43.859 169.985 27.822 C 128.573 11.784 81.644 20.701 49.000 50.810 C 27.617 70.429 14.408 97.381 12.000 126.300 C 11.523 131.892 13.417 137.427 17.221 141.554 C 21.025 145.681 26.388 148.020 32.000 148.000 L 116.000 148.000 L 116.000 200.000 C 116.000 219.882 132.118 236.000 152.000 236.000 C 171.882 236.000 188.000 219.882 188.000 200.000 C 188.000 193.373 182.627 188.000 176.000 188.000 C 169.373 188.000 164.000 193.373 164.000 200.000 C 164.000 206.627 158.627 212.000 152.000 212.000 C 145.373 212.000 140.000 206.627 140.000 200.000 L 140.000 148.000 L 224.000 148.000 C 229.612 148.020 234.975 145.681 238.779 141.554 C 242.583 137.427 244.477 131.892 244.000 126.300 ZM 36.440 124.000 C 41.080 89.864 64.315 61.140 96.728 49.469 C 129.141 37.798 165.354 45.117 190.690 68.460 C 206.539 83.007 216.760 102.670 219.560 124.000 Z"),
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
        return _umbrellaSimple!!
    }

private var _umbrellaSimple: ImageVector? = null
