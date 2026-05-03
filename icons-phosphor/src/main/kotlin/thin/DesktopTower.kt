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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.000 72.000 C 212.000 74.209 210.209 76.000 208.000 76.000 L 176.000 76.000 C 173.791 76.000 172.000 74.209 172.000 72.000 C 172.000 69.791 173.791 68.000 176.000 68.000 L 208.000 68.000 C 210.209 68.000 212.000 69.791 212.000 72.000 ZM 208.000 100.000 L 176.000 100.000 C 173.791 100.000 172.000 101.791 172.000 104.000 C 172.000 106.209 173.791 108.000 176.000 108.000 L 208.000 108.000 C 210.209 108.000 212.000 106.209 212.000 104.000 C 212.000 101.791 210.209 100.000 208.000 100.000 ZM 244.000 48.000 L 244.000 208.000 C 244.000 214.627 238.627 220.000 232.000 220.000 L 152.000 220.000 C 145.373 220.000 140.000 214.627 140.000 208.000 L 140.000 188.000 L 92.000 188.000 L 92.000 212.000 L 112.000 212.000 C 114.209 212.000 116.000 213.791 116.000 216.000 C 116.000 218.209 114.209 220.000 112.000 220.000 L 64.000 220.000 C 61.791 220.000 60.000 218.209 60.000 216.000 C 60.000 213.791 61.791 212.000 64.000 212.000 L 84.000 212.000 L 84.000 188.000 L 32.000 188.000 C 20.954 188.000 12.000 179.046 12.000 168.000 L 12.000 96.000 C 12.000 84.954 20.954 76.000 32.000 76.000 L 140.000 76.000 L 140.000 48.000 C 140.000 41.373 145.373 36.000 152.000 36.000 L 232.000 36.000 C 238.627 36.000 244.000 41.373 244.000 48.000 ZM 140.000 180.000 L 140.000 84.000 L 32.000 84.000 C 25.373 84.000 20.000 89.373 20.000 96.000 L 20.000 168.000 C 20.000 174.627 25.373 180.000 32.000 180.000 ZM 236.000 48.000 C 236.000 45.791 234.209 44.000 232.000 44.000 L 152.000 44.000 C 149.791 44.000 148.000 45.791 148.000 48.000 L 148.000 208.000 C 148.000 210.209 149.791 212.000 152.000 212.000 L 232.000 212.000 C 234.209 212.000 236.000 210.209 236.000 208.000 ZM 192.000 172.000 C 187.582 172.000 184.000 175.582 184.000 180.000 C 184.000 184.418 187.582 188.000 192.000 188.000 C 196.418 188.000 200.000 184.418 200.000 180.000 C 200.000 175.582 196.418 172.000 192.000 172.000 Z"),
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
        return _desktopTower!!
    }

private var _desktopTower: ImageVector? = null
