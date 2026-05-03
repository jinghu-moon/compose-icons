package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Copyright: ImageVector
    get() {
        if (_copyright != null) return _copyright!!
        _copyright = phosphorThinIcon(
            name = "Copyright",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 163.200 154.410 C 151.834 169.556 132.052 175.731 114.088 169.740 C 96.124 163.749 84.007 146.937 84.007 128.000 C 84.007 109.063 96.124 92.251 114.088 86.260 C 132.052 80.269 151.834 86.444 163.200 101.590 C 164.528 103.357 164.172 105.867 162.405 107.195 C 160.638 108.523 158.128 108.167 156.800 106.400 C 147.503 94.004 131.316 88.947 116.616 93.847 C 101.915 98.748 92.000 112.505 92.000 128.000 C 92.000 143.495 101.915 157.252 116.616 162.153 C 131.316 167.053 147.503 161.996 156.800 149.600 C 158.128 147.833 160.638 147.477 162.405 148.805 C 164.172 150.133 164.528 152.643 163.200 154.410 Z"),
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
        return _copyright!!
    }

private var _copyright: ImageVector? = null
