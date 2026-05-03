package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ComputerTower: ImageVector
    get() {
        if (_computerTower != null) return _computerTower!!
        _computerTower = phosphorBoldIcon(
            name = "ComputerTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 84.000 76.000 C 84.000 69.373 89.373 64.000 96.000 64.000 L 160.000 64.000 C 166.627 64.000 172.000 69.373 172.000 76.000 C 172.000 82.627 166.627 88.000 160.000 88.000 L 96.000 88.000 C 89.373 88.000 84.000 82.627 84.000 76.000 ZM 96.000 128.000 L 160.000 128.000 C 166.627 128.000 172.000 122.627 172.000 116.000 C 172.000 109.373 166.627 104.000 160.000 104.000 L 96.000 104.000 C 89.373 104.000 84.000 109.373 84.000 116.000 C 84.000 122.627 89.373 128.000 96.000 128.000 ZM 212.000 40.000 L 212.000 216.000 C 212.000 227.046 203.046 236.000 192.000 236.000 L 64.000 236.000 C 52.954 236.000 44.000 227.046 44.000 216.000 L 44.000 40.000 C 44.000 28.954 52.954 20.000 64.000 20.000 L 192.000 20.000 C 203.046 20.000 212.000 28.954 212.000 40.000 ZM 188.000 44.000 L 68.000 44.000 L 68.000 212.000 L 188.000 212.000 ZM 128.000 168.000 C 119.163 168.000 112.000 175.163 112.000 184.000 C 112.000 192.837 119.163 200.000 128.000 200.000 C 136.837 200.000 144.000 192.837 144.000 184.000 C 144.000 175.163 136.837 168.000 128.000 168.000 Z"),
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
