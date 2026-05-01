package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Club: ImageVector
    get() {
        if (_club != null) return _club!!
        _club = lucideOutlineIcon(
            name = "Club",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.28f, 9.05f),
                    PathNode.CurveTo(17.935698f, 6.801891f, 17.095991f, 4.385131f, 15.187616f, 3.027913f),
                    PathNode.CurveTo(13.279242f, 1.670696f, 10.720758f, 1.670696f, 8.812384f, 3.027913f),
                    PathNode.CurveTo(6.904009f, 4.385131f, 6.064302f, 6.801891f, 6.72f, 9.05f),
                    PathNode.CurveTo(4.236249f, 9.407044f, 2.309054f, 11.399903f, 2.035397f, 13.894219f),
                    PathNode.CurveTo(1.761739f, 16.388535f, 3.21101f, 18.751835f, 5.558267f, 19.6389f),
                    PathNode.CurveTo(7.905524f, 20.525965f, 10.555583f, 19.711868f, 12.0f, 17.66f),
                    PathNode.CurveTo(13.440874f, 19.717611f, 16.09274f, 20.537546f, 18.443525f, 19.652285f),
                    PathNode.CurveTo(20.79431f, 18.767023f, 22.246607f, 16.40154f, 21.972328f, 13.904612f),
                    PathNode.CurveTo(21.69805f, 11.407682f, 19.7669f, 9.413858f, 17.28f, 9.06f),
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
                    PathNode.MoveTo(12.0f, 17.66f),
                    PathNode.LineTo(12.0f, 22.0f)
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
        return _club!!
    }

private var _club: ImageVector? = null
