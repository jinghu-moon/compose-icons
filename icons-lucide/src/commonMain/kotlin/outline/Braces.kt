package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Braces: ImageVector
    get() {
        if (_braces != null) return _braces!!
        _braces = lucideOutlineIcon(
            name = "Braces",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 3.0f),
                    PathNode.LineTo(7.0f, 3.0f),
                    PathNode.CurveTo(5.895431f, 3.0f, 5.0f, 3.895431f, 5.0f, 5.0f),
                    PathNode.LineTo(5.0f, 10.0f),
                    PathNode.CurveTo(5.0f, 11.104569f, 4.10457f, 12.0f, 3.0f, 12.0f),
                    PathNode.CurveTo(4.10457f, 12.0f, 5.0f, 12.895431f, 5.0f, 14.0f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.CurveTo(5.0f, 20.1f, 5.9f, 21.0f, 7.0f, 21.0f),
                    PathNode.LineTo(8.0f, 21.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 21.0f),
                    PathNode.LineTo(17.0f, 21.0f),
                    PathNode.CurveTo(18.10457f, 21.0f, 19.0f, 20.10457f, 19.0f, 19.0f),
                    PathNode.LineTo(19.0f, 14.0f),
                    PathNode.CurveTo(19.0f, 12.9f, 19.9f, 12.0f, 21.0f, 12.0f),
                    PathNode.CurveTo(19.89543f, 12.0f, 19.0f, 11.104569f, 19.0f, 10.0f),
                    PathNode.LineTo(19.0f, 5.0f),
                    PathNode.CurveTo(19.0f, 3.895431f, 18.10457f, 3.0f, 17.0f, 3.0f),
                    PathNode.LineTo(16.0f, 3.0f)
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
        return _braces!!
    }

private var _braces: ImageVector? = null
