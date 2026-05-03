package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.EarOff: ImageVector
    get() {
        if (_earOff != null) return _earOff!!
        _earOff = lucideOutlineIcon(
            name = "EarOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 18.5f),
                    PathNode.CurveTo(6.0f, 20.432997f, 7.567004f, 22.0f, 9.5f, 22.0f),
                    PathNode.CurveTo(11.432997f, 22.0f, 13.0f, 20.432997f, 13.0f, 18.5f),
                    PathNode.CurveTo(13.0f, 16.93f, 13.92f, 15.98f, 15.04f, 15.04f)
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
                    PathNode.MoveTo(6.0f, 8.5f),
                    PathNode.CurveTo(6.0f, 7.75f, 6.13f, 7.03f, 6.36f, 6.36f)
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
                    PathNode.MoveTo(8.8f, 3.15f),
                    PathNode.CurveTo(10.788617f, 1.773189f, 13.377249f, 1.614427f, 15.519211f, 2.737907f),
                    PathNode.CurveTo(17.661173f, 3.861387f, 19.002176f, 6.081281f, 19.0f, 8.5f),
                    PathNode.CurveTo(19.0f, 10.13f, 18.56f, 11.31f, 17.91f, 12.26f)
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
                    PathNode.MoveTo(12.5f, 6.0f),
                    PathNode.CurveTo(13.880712f, 6.0f, 15.0f, 7.119288f, 15.0f, 8.5f),
                    PathNode.MoveTo(10.0f, 13.0f),
                    PathNode.CurveTo(10.785799f, 12.998361f, 11.497824f, 12.536718f, 11.82f, 11.82f)
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
                    PathNode.MoveTo(2.0f, 2.0f),
                    PathNode.LineTo(22.0f, 22.0f)
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
        return _earOff!!
    }

private var _earOff: ImageVector? = null
