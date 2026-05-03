package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Keyboard: ImageVector
    get() {
        if (_keyboard != null) return _keyboard!!
        _keyboard = phosphorThinIcon(
            name = "Keyboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 52.000 L 32.000 52.000 C 25.373 52.000 20.000 57.373 20.000 64.000 L 20.000 192.000 C 20.000 198.627 25.373 204.000 32.000 204.000 L 224.000 204.000 C 230.627 204.000 236.000 198.627 236.000 192.000 L 236.000 64.000 C 236.000 57.373 230.627 52.000 224.000 52.000 ZM 228.000 192.000 C 228.000 194.209 226.209 196.000 224.000 196.000 L 32.000 196.000 C 29.791 196.000 28.000 194.209 28.000 192.000 L 28.000 64.000 C 28.000 61.791 29.791 60.000 32.000 60.000 L 224.000 60.000 C 226.209 60.000 228.000 61.791 228.000 64.000 ZM 204.000 128.000 C 204.000 130.209 202.209 132.000 200.000 132.000 L 56.000 132.000 C 53.791 132.000 52.000 130.209 52.000 128.000 C 52.000 125.791 53.791 124.000 56.000 124.000 L 200.000 124.000 C 202.209 124.000 204.000 125.791 204.000 128.000 ZM 204.000 96.000 C 204.000 98.209 202.209 100.000 200.000 100.000 L 56.000 100.000 C 53.791 100.000 52.000 98.209 52.000 96.000 C 52.000 93.791 53.791 92.000 56.000 92.000 L 200.000 92.000 C 202.209 92.000 204.000 93.791 204.000 96.000 ZM 68.000 160.000 C 68.000 162.209 66.209 164.000 64.000 164.000 L 56.000 164.000 C 53.791 164.000 52.000 162.209 52.000 160.000 C 52.000 157.791 53.791 156.000 56.000 156.000 L 64.000 156.000 C 66.209 156.000 68.000 157.791 68.000 160.000 ZM 164.000 160.000 C 164.000 162.209 162.209 164.000 160.000 164.000 L 96.000 164.000 C 93.791 164.000 92.000 162.209 92.000 160.000 C 92.000 157.791 93.791 156.000 96.000 156.000 L 160.000 156.000 C 162.209 156.000 164.000 157.791 164.000 160.000 ZM 204.000 160.000 C 204.000 162.209 202.209 164.000 200.000 164.000 L 192.000 164.000 C 189.791 164.000 188.000 162.209 188.000 160.000 C 188.000 157.791 189.791 156.000 192.000 156.000 L 200.000 156.000 C 202.209 156.000 204.000 157.791 204.000 160.000 Z"),
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
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
