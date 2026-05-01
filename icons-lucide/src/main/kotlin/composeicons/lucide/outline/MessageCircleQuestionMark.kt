package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageCircleQuestionMark: ImageVector
    get() {
        if (_messageCircleQuestionMark != null) return _messageCircleQuestionMark!!
        _messageCircleQuestionMark = lucideOutlineIcon(
            name = "MessageCircleQuestionMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.992f, 16.342f),
                    PathNode.CurveTo(3.139039f, 16.712915f, 3.171775f, 17.119331f, 3.086f, 17.509f),
                    PathNode.LineTo(2.021f, 20.799f),
                    PathNode.CurveTo(1.95123f, 21.138227f, 2.061949f, 21.489405f, 2.313667f, 21.727274f),
                    PathNode.CurveTo(2.565384f, 21.965143f, 2.922259f, 22.055834f, 3.257f, 21.967f),
                    PathNode.LineTo(6.67f, 20.969f),
                    PathNode.CurveTo(7.037716f, 20.896063f, 7.418529f, 20.92794f, 7.769f, 21.061f),
                    PathNode.CurveTo(12.177509f, 23.119764f, 17.427994f, 21.7067f, 20.207699f, 17.713367f),
                    PathNode.CurveTo(22.987404f, 13.720035f, 22.489471f, 8.305573f, 19.028067f, 4.886195f),
                    PathNode.CurveTo(15.566662f, 1.466817f, 10.146522f, 1.03506f, 6.187443f, 3.863338f),
                    PathNode.CurveTo(2.228363f, 6.691615f, 0.879539f, 11.958968f, 2.992f, 16.342f)
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
                    PathNode.MoveTo(9.09f, 9.0f),
                    PathNode.CurveTo(9.575437f, 7.620044f, 10.985384f, 6.791406f, 12.427176f, 7.038712f),
                    PathNode.CurveTo(13.868969f, 7.286018f, 14.922179f, 8.537153f, 14.92f, 10.0f),
                    PathNode.CurveTo(14.92f, 12.0f, 11.92f, 13.0f, 11.92f, 13.0f)
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
                    PathNode.MoveTo(12.0f, 17.0f),
                    PathNode.LineTo(12.01f, 17.0f)
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
        return _messageCircleQuestionMark!!
    }

private var _messageCircleQuestionMark: ImageVector? = null
