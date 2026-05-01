package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GitPullRequestArrow: ImageVector
    get() {
        if (_gitPullRequestArrow != null) return _gitPullRequestArrow!!
        _gitPullRequestArrow = lucideOutlineIcon(
            name = "GitPullRequestArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 6.0f),
                    PathNode.CurveTo(8.0f, 7.656854f, 6.656854f, 9.0f, 5.0f, 9.0f),
                    PathNode.CurveTo(3.343146f, 9.0f, 2.0f, 7.656854f, 2.0f, 6.0f),
                    PathNode.CurveTo(2.0f, 4.343146f, 3.343146f, 3.0f, 5.0f, 3.0f),
                    PathNode.CurveTo(6.656854f, 3.0f, 8.0f, 4.343146f, 8.0f, 6.0f),
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
                    PathNode.MoveTo(5.0f, 9.0f),
                    PathNode.LineTo(5.0f, 21.0f)
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
                    PathNode.MoveTo(22.0f, 18.0f),
                    PathNode.CurveTo(22.0f, 19.656855f, 20.656855f, 21.0f, 19.0f, 21.0f),
                    PathNode.CurveTo(17.343145f, 21.0f, 16.0f, 19.656855f, 16.0f, 18.0f),
                    PathNode.CurveTo(16.0f, 16.343145f, 17.343145f, 15.0f, 19.0f, 15.0f),
                    PathNode.CurveTo(20.656855f, 15.0f, 22.0f, 16.343145f, 22.0f, 18.0f),
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
                    PathNode.MoveTo(15.0f, 9.0f),
                    PathNode.LineTo(12.0f, 6.0f),
                    PathNode.LineTo(15.0f, 3.0f)
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
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.LineTo(17.0f, 6.0f),
                    PathNode.CurveTo(18.10457f, 6.0f, 19.0f, 6.895431f, 19.0f, 8.0f),
                    PathNode.LineTo(19.0f, 15.0f)
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
        return _gitPullRequestArrow!!
    }

private var _gitPullRequestArrow: ImageVector? = null
