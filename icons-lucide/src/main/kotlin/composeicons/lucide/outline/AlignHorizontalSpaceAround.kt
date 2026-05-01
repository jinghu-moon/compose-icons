package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignHorizontalSpaceAround: ImageVector
    get() {
        if (_alignHorizontalSpaceAround != null) return _alignHorizontalSpaceAround!!
        _alignHorizontalSpaceAround = lucideOutlineIcon(
            name = "AlignHorizontalSpaceAround",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 7.0f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.CurveTo(14.104569f, 7.0f, 15.0f, 7.895431f, 15.0f, 9.0f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.CurveTo(15.0f, 16.10457f, 14.104569f, 17.0f, 13.0f, 17.0f),
                    PathNode.LineTo(11.0f, 17.0f),
                    PathNode.CurveTo(9.895431f, 17.0f, 9.0f, 16.10457f, 9.0f, 15.0f),
                    PathNode.LineTo(9.0f, 9.0f),
                    PathNode.CurveTo(9.0f, 7.895431f, 9.895431f, 7.0f, 11.0f, 7.0f),
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
                    PathNode.MoveTo(4.0f, 22.0f),
                    PathNode.LineTo(4.0f, 2.0f)
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
                    PathNode.MoveTo(20.0f, 22.0f),
                    PathNode.LineTo(20.0f, 2.0f)
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
        return _alignHorizontalSpaceAround!!
    }

private var _alignHorizontalSpaceAround: ImageVector? = null
