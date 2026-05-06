package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DesktopTower: ImageVector
    get() {
        if (_desktopTower != null) return _desktopTower!!
        _desktopTower = phosphorThinIcon(
            name = "DesktopTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 72c0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4ZM208 100h-32c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h32c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM244 48v160c0 6.627-5.373 12-12 12h-80c-6.627 0-12-5.373-12-12v-20h-48v24h20c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h20v-24h-52C20.954 188 12 179.046 12 168v-72C12 84.954 20.954 76 32 76h108v-28c0-6.627 5.373-12 12-12h80c6.627 0 12 5.373 12 12ZM140 180v-96h-108C25.373 84 20 89.373 20 96v72c0 6.627 5.373 12 12 12ZM236 48c0-2.209-1.791-4-4-4h-80c-2.209 0-4 1.791-4 4v160c0 2.209 1.791 4 4 4h80c2.209 0 4-1.791 4-4ZM192 172c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _desktopTower!!
    }

private var _desktopTower: ImageVector? = null
