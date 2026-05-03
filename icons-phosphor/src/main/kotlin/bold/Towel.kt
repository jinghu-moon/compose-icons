package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Towel: ImageVector
    get() {
        if (_towel != null) return _towel!!
        _towel = phosphorBoldIcon(
            name = "Towel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 197.160 20.000 C 196.690 20.000 196.230 20.000 195.770 20.000 L 72.000 20.000 C 56.536 20.000 44.000 32.536 44.000 48.000 L 44.000 216.000 C 44.000 227.046 52.954 236.000 64.000 236.000 L 168.000 236.000 C 179.046 236.000 188.000 227.046 188.000 216.000 L 188.000 52.000 C 188.000 47.582 191.582 44.000 196.000 44.000 L 196.350 44.000 C 200.761 44.334 204.142 48.057 204.050 52.480 L 204.050 148.000 C 204.050 154.627 209.423 160.000 216.050 160.000 C 222.677 160.000 228.050 154.627 228.050 148.000 L 228.050 52.480 C 228.253 35.073 214.555 20.671 197.160 20.000 ZM 72.000 44.000 L 165.000 44.000 C 164.333 46.614 163.997 49.302 164.000 52.000 L 164.000 172.000 L 68.000 172.000 L 68.000 48.000 C 68.000 45.791 69.791 44.000 72.000 44.000 ZM 68.000 212.000 L 68.000 196.000 L 164.000 196.000 L 164.000 212.000 Z"),
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
        return _towel!!
    }

private var _towel: ImageVector? = null
