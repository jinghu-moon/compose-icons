package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Desk: ImageVector
    get() {
        if (_desk != null) return _desk!!
        _desk = phosphorThinIcon(
            name = "Desk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 68.000 L 8.000 68.000 C 5.791 68.000 4.000 69.791 4.000 72.000 C 4.000 74.209 5.791 76.000 8.000 76.000 L 20.000 76.000 L 20.000 192.000 C 20.000 194.209 21.791 196.000 24.000 196.000 C 26.209 196.000 28.000 194.209 28.000 192.000 L 28.000 140.000 L 228.000 140.000 L 228.000 192.000 C 228.000 194.209 229.791 196.000 232.000 196.000 C 234.209 196.000 236.000 194.209 236.000 192.000 L 236.000 76.000 L 248.000 76.000 C 250.209 76.000 252.000 74.209 252.000 72.000 C 252.000 69.791 250.209 68.000 248.000 68.000 ZM 28.000 76.000 L 124.000 76.000 L 124.000 132.000 L 28.000 132.000 ZM 228.000 132.000 L 132.000 132.000 L 132.000 76.000 L 228.000 76.000 ZM 92.000 104.000 C 92.000 106.209 90.209 108.000 88.000 108.000 L 64.000 108.000 C 61.791 108.000 60.000 106.209 60.000 104.000 C 60.000 101.791 61.791 100.000 64.000 100.000 L 88.000 100.000 C 90.209 100.000 92.000 101.791 92.000 104.000 ZM 164.000 104.000 C 164.000 101.791 165.791 100.000 168.000 100.000 L 192.000 100.000 C 194.209 100.000 196.000 101.791 196.000 104.000 C 196.000 106.209 194.209 108.000 192.000 108.000 L 168.000 108.000 C 165.791 108.000 164.000 106.209 164.000 104.000 Z"),
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
        return _desk!!
    }

private var _desk: ImageVector? = null
