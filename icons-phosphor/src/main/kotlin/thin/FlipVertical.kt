package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) return _flipVertical!!
        _flipVertical = phosphorThinIcon(
            name = "FlipVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 56.000 116.000 L 216.000 116.000 C 221.730 116.008 226.665 111.964 227.785 106.345 C 228.904 100.725 225.895 95.099 220.600 92.910 L 60.600 28.910 C 56.896 27.373 52.669 27.787 49.334 30.015 C 45.999 32.243 43.998 35.990 44.000 40.000 L 44.000 104.000 C 44.000 110.627 49.373 116.000 56.000 116.000 ZM 52.000 40.000 C 52.000 37.791 53.791 36.000 56.000 36.000 C 56.540 36.000 57.074 36.109 57.570 36.320 L 57.640 36.320 L 217.550 100.320 C 219.296 101.064 220.279 102.931 219.903 104.791 C 219.528 106.651 217.897 107.992 216.000 108.000 L 56.000 108.000 C 53.791 108.000 52.000 106.209 52.000 104.000 ZM 227.740 149.610 C 226.696 143.971 221.734 139.909 216.000 140.000 L 56.000 140.000 C 49.373 140.000 44.000 145.373 44.000 152.000 L 44.000 216.000 C 44.000 222.627 49.373 228.000 56.000 228.000 C 57.577 228.000 59.138 227.684 60.590 227.070 L 220.590 163.070 L 220.670 163.070 C 226.003 160.918 228.995 155.222 227.740 149.610 ZM 217.570 155.670 L 57.570 219.670 C 56.336 220.197 54.920 220.069 53.799 219.331 C 52.679 218.593 52.003 217.342 52.000 216.000 L 52.000 152.000 C 52.000 149.791 53.791 148.000 56.000 148.000 L 216.000 148.000 C 217.896 148.000 219.531 149.332 219.916 151.188 C 220.301 153.044 219.329 154.916 217.590 155.670 Z"),
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
        return _flipVertical!!
    }

private var _flipVertical: ImageVector? = null
