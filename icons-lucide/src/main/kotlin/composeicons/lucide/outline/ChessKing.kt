package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChessKing: ImageVector
    get() {
        if (_chessKing != null) return _chessKing!!
        _chessKing = lucideOutlineIcon(
            name = "ChessKing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 20.0f),
                    PathNode.CurveTo(4.0f, 18.89543f, 4.895431f, 18.0f, 6.0f, 18.0f),
                    PathNode.LineTo(18.0f, 18.0f),
                    PathNode.CurveTo(19.10457f, 18.0f, 20.0f, 18.89543f, 20.0f, 20.0f),
                    PathNode.LineTo(20.0f, 21.0f),
                    PathNode.CurveTo(20.0f, 21.552284f, 19.552284f, 22.0f, 19.0f, 22.0f),
                    PathNode.LineTo(5.0f, 22.0f),
                    PathNode.CurveTo(4.447716f, 22.0f, 4.0f, 21.552284f, 4.0f, 21.0f),
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
                    PathNode.MoveTo(6.7f, 18.0f),
                    PathNode.LineTo(5.7f, 17.0f),
                    PathNode.CurveTo(4.35f, 15.682f, 3.0f, 14.09f, 3.0f, 12.0f),
                    PathNode.CurveTo(2.999863f, 9.257985f, 5.208123f, 7.02742f, 7.95f, 7.0f),
                    PathNode.CurveTo(9.534f, 7.0f, 10.65f, 7.455f, 12.0f, 8.818f),
                    PathNode.CurveTo(13.35f, 7.455f, 14.466f, 7.0f, 16.05f, 7.0f),
                    PathNode.CurveTo(18.791878f, 7.02742f, 21.000137f, 9.257985f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 14.082f, 19.641f, 15.673f, 18.3f, 17.0f),
                    PathNode.LineTo(17.3f, 18.0f)
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
                    PathNode.MoveTo(10.0f, 4.0f),
                    PathNode.LineTo(14.0f, 4.0f)
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
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.LineTo(12.0f, 8.818f)
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
        return _chessKing!!
    }

private var _chessKing: ImageVector? = null
