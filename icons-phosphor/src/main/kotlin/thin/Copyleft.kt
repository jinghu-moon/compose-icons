package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Copyleft: ImageVector
    get() {
        if (_copyleft != null) return _copyleft!!
        _copyleft = phosphorThinIcon(
            name = "Copyleft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 172.000 128.000 C 172.004 146.941 159.887 163.759 141.919 169.750 C 123.951 175.742 104.164 169.563 92.800 154.410 C 91.472 152.643 91.828 150.133 93.595 148.805 C 95.362 147.477 97.872 147.833 99.200 149.600 C 108.497 161.996 124.684 167.053 139.384 162.153 C 154.085 157.252 164.000 143.495 164.000 128.000 C 164.000 112.505 154.085 98.748 139.384 93.847 C 124.684 88.947 108.497 94.004 99.200 106.400 C 97.872 108.167 95.362 108.523 93.595 107.195 C 91.828 105.867 91.472 103.357 92.800 101.590 C 104.164 86.437 123.951 80.258 141.919 86.250 C 159.887 92.241 172.004 109.059 172.000 128.000 Z"),
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
        return _copyleft!!
    }

private var _copyleft: ImageVector? = null
