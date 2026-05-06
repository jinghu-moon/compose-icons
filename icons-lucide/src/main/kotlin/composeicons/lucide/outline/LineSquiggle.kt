package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LineSquiggle: ImageVector
    get() {
        if (_lineSquiggle != null) return _lineSquiggle!!
        _lineSquiggle = lucideOutlineIcon(
            name = "LineSquiggle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 3.5c5-2 7 2.5 3 4C1.5 10 2 15 5 16 10 18 14 6 19 9c5 3 .5 13.5-4 12-5-2.5 .5-11 6-2"),
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
        return _lineSquiggle!!
    }

private var _lineSquiggle: ImageVector? = null
