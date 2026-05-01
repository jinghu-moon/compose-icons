package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChessKing: ImageVector
    get() {
        if (_chessKing != null) return _chessKing!!
        _chessKing = tablerOutlineIcon(
            name = "ChessKing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
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
                    PathNode.MoveTo(8.5f, 16.0f),
                    PathNode.CurveTo(6.765941f, 15.999642f, 5.293573f, 14.729609f, 5.038727f, 13.014379f),
                    PathNode.CurveTo(4.78388f, 11.299148f, 5.823397f, 9.655902f, 7.482446f, 9.151402f),
                    PathNode.CurveTo(9.141494f, 8.646901f, 10.919831f, 9.433264f, 11.663f, 11.0f),
                    PathNode.LineTo(12.337f, 11.0f),
                    PathNode.CurveTo(13.080169f, 9.433264f, 14.858506f, 8.646901f, 16.517555f, 9.151402f),
                    PathNode.CurveTo(18.176603f, 9.655902f, 19.21612f, 11.299148f, 18.961273f, 13.014379f),
                    PathNode.CurveTo(18.706427f, 14.729609f, 17.23406f, 15.999642f, 15.5f, 16.0f),
                    PathNode.LineTo(8.5f, 16.0f)
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
                    PathNode.MoveTo(9.0f, 6.0f),
                    PathNode.LineTo(15.0f, 6.0f)
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
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.LineTo(12.0f, 11.0f)
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
