package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ComputerTower: ImageVector
    get() {
        if (_computerTower != null) return _computerTower!!
        _computerTower = phosphorLightIcon(
            name = "ComputerTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 166.000 72.000 C 166.000 75.314 163.314 78.000 160.000 78.000 L 96.000 78.000 C 92.686 78.000 90.000 75.314 90.000 72.000 C 90.000 68.686 92.686 66.000 96.000 66.000 L 160.000 66.000 C 163.314 66.000 166.000 68.686 166.000 72.000 ZM 160.000 98.000 L 96.000 98.000 C 92.686 98.000 90.000 100.686 90.000 104.000 C 90.000 107.314 92.686 110.000 96.000 110.000 L 160.000 110.000 C 163.314 110.000 166.000 107.314 166.000 104.000 C 166.000 100.686 163.314 98.000 160.000 98.000 ZM 206.000 40.000 L 206.000 216.000 C 206.000 223.732 199.732 230.000 192.000 230.000 L 64.000 230.000 C 56.268 230.000 50.000 223.732 50.000 216.000 L 50.000 40.000 C 50.000 32.268 56.268 26.000 64.000 26.000 L 192.000 26.000 C 199.732 26.000 206.000 32.268 206.000 40.000 ZM 194.000 40.000 C 194.000 38.895 193.105 38.000 192.000 38.000 L 64.000 38.000 C 62.895 38.000 62.000 38.895 62.000 40.000 L 62.000 216.000 C 62.000 217.105 62.895 218.000 64.000 218.000 L 192.000 218.000 C 193.105 218.000 194.000 217.105 194.000 216.000 ZM 128.000 170.000 C 122.477 170.000 118.000 174.477 118.000 180.000 C 118.000 185.523 122.477 190.000 128.000 190.000 C 133.523 190.000 138.000 185.523 138.000 180.000 C 138.000 174.477 133.523 170.000 128.000 170.000 Z"),
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
