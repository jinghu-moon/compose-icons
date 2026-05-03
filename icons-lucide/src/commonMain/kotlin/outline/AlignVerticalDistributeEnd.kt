package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignVerticalDistributeEnd: ImageVector
    get() {
        if (_alignVerticalDistributeEnd != null) return _alignVerticalDistributeEnd!!
        _alignVerticalDistributeEnd = lucideOutlineIcon(
            name = "AlignVerticalDistributeEnd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 14.0f),
                    PathNode.LineTo(17.0f, 14.0f),
                    PathNode.CurveTo(18.10457f, 14.0f, 19.0f, 14.895431f, 19.0f, 16.0f),
                    PathNode.LineTo(19.0f, 18.0f),
                    PathNode.CurveTo(19.0f, 19.10457f, 18.10457f, 20.0f, 17.0f, 20.0f),
                    PathNode.LineTo(7.0f, 20.0f),
                    PathNode.CurveTo(5.895431f, 20.0f, 5.0f, 19.10457f, 5.0f, 18.0f),
                    PathNode.LineTo(5.0f, 16.0f),
                    PathNode.CurveTo(5.0f, 14.895431f, 5.895431f, 14.0f, 7.0f, 14.0f),
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
                    PathNode.MoveTo(9.0f, 4.0f),
                    PathNode.LineTo(15.0f, 4.0f),
                    PathNode.CurveTo(16.10457f, 4.0f, 17.0f, 4.895431f, 17.0f, 6.0f),
                    PathNode.LineTo(17.0f, 8.0f),
                    PathNode.CurveTo(17.0f, 9.104569f, 16.10457f, 10.0f, 15.0f, 10.0f),
                    PathNode.LineTo(9.0f, 10.0f),
                    PathNode.CurveTo(7.895431f, 10.0f, 7.0f, 9.104569f, 7.0f, 8.0f),
                    PathNode.LineTo(7.0f, 6.0f),
                    PathNode.CurveTo(7.0f, 4.895431f, 7.895431f, 4.0f, 9.0f, 4.0f),
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
                    PathNode.MoveTo(2.0f, 20.0f),
                    PathNode.LineTo(22.0f, 20.0f)
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
                    PathNode.MoveTo(2.0f, 10.0f),
                    PathNode.LineTo(22.0f, 10.0f)
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
        return _alignVerticalDistributeEnd!!
    }

private var _alignVerticalDistributeEnd: ImageVector? = null
