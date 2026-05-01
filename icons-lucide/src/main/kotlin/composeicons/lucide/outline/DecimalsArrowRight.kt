package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.DecimalsArrowRight: ImageVector
    get() {
        if (_decimalsArrowRight != null) return _decimalsArrowRight!!
        _decimalsArrowRight = lucideOutlineIcon(
            name = "DecimalsArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 18.0f),
                    PathNode.LineTo(20.0f, 18.0f)
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
                    PathNode.MoveTo(17.0f, 21.0f),
                    PathNode.LineTo(20.0f, 18.0f),
                    PathNode.LineTo(17.0f, 15.0f)
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
                    PathNode.MoveTo(3.0f, 11.0f),
                    PathNode.LineTo(3.01f, 11.0f)
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
                    PathNode.MoveTo(17.5f, 3.0f),
                    PathNode.LineTo(17.5f, 3.0f),
                    PathNode.CurveTo(18.880713f, 3.0f, 20.0f, 4.119288f, 20.0f, 5.5f),
                    PathNode.LineTo(20.0f, 8.5f),
                    PathNode.CurveTo(20.0f, 9.880712f, 18.880713f, 11.0f, 17.5f, 11.0f),
                    PathNode.LineTo(17.5f, 11.0f),
                    PathNode.CurveTo(16.119287f, 11.0f, 15.0f, 9.880712f, 15.0f, 8.5f),
                    PathNode.LineTo(15.0f, 5.5f),
                    PathNode.CurveTo(15.0f, 4.119288f, 16.119287f, 3.0f, 17.5f, 3.0f),
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
                    PathNode.MoveTo(8.5f, 3.0f),
                    PathNode.LineTo(8.5f, 3.0f),
                    PathNode.CurveTo(9.880712f, 3.0f, 11.0f, 4.119288f, 11.0f, 5.5f),
                    PathNode.LineTo(11.0f, 8.5f),
                    PathNode.CurveTo(11.0f, 9.880712f, 9.880712f, 11.0f, 8.5f, 11.0f),
                    PathNode.LineTo(8.5f, 11.0f),
                    PathNode.CurveTo(7.119288f, 11.0f, 6.0f, 9.880712f, 6.0f, 8.5f),
                    PathNode.LineTo(6.0f, 5.5f),
                    PathNode.CurveTo(6.0f, 4.119288f, 7.119288f, 3.0f, 8.5f, 3.0f),
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
        }
        return _decimalsArrowRight!!
    }

private var _decimalsArrowRight: ImageVector? = null
