package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ComputerTower: ImageVector
    get() {
        if (_computerTower != null) return _computerTower!!
        _computerTower = phosphorThinIcon(
            name = "ComputerTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 164.000 72.000 C 164.000 74.209 162.209 76.000 160.000 76.000 L 96.000 76.000 C 93.791 76.000 92.000 74.209 92.000 72.000 C 92.000 69.791 93.791 68.000 96.000 68.000 L 160.000 68.000 C 162.209 68.000 164.000 69.791 164.000 72.000 ZM 160.000 100.000 L 96.000 100.000 C 93.791 100.000 92.000 101.791 92.000 104.000 C 92.000 106.209 93.791 108.000 96.000 108.000 L 160.000 108.000 C 162.209 108.000 164.000 106.209 164.000 104.000 C 164.000 101.791 162.209 100.000 160.000 100.000 ZM 204.000 40.000 L 204.000 216.000 C 204.000 222.627 198.627 228.000 192.000 228.000 L 64.000 228.000 C 57.373 228.000 52.000 222.627 52.000 216.000 L 52.000 40.000 C 52.000 33.373 57.373 28.000 64.000 28.000 L 192.000 28.000 C 198.627 28.000 204.000 33.373 204.000 40.000 ZM 196.000 40.000 C 196.000 37.791 194.209 36.000 192.000 36.000 L 64.000 36.000 C 61.791 36.000 60.000 37.791 60.000 40.000 L 60.000 216.000 C 60.000 218.209 61.791 220.000 64.000 220.000 L 192.000 220.000 C 194.209 220.000 196.000 218.209 196.000 216.000 ZM 128.000 172.000 C 123.582 172.000 120.000 175.582 120.000 180.000 C 120.000 184.418 123.582 188.000 128.000 188.000 C 132.418 188.000 136.000 184.418 136.000 180.000 C 136.000 175.582 132.418 172.000 128.000 172.000 Z"),
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
        return _computerTower!!
    }

private var _computerTower: ImageVector? = null
