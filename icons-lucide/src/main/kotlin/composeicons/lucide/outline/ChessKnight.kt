package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChessKnight: ImageVector
    get() {
        if (_chessKnight != null) return _chessKnight!!
        _chessKnight = lucideOutlineIcon(
            name = "ChessKnight",
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
                    PathNode.MoveTo(16.5f, 18.0f),
                    PathNode.CurveTo(17.5f, 16.0f, 19.0f, 13.0f, 19.0f, 9.0f),
                    PathNode.CurveTo(19.0f, 5.134007f, 15.865993f, 2.0f, 12.0f, 2.0f),
                    PathNode.LineTo(6.635f, 2.0f),
                    PathNode.CurveTo(6.247094f, 2.000145f, 5.894266f, 2.224611f, 5.729757f, 2.575906f),
                    PathNode.CurveTo(5.565248f, 2.927201f, 5.61874f, 3.341942f, 5.867f, 3.64f),
                    PathNode.LineTo(7.0f, 5.0f),
                    PathNode.LineTo(4.68f, 10.802f),
                    PathNode.CurveTo(4.295271f, 11.762972f, 4.707367f, 12.858712f, 5.63f, 13.328f),
                    PathNode.LineTo(8.5f, 14.784f)
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
                    PathNode.MoveTo(15.0f, 5.0f),
                    PathNode.LineTo(16.425f, 3.575f)
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
                    PathNode.MoveTo(17.0f, 8.0f),
                    PathNode.LineTo(18.53f, 6.47f)
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
                    PathNode.MoveTo(9.713f, 12.185f),
                    PathNode.LineTo(7.0f, 18.0f)
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
        return _chessKnight!!
    }

private var _chessKnight: ImageVector? = null
