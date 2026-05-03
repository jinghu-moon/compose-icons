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
                pathData = parseSvgPathData("M 168.000 76.000 C 168.000 69.373 173.373 64.000 180.000 64.000 L 204.000 64.000 C 210.627 64.000 216.000 69.373 216.000 76.000 C 216.000 82.627 210.627 88.000 204.000 88.000 L 180.000 88.000 C 173.373 88.000 168.000 82.627 168.000 76.000 ZM 180.000 124.000 L 204.000 124.000 C 210.627 124.000 216.000 118.627 216.000 112.000 C 216.000 105.373 210.627 100.000 204.000 100.000 L 180.000 100.000 C 173.373 100.000 168.000 105.373 168.000 112.000 C 168.000 118.627 173.373 124.000 180.000 124.000 ZM 252.000 48.000 L 252.000 208.000 C 252.000 219.046 243.046 228.000 232.000 228.000 L 152.000 228.000 C 140.954 228.000 132.000 219.046 132.000 208.000 L 132.000 192.000 L 100.000 192.000 L 100.000 204.000 L 108.000 204.000 C 114.627 204.000 120.000 209.373 120.000 216.000 C 120.000 222.627 114.627 228.000 108.000 228.000 L 68.000 228.000 C 61.373 228.000 56.000 222.627 56.000 216.000 C 56.000 209.373 61.373 204.000 68.000 204.000 L 76.000 204.000 L 76.000 192.000 L 32.000 192.000 C 16.536 192.000 4.000 179.464 4.000 164.000 L 4.000 96.000 C 4.000 80.536 16.536 68.000 32.000 68.000 L 132.000 68.000 L 132.000 48.000 C 132.000 36.954 140.954 28.000 152.000 28.000 L 232.000 28.000 C 243.046 28.000 252.000 36.954 252.000 48.000 ZM 132.000 168.000 L 132.000 92.000 L 32.000 92.000 C 29.791 92.000 28.000 93.791 28.000 96.000 L 28.000 164.000 C 28.000 166.209 29.791 168.000 32.000 168.000 ZM 228.000 52.000 L 156.000 52.000 L 156.000 204.000 L 228.000 204.000 ZM 192.000 160.000 C 183.163 160.000 176.000 167.163 176.000 176.000 C 176.000 184.837 183.163 192.000 192.000 192.000 C 200.837 192.000 208.000 184.837 208.000 176.000 C 208.000 167.163 200.837 160.000 192.000 160.000 Z"),
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
