package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Shrimp: ImageVector
    get() {
        if (_shrimp != null) return _shrimp!!
        _shrimp = lucideOutlineIcon(
            name = "Shrimp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 12.0f),
                    PathNode.LineTo(11.01f, 12.0f)
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
                    PathNode.MoveTo(13.0f, 22.0f),
                    PathNode.CurveTo(13.5f, 21.5f, 14.12f, 21.0f, 15.5f, 21.0f),
                    PathNode.CurveTo(14.12f, 21.0f, 13.5f, 20.5f, 13.0f, 20.0f)
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
                    PathNode.MoveTo(14.0f, 2.0f),
                    PathNode.CurveTo(13.396178f, 3.205676f, 12.115991f, 3.918963f, 10.773f, 3.798f),
                    PathNode.LineTo(4.603f, 3.237f),
                    PathNode.CurveTo(3.725437f, 3.152587f, 2.872798f, 3.558755f, 2.385401f, 4.293389f),
                    PathNode.CurveTo(1.898004f, 5.028022f, 1.855218f, 5.971493f, 2.27412f, 6.747226f),
                    PathNode.CurveTo(2.693023f, 7.52296f, 3.505399f, 8.004636f, 4.387f, 8.0f),
                    PathNode.LineTo(15.5f, 8.0f),
                    PathNode.CurveTo(19.089851f, 8.0f, 22.0f, 10.91015f, 22.0f, 14.5f),
                    PathNode.CurveTo(22.0f, 18.089851f, 19.089851f, 21.0f, 15.5f, 21.0f),
                    PathNode.CurveTo(16.880713f, 21.0f, 18.0f, 19.880713f, 18.0f, 18.5f),
                    PathNode.CurveTo(18.0f, 17.119287f, 16.880713f, 16.0f, 15.5f, 16.0f),
                    PathNode.LineTo(12.0f, 16.0f),
                    PathNode.CurveTo(8.134007f, 16.0f, 5.0f, 12.865993f, 5.0f, 9.0f),
                    PathNode.LineTo(5.0f, 8.0f)
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
                    PathNode.MoveTo(14.0f, 8.0f),
                    PathNode.CurveTo(15.333333f, 10.5f, 15.333333f, 13.5f, 14.0f, 16.0f)
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
                    PathNode.MoveTo(16.0f, 16.0f),
                    PathNode.CurveTo(18.0f, 16.0f, 20.5f, 12.0f, 20.0f, 10.0f)
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
        return _shrimp!!
    }

private var _shrimp: ImageVector? = null
