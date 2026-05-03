package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Link: ImageVector
    get() {
        if (_link != null) return _link!!
        _link = lucideOutlineIcon(
            name = "Link",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 13.0f),
                    PathNode.CurveTo(10.868956f, 14.161693f, 12.199627f, 14.8887f, 13.64665f, 14.992333f),
                    PathNode.CurveTo(15.093673f, 15.095966f, 16.514366f, 14.566006f, 17.54f, 13.54f),
                    PathNode.LineTo(20.54f, 10.54f),
                    PathNode.CurveTo(22.43486f, 8.578106f, 22.407763f, 5.459576f, 20.479094f, 3.530907f),
                    PathNode.CurveTo(18.550425f, 1.602238f, 15.431894f, 1.575139f, 13.47f, 3.47f),
                    PathNode.LineTo(11.75f, 5.18f)
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
                    PathNode.MoveTo(14.0f, 11.0f),
                    PathNode.CurveTo(13.131044f, 9.838307f, 11.800373f, 9.1113f, 10.35335f, 9.007667f),
                    PathNode.CurveTo(8.906327f, 8.904034f, 7.485635f, 9.433994f, 6.46f, 10.46f),
                    PathNode.LineTo(3.46f, 13.46f),
                    PathNode.CurveTo(1.565139f, 15.421894f, 1.592238f, 18.540424f, 3.520907f, 20.469093f),
                    PathNode.CurveTo(5.449576f, 22.397762f, 8.568106f, 22.424862f, 10.53f, 20.53f),
                    PathNode.LineTo(12.24f, 18.82f)
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
        return _link!!
    }

private var _link: ImageVector? = null
