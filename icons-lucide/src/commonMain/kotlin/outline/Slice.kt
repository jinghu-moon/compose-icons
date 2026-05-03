package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
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
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 16.586f),
                    PathNode.LineTo(11.0f, 19.0f),
                    PathNode.CurveTo(11.0f, 19.552284f, 10.552285f, 20.0f, 10.0f, 20.0f),
                    PathNode.LineTo(2.0f, 20.0f),
                    PathNode.LineTo(18.37f, 3.63f),
                    PathNode.CurveTo(19.198427f, 2.801573f, 20.541573f, 2.801573f, 21.37f, 3.63f),
                    PathNode.CurveTo(22.198427f, 4.458427f, 22.198427f, 5.801573f, 21.37f, 6.63f),
                    PathNode.LineTo(11.707f, 16.293f),
                    PathNode.CurveTo(11.3165f, 16.683382f, 10.6835f, 16.683382f, 10.293f, 16.293f),
                    PathNode.LineTo(8.0f, 14.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _slice!!
    }

private var _slice: ImageVector? = null
