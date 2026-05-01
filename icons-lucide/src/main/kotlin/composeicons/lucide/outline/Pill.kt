package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pill: ImageVector
    get() {
        if (_pill != null) return _pill!!
        _pill = lucideOutlineIcon(
            name = "Pill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.5f, 20.5f),
                    PathNode.LineTo(20.5f, 10.5f),
                    PathNode.CurveTo(21.77157f, 9.253862f, 22.275978f, 7.420853f, 21.820974f, 5.699597f),
                    PathNode.CurveTo(21.365973f, 3.978341f, 20.02166f, 2.634028f, 18.300404f, 2.179025f),
                    PathNode.CurveTo(16.579147f, 1.724022f, 14.746138f, 2.22843f, 13.5f, 3.5f),
                    PathNode.LineTo(3.5f, 13.5f),
                    PathNode.CurveTo(2.22843f, 14.746138f, 1.724022f, 16.579147f, 2.179025f, 18.300404f),
                    PathNode.CurveTo(2.634028f, 20.02166f, 3.978341f, 21.365973f, 5.699597f, 21.820974f),
                    PathNode.CurveTo(7.420853f, 22.275978f, 9.253862f, 21.77157f, 10.5f, 20.5f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.5f, 8.5f),
                    PathNode.LineTo(15.5f, 15.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pill!!
    }

private var _pill: ImageVector? = null
