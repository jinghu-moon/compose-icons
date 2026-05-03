package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Guitar: ImageVector
    get() {
        if (_guitar != null) return _guitar!!
        _guitar = lucideOutlineIcon(
            name = "Guitar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.9f, 12.1f),
                    PathNode.LineTo(16.414f, 7.586f)
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
                    PathNode.MoveTo(20.1f, 2.3f),
                    PathNode.CurveTo(19.711157f, 1.918857f, 19.088844f, 1.918857f, 18.7f, 2.3f),
                    PathNode.LineTo(17.586f, 3.414f),
                    PathNode.CurveTo(17.210901f, 3.788986f, 17.000113f, 4.297611f, 17.0f, 4.828f),
                    PathNode.LineTo(17.0f, 6.172f),
                    PathNode.CurveTo(16.999887f, 6.70239f, 16.789099f, 7.211015f, 16.414f, 7.586f),
                    PathNode.CurveTo(16.788986f, 7.210902f, 17.297611f, 7.000114f, 17.828f, 7.0f),
                    PathNode.LineTo(19.172f, 7.0f),
                    PathNode.CurveTo(19.702389f, 6.999887f, 20.211014f, 6.789099f, 20.586f, 6.414f),
                    PathNode.LineTo(21.7f, 5.3f),
                    PathNode.CurveTo(22.081142f, 4.911157f, 22.081142f, 4.288844f, 21.7f, 3.9f),
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
                    PathNode.MoveTo(6.0f, 16.0f),
                    PathNode.LineTo(8.0f, 18.0f)
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
                    PathNode.MoveTo(8.23f, 9.85f),
                    PathNode.CurveTo(8.694721f, 8.730292f, 9.787683f, 8.000336f, 11.0f, 8.0f),
                    PathNode.CurveTo(13.761424f, 8.0f, 16.0f, 10.238576f, 16.0f, 13.0f),
                    PathNode.CurveTo(15.999664f, 14.212317f, 15.269708f, 15.305279f, 14.15f, 15.77f),
                    PathNode.LineTo(13.23f, 16.15f),
                    PathNode.CurveTo(12.483714f, 16.461315f, 11.998316f, 17.191385f, 12.0f, 18.0f),
                    PathNode.CurveTo(12.0f, 20.209139f, 10.209139f, 22.0f, 8.0f, 22.0f),
                    PathNode.CurveTo(4.686292f, 22.0f, 2.0f, 19.31371f, 2.0f, 16.0f),
                    PathNode.CurveTo(2.0f, 13.790861f, 3.790861f, 12.0f, 6.0f, 12.0f),
                    PathNode.CurveTo(6.808615f, 12.001684f, 7.538685f, 11.516286f, 7.85f, 10.77f),
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
        return _guitar!!
    }

private var _guitar: ImageVector? = null
