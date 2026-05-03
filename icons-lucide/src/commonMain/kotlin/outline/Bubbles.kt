package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bubbles: ImageVector
    get() {
        if (_bubbles != null) return _bubbles!!
        _bubbles = lucideOutlineIcon(
            name = "Bubbles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.001f, 15.085f),
                    PathNode.CurveTo(7.460113f, 14.923044f, 7.969271f, 14.993978f, 8.366636f, 15.275253f),
                    PathNode.CurveTo(8.764f, 15.556529f, 9.00014f, 16.013159f, 9.0f, 16.5f)
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
                    PathNode.MoveTo(22.0f, 8.5f),
                    PathNode.CurveTo(22.0f, 10.432997f, 20.432997f, 12.0f, 18.5f, 12.0f),
                    PathNode.CurveTo(16.567003f, 12.0f, 15.0f, 10.432997f, 15.0f, 8.5f),
                    PathNode.CurveTo(15.0f, 6.567004f, 16.567003f, 5.0f, 18.5f, 5.0f),
                    PathNode.CurveTo(20.432997f, 5.0f, 22.0f, 6.567004f, 22.0f, 8.5f),
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
                    PathNode.MoveTo(13.0f, 16.5f),
                    PathNode.CurveTo(13.0f, 19.537565f, 10.537566f, 22.0f, 7.5f, 22.0f),
                    PathNode.CurveTo(4.462434f, 22.0f, 2.0f, 19.537565f, 2.0f, 16.5f),
                    PathNode.CurveTo(2.0f, 13.462434f, 4.462434f, 11.0f, 7.5f, 11.0f),
                    PathNode.CurveTo(10.537566f, 11.0f, 13.0f, 13.462434f, 13.0f, 16.5f),
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
                    PathNode.MoveTo(10.0f, 4.5f),
                    PathNode.CurveTo(10.0f, 5.880712f, 8.880712f, 7.0f, 7.5f, 7.0f),
                    PathNode.CurveTo(6.119288f, 7.0f, 5.0f, 5.880712f, 5.0f, 4.5f),
                    PathNode.CurveTo(5.0f, 3.119288f, 6.119288f, 2.0f, 7.5f, 2.0f),
                    PathNode.CurveTo(8.880712f, 2.0f, 10.0f, 3.119288f, 10.0f, 4.5f),
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
        }
        return _bubbles!!
    }

private var _bubbles: ImageVector? = null
