package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) return _flipHorizontal!!
        _flipHorizontal = phosphorBoldIcon(
            name = "FlipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 104.000 20.410 C 94.665 18.446 85.254 23.408 81.600 32.220 C 81.530 32.370 81.470 32.530 81.410 32.680 L 21.470 192.490 C 18.973 198.654 19.703 205.657 23.419 211.173 C 27.134 216.690 33.349 219.998 40.000 220.000 L 100.000 220.000 C 111.046 220.000 120.000 211.046 120.000 200.000 L 120.000 40.000 C 120.064 30.475 113.346 22.250 104.000 20.410 ZM 96.000 196.000 L 45.790 196.000 L 96.000 62.090 ZM 234.530 192.490 L 174.610 32.680 C 174.550 32.530 174.490 32.370 174.420 32.220 C 170.715 23.460 161.353 18.521 152.031 20.409 C 142.708 22.297 136.005 30.489 136.000 40.000 L 136.000 200.000 C 136.000 211.046 144.954 220.000 156.000 220.000 L 216.000 220.000 C 222.653 220.001 228.871 216.694 232.589 211.177 C 236.307 205.660 237.038 198.656 234.540 192.490 ZM 160.000 196.000 L 160.000 62.090 L 210.210 196.000 Z"),
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
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null
