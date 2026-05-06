package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Shield: ImageVector
    get() {
        if (_shield != null) return _shield!!
        _shield = phosphorDuotoneIcon(
            name = "Shield",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 56v56c0 96-88 120-88 120 0 0-88-24-88-120v-56c0-4.418 3.582-8 8-8h160c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M208 40h-160C39.163 40 32 47.163 32 56v56c0 52.72 25.52 84.67 46.93 102.19 23.06 18.86 46 25.27 47 25.53 1.375 .374 2.825 .374 4.2 0 1-.26 23.91-6.67 47-25.53C198.48 196.67 224 164.72 224 112v-56c0-8.837-7.163-16-16-16ZM208 112c0 37.07-13.66 67.16-40.6 89.42-11.727 9.657-25.064 17.172-39.4 22.2C113.852 218.68 100.679 211.298 89.08 201.81 61.82 179.51 48 149.3 48 112v-56h160Z"),
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
        return _shield!!
    }

private var _shield: ImageVector? = null
