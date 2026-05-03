package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MailCheck: ImageVector
    get() {
        if (_mailCheck != null) return _mailCheck!!
        _mailCheck = lucideOutlineIcon(
            name = "MailCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 13.0f),
                    PathNode.LineTo(22.0f, 6.0f),
                    PathNode.CurveTo(22.0f, 4.895431f, 21.10457f, 4.0f, 20.0f, 4.0f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.CurveTo(2.895431f, 4.0f, 2.0f, 4.895431f, 2.0f, 6.0f),
                    PathNode.LineTo(2.0f, 18.0f),
                    PathNode.CurveTo(2.0f, 19.1f, 2.9f, 20.0f, 4.0f, 20.0f),
                    PathNode.LineTo(12.0f, 20.0f)
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
                    PathNode.MoveTo(22.0f, 7.0f),
                    PathNode.LineTo(13.03f, 12.7f),
                    PathNode.CurveTo(12.400047f, 13.094682f, 11.599953f, 13.094682f, 10.97f, 12.7f),
                    PathNode.LineTo(2.0f, 7.0f)
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
                    PathNode.MoveTo(16.0f, 19.0f),
                    PathNode.LineTo(18.0f, 21.0f),
                    PathNode.LineTo(22.0f, 17.0f)
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
        return _mailCheck!!
    }

private var _mailCheck: ImageVector? = null
