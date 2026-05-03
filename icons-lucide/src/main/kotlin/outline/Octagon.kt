package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Octagon: ImageVector
    get() {
        if (_octagon != null) return _octagon!!
        _octagon = lucideOutlineIcon(
            name = "Octagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.586 16.726 C 2.211 16.351 2.000 15.842 2.000 15.312 L 2.000 8.688 C 2.000 8.158 2.211 7.649 2.586 7.274 L 7.274 2.586 C 7.649 2.211 8.158 2.000 8.688 2.000 L 15.312 2.000 C 15.842 2.000 16.351 2.211 16.726 2.586 L 21.414 7.274 C 21.789 7.649 22.000 8.158 22.000 8.688 L 22.000 15.312 C 22.000 15.842 21.789 16.351 21.414 16.726 L 16.726 21.414 C 16.351 21.789 15.842 22.000 15.312 22.000 L 8.688 22.000 C 8.158 22.000 7.649 21.789 7.274 21.414 Z"),
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
        return _octagon!!
    }

private var _octagon: ImageVector? = null
