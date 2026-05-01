package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignVerticalSpaceBetween: ImageVector
    get() {
        if (_alignVerticalSpaceBetween != null) return _alignVerticalSpaceBetween!!
        _alignVerticalSpaceBetween = lucideOutlineIcon(
            name = "AlignVerticalSpaceBetween",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 15.0f),
                    PathNode.LineTo(17.0f, 15.0f),
                    PathNode.CurveTo(18.10457f, 15.0f, 19.0f, 15.895431f, 19.0f, 17.0f),
                    PathNode.LineTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.0f, 20.10457f, 18.10457f, 21.0f, 17.0f, 21.0f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.CurveTo(5.895431f, 21.0f, 5.0f, 20.10457f, 5.0f, 19.0f),
                    PathNode.LineTo(5.0f, 17.0f),
                    PathNode.CurveTo(5.0f, 15.895431f, 5.895431f, 15.0f, 7.0f, 15.0f),
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
                    PathNode.MoveTo(9.0f, 3.0f),
                    PathNode.LineTo(15.0f, 3.0f),
                    PathNode.CurveTo(16.10457f, 3.0f, 17.0f, 3.895431f, 17.0f, 5.0f),
                    PathNode.LineTo(17.0f, 7.0f),
                    PathNode.CurveTo(17.0f, 8.10457f, 16.10457f, 9.0f, 15.0f, 9.0f),
                    PathNode.LineTo(9.0f, 9.0f),
                    PathNode.CurveTo(7.895431f, 9.0f, 7.0f, 8.10457f, 7.0f, 7.0f),
                    PathNode.LineTo(7.0f, 5.0f),
                    PathNode.CurveTo(7.0f, 3.895431f, 7.895431f, 3.0f, 9.0f, 3.0f),
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
                    PathNode.MoveTo(2.0f, 21.0f),
                    PathNode.LineTo(22.0f, 21.0f)
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
                    PathNode.MoveTo(2.0f, 3.0f),
                    PathNode.LineTo(22.0f, 3.0f)
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
        return _alignVerticalSpaceBetween!!
    }

private var _alignVerticalSpaceBetween: ImageVector? = null
