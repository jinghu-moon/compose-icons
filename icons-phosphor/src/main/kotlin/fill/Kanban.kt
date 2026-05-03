package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Kanban: ImageVector
    get() {
        if (_kanban != null) return _kanban!!
        _kanban = phosphorFillIcon(
            name = "Kanban",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 160.000 56.000 L 160.000 152.000 C 160.000 156.418 156.418 160.000 152.000 160.000 L 112.000 160.000 C 107.582 160.000 104.000 156.418 104.000 152.000 L 104.000 56.000 C 104.000 51.582 107.582 48.000 112.000 48.000 L 152.000 48.000 C 156.418 48.000 160.000 51.582 160.000 56.000 ZM 224.000 48.000 L 184.000 48.000 C 179.582 48.000 176.000 51.582 176.000 56.000 L 176.000 108.000 C 176.000 110.209 177.791 112.000 180.000 112.000 L 228.000 112.000 C 230.209 112.000 232.000 110.209 232.000 108.000 L 232.000 56.000 C 232.000 51.582 228.418 48.000 224.000 48.000 ZM 228.000 128.000 L 180.000 128.000 C 177.791 128.000 176.000 129.791 176.000 132.000 L 176.000 176.000 C 176.000 184.837 183.163 192.000 192.000 192.000 L 216.000 192.000 C 224.837 192.000 232.000 184.837 232.000 176.000 L 232.000 132.000 C 232.000 129.791 230.209 128.000 228.000 128.000 ZM 80.000 48.000 L 40.000 48.000 C 35.582 48.000 32.000 51.582 32.000 56.000 L 32.000 108.000 C 32.000 110.209 33.791 112.000 36.000 112.000 L 84.000 112.000 C 86.209 112.000 88.000 110.209 88.000 108.000 L 88.000 56.000 C 88.000 51.582 84.418 48.000 80.000 48.000 ZM 84.000 128.000 L 36.000 128.000 C 33.791 128.000 32.000 129.791 32.000 132.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 72.000 224.000 C 80.837 224.000 88.000 216.837 88.000 208.000 L 88.000 132.000 C 88.000 129.791 86.209 128.000 84.000 128.000 Z"),
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
        return _kanban!!
    }

private var _kanban: ImageVector? = null
