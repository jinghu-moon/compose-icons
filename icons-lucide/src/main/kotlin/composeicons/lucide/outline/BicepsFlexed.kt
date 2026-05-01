package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BicepsFlexed: ImageVector
    get() {
        if (_bicepsFlexed != null) return _bicepsFlexed!!
        _bicepsFlexed = lucideOutlineIcon(
            name = "BicepsFlexed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.409f, 13.017f),
                    PathNode.CurveTo(13.348639f, 10.838916f, 15.689379f, 9.620852f, 18.012371f, 10.101146f),
                    PathNode.CurveTo(20.335361f, 10.581439f, 22.001146f, 12.627876f, 22.0f, 15.0f),
                    PathNode.CurveTo(22.0f, 18.866f, 18.0f, 22.0f, 13.0f, 22.0f),
                    PathNode.CurveTo(8.923f, 22.0f, 4.847f, 21.18f, 2.629f, 19.538f),
                    PathNode.CurveTo(2.203f, 19.222f, 1.998f, 18.706f, 2.009f, 18.176f),
                    PathNode.CurveTo(2.118f, 12.723f, 2.627f, 2.0f, 10.0f, 2.0f),
                    PathNode.CurveTo(11.656855f, 2.0f, 13.0f, 3.343146f, 13.0f, 5.0f),
                    PathNode.CurveTo(13.0f, 6.10457f, 12.104569f, 7.0f, 11.0f, 7.0f),
                    PathNode.CurveTo(9.895f, 7.0f, 9.36f, 6.556f, 9.0f, 6.0f)
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
                    PathNode.MoveTo(15.0f, 14.0f),
                    PathNode.CurveTo(13.777315f, 13.082474f, 12.20208f, 12.774681f, 10.72395f, 13.164484f),
                    PathNode.CurveTo(9.24582f, 13.554286f, 8.02722f, 14.598849f, 7.416f, 16.0f)
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
                    PathNode.MoveTo(9.964f, 6.825f),
                    PathNode.CurveTo(8.019f, 7.977f, 9.5f, 13.0f, 8.0f, 15.0f)
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
        return _bicepsFlexed!!
    }

private var _bicepsFlexed: ImageVector? = null
