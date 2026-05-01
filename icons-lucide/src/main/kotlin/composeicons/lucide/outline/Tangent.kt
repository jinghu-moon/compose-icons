package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Tangent: ImageVector
    get() {
        if (_tangent != null) return _tangent!!
        _tangent = lucideOutlineIcon(
            name = "Tangent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 4.0f),
                    PathNode.CurveTo(19.0f, 5.10457f, 18.10457f, 6.0f, 17.0f, 6.0f),
                    PathNode.CurveTo(15.895431f, 6.0f, 15.0f, 5.10457f, 15.0f, 4.0f),
                    PathNode.CurveTo(15.0f, 2.895431f, 15.895431f, 2.0f, 17.0f, 2.0f),
                    PathNode.CurveTo(18.10457f, 2.0f, 19.0f, 2.895431f, 19.0f, 4.0f),
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
                    PathNode.MoveTo(15.59f, 5.41f),
                    PathNode.LineTo(5.41f, 15.59f)
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
                    PathNode.MoveTo(6.0f, 17.0f),
                    PathNode.CurveTo(6.0f, 18.10457f, 5.10457f, 19.0f, 4.0f, 19.0f),
                    PathNode.CurveTo(2.895431f, 19.0f, 2.0f, 18.10457f, 2.0f, 17.0f),
                    PathNode.CurveTo(2.0f, 15.895431f, 2.895431f, 15.0f, 4.0f, 15.0f),
                    PathNode.CurveTo(5.10457f, 15.0f, 6.0f, 15.895431f, 6.0f, 17.0f),
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
                    PathNode.MoveTo(12.0f, 22.0f),
                    PathNode.CurveTo(12.0f, 22.0f, 8.0f, 13.0f, 10.5f, 10.5f),
                    PathNode.CurveTo(13.0f, 8.0f, 22.0f, 12.0f, 22.0f, 12.0f)
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
        return _tangent!!
    }

private var _tangent: ImageVector? = null
