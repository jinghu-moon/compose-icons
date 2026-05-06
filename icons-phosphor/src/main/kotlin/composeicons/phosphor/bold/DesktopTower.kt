package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DesktopTower: ImageVector
    get() {
        if (_desktopTower != null) return _desktopTower!!
        _desktopTower = phosphorBoldIcon(
            name = "DesktopTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 76c0-6.627 5.373-12 12-12h24c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-24c-6.627 0-12-5.373-12-12ZM180 124h24c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-24c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM252 48v160c0 11.046-8.954 20-20 20h-80c-11.046 0-20-8.954-20-20v-16h-32v12h8c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-40c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h8v-12h-44C16.536 192 4 179.464 4 164v-68C4 80.536 16.536 68 32 68h100v-20c0-11.046 8.954-20 20-20h80c11.046 0 20 8.954 20 20ZM132 168v-76h-100c-2.209 0-4 1.791-4 4v68c0 2.209 1.791 4 4 4ZM228 52h-72v152h72ZM192 160c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16Z"),
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
