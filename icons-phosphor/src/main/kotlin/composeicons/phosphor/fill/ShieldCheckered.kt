package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) return _shieldCheckered!!
        _shieldCheckered = phosphorFillIcon(
            name = "ShieldCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 40h-160C39.163 40 32 47.163 32 56v56c0 52.72 25.52 84.67 46.93 102.19 23.06 18.86 46 25.27 47 25.53 1.375 .374 2.825 .374 4.2 0 1-.26 23.91-6.67 47-25.53C198.48 196.67 224 164.72 224 112v-56c0-8.837-7.163-16-16-16ZM128 223.62C113.852 218.68 100.679 211.298 89.08 201.81 65.83 182.79 52.37 158 48.9 128h79.1v-72h80v56c.003 5.346-.297 10.688-.9 16h-79.1v95.62Z"),
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
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
