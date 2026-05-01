package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Glasses: ImageVector
    get() {
        if (_glasses != null) return _glasses!!
        _glasses = lucideOutlineIcon(
            name = "Glasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 15.0f),
                    PathNode.CurveTo(10.0f, 17.209139f, 8.209139f, 19.0f, 6.0f, 19.0f),
                    PathNode.CurveTo(3.790861f, 19.0f, 2.0f, 17.209139f, 2.0f, 15.0f),
                    PathNode.CurveTo(2.0f, 12.790861f, 3.790861f, 11.0f, 6.0f, 11.0f),
                    PathNode.CurveTo(8.209139f, 11.0f, 10.0f, 12.790861f, 10.0f, 15.0f),
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
                    PathNode.MoveTo(22.0f, 15.0f),
                    PathNode.CurveTo(22.0f, 17.209139f, 20.209139f, 19.0f, 18.0f, 19.0f),
                    PathNode.CurveTo(15.790861f, 19.0f, 14.0f, 17.209139f, 14.0f, 15.0f),
                    PathNode.CurveTo(14.0f, 12.790861f, 15.790861f, 11.0f, 18.0f, 11.0f),
                    PathNode.CurveTo(20.209139f, 11.0f, 22.0f, 12.790861f, 22.0f, 15.0f),
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
                    PathNode.MoveTo(14.0f, 15.0f),
                    PathNode.CurveTo(14.0f, 13.895431f, 13.104569f, 13.0f, 12.0f, 13.0f),
                    PathNode.CurveTo(10.895431f, 13.0f, 10.0f, 13.895431f, 10.0f, 15.0f)
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
                    PathNode.MoveTo(2.5f, 13.0f),
                    PathNode.LineTo(5.0f, 7.0f),
                    PathNode.CurveTo(5.7f, 5.7f, 6.4f, 5.0f, 8.0f, 5.0f)
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
                    PathNode.MoveTo(21.5f, 13.0f),
                    PathNode.LineTo(19.0f, 7.0f),
                    PathNode.CurveTo(18.3f, 5.7f, 17.5f, 5.0f, 16.0f, 5.0f)
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
        return _glasses!!
    }

private var _glasses: ImageVector? = null
