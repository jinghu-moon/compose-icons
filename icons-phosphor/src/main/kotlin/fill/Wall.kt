package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Wall: ImageVector
    get() {
        if (_wall != null) return _wall!!
        _wall = phosphorFillIcon(
            name = "Wall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 56.000 L 232.000 88.000 C 232.000 90.209 230.209 92.000 228.000 92.000 L 136.000 92.000 L 136.000 52.000 C 136.000 49.791 137.791 48.000 140.000 48.000 L 224.000 48.000 C 228.418 48.000 232.000 51.582 232.000 56.000 ZM 228.000 108.000 L 184.000 108.000 L 184.000 152.000 L 228.000 152.000 C 230.209 152.000 232.000 150.209 232.000 148.000 L 232.000 112.000 C 232.000 109.791 230.209 108.000 228.000 108.000 ZM 88.000 152.000 L 168.000 152.000 L 168.000 108.000 L 88.000 108.000 ZM 28.000 152.000 L 72.000 152.000 L 72.000 108.000 L 28.000 108.000 C 25.791 108.000 24.000 109.791 24.000 112.000 L 24.000 148.000 C 24.000 150.209 25.791 152.000 28.000 152.000 ZM 228.000 168.000 L 136.000 168.000 L 136.000 204.000 C 136.000 206.209 137.791 208.000 140.000 208.000 L 224.000 208.000 C 228.418 208.000 232.000 204.418 232.000 200.000 L 232.000 172.000 C 232.000 169.791 230.209 168.000 228.000 168.000 ZM 28.000 92.000 L 120.000 92.000 L 120.000 52.000 C 120.000 49.791 118.209 48.000 116.000 48.000 L 32.000 48.000 C 27.582 48.000 24.000 51.582 24.000 56.000 L 24.000 88.000 C 24.000 90.209 25.791 92.000 28.000 92.000 ZM 24.000 172.000 L 24.000 200.000 C 24.000 204.418 27.582 208.000 32.000 208.000 L 116.000 208.000 C 118.209 208.000 120.000 206.209 120.000 204.000 L 120.000 168.000 L 28.000 168.000 C 25.791 168.000 24.000 169.791 24.000 172.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _wall!!
    }

private var _wall: ImageVector? = null
