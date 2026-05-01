package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ellipsis: ImageVector
    get() {
        if (_ellipsis != null) return _ellipsis!!
        _ellipsis = lucideOutlineIcon(
            name = "Ellipsis",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 12.0f),
                    PathNode.CurveTo(13.0f, 12.552285f, 12.552285f, 13.0f, 12.0f, 13.0f),
                    PathNode.CurveTo(11.447715f, 13.0f, 11.0f, 12.552285f, 11.0f, 12.0f),
                    PathNode.CurveTo(11.0f, 11.447715f, 11.447715f, 11.0f, 12.0f, 11.0f),
                    PathNode.CurveTo(12.552285f, 11.0f, 13.0f, 11.447715f, 13.0f, 12.0f),
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
                    PathNode.MoveTo(20.0f, 12.0f),
                    PathNode.CurveTo(20.0f, 12.552285f, 19.552284f, 13.0f, 19.0f, 13.0f),
                    PathNode.CurveTo(18.447716f, 13.0f, 18.0f, 12.552285f, 18.0f, 12.0f),
                    PathNode.CurveTo(18.0f, 11.447715f, 18.447716f, 11.0f, 19.0f, 11.0f),
                    PathNode.CurveTo(19.552284f, 11.0f, 20.0f, 11.447715f, 20.0f, 12.0f),
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
                    PathNode.MoveTo(6.0f, 12.0f),
                    PathNode.CurveTo(6.0f, 12.552285f, 5.552285f, 13.0f, 5.0f, 13.0f),
                    PathNode.CurveTo(4.447716f, 13.0f, 4.0f, 12.552285f, 4.0f, 12.0f),
                    PathNode.CurveTo(4.0f, 11.447715f, 4.447716f, 11.0f, 5.0f, 11.0f),
                    PathNode.CurveTo(5.552285f, 11.0f, 6.0f, 11.447715f, 6.0f, 12.0f),
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
        }
        return _ellipsis!!
    }

private var _ellipsis: ImageVector? = null
