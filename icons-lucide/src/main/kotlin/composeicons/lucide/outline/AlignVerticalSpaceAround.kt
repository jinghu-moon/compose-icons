package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignVerticalSpaceAround: ImageVector
    get() {
        if (_alignVerticalSpaceAround != null) return _alignVerticalSpaceAround!!
        _alignVerticalSpaceAround = lucideOutlineIcon(
            name = "AlignVerticalSpaceAround",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 9.0f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.CurveTo(16.10457f, 9.0f, 17.0f, 9.895431f, 17.0f, 11.0f),
                    PathNode.LineTo(17.0f, 13.0f),
                    PathNode.CurveTo(17.0f, 14.104569f, 16.10457f, 15.0f, 15.0f, 15.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.CurveTo(7.895431f, 15.0f, 7.0f, 14.104569f, 7.0f, 13.0f),
                    PathNode.LineTo(7.0f, 11.0f),
                    PathNode.CurveTo(7.0f, 9.895431f, 7.895431f, 9.0f, 9.0f, 9.0f),
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
                    PathNode.MoveTo(22.0f, 20.0f),
                    PathNode.LineTo(2.0f, 20.0f)
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
                    PathNode.MoveTo(22.0f, 4.0f),
                    PathNode.LineTo(2.0f, 4.0f)
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
        return _alignVerticalSpaceAround!!
    }

private var _alignVerticalSpaceAround: ImageVector? = null
