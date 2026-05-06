package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RectangleVertical: ImageVector
    get() {
        if (_rectangleVertical != null) return _rectangleVertical!!
        _rectangleVertical = lucideOutlineIcon(
            name = "RectangleVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 2h8c1.105 0 2 .895 2 2v16c0 1.105-.895 2-2 2h-8C6.895 22 6 21.105 6 20v-16C6 2.895 6.895 2 8 2Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _rectangleVertical!!
    }

private var _rectangleVertical: ImageVector? = null
