package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Divide: ImageVector
    get() {
        if (_divide != null) return _divide!!
        _divide = lucideOutlineIcon(
            name = "Divide",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 6.0f),
                    PathNode.CurveTo(13.0f, 6.552285f, 12.552285f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(11.447715f, 7.0f, 11.0f, 6.552285f, 11.0f, 6.0f),
                    PathNode.CurveTo(11.0f, 5.447716f, 11.447715f, 5.0f, 12.0f, 5.0f),
                    PathNode.CurveTo(12.552285f, 5.0f, 13.0f, 5.447716f, 13.0f, 6.0f),
                    PathNode.Close
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
                    PathNode.MoveTo(5.0f, 12.0f),
                    PathNode.LineTo(19.0f, 12.0f)
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
                    PathNode.MoveTo(13.0f, 18.0f),
                    PathNode.CurveTo(13.0f, 18.552284f, 12.552285f, 19.0f, 12.0f, 19.0f),
                    PathNode.CurveTo(11.447715f, 19.0f, 11.0f, 18.552284f, 11.0f, 18.0f),
                    PathNode.CurveTo(11.0f, 17.447716f, 11.447715f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(12.552285f, 17.0f, 13.0f, 17.447716f, 13.0f, 18.0f),
                    PathNode.Close
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
        return _divide!!
    }

private var _divide: ImageVector? = null
