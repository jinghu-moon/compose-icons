package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.KeyReturn: ImageVector
    get() {
        if (_keyReturn != null) return _keyReturn!!
        _keyReturn = phosphorBoldIcon(
            name = "KeyReturn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 71.510 144.490 C 69.251 142.238 67.981 139.180 67.981 135.990 C 67.981 132.800 69.251 129.742 71.510 127.490 L 95.510 103.490 C 100.204 98.796 107.816 98.796 112.510 103.490 C 117.204 108.184 117.204 115.796 112.510 120.490 L 109.000 124.000 L 164.000 124.000 L 164.000 104.000 C 164.000 97.373 169.373 92.000 176.000 92.000 C 182.627 92.000 188.000 97.373 188.000 104.000 L 188.000 136.000 C 188.000 142.627 182.627 148.000 176.000 148.000 L 109.000 148.000 L 112.520 151.510 C 117.214 156.204 117.214 163.816 112.520 168.510 C 107.826 173.204 100.214 173.204 95.520 168.510 ZM 236.000 56.000 L 236.000 200.000 C 236.000 211.046 227.046 220.000 216.000 220.000 L 40.000 220.000 C 28.954 220.000 20.000 211.046 20.000 200.000 L 20.000 56.000 C 20.000 44.954 28.954 36.000 40.000 36.000 L 216.000 36.000 C 227.046 36.000 236.000 44.954 236.000 56.000 ZM 212.000 60.000 L 44.000 60.000 L 44.000 196.000 L 212.000 196.000 Z"),
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
        return _keyReturn!!
    }

private var _keyReturn: ImageVector? = null
