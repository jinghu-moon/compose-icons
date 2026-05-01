package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HandHelping: ImageVector
    get() {
        if (_handHelping != null) return _handHelping!!
        _handHelping = lucideOutlineIcon(
            name = "HandHelping",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 12.0f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.CurveTo(14.104569f, 12.0f, 15.0f, 11.104569f, 15.0f, 10.0f),
                    PathNode.CurveTo(15.0f, 8.895431f, 14.104569f, 8.0f, 13.0f, 8.0f),
                    PathNode.LineTo(10.0f, 8.0f),
                    PathNode.CurveTo(9.4f, 8.0f, 8.9f, 8.2f, 8.6f, 8.6f),
                    PathNode.LineTo(3.0f, 14.0f)
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
                    PathNode.MoveTo(7.0f, 18.0f),
                    PathNode.LineTo(8.6f, 16.6f),
                    PathNode.CurveTo(8.9f, 16.2f, 9.4f, 16.0f, 10.0f, 16.0f),
                    PathNode.LineTo(14.0f, 16.0f),
                    PathNode.CurveTo(15.1f, 16.0f, 16.1f, 15.6f, 16.8f, 14.8f),
                    PathNode.LineTo(21.4f, 10.4f),
                    PathNode.CurveTo(22.203575f, 9.640609f, 22.239391f, 8.373575f, 21.48f, 7.57f),
                    PathNode.CurveTo(20.720608f, 6.766426f, 19.453575f, 6.730609f, 18.65f, 7.49f),
                    PathNode.LineTo(14.45f, 11.39f)
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
                    PathNode.MoveTo(2.0f, 13.0f),
                    PathNode.LineTo(8.0f, 19.0f)
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
        return _handHelping!!
    }

private var _handHelping: ImageVector? = null
