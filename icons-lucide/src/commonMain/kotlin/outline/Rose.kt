package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Rose: ImageVector
    get() {
        if (_rose != null) return _rose!!
        _rose = lucideOutlineIcon(
            name = "Rose",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 10.0f),
                    PathNode.LineTo(16.0f, 10.0f),
                    PathNode.CurveTo(13.790861f, 10.0f, 12.0f, 8.209139f, 12.0f, 6.0f),
                    PathNode.CurveTo(12.0f, 3.790861f, 13.790861f, 2.0f, 16.0f, 2.0f),
                    PathNode.CurveTo(18.209139f, 2.0f, 20.0f, 3.790861f, 20.0f, 6.0f),
                    PathNode.LineTo(20.0f, 6.534f)
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
                    PathNode.MoveTo(17.0f, 6.0f),
                    PathNode.LineTo(18.0f, 6.0f),
                    PathNode.CurveTo(19.931276f, 5.99932f, 21.587246f, 7.378625f, 21.935745f, 9.278196f),
                    PathNode.CurveTo(22.284246f, 11.177769f, 21.225742f, 13.055078f, 19.42f, 13.74f),
                    PathNode.LineTo(17.13f, 14.61f),
                    PathNode.CurveTo(14.249606f, 15.706244f, 11.00713f, 14.441958f, 9.629046f, 11.685274f),
                    PathNode.CurveTo(8.250963f, 8.928591f, 9.185521f, 5.576178f, 11.791f, 3.93f),
                    PathNode.LineTo(13.86f, 2.62f)
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
                    PathNode.MoveTo(4.5f, 17.0f),
                    PathNode.CurveTo(7.3f, 16.5f, 8.9f, 17.0f, 10.0f, 17.8f),
                    PathNode.CurveTo(11.1f, 18.6f, 11.8f, 20.0f, 12.3f, 21.5f),
                    PathNode.CurveTo(10.3f, 21.9f, 8.8f, 21.9f, 7.5f, 21.2f),
                    PathNode.CurveTo(6.3f, 20.6f, 5.2f, 19.3f, 4.5f, 17.0f)
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
                    PathNode.MoveTo(9.77f, 12.0f),
                    PathNode.CurveTo(4.0f, 15.0f, 2.0f, 22.0f, 2.0f, 22.0f)
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
                    PathNode.MoveTo(19.0f, 8.0f),
                    PathNode.CurveTo(19.0f, 9.104569f, 18.10457f, 10.0f, 17.0f, 10.0f),
                    PathNode.CurveTo(15.895431f, 10.0f, 15.0f, 9.104569f, 15.0f, 8.0f),
                    PathNode.CurveTo(15.0f, 6.895431f, 15.895431f, 6.0f, 17.0f, 6.0f),
                    PathNode.CurveTo(18.10457f, 6.0f, 19.0f, 6.895431f, 19.0f, 8.0f),
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
        return _rose!!
    }

private var _rose: ImageVector? = null
