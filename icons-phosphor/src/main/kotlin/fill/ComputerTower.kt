package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ComputerTower: ImageVector
    get() {
        if (_computerTower != null) return _computerTower!!
        _computerTower = phosphorFillIcon(
            name = "ComputerTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 24.000 L 64.000 24.000 C 55.163 24.000 48.000 31.163 48.000 40.000 L 48.000 216.000 C 48.000 224.837 55.163 232.000 64.000 232.000 L 192.000 232.000 C 200.837 232.000 208.000 224.837 208.000 216.000 L 208.000 40.000 C 208.000 31.163 200.837 24.000 192.000 24.000 ZM 128.000 192.000 C 121.373 192.000 116.000 186.627 116.000 180.000 C 116.000 173.373 121.373 168.000 128.000 168.000 C 134.627 168.000 140.000 173.373 140.000 180.000 C 140.000 186.627 134.627 192.000 128.000 192.000 ZM 160.000 112.000 L 96.000 112.000 C 91.582 112.000 88.000 108.418 88.000 104.000 C 88.000 99.582 91.582 96.000 96.000 96.000 L 160.000 96.000 C 164.418 96.000 168.000 99.582 168.000 104.000 C 168.000 108.418 164.418 112.000 160.000 112.000 ZM 160.000 80.000 L 96.000 80.000 C 91.582 80.000 88.000 76.418 88.000 72.000 C 88.000 67.582 91.582 64.000 96.000 64.000 L 160.000 64.000 C 164.418 64.000 168.000 67.582 168.000 72.000 C 168.000 76.418 164.418 80.000 160.000 80.000 Z"),
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
