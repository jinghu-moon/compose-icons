package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CraneTower: ImageVector
    get() {
        if (_craneTower != null) return _craneTower!!
        _craneTower = phosphorThinIcon(
            name = "CraneTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 84h-133.53L83.58 38.21C82.902 36.855 81.516 35.999 80 36h-32c-2.209 0-4 1.791-4 4v44h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v120h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h104c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-20v-120h104v92c0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4v-8c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v8c0 6.627 5.373 12 12 12h16c6.627 0 12-5.373 12-12v-92h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM52 44h25.53l20 40h-45.53ZM52 212v-56h48v56ZM100 148h-48v-56h48Z"),
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
        return _craneTower!!
    }

private var _craneTower: ImageVector? = null
