package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.OrangeSlice: ImageVector
    get() {
        if (_orangeSlice != null) return _orangeSlice!!
        _orangeSlice = phosphorBoldIcon(
            name = "OrangeSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 244.000 76.000 L 12.000 76.000 C 5.373 76.000 0.000 81.373 0.000 88.000 L 0.000 92.000 C 0.000 162.692 57.308 220.000 128.000 220.000 C 198.692 220.000 256.000 162.692 256.000 92.000 L 256.000 88.000 C 256.000 81.373 250.627 76.000 244.000 76.000 ZM 64.520 100.000 L 107.210 100.000 L 84.670 139.050 C 73.546 128.826 66.407 114.990 64.520 100.000 ZM 128.000 112.000 L 150.940 151.730 C 136.176 157.423 119.824 157.423 105.060 151.730 ZM 171.330 139.050 L 148.790 100.000 L 191.480 100.000 C 189.593 114.990 182.454 128.826 171.330 139.050 ZM 128.000 196.000 C 73.691 195.932 28.550 154.143 24.300 100.000 L 40.370 100.000 C 44.536 145.286 82.522 179.939 128.000 179.939 C 173.478 179.939 211.464 145.286 215.630 100.000 L 231.700 100.000 C 227.450 154.143 182.309 195.932 128.000 196.000 Z"),
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
        return _orangeSlice!!
    }

private var _orangeSlice: ImageVector? = null
