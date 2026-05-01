package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MailQuestionMark: ImageVector
    get() {
        if (_mailQuestionMark != null) return _mailQuestionMark!!
        _mailQuestionMark = lucideOutlineIcon(
            name = "MailQuestionMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 10.5f),
                    PathNode.LineTo(22.0f, 6.0f),
                    PathNode.CurveTo(22.0f, 4.895431f, 21.10457f, 4.0f, 20.0f, 4.0f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.CurveTo(2.895431f, 4.0f, 2.0f, 4.895431f, 2.0f, 6.0f),
                    PathNode.LineTo(2.0f, 18.0f),
                    PathNode.CurveTo(2.0f, 19.1f, 2.9f, 20.0f, 4.0f, 20.0f),
                    PathNode.LineTo(16.5f, 20.0f)
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
                    PathNode.MoveTo(22.0f, 7.0f),
                    PathNode.LineTo(13.03f, 12.7f),
                    PathNode.CurveTo(12.400047f, 13.094682f, 11.599953f, 13.094682f, 10.97f, 12.7f),
                    PathNode.LineTo(2.0f, 7.0f)
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
                    PathNode.MoveTo(18.0f, 15.28f),
                    PathNode.CurveTo(18.2f, 14.88f, 18.5f, 14.48f, 18.9f, 14.28f),
                    PathNode.CurveTo(19.753164f, 13.786755f, 20.834549f, 13.953121f, 21.5f, 14.68f),
                    PathNode.CurveTo(21.8f, 15.08f, 22.0f, 15.48f, 22.0f, 15.98f),
                    PathNode.CurveTo(22.0f, 17.28f, 20.0f, 17.98f, 20.0f, 17.98f)
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
                    PathNode.LineTo(20.0f, 22.01f)
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
        return _mailQuestionMark!!
    }

private var _mailQuestionMark: ImageVector? = null
