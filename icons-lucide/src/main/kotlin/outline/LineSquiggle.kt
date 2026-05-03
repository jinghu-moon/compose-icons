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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 3.500 C 12.000 1.500 14.000 6.000 10.000 7.500 C 1.500 10.000 2.000 15.000 5.000 16.000 C 10.000 18.000 14.000 6.000 19.000 9.000 C 24.000 12.000 19.500 22.500 15.000 21.000 C 10.000 18.500 15.500 10.000 21.000 19.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _lineSquiggle!!
    }

private var _lineSquiggle: ImageVector? = null
