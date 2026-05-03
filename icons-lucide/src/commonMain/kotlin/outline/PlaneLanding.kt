package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PlaneLanding: ImageVector
    get() {
        if (_planeLanding != null) return _planeLanding!!
        _planeLanding = lucideOutlineIcon(
            name = "PlaneLanding",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 22.0f),
                    PathNode.LineTo(22.0f, 22.0f)
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
                    PathNode.MoveTo(3.77f, 10.77f),
                    PathNode.LineTo(2.0f, 9.0f),
                    PathNode.LineTo(4.0f, 4.5f),
                    PathNode.LineTo(5.1f, 5.05f),
                    PathNode.CurveTo(5.65f, 5.33f, 6.0f, 5.89f, 6.0f, 6.5f),
                    PathNode.CurveTo(6.0f, 7.11f, 6.35f, 7.67f, 6.9f, 7.95f),
                    PathNode.LineTo(8.0f, 8.5f),
                    PathNode.LineTo(11.0f, 2.5f),
                    PathNode.LineTo(12.05f, 3.03f),
                    PathNode.CurveTo(12.642467f, 3.325089f, 13.050568f, 3.894184f, 13.14f, 4.55f),
                    PathNode.LineTo(13.86f, 9.95f),
                    PathNode.CurveTo(13.949432f, 10.605817f, 14.357533f, 11.174911f, 14.95f, 11.47f),
                    PathNode.LineTo(19.35f, 13.67f),
                    PathNode.CurveTo(19.77f, 13.89f, 20.13f, 14.22f, 20.36f, 14.63f),
                    PathNode.LineTo(20.96f, 15.66f),
                    PathNode.CurveTo(21.45f, 16.54f, 20.9f, 17.64f, 19.9f, 17.76f),
                    PathNode.LineTo(18.72f, 17.91f),
                    PathNode.CurveTo(18.25f, 17.97f, 17.77f, 17.89f, 17.35f, 17.67f),
                    PathNode.LineTo(4.29f, 11.15f),
                    PathNode.CurveTo(4.097276f, 11.052258f, 3.921667f, 10.923927f, 3.77f, 10.77f),
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
        return _planeLanding!!
    }

private var _planeLanding: ImageVector? = null
