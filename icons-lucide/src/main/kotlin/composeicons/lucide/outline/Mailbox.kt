package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Mailbox: ImageVector
    get() {
        if (_mailbox != null) return _mailbox!!
        _mailbox = lucideOutlineIcon(
            name = "Mailbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 17.0f),
                    PathNode.CurveTo(22.0f, 18.10457f, 21.10457f, 19.0f, 20.0f, 19.0f),
                    PathNode.LineTo(4.0f, 19.0f),
                    PathNode.CurveTo(2.895431f, 19.0f, 2.0f, 18.10457f, 2.0f, 17.0f),
                    PathNode.LineTo(2.0f, 9.5f),
                    PathNode.CurveTo(2.0f, 7.0f, 4.0f, 5.0f, 6.5f, 5.0f),
                    PathNode.LineTo(18.0f, 5.0f),
                    PathNode.CurveTo(20.2f, 5.0f, 22.0f, 6.8f, 22.0f, 9.0f),
                    PathNode.LineTo(22.0f, 17.0f),
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
                    PathNode.LineTo(18.0f, 9.0f),
                    PathNode.LineTo(18.0f, 11.0f)
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
                    PathNode.MoveTo(6.5f, 5.0f),
                    PathNode.CurveTo(9.0f, 5.0f, 11.0f, 7.0f, 11.0f, 9.5f),
                    PathNode.LineTo(11.0f, 17.0f),
                    PathNode.CurveTo(11.0f, 18.10457f, 10.104569f, 19.0f, 9.0f, 19.0f)
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
                    PathNode.MoveTo(6.0f, 10.0f),
                    PathNode.LineTo(7.0f, 10.0f)
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
        return _mailbox!!
    }

private var _mailbox: ImageVector? = null
