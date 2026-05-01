package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Target: ImageVector
    get() {
        if (_target != null) return _target!!
        _target = lucideOutlineIcon(
            name = "Target",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.522848f, 17.522848f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477153f, 22.0f, 2.0f, 17.522848f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477153f, 6.477153f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(17.522848f, 2.0f, 22.0f, 6.477153f, 22.0f, 12.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 12.0f),
                    PathNode.CurveTo(14.0f, 13.104569f, 13.104569f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(10.895431f, 14.0f, 10.0f, 13.104569f, 10.0f, 12.0f),
                    PathNode.CurveTo(10.0f, 10.895431f, 10.895431f, 10.0f, 12.0f, 10.0f),
                    PathNode.CurveTo(13.104569f, 10.0f, 14.0f, 10.895431f, 14.0f, 12.0f),
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
        return _target!!
    }

private var _target: ImageVector? = null
