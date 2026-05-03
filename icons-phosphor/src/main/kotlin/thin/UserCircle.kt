package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserCircle: ImageVector
    get() {
        if (_userCircle != null) return _userCircle!!
        _userCircle = phosphorThinIcon(
            name = "UserCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 68.870 198.420 C 80.952 177.145 103.533 164.000 128.000 164.000 C 152.467 164.000 175.048 177.145 187.130 198.420 C 152.960 227.193 103.040 227.193 68.870 198.420 ZM 193.170 192.870 C 183.233 176.257 167.302 164.087 148.660 158.870 C 166.495 149.385 175.580 128.975 170.693 109.376 C 165.805 89.776 148.200 76.022 128.000 76.022 C 107.800 76.022 90.195 89.776 85.307 109.376 C 80.420 128.975 89.505 149.385 107.340 158.870 C 88.698 164.087 72.767 176.257 62.830 192.870 C 26.996 156.908 27.066 98.717 62.985 62.840 C 98.904 26.963 157.096 26.963 193.015 62.840 C 228.934 98.717 229.004 156.908 193.170 192.870 ZM 128.000 156.000 C 108.118 156.000 92.000 139.882 92.000 120.000 C 92.000 100.118 108.118 84.000 128.000 84.000 C 147.882 84.000 164.000 100.118 164.000 120.000 C 164.000 139.882 147.882 156.000 128.000 156.000 Z"),
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
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
