package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CraneTower: ImageVector
    get() {
        if (_craneTower != null) return _craneTower!!
        _craneTower = phosphorDuotoneIcon(
            name = "CraneTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 88v128h-56v-176h32Z"),
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
                pathData = parseSvgPathData("M240 80h-131.06L87.16 36.42C85.803 33.709 83.031 31.998 80 32h-32c-4.418 0-8 3.582-8 8v40h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v112h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h104c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-112h96v88h-16v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8c0 8.837 7.163 16 16 16h16c8.837 0 16-7.163 16-16v-88h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM56 48h19.06l16 32h-35.06ZM56 208v-48h40v48ZM96 144h-40v-48h40Z"),
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
