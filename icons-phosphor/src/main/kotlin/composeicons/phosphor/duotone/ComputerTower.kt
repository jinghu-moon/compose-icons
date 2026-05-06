package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ComputerTower: ImageVector
    get() {
        if (_computerTower != null) return _computerTower!!
        _computerTower = phosphorDuotoneIcon(
            name = "ComputerTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 40v176c0 4.418-3.582 8-8 8h-128c-4.418 0-8-3.582-8-8v-176c0-4.418 3.582-8 8-8h128c4.418 0 8 3.582 8 8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M88 72c0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8ZM96 112h64c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-64c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM208 40v176c0 8.837-7.163 16-16 16h-128c-8.837 0-16-7.163-16-16v-176C48 31.163 55.163 24 64 24h128c8.837 0 16 7.163 16 16ZM192 40h-128v176h128ZM128 168c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
