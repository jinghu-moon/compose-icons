package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RectangleHorizontal: ImageVector
    get() {
        if (_rectangleHorizontal != null) return _rectangleHorizontal!!
        _rectangleHorizontal = lucideOutlineIcon(
            name = "RectangleHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 6h16c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-16C2.895 18 2 17.105 2 16v-8C2 6.895 2.895 6 4 6Z"),
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
        return _rectangleHorizontal!!
    }

private var _rectangleHorizontal: ImageVector? = null
