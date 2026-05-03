package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Slice: ImageVector
    get() {
        if (_slice != null) return _slice!!
        _slice = lucideOutlineIcon(
            name = "Slice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 16.586 L 11.000 19.000 C 11.000 19.552 10.552 20.000 10.000 20.000 L 2.000 20.000 L 18.370 3.630 C 19.198 2.802 20.542 2.802 21.370 3.630 C 22.198 4.458 22.198 5.802 21.370 6.630 L 11.707 16.293 C 11.316 16.683 10.684 16.683 10.293 16.293 L 8.000 14.000"),
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
        return _slice!!
    }

private var _slice: ImageVector? = null
