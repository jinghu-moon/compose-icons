package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChessQueen: ImageVector
    get() {
        if (_chessQueen != null) return _chessQueen!!
        _chessQueen = tablerOutlineIcon(
            name = "ChessQueen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 16.0f),
                    PathNode.LineTo(18.0f, 5.0f),
                    PathNode.LineTo(14.0f, 9.0f),
                    PathNode.LineTo(12.0f, 4.0f),
                    PathNode.LineTo(10.0f, 9.0f),
                    PathNode.LineTo(6.0f, 5.0f),
                    PathNode.LineTo(8.0f, 16.0f)
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
                    PathNode.MoveTo(8.0f, 16.0f),
                    PathNode.LineTo(6.553f, 16.724f),
                    PathNode.CurveTo(6.214271f, 16.893263f, 6.000202f, 17.239334f, 6.0f, 17.618f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.LineTo(18.0f, 20.0f),
                    PathNode.LineTo(18.0f, 17.618f),
                    PathNode.CurveTo(17.999798f, 17.239334f, 17.78573f, 16.893263f, 17.447f, 16.724f),
                    PathNode.LineTo(16.0f, 16.0f),
                    PathNode.LineTo(8.0f, 16.0f)
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
                    PathNode.MoveTo(11.0f, 4.0f),
                    PathNode.CurveTo(11.0f, 4.552285f, 11.447715f, 5.0f, 12.0f, 5.0f),
                    PathNode.CurveTo(12.552285f, 5.0f, 13.0f, 4.552285f, 13.0f, 4.0f),
                    PathNode.CurveTo(13.0f, 3.447715f, 12.552285f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(11.447715f, 3.0f, 11.0f, 3.447715f, 11.0f, 4.0f)
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
                    PathNode.MoveTo(5.0f, 5.0f),
                    PathNode.CurveTo(5.0f, 5.552285f, 5.447716f, 6.0f, 6.0f, 6.0f),
                    PathNode.CurveTo(6.552285f, 6.0f, 7.0f, 5.552285f, 7.0f, 5.0f),
                    PathNode.CurveTo(7.0f, 4.447716f, 6.552285f, 4.0f, 6.0f, 4.0f),
                    PathNode.CurveTo(5.447716f, 4.0f, 5.0f, 4.447716f, 5.0f, 5.0f)
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
                    PathNode.MoveTo(17.0f, 5.0f),
                    PathNode.CurveTo(17.0f, 5.552285f, 17.447716f, 6.0f, 18.0f, 6.0f),
                    PathNode.CurveTo(18.552284f, 6.0f, 19.0f, 5.552285f, 19.0f, 5.0f),
                    PathNode.CurveTo(19.0f, 4.447716f, 18.552284f, 4.0f, 18.0f, 4.0f),
                    PathNode.CurveTo(17.447716f, 4.0f, 17.0f, 4.447716f, 17.0f, 5.0f)
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
        return _chessQueen!!
    }

private var _chessQueen: ImageVector? = null
