package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sidebar: ImageVector
    get() {
        if (_sidebar != null) return _sidebar!!
        _sidebar = phosphorFillIcon(
            name = "Sidebar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 64.000 152.000 L 48.000 152.000 C 43.582 152.000 40.000 148.418 40.000 144.000 C 40.000 139.582 43.582 136.000 48.000 136.000 L 64.000 136.000 C 68.418 136.000 72.000 139.582 72.000 144.000 C 72.000 148.418 68.418 152.000 64.000 152.000 ZM 64.000 120.000 L 48.000 120.000 C 43.582 120.000 40.000 116.418 40.000 112.000 C 40.000 107.582 43.582 104.000 48.000 104.000 L 64.000 104.000 C 68.418 104.000 72.000 107.582 72.000 112.000 C 72.000 116.418 68.418 120.000 64.000 120.000 ZM 64.000 88.000 L 48.000 88.000 C 43.582 88.000 40.000 84.418 40.000 80.000 C 40.000 75.582 43.582 72.000 48.000 72.000 L 64.000 72.000 C 68.418 72.000 72.000 75.582 72.000 80.000 C 72.000 84.418 68.418 88.000 64.000 88.000 ZM 216.000 200.000 L 88.000 200.000 L 88.000 56.000 L 216.000 56.000 L 216.000 200.000 Z"),
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
        return _sidebar!!
    }

private var _sidebar: ImageVector? = null
