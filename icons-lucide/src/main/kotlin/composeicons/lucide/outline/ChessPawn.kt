package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChessPawn: ImageVector
    get() {
        if (_chessPawn != null) return _chessPawn!!
        _chessPawn = lucideOutlineIcon(
            name = "ChessPawn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 20.0f),
                    PathNode.CurveTo(5.0f, 18.89543f, 5.895431f, 18.0f, 7.0f, 18.0f),
                    PathNode.LineTo(17.0f, 18.0f),
                    PathNode.CurveTo(18.10457f, 18.0f, 19.0f, 18.89543f, 19.0f, 20.0f),
                    PathNode.LineTo(19.0f, 21.0f),
                    PathNode.CurveTo(19.0f, 21.552284f, 18.552284f, 22.0f, 18.0f, 22.0f),
                    PathNode.LineTo(6.0f, 22.0f),
                    PathNode.CurveTo(5.447716f, 22.0f, 5.0f, 21.552284f, 5.0f, 21.0f),
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
                    PathNode.MoveTo(14.5f, 10.0f),
                    PathNode.LineTo(16.0f, 18.0f)
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
                    PathNode.MoveTo(7.0f, 10.0f),
                    PathNode.LineTo(17.0f, 10.0f)
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
                    PathNode.MoveTo(8.0f, 18.0f),
                    PathNode.LineTo(9.5f, 10.0f)
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
                    PathNode.MoveTo(16.0f, 6.0f),
                    PathNode.CurveTo(16.0f, 8.209139f, 14.209139f, 10.0f, 12.0f, 10.0f),
                    PathNode.CurveTo(9.790861f, 10.0f, 8.0f, 8.209139f, 8.0f, 6.0f),
                    PathNode.CurveTo(8.0f, 3.790861f, 9.790861f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(14.209139f, 2.0f, 16.0f, 3.790861f, 16.0f, 6.0f),
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
        return _chessPawn!!
    }

private var _chessPawn: ImageVector? = null
