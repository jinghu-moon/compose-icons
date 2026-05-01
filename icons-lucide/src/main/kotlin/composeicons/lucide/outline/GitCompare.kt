package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GitCompare: ImageVector
    get() {
        if (_gitCompare != null) return _gitCompare!!
        _gitCompare = lucideOutlineIcon(
            name = "GitCompare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 18.0f),
                    PathNode.CurveTo(21.0f, 19.656855f, 19.656855f, 21.0f, 18.0f, 21.0f),
                    PathNode.CurveTo(16.343145f, 21.0f, 15.0f, 19.656855f, 15.0f, 18.0f),
                    PathNode.CurveTo(15.0f, 16.343145f, 16.343145f, 15.0f, 18.0f, 15.0f),
                    PathNode.CurveTo(19.656855f, 15.0f, 21.0f, 16.343145f, 21.0f, 18.0f),
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
                    PathNode.MoveTo(9.0f, 6.0f),
                    PathNode.CurveTo(9.0f, 7.656854f, 7.656854f, 9.0f, 6.0f, 9.0f),
                    PathNode.CurveTo(4.343146f, 9.0f, 3.0f, 7.656854f, 3.0f, 6.0f),
                    PathNode.CurveTo(3.0f, 4.343146f, 4.343146f, 3.0f, 6.0f, 3.0f),
                    PathNode.CurveTo(7.656854f, 3.0f, 9.0f, 4.343146f, 9.0f, 6.0f),
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
                    PathNode.MoveTo(13.0f, 6.0f),
                    PathNode.LineTo(16.0f, 6.0f),
                    PathNode.CurveTo(17.10457f, 6.0f, 18.0f, 6.895431f, 18.0f, 8.0f),
                    PathNode.LineTo(18.0f, 15.0f)
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
                    PathNode.MoveTo(11.0f, 18.0f),
                    PathNode.LineTo(8.0f, 18.0f),
                    PathNode.CurveTo(6.895431f, 18.0f, 6.0f, 17.10457f, 6.0f, 16.0f),
                    PathNode.LineTo(6.0f, 9.0f)
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
        return _gitCompare!!
    }

private var _gitCompare: ImageVector? = null
