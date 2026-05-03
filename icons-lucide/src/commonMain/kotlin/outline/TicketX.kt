package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TicketX: ImageVector
    get() {
        if (_ticketX != null) return _ticketX!!
        _ticketX = lucideOutlineIcon(
            name = "TicketX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 9.0f),
                    PathNode.CurveTo(3.656854f, 9.0f, 5.0f, 10.343145f, 5.0f, 12.0f),
                    PathNode.CurveTo(5.0f, 13.656855f, 3.656854f, 15.0f, 2.0f, 15.0f),
                    PathNode.LineTo(2.0f, 17.0f),
                    PathNode.CurveTo(2.0f, 18.10457f, 2.895431f, 19.0f, 4.0f, 19.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(21.10457f, 19.0f, 22.0f, 18.10457f, 22.0f, 17.0f),
                    PathNode.LineTo(22.0f, 15.0f),
                    PathNode.CurveTo(20.343145f, 15.0f, 19.0f, 13.656855f, 19.0f, 12.0f),
                    PathNode.CurveTo(19.0f, 10.343145f, 20.343145f, 9.0f, 22.0f, 9.0f),
                    PathNode.LineTo(22.0f, 7.0f),
                    PathNode.CurveTo(22.0f, 5.895431f, 21.10457f, 5.0f, 20.0f, 5.0f),
                    PathNode.LineTo(4.0f, 5.0f),
                    PathNode.CurveTo(2.895431f, 5.0f, 2.0f, 5.895431f, 2.0f, 7.0f),
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
                    PathNode.MoveTo(9.5f, 14.5f),
                    PathNode.LineTo(14.5f, 9.5f)
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
                    PathNode.MoveTo(9.5f, 9.5f),
                    PathNode.LineTo(14.5f, 14.5f)
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
        return _ticketX!!
    }

private var _ticketX: ImageVector? = null
