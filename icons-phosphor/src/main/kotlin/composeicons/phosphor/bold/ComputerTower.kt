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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M84 76C84 69.373 89.373 64 96 64h64c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-64C89.373 88 84 82.627 84 76ZM96 128h64c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-64c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM212 40v176c0 11.046-8.954 20-20 20h-128C52.954 236 44 227.046 44 216v-176C44 28.954 52.954 20 64 20h128c11.046 0 20 8.954 20 20ZM188 44h-120v168h120ZM128 168c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16Z"),
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
        return _computerTower!!
    }

private var _computerTower: ImageVector? = null
