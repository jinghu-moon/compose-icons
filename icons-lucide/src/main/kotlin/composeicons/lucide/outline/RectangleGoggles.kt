package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RectangleGoggles: ImageVector
    get() {
        if (_rectangleGoggles != null) return _rectangleGoggles!!
        _rectangleGoggles = lucideOutlineIcon(
            name = "RectangleGoggles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 6c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-4c-.63 0-1.222-.296-1.6-.8L12.8 15.07c-.189-.252-.485-.4-.8-.4-.315 0-.611 .148-.8 .4L9.6 17.2C9.222 17.704 8.63 18 8 18h-4C2.895 18 2 17.105 2 16v-8C2 6.895 2.895 6 4 6Z"),
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
        return _rectangleGoggles!!
    }

private var _rectangleGoggles: ImageVector? = null
