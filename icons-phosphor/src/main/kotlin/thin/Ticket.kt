package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Ticket: ImageVector
    get() {
        if (_ticket != null) return _ticket!!
        _ticket = phosphorThinIcon(
            name = "Ticket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 100.000 C 234.209 100.000 236.000 98.209 236.000 96.000 L 236.000 64.000 C 236.000 57.373 230.627 52.000 224.000 52.000 L 32.000 52.000 C 25.373 52.000 20.000 57.373 20.000 64.000 L 20.000 96.000 C 20.000 98.209 21.791 100.000 24.000 100.000 C 39.464 100.000 52.000 112.536 52.000 128.000 C 52.000 143.464 39.464 156.000 24.000 156.000 C 21.791 156.000 20.000 157.791 20.000 160.000 L 20.000 192.000 C 20.000 198.627 25.373 204.000 32.000 204.000 L 224.000 204.000 C 230.627 204.000 236.000 198.627 236.000 192.000 L 236.000 160.000 C 236.000 157.791 234.209 156.000 232.000 156.000 C 216.536 156.000 204.000 143.464 204.000 128.000 C 204.000 112.536 216.536 100.000 232.000 100.000 ZM 28.000 192.000 L 28.000 163.780 C 46.232 161.755 60.026 146.344 60.026 128.000 C 60.026 109.656 46.232 94.245 28.000 92.220 L 28.000 64.000 C 28.000 61.791 29.791 60.000 32.000 60.000 L 92.000 60.000 L 92.000 196.000 L 32.000 196.000 C 29.791 196.000 28.000 194.209 28.000 192.000 ZM 196.000 128.000 C 196.026 146.325 209.791 161.717 228.000 163.780 L 228.000 192.000 C 228.000 194.209 226.209 196.000 224.000 196.000 L 100.000 196.000 L 100.000 60.000 L 224.000 60.000 C 226.209 60.000 228.000 61.791 228.000 64.000 L 228.000 92.220 C 209.791 94.283 196.026 109.675 196.000 128.000 Z"),
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
        return _ticket!!
    }

private var _ticket: ImageVector? = null
