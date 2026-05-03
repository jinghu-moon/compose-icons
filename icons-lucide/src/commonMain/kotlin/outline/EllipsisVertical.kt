package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.EllipsisVertical: ImageVector
    get() {
        if (_ellipsisVertical != null) return _ellipsisVertical!!
        _ellipsisVertical = lucideOutlineIcon(
            name = "EllipsisVertical",
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
                    PathNode.MoveTo(13.0f, 5.0f),
                    PathNode.CurveTo(13.0f, 5.552285f, 12.552285f, 6.0f, 12.0f, 6.0f),
                    PathNode.CurveTo(11.447715f, 6.0f, 11.0f, 5.552285f, 11.0f, 5.0f),
                    PathNode.CurveTo(11.0f, 4.447716f, 11.447715f, 4.0f, 12.0f, 4.0f),
                    PathNode.CurveTo(12.552285f, 4.0f, 13.0f, 4.447716f, 13.0f, 5.0f),
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
                    PathNode.MoveTo(13.0f, 19.0f),
                    PathNode.CurveTo(13.0f, 19.552284f, 12.552285f, 20.0f, 12.0f, 20.0f),
                    PathNode.CurveTo(11.447715f, 20.0f, 11.0f, 19.552284f, 11.0f, 19.0f),
                    PathNode.CurveTo(11.0f, 18.447716f, 11.447715f, 18.0f, 12.0f, 18.0f),
                    PathNode.CurveTo(12.552285f, 18.0f, 13.0f, 18.447716f, 13.0f, 19.0f),
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
        return _ellipsisVertical!!
    }

private var _ellipsisVertical: ImageVector? = null
