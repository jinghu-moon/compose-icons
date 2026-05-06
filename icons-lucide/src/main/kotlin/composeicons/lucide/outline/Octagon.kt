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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.586 16.726C2.211 16.351 2 15.842 2 15.312v-6.624c0-.53 .211-1.039 .586-1.414L7.274 2.586C7.649 2.211 8.158 2 8.688 2h6.624c.53 0 1.039 .211 1.414 .586l4.688 4.688c.375 .375 .586 .884 .586 1.414v6.624c-0 .53-.211 1.039-.586 1.414l-4.688 4.688c-.375 .375-.884 .586-1.414 .586h-6.624c-.53-0-1.039-.211-1.414-.586Z"),
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
        return _octagon!!
    }

private var _octagon: ImageVector? = null
