package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PaintRoller: ImageVector
    get() {
        if (_paintRoller != null) return _paintRoller!!
        _paintRoller = phosphorFillIcon(
            name = "PaintRoller",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 104v50c-.025 7.133-4.748 13.396-11.6 15.38L136 198v34c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-34c.025-7.133 4.748-13.396 11.6-15.38L232 154v-50h-16v24c0 8.837-7.163 16-16 16h-152c-8.837 0-16-7.163-16-16v-24h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16v-24C32 55.163 39.163 48 48 48h152c8.837 0 16 7.163 16 16v24h16c8.837 0 16 7.163 16 16Z"),
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
        return _paintRoller!!
    }

private var _paintRoller: ImageVector? = null
