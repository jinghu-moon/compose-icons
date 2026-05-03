package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SidebarSimple: ImageVector
    get() {
        if (_sidebarSimple != null) return _sidebarSimple!!
        _sidebarSimple = phosphorThinIcon(
            name = "SidebarSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 44.000 L 40.000 44.000 C 33.373 44.000 28.000 49.373 28.000 56.000 L 28.000 200.000 C 28.000 206.627 33.373 212.000 40.000 212.000 L 216.000 212.000 C 222.627 212.000 228.000 206.627 228.000 200.000 L 228.000 56.000 C 228.000 49.373 222.627 44.000 216.000 44.000 ZM 36.000 200.000 L 36.000 56.000 C 36.000 53.791 37.791 52.000 40.000 52.000 L 84.000 52.000 L 84.000 204.000 L 40.000 204.000 C 37.791 204.000 36.000 202.209 36.000 200.000 ZM 220.000 200.000 C 220.000 202.209 218.209 204.000 216.000 204.000 L 92.000 204.000 L 92.000 52.000 L 216.000 52.000 C 218.209 52.000 220.000 53.791 220.000 56.000 Z"),
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
        return _sidebarSimple!!
    }

private var _sidebarSimple: ImageVector? = null
