package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Watch: ImageVector
    get() {
        if (_watch != null) return _watch!!
        _watch = lucideOutlineIcon(
            name = "Watch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 10.0f),
                    PathNode.LineTo(12.0f, 12.2f),
                    PathNode.LineTo(13.6f, 13.2f)
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
                    PathNode.MoveTo(16.13f, 7.66f),
                    PathNode.LineTo(15.32f, 3.61f),
                    PathNode.CurveTo(15.131263f, 2.659768f, 14.288616f, 1.981438f, 13.32f, 2.0f),
                    PathNode.LineTo(10.64f, 2.0f),
                    PathNode.CurveTo(9.671384f, 1.981438f, 8.828737f, 2.659768f, 8.64f, 3.61f),
                    PathNode.LineTo(7.86f, 7.66f)
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
                    PathNode.MoveTo(7.88f, 16.36f),
                    PathNode.LineTo(8.68f, 20.36f),
                    PathNode.CurveTo(8.868737f, 21.310232f, 9.711384f, 21.988562f, 10.68f, 21.97f),
                    PathNode.LineTo(13.4f, 21.97f),
                    PathNode.CurveTo(14.368616f, 21.988562f, 15.211263f, 21.310232f, 15.4f, 20.36f),
                    PathNode.LineTo(16.21f, 16.31f)
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
                    PathNode.MoveTo(18.0f, 12.0f),
                    PathNode.CurveTo(18.0f, 15.313708f, 15.313708f, 18.0f, 12.0f, 18.0f),
                    PathNode.CurveTo(8.686292f, 18.0f, 6.0f, 15.313708f, 6.0f, 12.0f),
                    PathNode.CurveTo(6.0f, 8.686292f, 8.686292f, 6.0f, 12.0f, 6.0f),
                    PathNode.CurveTo(15.313708f, 6.0f, 18.0f, 8.686292f, 18.0f, 12.0f),
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
        return _watch!!
    }

private var _watch: ImageVector? = null
