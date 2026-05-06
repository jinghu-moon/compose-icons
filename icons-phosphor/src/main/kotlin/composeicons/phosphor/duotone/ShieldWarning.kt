package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ShieldWarning: ImageVector
    get() {
        if (_shieldWarning != null) return _shieldWarning!!
        _shieldWarning = phosphorDuotoneIcon(
            name = "ShieldWarning",
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
                pathData = parseSvgPathData("M120 136v-40c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v40c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM128 184c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM224 56v56c0 52.72-25.52 84.67-46.93 102.19-23.06 18.86-46 25.27-47 25.53-1.375 .374-2.825 .374-4.2 0-1-.26-23.91-6.67-47-25.53C57.52 196.67 32 164.72 32 112v-56C32 47.163 39.163 40 48 40h160c8.837 0 16 7.163 16 16ZM208 56h-160v56c0 37.3 13.82 67.51 41.07 89.81 11.602 9.489 24.779 16.871 38.93 21.81 14.339-5.027 27.68-12.542 39.41-22.2C194.34 179.16 208 149.07 208 112Z"),
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
        return _shieldWarning!!
    }

private var _shieldWarning: ImageVector? = null
